/* 40.	Receba 2 números inteiros. Verifique e mostre todos os números primos existentes entre eles.
 ****************************************
 Objetivo: Quadrigésimo exercício em java
 Programador: Bruno Pallin, William V. Carvalho, Daniel Mota
 Data da Criação: 07/03/2019
 ****************************************
 */
package exercicios_lote01;
import javax.swing.JOptionPane;

public class Lt01_EstRepEx40 {
	public static void main(String args[]) {
		int maior, menor, valor1, valor2, i;
		boolean primo;
		String msg = "";
		
		valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor 1."));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor 2."));
		
		if (valor1 > valor2) {
			maior = valor1;
			menor = valor2;		
		}
		else {
			maior = valor2; 
			menor = valor1;	
		}
		
		for (i = menor;i<=maior;i++){
				
			primo = true;
			
			if (i == 1){
				primo = false;
			}	
					
					
			if (primo) {
				if ((i%2 == 0) && (i != 2)) {
					primo = false;
				}
			}
					
					
			if(primo) {
				
				for(int j = 3; j <= (i/2); j++) {
					if (i%j == 0) {
						primo = false;
					}
				}
			}
			
					
			if (primo){
				msg += i + " ";
			}
			
		}
		JOptionPane.showMessageDialog(null,"Os numeros entre os dois valores são: " + msg);
	}
}