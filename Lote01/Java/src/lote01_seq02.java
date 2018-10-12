import java.util.Scanner;
public class lote01_seq02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o salario: ");
		double Salario = ler.nextDouble();
	    
	    Salario = Salario * 1.15;
	    System.out.println("Salario:" + Salario);
	}

}
