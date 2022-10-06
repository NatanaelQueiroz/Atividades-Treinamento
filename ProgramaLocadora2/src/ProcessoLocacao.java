import java.util.Scanner;	

public class ProcessoLocacao {

	public static void main(String[] args) {
		// Cadastramento de carros
		
		String [] carros = {"Gol", "Palio", "Uno", "Spin", "Onix", "Mobi", "Up", "Kwid", "Corolla","Civic"};
		Scanner teclado = new Scanner(System.in); 
				
		System.out.println("Escolha uma opção abaixo: ");
		System.out.println("Digite 1 para ver quais veículos estão disponíveis.");
		System.out.println("Digite 2 para escolher um veículo específico.");
		System.out.println("Digite 3 para finalizar o atendimento.");
		int opçao = teclado.nextInt ();
		int i;
		
		switch(opçao) {
		case 1:
			System.out.println("Opções de carros: ");
			for(i = 0; i <=10 - 1; i++)
			System.out.println(carros[i]);
			break;
		case 2:
			System.out.println("Selecione um número: ");
			int num = teclado.nextInt ();
			System.out.println(carros [num-1]);
			break;
		case 3:
			System.out.println("Atendimento Finalizado.");
			break;
			default: System.out.println("Opção inválida");
			teclado.close();
	
		}
		
		
	}

}