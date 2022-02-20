package Teste2;

import java.util.Scanner;

public class TesteLogico2 {

	public static void main(String[] args) {

		System.out.println("Siga as orientações para o cadastro da senha: ");
		System.out.println(" \n||Possui no mínimo 6 caracteres. ");
		System.out.println(" \n||Contém no mínimo 1 digito. ");
		System.out.println(" \n||Contém no mínimo 1 letra em minúsculo. ");
		System.out.println(" \n||Contém no mínimo 1 letra em maiúsculo.");
		System.out.println(" \n||Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+ \n");

		Scanner senha_cadastrada = new Scanner(System.in);

		String senha = new String();
		String confirme_senha = new String();

		System.out.print("Cadastre a senha:");
		senha = senha_cadastrada.next();

		if (senha.length() < 6 && (senha.length() - 6) * -1 != 1) {
			System.out.println("Faltam " + (senha.length() - 6) * -1 + " caracteres.");
			return;
		}
		if ((senha.length() - 6) * -1 == 1) {
			System.out.println("Falta " + (senha.length() - 6) * -1 + " caracter.");
			return;
		}

		System.out.print("Confirme a senha:");
		confirme_senha = senha_cadastrada.next();

		if (senha.equals(confirme_senha)) {
			System.out.println("    Senha cadastrada");
		} else {
			System.out.println("    Senhas diferentes");
		}
		return;
	}

}
