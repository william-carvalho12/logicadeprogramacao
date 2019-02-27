/* 6.	Receba os valores em x e y. Efetua a troca de seus valores e mostre seus conteúdos.
 ****************************************
 Objetivo: Sexto exercício em java
 Programador: Bruno Pallin
 Data da Criação: 12/02/2019 
 ****************************************
 */
package exercicios_lote01;
import javax.swing.JOptionPane;

public class Lt01_EstSeqEx06 {
	public static void main (String args[]) {
		double x, y, troca;
		
		x = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de x:"));
		y = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de y:"));
		
		troca = x;
		x = y;
		y = troca;
		
		JOptionPane.showMessageDialog(null, "O valor trocado ficará:\n" + "x: " + x + "\ny: " + y);
	}
}
