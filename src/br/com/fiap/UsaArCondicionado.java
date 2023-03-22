package br.com.fiap;

import javax.swing.JOptionPane;

public class UsaArCondicionado {

	public static void main(String[] args) {
		int temperatura;
		String modo;
		
		ArCondicionado arcond1 = new ArCondicionado();
		String aux;
		
		try {
			aux = JOptionPane.showInputDialog("Digite a temperatura: ");
			temperatura = Integer.parseInt(aux);
			aux = JOptionPane.showInputDialog("Digite o modo: ");
			modo = aux;
			
			arcond1.temperatura = temperatura;
			arcond1.modo = modo;
			arcond1.mostrar();
			arcond1.trocarModo(JOptionPane.showInputDialog("Digite o modo: "));
			arcond1.aumentarTemp();
			arcond1.aumentarTemp();
			arcond1.aumentarTemp();
			arcond1.mostrar();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Formato incorreto");
		}

	}

}
