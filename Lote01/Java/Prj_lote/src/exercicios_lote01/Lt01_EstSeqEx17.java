/* 17.	Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l. Receber o tempo de percurso e a velocidade média.
 ****************************************
 Objetivo: Décimo sétimo exercício em java
 Programador: Bruno Pallin
 Data da Criação: 13/02/2019 
 ****************************************
 */

package exercicios_lote01;
import javax.swing.JOptionPane;

public class Lt01_EstSeqEx17 {
	public static void main (String args[]) {
		double qntLitros, tempo, vM, distancia;
		
		tempo = Double.parseDouble(JOptionPane.showInputDialog("Insira o tempo do percurso:"));
		vM = Double.parseDouble(JOptionPane.showInputDialog("Insira a velocidade média:"));
		
		distancia = tempo * vM;
		
		qntLitros = distancia/12;
		
		JOptionPane.showMessageDialog(null, "A quantidade de litros que serão gastos na viagem é de: " + qntLitros);
	}
}
