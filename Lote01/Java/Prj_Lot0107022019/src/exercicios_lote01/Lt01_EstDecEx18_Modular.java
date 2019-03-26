package exercicios_lote01;
import javax.swing.JOptionPane;


public class Lt01_EstDecEx18_Modular {
	public static void main(String args[]) {
		
		int x, y, df;
			
		x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de x."));
		y = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de y."));
		
		df = diferenca(x,y);
		
		JOptionPane.showMessageDialog(null,"A diferença do maior pelo menor é de " + df);
	}
	
	static int diferenca(int x,int y) {
		int diferenca;
		
		if (x >= y) {
			
			diferenca = x-y;	
		}
		
		else {
			
			diferenca = y-x;
		}
		
		return diferenca;
	}
}