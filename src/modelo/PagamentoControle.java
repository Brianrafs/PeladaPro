package modelo;

import java.util.ArrayList;
import java.util.List;

public class PagamentoControle {

    private List<Jogador> jogadores = new ArrayList<>();

    public void adicionarJogador(Jogador jogador) {
        jogadores.add(jogador);
    }

    public void verificarStatusPagamento() {
        for (Jogador jogador : jogadores) {
            if (jogador.calcularPagamento() > 0) {
                jogador.setEmDiaComPagamento(true);
            }
        }
    }

}
