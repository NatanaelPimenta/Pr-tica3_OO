package br.com.questao2;

public class Main {
    public static void main(String[] args) {

        FPadrao fp = new FPadrao(1, "Joao", 10000);
        System.out.println(fp.toString());

        FComissionado fc = new FComissionado(2, "Natanael", 15000, 2, 100);
        System.out.println(fc.toString());

        FProdutividade fpr = new FProdutividade(3, "Michelle", 16500, 0.50, 100);

    }
}
