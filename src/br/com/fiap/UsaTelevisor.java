package br.com.fiap;
import javax.swing.JOptionPane;

public class UsaTelevisor {

	public static void main(String[] args) {
		int volume, canal;
		
		Televisor televisor1 = new Televisor();
		String aux;
		try {
			aux = JOptionPane.showInputDialog("Digite o nivel do volume: ");
			volume = Integer.parseInt(aux);
			aux = JOptionPane.showInputDialog("Digite o numero do canal: ");
			canal = Integer.parseInt(aux);
			
			televisor1.volume = volume;
			televisor1.canal = canal;
			televisor1.mostrar();
			televisor1.aumentarVolume();
			televisor1.aumentarVolume();
			televisor1.aumentarVolume();
			televisor1.mostrar();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Formato incorreto");
		}
	}
}
