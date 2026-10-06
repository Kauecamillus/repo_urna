package exercicio_urna;
import javax.swing.JOptionPane;
public class Main {

	public static void main(String[] args) {
		
		String qtt = JOptionPane.showInputDialog(null, "Insira a quantidade de candidatos a representa de classe.");
		int qt = Integer.parseInt(qtt);
		
		String candidato [] = new String[qt];
		
		for (int i = 0; i < qt; i++) {
			candidato[i] = JOptionPane.showInputDialog(null, "Insira o seu nome candidato.");
		}
		
	}

}
