/* 7.	Receba os valores do comprimento, largura e altura de um paralelepípedo. Calcule e mostre seu volume.
 ****************************************
 Objetivo: Sétimo exercício em java
 Programador: Bruno Pallin, William V. Carvalho, Daniel Mota
 Data da Criação: 12/02/2019 
 ****************************************
 */

package exercicios_lote01;
import javax.swing.JOptionPane;

public class Lt01_EstSeqEx07 {
	public static void main (String args[]) {
		double comprimento, largura, altura, volume; 
		
		comprimento = Double.parseDouble(JOptionPane.showInputDialog("Insira o comprimento do paralelepípedo"));
		largura = Double.parseDouble(JOptionPane.showInputDialog("Insira o largura do paralelepípedo"));
		altura= Double.parseDouble(JOptionPane.showInputDialog("Insira o altura do paralelepípedo"));
		
		volume = comprimento * largura * altura;
		
		JOptionPane.showMessageDialog(null, "O volume do paralelepípedo é: " + volume);
	}
}
