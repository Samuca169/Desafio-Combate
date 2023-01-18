package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os dados do primeiro campeão:");
		System.out.print("Nome: ");
		String nome_1 = sc.nextLine();
		System.out.print("Vida inicial: ");
		int vida_1 = sc.nextInt();
		System.out.print("Ataque: ");
		int ataque_1 = sc.nextInt();
		System.out.print("Armadura: ");
		int armadura_1 = sc.nextInt();
		Champion champ_1 = new Champion(nome_1, vida_1, ataque_1, armadura_1);
		
		System.out.println();
		System.out.println("Digite os dados do segundo campeão:");
		System.out.print("Nome: ");
		sc.nextLine();
		String nome_2 = sc.nextLine();
		System.out.print("Vida inicial: ");
		int vida_2 = sc.nextInt();
		System.out.print("Ataque: ");
		int ataque_2 = sc.nextInt();
		System.out.print("Armadura: ");
		int armadura_2 = sc.nextInt();
		Champion champ_2 = new Champion(nome_2, vida_2, ataque_2, armadura_2);
		
		System.out.println();
		System.out.print("Quantos turnos você deseja executar? ");
		int N = sc.nextInt();
		
		System.out.println();
		for (int i=0; i<N; i++) {
			System.out.println("Resultado do turno " + (i+1) + ":");
			champ_1.takeDamage(champ_2);
			champ_2.takeDamage(champ_1);
			System.out.println(champ_1.status());
			System.out.println(champ_2.status());
			if (champ_1.getLife() == 0 || champ_2.getLife() == 0) {
				i = N;
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("FIM DO COMBATE");
		sc.close();
	}

}
