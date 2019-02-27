/* 3.	Receba a base e a altura de um triângulo. Calcule e mostre a sua área.
 ****************************************
 Objetivo: Terceiro exercício em java
 Programador: Bruno Pallin, William V. Carvalho, Daniel Mota
 Data da Criação: 12/02/2019 
 ****************************************
 */

package exercicios_lote01;
import javax.swing.JOptionPane;

public class Lt01_EstSeqEx03 {
	public static void main (String args[]) {
		double base, altura, area;
		
		base = Double.parseDouble(JOptionPane.showInputDialog("Insira a base do Triângulo:"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Insira a altura do triângulo"));
		
		area = (base*altura)/2;
	
		JOptionPane.showMessageDialog(null, "A área do quadrado é: " + area);
		
	}
}
