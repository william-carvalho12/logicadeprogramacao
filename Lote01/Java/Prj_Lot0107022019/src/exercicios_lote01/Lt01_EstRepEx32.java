/* 32.	Receba um número inteiro. Calcule e mostre o seu fatorial.
 ******************************************
 Objetivo: Trigésimo segundo exercício em java
 Programador: Bruno Pallin, William V. Carvalho, Daniel Mota
 Data da Criação: 07/03/2019
 *****************************************/
package exercicios_lote01;
import javax.swing.JOptionPane;

public class Lt01_EstRepEx32 {
	public static void main(String args[]){
		int y, x;
		
		x = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para que seu fatorial sera calculado."));
		y = x;
		
		while (x>1){
			y = y * (x-1);
			x--;
		}
		
		JOptionPane.showMessageDialog(null,"O fatorial desse valor é " + y);
	}
}
