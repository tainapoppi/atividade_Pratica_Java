package atividadePraticaJava;

import java.util.Scanner;

public class Exer_6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

        String[] cargos = {
                "Gerente",
                "Vendedor",
                "Supervisor",
                "Motorista",
                "Estoquista",
                "Técnico de TI"
        };

        double[] percentuaisReajuste = {0.10, 0.07, 0.09, 0.06, 0.05, 0.08};

        System.out.print("Digite o Nome do Colaborador: ");
        String nomeColaborador = leia.nextLine();

        System.out.println("Código do Cargo\t\tCargo\t\tPercentual do Reajuste");
        for (int i = 0; i < cargos.length; i++) {
            System.out.println((i + 1) + "\t\t\t\t" + cargos[i] + "\t\t" + percentuaisReajuste[i] * 100 + "%");
        }

        System.out.print("\nDigite o Código do Cargo do Colaborador: ");
        int codigoCargo = leia.nextInt();

        if (codigoCargo < 1 || codigoCargo > 6) {
            System.out.println("Código de cargo inválido.");
            return;
        }

        System.out.print("Digite o Salário do Colaborador: ");
        double salario = leia.nextDouble();
     
        double percentualReajuste = percentuaisReajuste[codigoCargo - 1];
        double novoSalario = salario + (percentualReajuste * salario);

        System.out.println("\nResumo do Reajuste:");
        System.out.println("Nome do Colaborador: " + nomeColaborador);
        System.out.println("Cargo: " + cargos[codigoCargo - 1]);
        System.out.println("Percentual de Reajuste: " + percentualReajuste * 100 + "%");
        System.out.println("Novo Salário: R$ " + novoSalario);
		

	}

}
