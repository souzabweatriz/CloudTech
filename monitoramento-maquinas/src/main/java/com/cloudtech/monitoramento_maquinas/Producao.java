package br.com.cloudtech.monitoramento;

public class Producao {

    private String identificadorMaquina;
    private double consumoKw;
    private double tempoAtivacao;
    private int pecasProduzidas;

    public Producao(String identificadorMaquina, double consumoKw,
                     double tempoAtivacao, int pecasProduzidas) {
        this.identificadorMaquina = identificadorMaquina;
        this.consumoKw = consumoKw;
        this.tempoAtivacao = tempoAtivacao;
        this.pecasProduzidas = pecasProduzidas;
    }

    public String getIdentificadorMaquina() {
        return identificadorMaquina;
    }

    public double getConsumoKw() {
        return consumoKw;
    }

    public double getTempoAtivacao() {
        return tempoAtivacao;
    }

    public int getPecasProduzidas() {
        return pecasProduzidas;
    }
}