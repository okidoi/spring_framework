package br.okidoi.projspring.beans;

public class BeanEndereco {
	
	private String logradouro;
	private Long numero;
	private String bairro;
	private String cidade;
	private String UF;
	private String CEP;
	
	public BeanEndereco(String logradouro, Long numero, String bairro, String cidade, String UF, String CEP) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.UF = UF;
		this.CEP = CEP;
	}
	
	@Override
	public String toString() {
		return "BeanEndereco [logradouro=" + logradouro + ", numero=" + numero + ", bairro=" + bairro + ", cidade="
				+ cidade + ", UF=" + UF + ", CEP=" + CEP + "]";
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUF() {
		return UF;
	}

	public void setUF(String uF) {
		UF = uF;
	}

	public String getCEP() {
		return CEP;
	}

	public void setCEP(String cEP) {
		CEP = cEP;
	}
	
	
	
	
	

}
