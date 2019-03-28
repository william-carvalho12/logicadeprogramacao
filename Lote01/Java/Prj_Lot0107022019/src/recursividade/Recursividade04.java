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
		return serie4Full(n, 1);
	}
	
	static Double serie4Full(Double n, int denominador) {
		Double soma;		
		if(n>=1) {
			soma = n/denominador + serie4Full(n-1, denominador+1);
			return soma;
		} else {
			return n;
		}
	}
}
