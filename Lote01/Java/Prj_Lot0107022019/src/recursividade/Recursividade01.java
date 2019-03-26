//1) Serie1 = (1+2+3+...+100)
package recursividade;
import javax.swing.JOptionPane;

public class Recursividade01 {

	public static void main(String[] args) {
		int n = 1; 
		
		n = serieSoma(n);
		JOptionPane.showMessageDialog(null, n);
	}
	
	static int serieSoma(int n) {
		int soma = 0;
		
		if (n<100) {
			soma = n + serieSoma(n + 1);
			return soma;
		} else {
			return n;
		}
		
	}
	
}
