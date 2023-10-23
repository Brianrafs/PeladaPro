package modelo;

public abstract class Jogador {

    private String nome;
    private int cartao_vermelho;
    private int Cartao_amarelo;
    private boolean suspenso;
    private boolean emDiaComPagamento;

    public Jogador(String nome){
        this.nome = nome;
        this.emDiaComPagamento = false; //Por padrão, assume-se que o jogador ainda não pagou
    }

    public abstract double calcularPagamento();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCartao_vermelho() {
        return cartao_vermelho;
    }

    public void setCartao_vermelho(int cartao_vermelho) {
        this.cartao_vermelho = cartao_vermelho;
    }

    public int getCartao_amarelo() {
        return Cartao_amarelo;
    }

    public void setCartao_amarelo(int cartao_amarelo) {
        this.Cartao_amarelo = cartao_amarelo;
    }

    public boolean isSuspenso() {
        return suspenso;
    }

    public void setSuspenso(boolean suspenso) {
        this.suspenso = suspenso;
    }

    public boolean isEmDiaComPagamento() {
        return emDiaComPagamento;
    }

    public void setEmDiaComPagamento(boolean emDiaComPagamento) {
        this.emDiaComPagamento = emDiaComPagamento;
    }

}
