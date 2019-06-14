public class Estatistica2015 {

	/*
	 * .Cod Cidade : Nome Cidade : QTD Acidentes : Tipo Veículo .
	 * .............................................................................
	 * ....................................................... .int : String : int :
	 * int .
	 * .............................................................................
	 * ......................................................
	 */

	private int codCidade;
	private String cidade;
	private int qtdAcidentes;
	private int tipoVeiculo;

	public Estatistica2015() {
		this(0, "", 0, 0);
	}



	public Estatistica2015(int codCidade, String cidade, int qtdAcidentes, int tipoVeiculo) {
		this.codCidade = codCidade;
		this.cidade = cidade;
		this.qtdAcidentes = qtdAcidentes;
		this.tipoVeiculo = tipoVeiculo;
	}

	public int getCodCidade() {
		return codCidade;
	}

	public void setCodCidade(int codCidade) {
		this.codCidade = codCidade;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public int getQtdAcidentes() {
		return qtdAcidentes;
	}

	public void setQtdAcidentes(int qtdAcidentes) {
		this.qtdAcidentes = qtdAcidentes;
	}

	public int getTipoVeiculo() {
		return tipoVeiculo;
	}

	public void setTipoVeiculo(int tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}

	
	@Override
	public String toString() {
		return "Estatistica2015 [codCidade=" + codCidade + ", cidade=" + cidade + ", qtdAcidentes=" + qtdAcidentes
				+ ", tipoVeiculo=" + tipoVeiculo + ", getCodCidade()=" + getCodCidade() + ", getCidade()=" + getCidade()
				+ ", getQtdAcidentes()=" + getQtdAcidentes() + ", getTipoVeiculo()=" + getTipoVeiculo()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
