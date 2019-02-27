/* 12.	Receba o ano de nascimento e o ano atual. Calcule e mostre a sua idade e quantos anos terá daqui a 17 anos.
 ****************************************
 Objetivo: Décimo Segundo exercício em java
 Programador: Bruno Pallin
 Data da Criação: 13/02/2019 
 ****************************************
 */

package exercicios_lote01;
import javax.swing.JOptionPane;

public class Lt01_EstSeqEx12 {
	public static void main (String args[]) {
		int anoNascimento, anoAtual, ano;
		
		anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Insira seu ano de nascimento:"));
		anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Insira o ano atual:" ));
		
		ano = anoAtual - anoNascimento;
		
		JOptionPane.showMessageDialog(null, "Sua idade é: " + ano);
	}
}