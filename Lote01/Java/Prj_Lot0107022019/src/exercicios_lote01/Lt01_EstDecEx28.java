/* 28 . Receba a média mensal e o preço atual de um produto. 
 		Calcule e mostre o novo preço sabendo que:

	Venda Mensal    | 	Preço Atual	 |   Preço Novo
	< 500           |	  < 30       |	+10%
	>= 500 e < 1000 |  >= 30 e < 80  |  +15%
	>= 1000      	|     >= 80      |  -5%

Obs.: para outras condições, preço novo será igual ao preço atual.

 ****************************************
 Objetivo: Vigésimo oitavo exercício em java
 Programador: Bruno Pallin, William V. Carvalho, Daniel Mota
 Data da Criação: 07/03/2019
 ****************************************
 */



package exercicios_lote01;
import javax.swing.JOptionPane;

public class Lt01_EstDecEx28 {
	public static void main(String args[]) {
		double precoA, mediaM, precoN;
		
		mediaM = Double.parseDouble(JOptionPane.showInputDialog("Digite a média mensal do produto."));
		precoA = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto atual."));
		
		if (mediaM < 500 && precoA < 30) {
			precoN = precoA * 1.10;
		}
		
		else if (mediaM >= 500 && mediaM < 1000 && precoA >= 30 && precoA < 80){
			precoN = precoA * 0.95;
		}
		
		else{
			precoN = precoA;
		}
		
		JOptionPane.showMessageDialog(null,"O novo preço do produto é de " + precoN);		
	}
}
