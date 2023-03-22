package br.com.fiap;

import javax.swing.JOptionPane;

public class Televisor {
	public int volume, canal;
	
	public void aumentarVolume() {
		this.volume++;
	}
	
	public void diminuirVolume() {
		this.volume--;
	}
	
	public void trocarCanal(int canal) {
		this.canal = canal;
	}
	
	public void mostrar() {
		JOptionPane.showMessageDialog(null, 
				"Volume atual: " + this.volume + 
				"\nCanal Atual: " + this.canal);
	}
	
	public void mostrarScanner() {
		System.out.println(
				"Volume atual: " + this.volume + 
				"\nCanal Atual: " + this.canal);			
	}
}
