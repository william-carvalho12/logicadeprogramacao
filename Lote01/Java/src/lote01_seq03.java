import java.util.Scanner;
public class lote01_seq03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o valor da base");
	    double Base = ler.nextDouble();
		System.out.println("Digite o valor da altura");
	    double Altura = ler.nextDouble();

	    double Area = (Base * Altura) / 2;
	    System.out.println("Area:" + Area);
	}

}
