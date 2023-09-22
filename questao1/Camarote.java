package br.com.questao1;

public class Camarote extends Ingresso{
    private double valorAdicional;
    private String localização;

    public Camarote(double valorIngresso) {
        super(valorIngresso);
    }

    public Camarote(double valorIngresso, double valorAdicional, String localização) {
        super(valorIngresso);
        this.valorAdicional = valorAdicional;
        this.localização = localização;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public String getLocalização() {
        return localização;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public void setLocalização(String localização) {
        this.localização = localização;
    }
    public void imprimeIngresso(){
        System.out.println("Ingresso Camarote - valor: "
                + (getValorIngresso() + getValorAdicional()) +"localização" + getLocalização());
    }

}
