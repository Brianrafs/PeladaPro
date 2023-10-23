package modelo;

import java.util.ArrayList;
import java.util.List;

public class Diarista extends Jogador {
    private double valorPorPartida;
    private List<Pelada> peladasPagas =  new ArrayList<>();

    public Diarista(String nome) {
        super(nome);
        this.valorPorPartida = 12.00;
    }

    public void adicionarPeladaPaga(Pelada pelada) {
        peladasPagas.add(pelada);
    }

    public List<Pelada> getPeladasPagas() {
        return peladasPagas;
    }

    @Override
    public double calcularPagamento() {
        return valorPorPartida;
    }
}
