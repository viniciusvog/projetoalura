public class Atividade1 {
    public static void main(String[] args) {

        // APLICANDO OS CONHECIMENTOS VISTOS ATE O MOMENTO NAS AULAS

        //1. Criando programa que realiza a média de duas notas decimais e exibe o resultado.
        double nota1 = 5.4;
        double nota2 = 7.8;
        System.out.println("A média das notas é: " + (nota1 + nota2) /2);

        //2. Realizando o Casting da variável double para int e mostrando o resultado.
        double nota3 = 6.7;
        int nota4 = (int) nota3;
        System.out.println("A nota 6.7 convertida para int fica: " + nota4);
        //Se eu quisesse arredondar poderia usar o Math.round(nota3)

        //3. Concatenando um Char e um int na mensagem
        char letra = 'A';
        int num = 17;
        System.out.println("A letra é: " + letra + " e o número é: " + num);

        //4. Multiplicando quantidade de um produto pelo preco do produto
        double precoProduto = 29.90;
        int quantidade = 3;
        System.out.printf("O valor dos %d produtos, fica: R$%.2f%n", quantidade, (quantidade * precoProduto));
        /* %d: É o lugar onde vai entrar número inteiro da variavel (quantidade)
        * %.2f: É o lugar onde vai entrar o resultado decimal (o total) com 2 casas
        * colocado entre parênteses para garantir que o resultado dessa conta seja enviado para a máscara %.2f
        * %.2f: É o comando para formatar o número (2 casas decimais)
        * %n: É um comando especial que diz ao Java: "Pule para a próxima linha agora"
        * Ja que utilizei o (printf) para formatar
        * */

        //5. Convertendo Dollar para Real
        double valorDolares = 294.25;
        double valorReal = 4.94;
        System.out.printf("O valor da conversao dos $%.2f convertido para Real ficam: R$%.2f%n", valorDolares, (valorDolares * valorReal));

        //6. Calculando o valor do desconto em reais e aplicando sobre o valor orginal
        double precoOriginal = 399.90;
        double percentualDesconto = 20;
        double valorDesconto = (precoOriginal * percentualDesconto) /100;
        System.out.printf("O valor do produto com os 20%% de desconto aplicado fica: R$%.2f%n", (precoOriginal - valorDesconto));
    }
}
