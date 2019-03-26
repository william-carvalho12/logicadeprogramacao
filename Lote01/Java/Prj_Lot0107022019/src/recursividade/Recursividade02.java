//2)   Serie2 = (N) + (N-1) + (N-2) + ... + (1) 
package recursividade;
import javax.swing.JOptionPane;

public class Recursividade02 {
	public static void main(String[] args) {		
		int entrada, resultadoSerie;
		
		entrada = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor para a série."));

		resultadoSerie = serie2(entrada);
		JOptionPane.showMessageDialog(null, resultadoSerie);		
		
	}
	
	static int serie2(int n) {
		int soma;
		if(n>1) {
			soma = n + serie2(n-1);
			return soma;
		} else {
			return n;
		}
	}
}