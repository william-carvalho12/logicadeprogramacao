/* 31.	Calcule e mosntre o quadrado dos numeros entre 10 e 150.
 ******************************************
 Objetivo: Trigésimo primeiro exercício em java
 Programador: Bruno Pallin, William V. Carvalho, Daniel Mota
 Data da Criação: 07/03/2019
 *****************************************/

package exercicios_lote01;
import javax.swing.JOptionPane;

public class Lt01_EstRepEx31 {
	public static void main(String args[]) {
		int resultado;	
	
		for (int x = 11; x < 150; x++){

			resultado = x*x;
			
			JOptionPane.showMessageDialog(null,resultado);
		}
	}
}
