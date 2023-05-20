package principal;

import java.text.DecimalFormat;
import java.util.Random;

public class AlturaRepetida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random aleatorio = new Random();

		DecimalFormat formatador = new DecimalFormat("0.00");

		int i = 0;
		double altura;
		double soma = 0;
		double media;

		while (i < 5) {
			altura = aleatorio.nextDouble() + 2;
			System.out.println(formatador.format(altura));
			i = i + 1;
			soma = soma + altura;
		}
		System.out.println();
		System.out.println("A soma das alturas é: "+formatador.format(soma));
		
		media = soma / i;
		
		System.out.println();
		System.out.println("A média das alturas é de: "+formatador.format(media));
	}

}
