package br.com.fiap;

import java.util.Scanner;

public class UsaTelevisor2 {

	public static void main(String[] args) {
		int volume, canal;
		Televisor tv2 = new Televisor();
		Scanner scan;

		try {
			scan = new Scanner(System.in);
			System.out.println("Digite o volume: ");
			volume = scan.nextInt();
			System.out.println("Digite o canal: ");
			canal = scan.nextInt();
			
			tv2.volume = volume;
			tv2.canal = canal;
			tv2.mostrarScanner();
			
		} catch (Exception e) {
			System.out.println("Formato incorreto");
		}
	}

}
