
import java.util.Scanner;

public class TesteLogico1 {

	public static void main(String[] args) {

		Scanner escada = new Scanner(System.in);

		System.out.print("Qual a quantidade de degraus? ");
		int quantidade_de_degraus = escada.nextInt();

		if (quantidade_de_degraus <= 0) {
			System.out.println("ERRO (numero negativo ou igual a zero não é aceito)");
			return;
		}

		for (int degrau = quantidade_de_degraus - 1; degrau >= 0; degrau--) {
			for (int coluna = 1; coluna <= (quantidade_de_degraus - (quantidade_de_degraus - degrau)); coluna++) {
				System.out.print(" ");
			}
			for (int coluna = 0; coluna < (quantidade_de_degraus - degrau); coluna++) {
				System.out.print("*");

			}
			System.out.println("");
		}
         
	}
}
