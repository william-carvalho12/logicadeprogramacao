/* 11.	Receba o raio de uma circunferência. Calcule e mostre o comprimento da circunferência.
 ****************************************
 Objetivo: Décimo primeiro exercício em java
 Programador: Bruno Pallin
 Data da Criação: 13/02/2019 
 ****************************************
 */

package exercicios_lote01;
import javax.swing.JOptionPane;

public class Lt01_EstSeqEx11 {
	public static void main (String args[]) {
		double raio, circunference;
		
		raio = Double.parseDouble(JOptionPane.showInputDialog("Insira o raio do círculo"));
		
		circunference = 2*Math.PI*raio;
		
		JOptionPane.showMessageDialog(null, "A circunferência do círculo é: " + circunference);
	}
}
