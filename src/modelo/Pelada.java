package modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pelada {
    private Date data;
    private List<Jogador> participantes = new ArrayList<>();

    public Pelada(Date data) {
        this.data = data;
    }

    public void adicionarParticipante(Jogador jogador) {
        participantes.add(jogador);
    }
}
