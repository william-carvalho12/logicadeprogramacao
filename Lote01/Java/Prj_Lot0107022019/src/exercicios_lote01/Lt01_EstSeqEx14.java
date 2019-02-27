/* 14.	Receba 2 ângulos de um triângulo. Calcule e mostre o valor do 3º ângulo.
 ****************************************
 Objetivo: Décimo Quarto exercício em java
 Programador: Bruno Pallin
 Data da Criação: 13/02/2019 
 ****************************************
 */

package exercicios_lote01;
import javax.swing.JOptionPane;

public class Lt01_EstSeqEx14 {
	public static void main (String args[]) {
		double ang1, ang2, angX;
	
		ang1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do primeiro ângulo do triângulo"));
		ang2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do segundo ângulo do triângulo"));
		
		angX = 180 - ang1 - ang2;
		
		JOptionPane.showMessageDialog(null, "O terceiro ângulo é: " + angX);
	}
}
