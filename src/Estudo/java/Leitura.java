package Estudo.java;

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite seu filme favorito: ");
        String filme = ler.nextLine();
        System.out.println(filme);
        System.out.println("QUal o ano de lancamento? ");
        int anoLancamento = ler.nextInt();
        System.out.println("Diga a avaliacao para o filme: ");
        double avaliacao = ler.nextDouble();

        System.out.println(filme);
        System.out.println(anoLancamento);
        System.out.println(avaliacao);

        ler.close();
    }
}
