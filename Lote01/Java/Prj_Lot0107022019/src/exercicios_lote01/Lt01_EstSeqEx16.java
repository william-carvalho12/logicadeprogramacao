/* 16.	Receba a quantidade de horas trabalhadas, o valor por hora, o percentual de desconto e o número de descendentes. Calcule o salário que serão as horas trabalhadas x o valor por hora.
 Calcule o salário líquido (= Salário Bruto – desconto). A cada dependente será acrescido R$ 100 no Salário Líquido. Exiba o salário a receber.
 ****************************************
 Objetivo: Décimo sexto exercício em java
 Programador: Bruno Pallin, William V. Carvalho, Daniel Mota
 Data da Criação: 13/02/2019 
 ****************************************
 */

package exercicios_lote01;
import javax.swing.JOptionPane;

public class Lt01_EstSeqEx16 {
	public static void main (String args[]) {
		double horasTrab, valorPH, percentualDesconto, salarioB, salarioL, salarioFinal;
		int descendentes;
		
		horasTrab = Double.parseDouble(JOptionPane.showInputDialog("Insira as horas trabalhadas:"));
		valorPH =  Double.parseDouble(JOptionPane.showInputDialog("Insira o valor por hora:"));
		percentualDesconto =  Double.parseDouble(JOptionPane.showInputDialog("Insira o percentual de desconto:"));
		descendentes = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de descendente"));

		percentualDesconto = percentualDesconto/100;
		
		salarioB = horasTrab * valorPH;
		salarioL = salarioB * (1-percentualDesconto); 
		
		salarioFinal = salarioL + descendentes*100;
		
		JOptionPane.showMessageDialog(null, "O salario final é: " + salarioFinal);
	}
}