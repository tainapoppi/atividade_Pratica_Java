package atividadePraticaJava;

import java.util.Scanner;

public class Exerc_3_Idade {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

        System.out.print("Digite o nome do doador: ");
        String nomeDoador = leia.nextLine();

        System.out.print("Digite a idade do doador: ");
        int idadeDoador = leia.nextInt();

        System.out.print("É a primeira doação? (true/false): ");
        boolean primeiraDoacao = leia.nextBoolean();

        if (idadeDoador >= 18 && idadeDoador <= 69) {
            if (idadeDoador >= 60 && idadeDoador <= 69 && primeiraDoacao) {
                System.out.println("Desculpe, o doador não está apto devido à idade e ser a primeira doação.");
            } else {
                System.out.println("O doador " + nomeDoador + " está apto para a doação de sangue.");
            }
        } else {
            System.out.println("O doador não está apto devido à idade.");
        }
						
		}
		

	}

