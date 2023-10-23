package daodb4o;

import com.db4o.query.Query;
import modelo.Jogador;

import java.util.List;


public class DAOJogador extends DAO<Jogador> {

        //nome é usado como campo unico
        public Jogador read (Object chave) {
            String nome = (String) chave;	//casting para o tipo da chave
            Query q = manager.query();
            q.constrain(Jogador.class);
            q.descend("nome").constrain(nome);
            List<Jogador> resultados = q.execute();
            if (resultados.size()>0)
                return resultados.get(0);
            else
                return null;
        }

}
