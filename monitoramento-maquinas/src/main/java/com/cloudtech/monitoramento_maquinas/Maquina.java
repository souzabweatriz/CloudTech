

package br.com.cloudtech.monitoramento;

public class Maquina {

    private String identificador;
    private String tipo;
    private String setor;
    private String status;

    public Maquina(String identificador, String tipo, String setor, String status) {
        this.identificador = identificador;
        this.tipo = tipo;
        this.setor = setor;
        this.status = status;
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getTipo() {
        return tipo;
    }

    public String getSetor() {
        return setor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}