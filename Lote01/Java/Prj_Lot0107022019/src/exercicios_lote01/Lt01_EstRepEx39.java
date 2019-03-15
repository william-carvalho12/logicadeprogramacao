/* 39.	Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde:
Casa: 	1	2	3	4	...	64	
Qdte:	1	2	4	8	...	N
 ****************************************
 Objetivo: Trigésimo oitavo exercício em java
 Programador: Bruno Pallin, William V. Carvalho, Daniel Mota
 Data da Criação: 13/03/2019
 ****************************************
 */
package exercicios_lote01;
import javax.swing.JOptionPane;

public class Lt01_EstRepEx39 {
	public static void main(String args[]) {
		double qnt = 0;
		
		for (int i = 0; i < 64; i++) {
			qnt = qnt + Math.pow(2, i);
		}
		
		JOptionPane.showMessageDialog(null,"A quantidade de graos no tabuleiro é de " + qnt);
	}
}