package br.com.questao2;

public class FProdutividade extends Funcionarios {
    private  double valor;
    private int producao;

    public FProdutividade(int matricula, String nome, double salario, double valor, int producao) {
        super(matricula, nome, salario);
        this.valor = valor;
        this.producao = producao;
    }

    public double getValor() {
        return valor;
    }

    public int getProducao() {
        return producao;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setProducao(int producao) {
        this.producao = producao;
    }
    public double calculaProventos(){
        return getSalario() + (getProducao() * getValor());

    }

    public String toString() {
        return null;
    }
}
