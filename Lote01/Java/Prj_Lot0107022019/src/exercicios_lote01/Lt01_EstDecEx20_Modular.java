package exercicios_lote01;

import javax.swing.JOptionPane;

public class Lt01_EstDecEx20_Modular {
	public static void main(String args[]){
		int a, b, c;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A."));
		b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B."));
		c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de C."));
		
		raizes(a,b,c);
		
	}
	
	public static void raizes(int a, int b, int c){
		int r1, r2, delta;
		
		delta = (b^2) - 4*a*c;
		
		if (delta >= 0){
		
			r1 = (-b + delta^(1/2)) / (2*a);
			r2 = (-b - delta^(1/2)) / (2*a);
			
			JOptionPane.showMessageDialog(null,"O valor das raízes são: R1 = " + r1 + " R2 = "+ r2 + "." );
	    }
		
		else{
			JOptionPane.showMessageDialog(null,"Não existem raízes reais.");
		}
	}	
}



