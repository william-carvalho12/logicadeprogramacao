// 5) Serie5 = (N)! + (N-1)! + (N-2)! + ... + (1)!
package recursividade;
import javax.swing.JOptionPane;
public class Recursividade05 {	
	public static void main(String[] args) {
		int entrada, resultadoSerie;
		
		entrada = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da série 5"));
		
		resultadoSerie = serie5(entrada);
		
		JOptionPane.showMessageDialog(null, resultadoSerie);
		
	}
	
	static int serie5(int n) {
		int serie;
		if (n>1) {
			serie = Fat(n) + serie5(n-1);
			return serie;
		} else {
			return n;
		}
	
	}
	
	static int Fat(int n) {
		int fatorial = 1;;
		
		if(n>1) {
			fatorial = n * Fat(n-1);
			return fatorial;
		} else {
			return n;
		}
	}
	


}
