/* 34.	Receba um número. Calcule e mostre os resultados da tabuada desse número.
 ****************************************
 Objetivo: trigésimo quarto exercício em java
 Programador: Bruno Pallin, William V. Carvalho, Daniel Mota
 Data da Criação: 10/03/2019
 ****************************************
 */
package exercicios_lote01;
import javax.swing.JOptionPane;

public class Lt01_EstRepEx34 {
	public static void main(String args[]) {
		int Resultado, x;
		
		x = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para calcular sua tatuada."));
		
		for (int c = 0; c <= 10; c++) {
			Resultado = c * x;
			JOptionPane.showMessageDialog(null, x + " x " + c + " = " + Resultado);		
		}
		
		
	}
}
