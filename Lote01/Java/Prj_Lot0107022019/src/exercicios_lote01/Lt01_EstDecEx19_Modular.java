package exercicios_lote01;
import javax.swing.JOptionPane;

public class Lt01_EstDecEx19_Modular {
	public static void main(String args[]) {
		double x, y, maior = 0;
		
		x = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de x."));
		y = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de y."));
		
		maior = Maior(x,y); 
		
		JOptionPane.showMessageDialog(null,"O maior valor é " + maior);
	}
	
	static double Maior(double x, double y){
		double Maior;
		
		if (x >= y) {
			Maior = x;
		}
		
		else {
			Maior = y;
		}
		
		return Maior;
		
	}
}
