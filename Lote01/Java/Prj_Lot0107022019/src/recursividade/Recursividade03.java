//3)   Serie3 = (1/1) + (1/2) + (1/3) + ....+ (1/N)
package recursividade;
import javax.swing.JOptionPane;

public class Recursividade03 {
	public static void main(String[] args) {
		Double entrada, resultadoSerie;
		
		entrada = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor para a série."));
		
		resultadoSerie = serie3(entrada);
		
		JOptionPane.showMessageDialog(null, resultadoSerie);
	}
	
	static Double serie3(Double n) {
		Double soma;
		
		if (n > 1) {
			soma = (1/n) + serie3(n-1);
			return soma;
		} else {
			return n;
		}
	}
}
