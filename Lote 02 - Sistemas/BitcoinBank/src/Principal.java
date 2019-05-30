import java.io.IOException;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String args[]) {
		int opcao = 0;
		Conta[] contaCorrente = new Conta[4];
		Conta[] contaAtualizada = new Conta[4];
		Movimento[] movimento = new Movimento[9];
		
		while (opcao != 9) {	
			opcao = Integer.parseInt(JOptionPane.showInputDialog(""
					+ "	| Estatísticas de acidentes em 2015					|\r\n" + 
					"	| 1 - Cadastrar Clientes							|\r\n" + 
					"	| 2 - Cadastrar Movimentações						|\r\n" + 
					"	| 3 - Gera contas atualizadas						|\r\n" + 
					"	| 4 - Consulta Cadastros   							|\r\n" + 
					"	| 9 - Finaliza.										|\r\n"));
			switch (opcao) {
			
			case 1:
				try {
					contaCorrente = Metodos.CadastraClientes(contaCorrente);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 2:	
				try {
					movimento = Metodos.CadastraMovimentos(movimento);					
				} catch (IOException e){
					e.printStackTrace();
				}
				break;
			case 3:	
				
				break;
			case 4:	
				
				break;
			case 5:
				
				break;
			case 9: 
				System.exit(0);
				break;
			default: JOptionPane.showMessageDialog(null, "Opção Inválida");
			
			}
			
		} 

	
	}

}
