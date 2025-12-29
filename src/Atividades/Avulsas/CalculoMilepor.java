package Atividades.Avulsas;

import java.util.Scanner;

public class CalculoMilepor {
    public static void main(String[] args) {
        double c = 4000;
        double l = 1200;
        double a = 500;

        System.out.println((c * l * a) / 1000);

                Scanner scanner = new Scanner(System.in);

                // O maior número que um int aguenta (2.147.483.647)
                int limiteMaximo = Integer.MAX_VALUE;

                System.out.println("--- CÁLCULO DE PEÇAS DE ISOPOR ---");

                // 1. Pede o Comprimento
                System.out.println("Digite o Comprimento:");
                int comp = scanner.nextInt();

                // 2. Calcula qual a LARGURA máxima permitida para esse comprimento
                // Lógica: Se MAX = Comp * Largura, então LarguraMaxima = MAX / Comp
                int maxLarguraPermitida = limiteMaximo / comp;

                System.out.println("Para esse comprimento, a Largura máx é: " + maxLarguraPermitida);
                System.out.println("Digite a Largura:");
                int larg = scanner.nextInt();

                // Validação de segurança
                if (larg > maxLarguraPermitida) {
                    System.out.println("ERRO: Valor muito alto! Vai travar o sistema.");
                    return; // Para o programa
                }

                // 3. Calcula qual a ALTURA máxima permitida baseada nos dois anteriores
                // Lógica: Sobrou quanto espaço no balde? MAX / (Comp * Larg)
                int produtoAtual = comp * larg;
                int maxAlturaPermitida = limiteMaximo / produtoAtual;

                System.out.println("Baseado nas medidas anteriores, a Altura máx é: " + maxAlturaPermitida);
                System.out.println("Digite a Altura:");
                int alt = scanner.nextInt();

                if (alt > maxAlturaPermitida) {
                    System.out.println("ERRO: Valor muito alto! Estouro de memória.");
                } else {
                    // Se chegou aqui, é 100% seguro calcular sem long e sem travar!
                    int resultado = (comp * larg * alt) / 1000;
                    System.out.println("------------------------------");
                    System.out.println("Volume Calculado com Sucesso: " + resultado);
                }
            }

    }
