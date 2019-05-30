
public class Conta {
	

	private int cod;
	private String nomeCliente;
	private double saldo;
	private double Limite;
	private int tipo;  // 1 _física 2 _conjunta 3 _jurídica 4 Especial
	//    1 .............zero
	//    2 .............LimitecontaC
	//    3 .............LimitecontaC + 50%  saldoContaC
	//    4 .............LimitecontaC + 100% saldoContaC

	
	

	public Conta() {
		this (0,"",0.0,0.0,0);
	}
	
	public Conta(int cod, String nomeCliente, double saldo, double limite, int tipo) {
		this.cod = cod;
		this.nomeCliente = nomeCliente;
		this.saldo = saldo;
		Limite = limite;
		this.tipo = tipo;
	}
	
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void debitar(double valor) {
		if (this.saldo < valor) {
		
			switch (this.tipo) {
			case 1:
				System.out.println("A Conta não possui possui saldo para esta operação");
				break;
			case 2:
				if ((this.saldo - valor) < this.Limite ) {
					System.out.println("A Conta não possui possui saldo para esta operação");
				}else {
					this.saldo = saldo - valor;
				}
				break;
			case 3:
				if ((this.saldo - valor)  < (this.Limite + this.saldo * 0.5)) {
					System.out.println("A Conta não possui possui saldo para esta operação");
				}else {
					this.saldo = saldo - valor;
				}
				break;
			case 4:
				if ((this.saldo - valor)  < (this.Limite + this.saldo)) {
					System.out.println("A Conta não possui possui saldo para esta operação");
				}else {
					this.saldo = saldo - valor;
				}
				break;
			default:
				break;
           
           }
		}else {		
			this.saldo = saldo - valor;
		}
		
	}
	public void creditar(double valor) {
		this.saldo = saldo + valor;
	}

	public double getLimite() {
		return Limite;
	}
	public void setLimite(double limite) {
		Limite = limite;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
}
