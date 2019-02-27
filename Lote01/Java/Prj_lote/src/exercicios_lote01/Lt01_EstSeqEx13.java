/* 13.	Receba a quantidade de alimento em quilos. Calcule e mostre quantos dias durará esse alimento sabendo que a pessoa consome 50g ao dia.
 ****************************************
 Objetivo: Décimo terceiro exercício em java
 Programador: Bruno Pallin
 Data da Criação: 13/02/2019 
 ****************************************
 */

package exercicios_lote01;
import javax.swing.JOptionPane;

public class Lt01_EstSeqEx13 {
	public static void main (String args[]) {
		double kg, dias;
		
		kg = Double.parseDouble(JOptionPane.showInputDialog("Insira a quantidade de quilos do alimento: "));
		
		dias = kg / 0.050;
		
		JOptionPane.showMessageDialog(null, "O alimento durará " + Math.round(dias) + " dias!");
	}
}
