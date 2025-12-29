package Atividades.Alura;

public class ConvertTemp {
    public static void main(String[] args) {

        int c = 27;
        double f = (c * 1.8) + 32;
        System.out.println("A temperatura convertida de Celsius para Fahrenheit é: " + f);

         int fh = (int) f;
        System.out.println("A temperatura em Fahrenheit sem número quebrado é: " + fh);
    }
}
