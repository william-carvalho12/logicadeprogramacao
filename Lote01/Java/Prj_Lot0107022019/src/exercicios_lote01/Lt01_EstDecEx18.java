/* 18. Receba dois valores inteiros. Calcule e mostre o resultado da diferença do maior pelo menor.
 ****************************************
 Objetivo: Décimo oitavo exercício em java
 Programador: Bruno Pallin, William V. Carvalho, Daniel Mota
 Data da Criação: 26/02/2019
 ****************************************
 */

package exercicios_lote01;
import javax.swing.JOptionPane;

public class Lt01_EstDecEx18 {
	public static void main(String args[]) {
		
		int x, y, df;
		
		x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de x."));
		y = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de y."));
		
		if (x >= y) {
			
			df = x-y;	
		}
		
		else {
			
			df = y-x;
		}
		
		JOptionPane.showMessageDialog(null,"A diferença do maior pelo menor é de " + df);
	}
}
