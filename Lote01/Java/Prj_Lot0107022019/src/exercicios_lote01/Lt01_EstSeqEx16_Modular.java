package exercicios_lote01;

import javax.swing.JOptionPane;

public class Lt01_EstSeqEx16_Modular {
	public static void main (String args[]) {
		double horasTrab, valorPH, percentualDesconto, salarioB=0, salarioL=0, salarioFinal;
		int descendentes;
		
		horasTrab = Double.parseDouble(JOptionPane.showInputDialog("Insira as horas trabalhadas:"));
		valorPH =  Double.parseDouble(JOptionPane.showInputDialog("Insira o valor por hora:"));
		percentualDesconto =  Double.parseDouble(JOptionPane.showInputDialog("Insira o percentual de desconto:"));
		descendentes = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de descendente"));

		salarioFinal = salario(percentualDesconto, salarioB, horasTrab, valorPH, salarioL, descendentes);
		
		JOptionPane.showMessageDialog(null, "O salario final é: " + salarioFinal);
	}
	
	static double salario(double percentualDesconto, double salarioB, double horasTrab, double valorPH, double salarioL, double descendentes){
	
	
		percentualDesconto = percentualDesconto/100;
		double salario;
		
		salarioB = horasTrab * valorPH;
		salarioL = salarioB * (1-percentualDesconto); 
		
		salario = salarioL + descendentes*100;
	
		return salario;

	}
}