/* 25.	Receba a hora de início e de final de um jogo (HH,MM), 
        calcular o tempo do jogo em horas e minutos, sabendo que
        o tempo máximo é menor que 24 horas e pode começar
		dia e terminar noutro.
 ****************************************
 Objetivo: Vigésimo quinto exercício em java
 Programador: Bruno Pallin, William V. Carvalho, Daniel Mota
 Data da Criação: 06/02/2019
 ****************************************
 */


package exercicios_lote01;
import javax.swing.JOptionPane;

public class Lt01_EstDecEx25 {
	public static void main(String args[]) {
		int horaInicio, minutosInicio, horaFim, minutosFim, horas, minutos;
		
		horaInicio = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora de início:"));
		minutosInicio = Integer.parseInt(JOptionPane.showInputDialog("Agora os minutos de início:"));
		horaFim = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora de termino:"));
		minutosFim = Integer.parseInt(JOptionPane.showInputDialog("Agora os minutos de termino:"));

		horas = horaFim - horaInicio;
		
		if (horas < 0) {
			horas = 24 + horas;
		}
		
		minutos = minutosFim - minutosInicio;
		
		if (minutos < 0) {
			if (minutosFim < minutosInicio) {
				horas--;
			}
		minutos = 60 + minutos;	
		}
		
		JOptionPane.showMessageDialog(null,"A duração do jogo foi de: " + horas + " horas e " + minutos +" minutos.");
	}
}