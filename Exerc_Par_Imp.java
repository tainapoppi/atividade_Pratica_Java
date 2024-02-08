package atividadePraticaJava;

import java.util.Scanner;

public class Exerc_Par_Imp {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = leia.nextInt();
       

        if (numero % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }
		

	}

}
