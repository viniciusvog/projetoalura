import java.util.Scanner;
import java.util.Random;

public class AtividadeAdivinhando {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = new Random().nextInt(20);
        int usuario = 0;
        int i;

        System.out.println("----------------------------------------------------------------");
        System.out.println("Você tem 5 tentativas para acertar o número de 0 a 5, boa sorte!");

        for(i = 1; i <= 5; i++){
            System.out.println("Digite o número que você acha aqui em baixo:");
            System.out.println("Esta é sua " + i + " tentativa!");
            usuario = scanner.nextInt();

            if(usuario == numero){
                System.out.println("Você acertou!");
                break;
            } if (i == 5){
                    System.out.println("Acabaram as tentativas! O número era " + numero);
                    break;
            } if (usuario > numero) {
                System.out.println("O número é menor, Tente novamente!");
            } else if (usuario < numero) {
                System.out.println("O número é maior, Tente novamente!");
            }
            System.out.println("--------------------------------------------");
        }
    }
}
