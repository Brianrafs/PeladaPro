package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Mensalista extends Jogador{

    private double valorMensal;
    private List<LocalDate> mesesPagos =  new ArrayList<>();
    public Mensalista(String nome) {
        super(nome);
        this.valorMensal = 35.00;
    }

    public void adicionarMesPago(LocalDate data) {
        mesesPagos.add(data);
    }

    public List<LocalDate> getMesesPagos() {
        return mesesPagos;
    }
    @Override
    public double calcularPagamento() {
        return valorMensal;
    }
}
