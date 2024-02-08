package atividadePraticaJava;

import java.util.Scanner;

public class Exercio_1_Laco_Cond {

	public static void main(String[] args) {
		int numeroA;
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o número A: ");
		numeroA = leia.nextInt();
		
		int numeroB;
		Scanner leia1 = new Scanner(System.in);
		System.out.println("Digite o número B: ");
		numeroB = leia1.nextInt();
		
		int numeroC;
		Scanner leia2 = new Scanner(System.in);
		System.out.println("Digite o número C: ");
		numeroC = leia2.nextInt();
		
		if(numeroA + numeroB > numeroC) {
		System.out.println("A soma de A + B é maior do que C");
		}
		if(numeroA + numeroB < numeroC) {
		System.out.println("A soma de A + B é menor do que C");
		}
		if(numeroA + numeroB == numeroC) {
		System.out.println("A soma de A + B é igual a C");	
		}
		
	}

}
