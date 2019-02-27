/* 8.	Receba o valor de um depósito em poupança. Calcule e mostre o valor após 1 mês de aplicação sabendo que rende 1,3% a. m.
 ****************************************
 Objetivo: Oitavo exercício em java
 Programador: Bruno Pallin, William V. Carvalho, Daniel Mota
 Data da Criação: 13/02/2019 
 ****************************************
 */
package exercicios_lote01;

import javax.swing.JOptionPane;

public class Lt01_EstSeqEx08 {
	public static void main (String args[]) {
		double 	deposito, aplicado;
		
		deposito = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do depósito"));
		
		aplicado = deposito * 1.013;
		
		JOptionPane.showMessageDialog(null, "O valor após um mês de aplicação é: " + aplicado);
	}
}
