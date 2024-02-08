package atividadePraticaJava;

import java.util.Scanner;

public class Exerc_5_Lanche {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

        String[] produtos = {
                "Cachorro Quente",
                "X-Salada",
                "X-Bacon",
                "Bauru",
                "Refrigerante",
                "Suco de laranja"
        };

        double[] precos = {10.00, 15.00, 18.00, 12.00, 8.00, 13.00};


        System.out.println("Código do Produto\tProduto\t\tPreço Unitário");
        for (int i = 0; i < produtos.length; i++) {
            System.out.println((i + 1) + "\t\t\t\t" + produtos[i] + "\t\tR$ " + precos[i]);
        }


        System.out.print("\nDigite o código do produto: ");
        int codigoProduto = leia.nextInt();

     
        if (codigoProduto < 1 || codigoProduto > 6) {
            System.out.println("Inválido.");
            return;
        }

        System.out.print("Digite Quantidade: ");
        int quantidade = leia.nextInt();

    
        double precoUnitario = precos[codigoProduto - 1];
        double valorTotal = precoUnitario * quantidade;

 
        System.out.println("\nResumo do Pedido:");
        System.out.println("Produto: " + produtos[codigoProduto - 1]);
        System.out.println("Preço Unitário: R$ " + precoUnitario);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Total: R$ " + valorTotal);
    
	}

}
