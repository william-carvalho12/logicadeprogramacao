//4) Serie4 = (N/1) +(N-1 / 2 ) + (N-2 / 3) + .... + (1/N)
package recursividade;
import javax.swing.JOptionPane;

public class Recursividade04 {
	public static void main(String[] args) {
		Double entrada, resultadoSerie;
		entrada = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor para a série."));
		
		resultadoSerie =  serie4(entrada);
		
		JOptionPane.showMessageDialog(null, resultadoSerie);
	}
	
	static Double serie4(Double n) {
		Double soma;
		if(n>1) {
			soma = n + serie4(n-1);
			return soma;
		} else {
			return n;
		}
	}
}
