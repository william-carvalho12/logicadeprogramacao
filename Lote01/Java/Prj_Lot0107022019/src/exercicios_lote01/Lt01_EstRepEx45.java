/* 1.	Calcule e mostre a série 1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225
 ****************************************
 Objetivo: Quadrigésimo quinto exercício em java
 Programador: Bruno Pallin, William V. Carvalho, Daniel Mota
 Data da Criação: 07/03/2019
 ****************************************
 */

package exercicios_lote01;

import javax.swing.JOptionPane;

public class Lt01_EstRepEx45 {
	public static void main(String[] args) {
		
		double x = 1, y, resultado = 0;
		
		while (x <= 15) {
			y = Math.pow(x, 2);
			
			if (x % 2 == 1) {
				resultado = resultado + (x/y);
				JOptionPane.showMessageDialog(null,"O resultado da série é  " + x + "/" + y + "  =  " + resultado);
			}
			else {
				resultado = resultado - (x/y);
				JOptionPane.showMessageDialog(null,"O resultado da série é  -" + x + "/" + y + "  =  " + resultado);
			}
			x++;
		}
	}
}
