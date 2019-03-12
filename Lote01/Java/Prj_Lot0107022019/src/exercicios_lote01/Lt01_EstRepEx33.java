/* 33. Receba um valor. Calcule e motre a série 1 + 1/2 + 1/3 + ... 1/n
 ******************************************
 Objetivo: Trigésimo Terceiro exercício em java
 Programador: Bruno Pallin, William V. Carvalho, Daniel Mota
 Data da Criação: 07/03/2019
 *****************************************/
package exercicios_lote01;
import javax.swing.JOptionPane;

public class Lt01_EstRepEx33 {
	public static void main(String args[]) {
		double n = 0; 
		double soma = 0.0;
		
		n = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor."));
		
		for (double x = n; x >= 1 ; x--){
			soma = soma + (1 / x);
		}
		
		JOptionPane.showMessageDialog(null,"Valor da série = " + soma);
	}
}