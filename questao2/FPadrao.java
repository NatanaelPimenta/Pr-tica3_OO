package br.com.questao2;

public class FPadrao extends Funcionarios {

    public FPadrao(int matricula, String nome, double salario) {
        super(matricula, nome, salario);
    }
    public double calcularProventos(){
        return getSalario();
    }

}
