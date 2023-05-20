package principal;

import java.util.Random;
import java.util.Scanner;

public class Resposta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		Random aleatorio = new Random();
		
		int opcao, num;
		int somado = 0;

		do {
			System.out.println();
			System.out.println("Deseja Jogar ?");
			System.out.println("1 - Sim");
			System.out.println("2 - Não");
			opcao = entrada.nextInt();

			if (opcao == 1) {
				num = aleatorio.nextInt(1000);
				System.out.println();
				System.out.println("Valor aleatório: "+num);
				somado = num + 1;
				System.out.println("Valor aleatório somado: "+somado);
			}
		} while (opcao == 1);
		System.out.println("Saindo...");
		entrada.close();

	}

}
