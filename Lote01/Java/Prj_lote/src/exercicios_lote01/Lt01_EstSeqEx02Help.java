/* 2.	Receba o salário de um funcionário e mostre o novo salário com reajuste de 15%.
 ****************************************
 Objetivo: Segundo exercício em java
 Programador: Bruno Pallin
 Data da Criação: 12/02/2019 
 ****************************************
 */

package exercicios_lote01;
import javax.swing.JOptionPane;

public class Lt01_EstSeqEx02Help {
	public static void main (String args[]) {
		double salario, salarioNovo;
		salario = Double.parseDouble(JOptionPane.showInputDialog("Insira o salário:"));
		salarioNovo = salario * 1.15;
		JOptionPane.showMessageDialog(null, "O novo salário é: R$" + salarioNovo);
	}
}
 //O calculo de 100 dá 114,999, não 115