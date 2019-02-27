/* 10.	Receba 2 números reais. Calcule e mostre a diferença desses valores.
 ****************************************
 Objetivo: Décimo exercício em java
 Programador: Bruno Pallin, William V. Carvalho, Daniel Mota
 Data da Criação: 13/02/2019 
 ****************************************
 */

package exercicios_lote01;
import javax.swing.JOptionPane;

public class Lt01_EstSeqEx10 {
	public static void main (String args[]) {
		double num1, num2, diferenca ;
		
		num1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro valor:"));
		num2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo valor:"));
		
		diferenca = num1 - num2;
		
		JOptionPane.showMessageDialog(null, "A diferença desses valores é de: " + diferenca);
	}
}
