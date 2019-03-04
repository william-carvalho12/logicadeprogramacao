/* 21.	Receba 4 notas bimestrais de um aluno. Calcule e mostre 
 * 		a média aritmética. Mostre a mensagem de acordo com a média:
		 a. Se a média for >= 6,0 exibir “APROVADO”;
		 b.	Se a média for >= 3,0 ou < 6,0 exibir “EXAME”;
		 c.	Se a média for < 3,0 exibir “RETIDO”.

 ****************************************
 Objetivo: Vigésimo primeiro exercício em java
 Programador: Bruno Pallin, William V. Carvalho, Daniel Mota
 Data da Criação: 27/02/2019
 ****************************************
 */
package exercicios_lote01;
import javax.swing.JOptionPane;

public class Lt01_EstDecEx21 {
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
