public class Condicional {
    public static void main(String[] args) {

        int ano = 1990;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if (ano >= 2022){
            System.out.println("Lancamento que os clientes estao curtindo!");
        } else {
            System.out.println("Filme retro que vale a pena assistir");
        }

        // Ou a condicao && onde as duas condicoes deveriam ser iguais.
        if (incluidoNoPlano || tipoPlano.equals("plus")){
            System.out.println("Filme liberado!");
        } else {
            System.out.println("Deve pagar a locacao!");
        }

        // Uma alternativa ao if/else é o switch case, dando opcoes de escolha
        switch (expressão) {
            case valor1:
                // código a ser executado se a expressão for igual a valor1
                break;
            case valor2:
                // código a ser executado se a expressão for igual a valor2
                break;
            case valor3:
                // código a ser executado se a expressão for igual a valor3
                break;
                // break usado para PARAR o codigo
            default:
                // código a ser executado se a expressão não for igual a nenhum valor
                break;
        }
    }
}
