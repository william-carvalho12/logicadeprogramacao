/* 20. Receba 3 coeficientes A, B, e C de uma equação do 2º grau
       da fórmula AX²+BX+C=0. Verifique e mostre a existência de
       raízes reais e se caso exista, calcule e mostre.
 ****************************************
 Objetivo: Vigésimo exercício em java
 Programador: Bruno Pallin, William V. Carvalho, Daniel Mota
 Data da Criação: 27/02/2019
 ****************************************
 */
package exercicios_lote01;
import javax.swing.JOptionPane;

public class Lt01_EstDecEx20 {
	public static void main(String args[]) {
		int a, b, c, delta, r1, r2;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A."));
		b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B."));
		c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de C."));
		
		delta = (b^2) - 4*a*c;

		if (delta >= 0){
			
			r1 = (-b + delta^(1/2)) / (2*a);
			r2 = (-b - delta^(1/2)) / (2*a);
			
			JOptionPane.showMessageDialog(null,"O valor das raízes são: R1 = " + r1 + " R2 = "+ r2 + "." );
		}
	
		else {
			JOptionPane.showMessageDialog(null,"Não existem raízes reais.");
		}
	
	}
}
