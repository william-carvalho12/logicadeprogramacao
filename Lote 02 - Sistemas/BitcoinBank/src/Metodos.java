import javax.swing.JOptionPane;
import java.lang.Math;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Metodos {

	public static Conta[]  CadastraClientes(Conta[] conta ) throws IOException {
		
		int teste = 1;
		
		BufferedWriter writer = new BufferedWriter(new FileWriter("contasCorrentes.txt"));
		
		for (int i =0; i < 5; i++) {
			
			if (teste == 1) {

				conta[i] = new Conta();
				conta[i].setCod(Integer.parseInt(JOptionPane.showInputDialog("Insira o código da conta")));
				conta[i].setLimite(Math.random() * 100);
				conta[i].setNomeCliente("fulano " + i);
				conta[i].setSaldo(Math.random() * 100);
				conta[i].setTipo(Integer.parseInt(JOptionPane.showInputDialog("Insira o tipo da conta:    \r\n"
						+  "1 - Física\r\n" + 
						"   2 - Conjunta\r\n" + 
						"   3 - Jurídica\r\n" + 
						"   4 - Especial\r\n" + 
						"")));
	

			} else {
				
				conta[i] = new Conta();
				conta[i].setCod(Integer.parseInt(JOptionPane.showInputDialog("Insira o código da conta")));
				conta[i].setLimite(Double.parseDouble(JOptionPane.showInputDialog("Insira o limite da conta")));
				conta[i].setNomeCliente(JOptionPane.showInputDialog("Insira o nome do correntista"));
				conta[i].setSaldo(Double.parseDouble(JOptionPane.showInputDialog("Insira o saldo inicial da conta")));
				conta[i].setTipo(Integer.parseInt(JOptionPane.showInputDialog("Insira o tipo da conta:    \r\n"
						+  "1 - Física\r\n" + 
						"   2 - Conjunta\r\n" + 
						"   3 - Jurídica\r\n" + 
						"   4 - Especial\r\n" + 
						"")));
			}
			
  
		}
		
		ordenaContas(conta);
		for (int i =0; i < conta.length ; i++) {
		writer.append(conta[i].getCod() + "|" 
				+ conta[i].getLimite()+ "|" 
				+ conta[i].getNomeCliente()+ "|" 
				+ conta[i].getSaldo()+ "|" 
				+ conta[i].getTipo()+ "|" );
		writer.newLine();
		}
		
		writer.close();
		return conta;
	}
	
	public static Movimento[]  CadastraMovimentos(Movimento[] movimento ) throws IOException {
		
		int teste = 1;
		
		BufferedWriter writer = new BufferedWriter(new FileWriter("movimentos.txt"));
		
		for (int i =0; i < 10; i++) {
			
			if (teste == 1) {

				movimento[i] = new Movimento();
				movimento[i].setCodConta(i);
				movimento[i].setStatus(1);
				movimento[i].setTipo(Integer.parseInt(JOptionPane.showInputDialog("Insira o tipo de movimento:    \r\n"
						+  "1 - Débito\r\n" + 
						"   2 - Crédito\r\n")));
				movimento[i].setValor(Math.random() * 100);
	

			}else {
				
				movimento[i] = new Movimento();
				movimento[i].setCodConta(Integer.parseInt(JOptionPane.showInputDialog("Insira o código da conta")));
				movimento[i].setStatus(Integer.parseInt(JOptionPane.showInputDialog("Insira o Status")));
				movimento[i].setValor(Double.parseDouble(JOptionPane.showInputDialog("Insira o valor:")));
				movimento[i].setTipo(Integer.parseInt(JOptionPane.showInputDialog("Insira o tipo de movimento:    \r\n"
						+  "1 - Débito\r\n" + 
						"   2 - Crédito\r\n")));
			}
		
			
		}
		ordenaMovimentos(movimento);
		for (int i =0; i < movimento.length ; i++) {
			writer.append(movimento[i].getCodConta() + "|" 
					+ movimento[i].getStatus() + "|" 
					+ movimento[i].getTipo() + "|" 
					+ movimento[i].getValor() + "|" 
					+ movimento[i].getTipo() + "|" );
			writer.newLine();  
			
		}
		 writer.close();
		return movimento;
	}
	
	public static Conta[] ordenaContas(Conta[] conta) {
		
		
		for (int i = 0; i < conta.length; i++) {
			for (int j = i + 1; j < conta.length; j++ ) {
				if (conta[j].getCod() < conta[i].getCod()) {
					
					Conta aux = new Conta();
					aux = conta[i];
					conta[i] = conta[j];
					conta[j] = aux;
					
				}
			
			}
			
		}
		
		
		return conta;
	}
	
	public static Movimento[] ordenaMovimentos(Movimento[] movimento) {
		
		
		for (int i = 0; i < movimento.length; i++) {
			for (int j = i + 1; j < movimento.length; j++ ) {
				if (movimento[j].getCodConta() < movimento[i].getCodConta()) {
					
					Movimento aux = new Movimento();
					aux = movimento[i];
					movimento[i] = movimento[j];
					movimento[j] = aux;
					
				}
			
			}
			
		}
		return movimento;
	}
	

	public static Conta[] lerContasCorrentes() throws IOException{
		BufferedReader contasReader = new BufferedReader(new FileReader("movimentos.txt"));
		Conta[] conta = new Conta[5];

		for (int i=0; i< conta.length; i++) {
			String linhaContaCorrente[] = contasReader.readLine().split("|");
			conta[i] = new Conta();
			conta[i].setCod(Integer.parseInt(linhaContaCorrente[0])); 
			conta[i].setLimite(Double.parseDouble(linhaContaCorrente[2]));
			conta[i].setSaldo(Double.parseDouble(linhaContaCorrente[4]));
			conta[i].setNomeCliente(linhaContaCorrente[6]);
			conta[i].setTipo(Integer.parseInt(linhaContaCorrente[8]));
		}
		contasReader.close();
		return conta;
	}

	public static  Movimento[] lerMovimentos() throws IOException{
		BufferedReader movimentoReader = new BufferedReader(new FileReader("movimentos.txt"));
		Movimento[] movimento = new Movimento[10];

		for (int i=0; i< movimento.length; i++) {
			String linhaMovimento[] = movimentoReader.readLine().split("|");
			movimento[i].setCodConta(Integer.parseInt(linhaMovimento[0]));
			movimento[i].setStatus(Integer.parseInt(linhaMovimento[2]));
			movimento[i].setTipo(Integer.parseInt(linhaMovimento[4]));
			movimento[i].setValor(Double.parseDouble(linhaMovimento[6]));
		}
		movimentoReader.close();
		return movimento;
	}
	
	
	//gerar_a_partir_da_memoria _não_terminado
	public static Conta[] geraContasAtualizadas2(Conta[] conta, Movimento[] movimento) throws IOException{
		
			for (int i = 0; i < conta.length; i++) {		
				
				for (int j = 0; j < movimento.length; j++) {
					if (true) {

					}
					
				}

			}
			
			
			BufferedWriter writer = new BufferedWriter(new FileWriter("contasAtualizadas.txt"));
			ordenaContas(conta);
			for (int i =0; i < conta.length ; i++) {
			writer.append(conta[i].getCod() + "|" 
					+ conta[i].getLimite()+ "|" 
					+ conta[i].getNomeCliente()+ "|" 
					+ conta[i].getSaldo()+ "|" 
					+ conta[i].getTipo()+ "|" );
			writer.newLine();
			}
			
			writer.close();		
		return conta;
		
		
	}
	
	
	
	
	
	
	//gerar_a_partir_do_arquivo _não_terminado
	public static void geraContasAtualizadas() throws IOException{
		
		BufferedReader contaCorrenteReader = new BufferedReader(new FileReader("contasCorrentes.txt"));
		String linhaContaCorrente[] = contaCorrenteReader.readLine().split("|");
		BufferedReader movimentoReader = new BufferedReader(new FileReader("movimentos.txt"));
		while (linhaContaCorrente != null) {
			Conta conta = new Conta();
			conta.setCod(Integer.parseInt(linhaContaCorrente[0])); 
			conta.setLimite(Double.parseDouble(linhaContaCorrente[2]));
			conta.setSaldo(Double.parseDouble(linhaContaCorrente[4]));
			conta.setNomeCliente(linhaContaCorrente[6]);
			conta.setTipo(Integer.parseInt(linhaContaCorrente[8]));
			
			String linhamovimento[] = movimentoReader.readLine().split("|");
			while (linhamovimento != null) {
				Movimento movimento = new Movimento();
				movimento.setCodConta(Integer.parseInt(linhamovimento[0]));
				
				if (movimento.getCodConta() == conta.getCod()) {
					movimento.setStatus(Integer.parseInt(linhamovimento[2]));
					movimento.setTipo(Integer.parseInt(linhamovimento[4]));
					movimento.setValor(Double.parseDouble(linhamovimento[6]));

					if (movimento.getTipo() == 1) {
						conta.debitar(movimento.getValor());
					} else if (movimento.getTipo() == 2) {
						conta.creditar(movimento.getValor());
					}
					
				}
				linhamovimento = movimentoReader.readLine().split("|");
			}
					
			linhaContaCorrente = contaCorrenteReader.readLine().split("|");
		}
		contaCorrenteReader.close();
		

		
		movimentoReader.close();
	}

}
