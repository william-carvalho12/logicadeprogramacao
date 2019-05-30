
public class Movimento {

	private int codConta;
	private double valor;
	private int tipo;
	private int status;

	
	public Movimento() {
		this (0,0.0,0,0);
	}
	
	public Movimento(int codContaM, double valorMovimentoM, int tipoMovimentoM, int status) {

		this.codConta = codContaM;
		valor = valorMovimentoM;
		tipo = tipoMovimentoM;
		this.status = status;
	}
	
	public int getCodConta() {
		return codConta;
	}
	public void setCodConta(int codContaM) {
		this.codConta = codContaM;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valorMovimentoM) {
		valor = valorMovimentoM;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipoMovimentoM) {
		tipo = tipoMovimentoM;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
}
