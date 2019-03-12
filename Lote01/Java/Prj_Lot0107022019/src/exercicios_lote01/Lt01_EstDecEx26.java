/* 26. Receba 2 números inteiros. Verifique e mostre
  	   se o maior número é múltiplo do menor.
 ****************************************
 Objetivo: Vigésimo sexto exercício em java
 Programador: Bruno Pallin, William V. Carvalho, Daniel Mota
 Data da Criação: 07/03/2019
 ****************************************
 */

package exercicios_lote01;
import javax.swing.JOptionPane;

public class Lt01_EstDecEx26 {
	public static void main(String args[]) {
		int x, y, r;
		
		x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de x."));
		y = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de y."));
		
		if(x >= y) {
			r = x % y;
		}
		
		else {
			r = y % x;
		}
		
		if(r == 0) {
			JOptionPane.showMessageDialog(null, "O maior é multiplo do menor. ");
		}
		
		else {
			JOptionPane.showMessageDialog(null, "O maior não é multiplo do menor.");
		}
	}
}
