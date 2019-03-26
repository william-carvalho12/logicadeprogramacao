package exercicios_lote01;
import javax.swing.JOptionPane;

public class Lt01_EstDecEx21_Modular {
	public static void main(String args[]) {
		double n1, n2, n3, n4, média;
		
		JOptionPane.showMessageDialog(null,"Digite as suas notas");
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Nota 1."));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Nota 2."));
		n3 = Double.parseDouble(JOptionPane.showInputDialog("Nota 3."));
		n4 = Double.parseDouble(JOptionPane.showInputDialog("Nota 4."));
	
		média = (n1+n2+n3+n4)/4;
		
		if(média >= 6) {
			JOptionPane.showMessageDialog(null,"Situação - Aprovado com média "+ média);
		}
		
		else {
	
			if(média < 3){
			JOptionPane.showMessageDialog(null,"Situação - Retido com média "+ média);
			}
			
			else {
				JOptionPane.showMessageDialog(null,"Situação - EXAME com média " + média);
			}
		}
	}

}
