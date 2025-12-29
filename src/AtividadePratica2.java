import java.util.InputMismatchException;
import java.util.Scanner;

public class AtividadePratica2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. Verificando se o número é positivo ou negativo
        int numero;

        System.out.println("---------------------------------------------");
        System.out.println("Verificando se o número é positivo ou negativo");
        System.out.println("1. Digite um número: ");
        numero = scanner.nextInt();

        if (numero > 0){
            System.out.println("O número é positivo!");
        } else {
            System.out.println("O número é negativo!");
        }

        //2. Verificando se os números sao iguais/diferentes e maiores ou menores
        int i;
        int ii;

        System.out.println("---------------------------------------------");
        System.out.println("2. Digite um número: ");
        i = scanner.nextInt();

        System.out.println("Digite um segundo número: ");
        ii = scanner.nextInt();

        if (i == ii){
            System.out.println("Os números são iguais!");
        } else {
            System.out.println("Os números são diferentes!");
        } if (i > ii){
            System.out.println("O primeiro é maior!");
        } else if (i < ii){
            System.out.println("O segundo é maior!");
        }

        //3. Opcao de calcular area do quadrado ou do circulo
        int opcao;
        int lado = 0;
        int raio = 0;

        try {

            System.out.println("---------------------------------------------");
            System.out.println("""
                    Você deseja calcular qual área?
                    1 - Área do Quadrado
                    2 - Área do Círculo
                    """);
            opcao = scanner.nextInt();

            /*
            poderia fazer com um if mas para ficar menor o código fiz direto na opção escolhida
            if (opcao == 1){
                System.out.println("Qual a medida do lado do Quadrado?");
                lado = scanner.nextInt();
            } else {
                System.out.println("Qual a medida do raio do Círculo?");
                raio = scanner.nextInt();
            }*/

            switch (opcao) {
                case 1:
                    System.out.println("Qual a medida do lado do Quadrado?");
                    lado = scanner.nextInt();
                    System.out.println("Área do quadrado é: " + (lado * lado));
                    break;
                case 2:
                    System.out.println("Qual a medida do raio do Círculo?");
                    raio = scanner.nextInt();
                    System.out.println("Área do círculo é: " + (raio * raio) * 3.14);
                    break;
                default:
                    System.out.println("Voce digitou uma opcao que nao e valida, tente novamente!");
            }
        } catch (InputMismatchException e) {
            System.out.println("Somente numeros são aceitos, tente novamente!");
        }

        System.out.println("---------------------------------------------");

        //4. tabuada do numero que o usuario informar
        int digito;
        int contador;

        System.out.println("Digite um numero para consultar a tabuada: ");
        digito = scanner.nextInt();

        for (contador = 1; contador <= 10; contador++){
            System.out.println(digito + " X " + contador + " = " + (digito * contador));
        }
        System.out.println("---------------------------------------------");

        //5. Verificando se o numero é par ou impar
        int inteiro;

        System.out.println("Digite um numero para saber se é Par ou Ímpar: ");
        inteiro = scanner.nextInt();

        if (inteiro % 2 == 0){
            System.out.println("O número é par!");
        } else {
            System.out.println("O número é ímpar!");
        }
        System.out.println("---------------------------------------------");

        //6. Calculando o Fatorial do numero do usuario
        int x;
        int fatorial = 1;

        System.out.println("Digite um número para calcular o fatorial: ");
        x = scanner.nextInt();

        for (int a = x; a >= 1; a--) {
            fatorial *= a;
        }
        System.out.println("O fatorialde " + x + " é: " + fatorial);
        System.out.println("---------------------------------------------");

    }
}
