/* 27.	Receba o número de voltas, a extensão do circuito (em metros)
  		e o tempo de duração (minutos). Calcule e mostre a velocidade média em km/h.

 ****************************************
 Objetivo: Vigésimo sétimo exercício em java
 Programador: Bruno Pallin, William V. Carvalho, Daniel Mota
 Data da Criação: 07/03/2019
 ****************************************
 */


package exercicios_lote01;
import javax.swing.JOptionPane;

public class Lt01_EstDecEx27 {
	public static void main(String args[]) {
		int nV, eC, t, vM;
		
		nV = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do número de voltas."));
		eC = Integer.parseInt(JOptionPane.showInputDialog("Digite a extensão do circuito. (metros"));
		t  = Integer.parseInt(JOptionPane.showInputDialog("Digite a dura"));
		
		vM = (nV * eC) / t;
		vM = (vM * 60) / 1000;
		
		JOptionPane.showMessageDialog(null, "A velocidade média é de " + vM);
	}
}
