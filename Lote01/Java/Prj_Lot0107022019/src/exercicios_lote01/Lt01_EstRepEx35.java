/* 35.	Receba 2 números inteiros, verifique qual o maior entre
  		eles. Calcule e mostre o resultado da somatória dos números
  		ímpares entre esses valores.

 ****************************************
 Objetivo: Trigésimo quinto exercício em java
 Programador: Bruno Pallin, William V. Carvalho, Daniel Mota
 Data da Criação: 10/03/2019
 ****************************************
 */
package exercicios_lote01;
import javax.swing.JOptionPane;

public class Lt01_EstRepEx35 {
	public static void main(String args[]) {
		int x, y, soma=0, resto;
		
		x = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor."));
		y = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor."));
		
		if (x > y) {
			
			for (int c = y+1; c < x; c++) {
				
				if (c % 2 == 1){
					soma = soma + c;				
				}
			}
		}
		
		else {
			
			for (int c = x+1; c < y; c++) {
				if (c % 2 == 1){
					soma = soma + c;			
				}
			}
		}
		JOptionPane.showMessageDialog(null,"A somatória é: " + soma);
	}
}


