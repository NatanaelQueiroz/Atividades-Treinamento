import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		double num1, num2;
		int opcao = 0;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite o primeiro numero: ");
		num1 = teclado.nextDouble();
		System.out.println("Digite o segundo numero: ");
		num2 = teclado.nextDouble();

		while (opcao != 0) {
			System.out.println(
					"Escolha uma opção: n\1-Adicao \n2-Subtracao \n3-Multiplicacao \n4-Divisao \n5-Encerrar Calculadora");
			int conta = teclado.nextInt();
			
			switch (conta) {
			case 1:
				Adicao executar = new Adicao();
				executar.conta(num1, num2);
				break;

			case 2:
				Subtracao executar2 = new Subtracao();
				executar2.conta(num1, num2);
				break;

			case 3:
				Multiplicacao executar3 = new Multiplicacao();
				executar3.conta(num1, num2);
				break;

			case 4:
				Divisao executar4 = new Divisao();
				executar4.conta(num1, num2);
				break;
			default:
				System.out.println("Opçao invalida!");
			}
			teclado.close();
		}
	}
}
