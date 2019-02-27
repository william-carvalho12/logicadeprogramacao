/* 5.	Receba os coeficientes A, B e C de uma equação do 2º grau (AX²+BX+C=0). Calcule e mostre as raízes reais (considerar que a 
 equação possue 2 raízes).
 ****************************************
 Objetivo: Quinto exercício em java
 Programador: Bruno Pallin, William V. Carvalho, Daniel Mota
 Data da Criação: 12/02/2019 
 ****************************************
 */

package exercicios_lote01;
import javax.swing.JOptionPane;

public class Lt01_EstSeqEx05 {
	public static void main (String args[]) {
		double a, b, c, delta, r1, r2;
		String raizes;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de A da equação de 2º grau:")); //2
		b = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de B da equação de 2º grau:")); //5
		c = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de C da equação de 2º grau:")); // 2

		delta = (b*b) - (4*a*c); //9
		
		r1 = (-b + Math.sqrt(delta))/(2*a);
		r2 = (-b - Math.sqrt(delta))/(2*a);				
	
		raizes = "A raizes são:\n" + "R1: " + r1 + "\nR2: " + r2;
		JOptionPane.showMessageDialog(null, raizes);
	}

}
