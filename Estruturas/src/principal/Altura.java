package principal;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Altura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double altura = 0;
		double media = 0;
		double soma = 0;
		int i = 0;

		Random aleatorio = new Random();

		DecimalFormat formatador = new DecimalFormat("0.00");

		altura = aleatorio.nextDouble() + 2;

		do {
			altura = aleatorio.nextDouble() + 2;
			System.out.println(formatador.format(altura));
			i = i + 1;
			soma = soma + altura;
		} while (i < 5);
		System.out.println();
		System.out.println("A soma de todas as alturas é: "+formatador.format(soma));
		
		media = soma / i;

		System.out.println();
		System.out.println("A média das alturas é de: " + formatador.format(media));

	}

}
