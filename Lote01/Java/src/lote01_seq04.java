import java.util.Scanner;
public class lote01_seq04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
	    
	    System.out.println("Digite o temperatura em Celsius: ");
	    double c = ler.nextDouble();
	    
	    double f = (9 * c + 160) / 5;
	    System.out.println("Valor em Fahreheit: " + f);
	}

}
