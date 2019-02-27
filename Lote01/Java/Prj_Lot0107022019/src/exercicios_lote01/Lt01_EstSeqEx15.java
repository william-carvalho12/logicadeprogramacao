/* 15.	Receba os valores de 2 catetos de um triângulo retângulo. Calcule e mostre a hipotenusa.
 ****************************************
 Objetivo: Décimo quinto exercício em java
 Programador: Bruno Pallin, William V. Carvalho, Daniel Mota
 Data da Criação: 13/02/2019 
 ****************************************
 */

package exercicios_lote01;
import javax.swing.JOptionPane;

public class Lt01_EstSeqEx15 {
	public static void main (String args[]) {
		double cateto1, cateto2, hipotenusa;
		
		cateto1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do primeiro cateto: "));
		cateto2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do primeiro cateto: "));
		
		hipotenusa = Math.sqrt(cateto1*cateto1 + cateto2*cateto2);
		
		JOptionPane.showMessageDialog(null, "A hipotenusa do triângulo retângulo é: " + hipotenusa);
	}
}
