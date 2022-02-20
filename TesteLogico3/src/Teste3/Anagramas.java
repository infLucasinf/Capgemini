package Teste3;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Anagramas {

	public static void main(String[] args) {

		String anagrama1 = "ovo";
		String anagrama2 = "voo";

		char[] conjunto1 = anagrama1.toCharArray();
		char[] conjunto2 = anagrama2.toCharArray();

		Arrays.sort(conjunto1);
		Arrays.sort(conjunto2);

		if (Arrays.equals(conjunto1, conjunto2)) {

			for (int i = 0; i < anagrama1.length(); i++) {
				for (int j = i + 1; j < anagrama1.length(); j++) {
					String substring = anagrama1.substring(i, j);

					i++;

				}
				System.out.println(i);
			}

		}
	}

}
