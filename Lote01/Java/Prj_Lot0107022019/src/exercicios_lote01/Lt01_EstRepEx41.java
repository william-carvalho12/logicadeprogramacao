/* 41. Mostre todas as possibilidades de 2 dados de forma que a soma tenha como resultado 7
 ****************************************
 Objetivo: Quadrigésimo primeiro exercício em java
 Programador: Bruno Pallin, William V. Carvalho, Daniel Mota
 Data da Criação: xx/xx/2019
 ****************************************
 */
package exercicios_lote01;
import javax.swing.JOptionPane;

public class Lt01_EstRepEx41 {
	public static void main(String args[]) {		
		
		int x, y;
		
		for (x = 1;x <= 6;x++) {
			for (y = 1;y <= 6;y++) {
				if (x + y == 7) {
					JOptionPane.showMessageDialog(null, x + " + " + y + " = 7");
				}
			}
		}
	}
}