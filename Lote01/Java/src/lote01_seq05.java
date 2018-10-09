import java.util.Scanner;
public class lote01_seq05 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite A: ");
		double a = ler.nextDouble();
		System.out.println("Digite B: ");
	    double b = ler.nextDouble();
	    System.out.println("Digite C: ");		
	    double c = ler.nextDouble();
	    double delta = Math.pow(b,2) - 4*a*c;
	    double R1 = (-b + Math.sqrt(delta)) / (2*a);
	    double R2 = (-b - Math.sqrt(delta)) / (2*a);
	    
	    System.out.println("x1 = " + R1 + "e x2 = " + R2);
	}

}
