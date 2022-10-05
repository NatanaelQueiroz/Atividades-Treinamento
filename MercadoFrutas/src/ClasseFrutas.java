import java.util.ArrayList;
import java.util.Scanner;

public class ClasseFrutas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		ArrayList<String> frutas = new ArrayList<String>();

		int id, opcao;
		String nomeFruta;

		do {
			System.out.println("Opcoes: ");
			System.out.println("1-Cadastrar Frutas");
			System.out.println("2-Listar Frutas");
			System.out.println("3-Excluir Frutas");
			System.out.println("4-Listar fruta ID");
			System.out.println("5-Modificar uma fruta");

			opcao = teclado.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Nº de frutas para cadastrar:");
				opcao = teclado.nextInt();
				System.out.println("1-Digite o nome da Fruta: ");
				for (int i = 0; i < opcao; i++) {
					nomeFruta = teclado.next();
					frutas.add(nomeFruta);
				}
				break;
			case 2:
				System.out.println("2-Lista de Frutas");
				System.out.println(frutas);
				break;
			case 3:
				System.out.println("3-Exclua uma fruta pelo ID");
				id = teclado.nextInt();
				frutas.remove(id);
				System.out.println("Fruta excluida");
				break;
			case 4:
				System.out.println("4-Insira o ID da fruta");
				id = teclado.nextInt();
				System.out.println("Fruta escolhida = " + (frutas.get(id)));
				break;
			case 5:
				System.out.println("5-Digite o ID da fruta que deseja modificar");
				id = teclado.nextInt();
				System.out.println("Digite o nome da nova fruta: ");
				nomeFruta = teclado.next();
				frutas.set(id, nomeFruta);
				break;
			default:
				System.out.println("Opçao invalida");
			}
		} while (1 >= opcao || opcao <= 6);
		teclado.close();
	}
}