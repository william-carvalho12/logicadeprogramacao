/* 4.	Receba a temperatura em graus Celsius. Calcule e mostre a sua temperatura convertida em fahrenheit F = (9*C+160) /5.
 ****************************************
 Objetivo: Quarto exercício em java
 Programador: Bruno Pallin
 Data da Criação: 12/02/2019 
 ****************************************
 */


package exercicios_lote01;
import javax.swing.JOptionPane;


public class Lt01_EstSeqEx04 {
	public static void main (String args[]) {
		double C, F;
		String resultado;
		C = Double.parseDouble(JOptionPane.showInputDialog("Insira a temperatura em graus Celsius"));
		F = (9*C+160)/5;
		resultado =  C + "ºC em Fahrenheit é:" +F + "ºF";
		JOptionPane.showMessageDialog(null, resultado);
	}
}
