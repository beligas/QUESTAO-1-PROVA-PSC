// Imagine que você está desenvolvendo um programa de software para uma loja online. 
// O programa precisa calcular o valor total de uma compra com base nos itens selecionados pelo cliente e aplicar descontos especiais,  se aplicáveis.

// Como você usaria instruções de seleção (if) para resolver esse problema?
// a) Descreva como você identificaria os itens selecionados pelo cliente e como aplicaria os descontos.
// b) Mostre trechos de código de acordo com sua proposta. Utilize a linguagem de programação usada pelo professor durante as aulas presenciais ou online.
// c) Discuta qualquer consideração importante que você teria ao usar instruções de seleção nesse contexto e como garantiria que o programa seja confiável para lidar com diferentes 
// cenários de compra.

import java.util.Scanner;

public class Loja {
    public static void main(String[] args)  {

        Scanner enterScanner = new Scanner(System.in);

        double valFinal = 0;
        double valor = 0;
        
        System.out.println("Bem vindo!");
        System.out.println("Quantos produtos você deseja comprar? Com um limite de 10 produtos por compra");

        int quantidadeProdutos = enterScanner.nextInt();

        if (quantidadeProdutos > 10) {
            System.out.println("O limite maximo de compra é de 10 produtos");
            quantidadeProdutos = 10;
            System.exit(0);
        }

        System.out.println("Escolha o produto desejado: \n 1 - Camiseta R$100,00 \n 2 - Bermuda R$75,00 \n 3 - Moletom R$230,00 \n 4 - Bone R$ 90,00");

        double[] precos = {100.0, 75.0, 230.0, 90.0};

        for (int i = 0; i < quantidadeProdutos; i++) {
            System.out.println("Escolha o produto " + (i+1));
            
            int op = enterScanner.nextInt();
            
            switch (op) {
            case 1:
                valor += precos[0];
            break;

            case 2:
                valor += precos[1];
            break;
            case 3:
                valor += precos[2];
            break;
            case 4:
                valor += precos[3];
            break;
                default:
                System.out.println("Opção inválida, escolha um número de 1 a 4. ");
                i--; 
            }
        }

        if (quantidadeProdutos == 1) {
            System.out.println("Você escolheu 1 produto, seu desconto será de 10%");
            valFinal = valor - (valor * 0.1);
        } else if (quantidadeProdutos == 2){
            System.out.println("Você escolheu 2 produtos, seu desconto será de 20%");
            valFinal = valor - (valor * 0.2);
        } else {
            System.out.println("Você escolheu três ou mais produtos, seu desconto será de 30%");
            valFinal = valor - (valor * 0.3);
        }

        System.out.println("O valor final é de R$" + valFinal);
        enterScanner.close();
    }
}
