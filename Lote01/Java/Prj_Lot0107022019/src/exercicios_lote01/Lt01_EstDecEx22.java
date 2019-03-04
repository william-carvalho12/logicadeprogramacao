/* 22.	Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.
 ****************************************
 Objetivo: Vigésimo segundo exercício em java
 Programador: Bruno Pallin, William V. Carvalho, Daniel Mota
 Data da Criação: 04/02/2019
 ****************************************
 */

package exercicios_lote01;
import javax.swing.JOptionPane;

public class Lt01_EstDecEx22 {
	public static void main(String args[]) {
		int x, y;
		
		x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de X."));
		y = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de Y"));
		
		if (x >= y){
			
			JOptionPane.showMessageDialog(null,"Valores organizados em ordem crescente: " + y +", " + x);
		}
		
		else {
			
			JOptionPane.showMessageDialog(null,"Valores organizados em ordem crescente: " + x + ", "+ y);
		}
	}
}
