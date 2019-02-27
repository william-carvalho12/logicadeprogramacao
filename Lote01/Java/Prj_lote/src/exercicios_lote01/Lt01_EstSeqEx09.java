/* 9.	Receba os 2 números inteiros. Calcule e mostre a soma dos quadrados.
 ****************************************
 Objetivo: Oitavo exercício em java
 Programador: Bruno Pallin
 Data da Criação: 13/02/2019 
 ****************************************
 */

package exercicios_lote01;
import javax.swing.JOptionPane;

public class Lt01_EstSeqEx09 {
	public static void main (String ags[]) {
		int num1, num2, soma;
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro número(inteiro):"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo número(inteiro):"));
		
		soma = num1*num1 + num2*num2;
		
		JOptionPane.showMessageDialog(null, "A soma dos quadradados é: "+soma);
		
	}
}
