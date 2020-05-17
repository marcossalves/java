package br.com.jokenpo;

import java.util.Scanner;

public class JoKenPo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int jogador;
		Scanner mao = new Scanner(System.in);
		System.out.println("_____________JoKenPo_______________");
		System.out.println("___________________________________");
		System.out.println("1. PEDRA");
		System.out.println("2. PAPEL");
		System.out.println("3. TESOURA");
		System.out.println("Digite a opção desejada: ");
		jogador = mao.nextInt();
		switch (jogador) {
			case 1:
				System.out.println("Jogador escolheu PEDRA");
				break;

			case 2:
				System.out.println("Jogador escolheu PAPEL");
				break;

			case 3:
				System.out.println("Jogador escolheu TESOURA");
				break;
			default:
				System.out.println("Opçãoo inválida");
				break;
		}

		// l�gica do computador
		int computador = (int) (Math.random() * 3 + 1);
		switch (computador) {
			case 1:
				System.out.println("Computador escolheu PEDRA");
				break;

			case 2:
				System.out.println("Computador escolheu PAPEL");
				break;

			case 3:
				System.out.println("Computador escolheu TESOURA");
				break;

		}
		// l�gica para determinar o vencedor

		if (jogador != computador) {
			if ((jogador == 1 && computador == 3) || (jogador == 2 && computador == 1)
					|| (jogador == 3 && computador == 2)) {
				System.out.println("JOGADOR VENCEU");

			} else {
				System.out.println("COMPUTADOR VENCEU");

			}
		} else {
			System.out.println("EMPATE");
		}
	}

}
