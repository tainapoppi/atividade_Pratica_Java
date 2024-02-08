package atividadePraticaJava;

import java.util.Scanner;

public class Exer_7 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);


        System.out.print("Digite o primeiro número: ");
        float numero1 = leia.nextFloat();

        System.out.print("Digite o segundo número: ");
        float numero2 = leia.nextFloat();

        System.out.println("Código da Operação\tOperação");
        System.out.println("1\t\t\t\tSoma");
        System.out.println("2\t\t\t\tSubtração");
        System.out.println("3\t\t\t\tMultiplicação");
        System.out.println("4\t\t\t\tDivisão");

        System.out.print("Digite o Código da Operação: ");
        int codigoOperacao = leia.nextInt();

        float resultado = 0;

        switch (codigoOperacao) {
            case 1:
                resultado = numero1 + numero2;
                System.out.println("Resultado da Soma: " + resultado);
                break;
            case 2:
                resultado = numero1 - numero2;
                System.out.println("Resultado da Subtração: " + resultado);
                break;
            case 3:
                resultado = numero1 * numero2;
                System.out.println("Resultado da Multiplicação: " + resultado);
                break;
            case 4:
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.println("Resultado da Divisão: " + resultado);
                } else {
                    System.out.println("Não é possível dividir por zero.");
                }
                break;
            default:
                System.out.println("Operação Inválida!");
        }
		
	}

}
