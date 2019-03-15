/* 37.	Receba um número inteiro. Calcule e mostre a série de Fibonacci 
  		até o seu N’nésimo termo.
 ****************************************
 Objetivo: Trigésimo sétimo exercício em java
 Programador: Bruno Pallin, William V. Carvalho, Daniel Mota
 Data da Criação: 07/03/2019
 ****************************************
 */

package exercicios_lote01;
import javax.swing.JOptionPane;

public class Lt01_EstRepEx37 {
	public static void main(String args[]) {
		int n, valor=0, valor2, troca;
		
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para calcular a série de fibonacci até ele."));
		
		valor2 = 1;
		
		for(int i=0;i<=n;i++) {
			JOptionPane.showMessageDialog(null,valor);
			troca = valor;
			valor = valor2;
			valor2 = troca;
			valor = valor + valor2;			
		}
	}
}