package Estudo.java;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Diga a avaliacao para o filme: ");
            nota = ler.nextDouble();
            mediaAvaliacao += nota;
            // += incrementa somando a informacao antes da igualdade com o valor seguinte
        }

        System.out.println("Media de avaliacoes: " + mediaAvaliacao/3);
    }
}
