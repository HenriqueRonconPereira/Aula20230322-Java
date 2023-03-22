package br.com.fiap;

import javax.swing.JOptionPane;

public class ArCondicionado {
	public int temperatura;
	public String modo;
	

	public void aumentarTemp() {
		this.temperatura++;
	}
	
	public void diminuirTemp() {
		this.temperatura--;
	}
	
	public void trocarModo(String modo) {
		this.modo = modo;
	}
	
	public void mostrar() {
		JOptionPane.showMessageDialog(null, 
				"Temperatura atual: " + this.temperatura + 
				"\nModo Atual: " + this.modo);
	}
}
