import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.println("Diga a avaliacao para o filme ou -1 para encerrar:  ");
            nota = ler.nextDouble();

            if (nota != -1) {
                mediaAvaliacao += nota;
                totalDeNotas++;
            }

            if(totalDeNotas == 0) {
                System.out.println("Obrigado!");
            } else  {
                System.out.println("Media de avaliacoes: " + mediaAvaliacao/totalDeNotas);
            }
        }
    }
}
