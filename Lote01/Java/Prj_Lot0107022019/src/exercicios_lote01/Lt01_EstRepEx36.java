
/* 36.	Receba um número N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N!
 ****************************************
 Objetivo: Trigésimo sexto exercício em java
 Programador: Bruno Pallin, William V. Carvalho, Daniel Mota
 Data da Criação: 07/03/2019
 ****************************************
 */
package exercicios_lote01;
import javax.swing.JOptionPane;

public class Lt01_EstRepEx36 {
	public static void main(String args[]) {
		double n, x, fatorial, serie;
		
		n = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor para caluclar a série."));
		
		n = n+1;
		x = 1;
		fatorial = 1;
		serie = 1;
		
		while(x <= n) {
			fatorial = fatorial * x;
			x++;
			JOptionPane.showMessageDialog(null,serie);
			serie = serie + 1/fatorial;
		}
	}
}