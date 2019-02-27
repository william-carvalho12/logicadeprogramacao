/* 1.	Coletar o valor do lado de um quadrado, calcular sua área e apresentar o resultado.
 ****************************************
 Objetivo: Primeiro Exercício em Java
 Programador: Bruno Pallin
 Data da Criação: 12/02/2019 
 ****************************************
 */


package exercicios_lote01;
import javax.swing.JOptionPane;

public class Lt01_EstSeqEx01 {
	public static void main (String args[]) {
		double lado, area; 
		lado = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do lado do quadrado:"));
		area = lado * lado;
		JOptionPane.showMessageDialog(null, "A area do quadrado é:" + area);
	}
}
