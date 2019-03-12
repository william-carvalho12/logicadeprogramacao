/* 23. Receba 3 valores obrigatoriamente em ordem crescente 
       e um 4º valor não necessariamente em ordem. Mostre os
       4 números em ordem crescente.
 ****************************************
 Objetivo: Vigésimo terceiro exercício em java
 Programador: Bruno Pallin, William V. Carvalho, Daniel Mota
 Data da Criação: 04/02/2019
 ****************************************
 */

package exercicios_lote01;
import javax.swing.JOptionPane;

public class Lt01_EstDecEx23 {
	public static void main(String args[]) {
		double x1, x2, x3, x4;
		
		x1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de x1")); 
		x2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de x2. (Deve ser maior que x1)"));
		x3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de x3. (Deve ser maior que x2)"));
		x4 = Double.parseDouble(JOptionPane.showInputDialog("Digite um 4° valor qualquer."));
		
		if (x4 <= x1) {
			JOptionPane.showMessageDialog(null,"Valores organizados em ordem crescente: " + x4 + ",  " + x1 + ",  " + x2 + ",  " + x3 + ".");
		}
		else if (x4 <= x2) {
			JOptionPane.showMessageDialog(null,"Valores organizados em ordem crescente: " + x1 + ",  " + x4 + ",  " + x2 + ",  " + x3 + ".");
		}
		else if (x4 <= x3) {
			JOptionPane.showMessageDialog(null,"Valores organizados em ordem crescente: " + x1 + ",  " + x2 + ",  " + x4 + ",  " + x3 + ".");	
		}
		else {
			JOptionPane.showMessageDialog(null,"Valores organizados em ordem crescente: " + x1 + ",  " + x2 + ",  " + x3 + ",  " + x4 + ".");
		}
			
		
	}
}
