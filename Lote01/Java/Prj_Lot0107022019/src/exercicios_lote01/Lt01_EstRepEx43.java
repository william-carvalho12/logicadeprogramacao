/* 43. Calcule e mostre quantos anos serão necessários para que 
       ana seja maior que maria sabendo que ana tem 1.10m e cresce
       3cm ao ano e maria tem 1.5m e cresce 2cm ao ano.
 ****************************************
 Objetivo: Quadrigésimo terceiro exercício em java
 Programador: Bruno Pallin, William V. Carvalho, Daniel Mota
 Data da Criação: 07/03/2019
 ****************************************
 */

package exercicios_lote01;
import javax.swing.JOptionPane;

public class Lt01_EstRepEx43 {
	public static void main(String[] args) {
		int ana, maria, ano = 0;
		
		ana = 110;
		maria = 150;
		
		while(ana <= maria) {
			ana = maria + 3;
			maria = ana + 2;
			ano++;
		}
		
		JOptionPane.showMessageDialog(null,"Serão necessários " + ano + " anos.");
	}
}
