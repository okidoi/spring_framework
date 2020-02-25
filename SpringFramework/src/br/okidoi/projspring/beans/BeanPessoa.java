package br.okidoi.projspring.beans;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class BeanPessoa {
	
	private String nome;
	private String fone;
	private String cpf;
	private String idade;
	private String sexo;
	
	private List<String> listaIrmaos;
	private Map<String, Integer> videosQtd;
	private Set<String> listaFilhos; 
	private Properties propertiesConexao;
	private BeanEndereco endereco;
	
	
	@Override
	public String toString() {
		return "Nome.: " + nome + " CPF: " + cpf 
				+ " Idade: " +idade + " Sexo:" + sexo
				+ "\n Lista de irmãos:" + listaIrmaos
			    + "\n Lista de aulas:" + videosQtd
			    + "\n Lista de filhos:" + listaFilhos
			    + "\n Conexao: " + propertiesConexao
			    + "\n Endereco: " + endereco;
	}
	
		
	
	public BeanEndereco getEndereco() {
		return endereco;
	}



	public void setEndereco(BeanEndereco endereco) {
		this.endereco = endereco;
	}



	public Properties getPropertiesConexao() {
		return propertiesConexao;
	}

	public void setPropertiesConexao(Properties propertiesConexao) {
		this.propertiesConexao = propertiesConexao;
	}


	public Set<String> getListaFilhos() {
		return listaFilhos;
	}


	public void setListaFilhos(Set<String> listaFilhos) {
		this.listaFilhos = listaFilhos;
	}


	public Map<String, Integer> getVideosQtd() {
		return videosQtd;
	}



	public void setVideosQtd(Map<String, Integer> videosQtd) {
		this.videosQtd = videosQtd;
	}



	public List<String> getListaIrmaos() {
		return listaIrmaos;
	}

	public void setListaIrmaos(List<String> listaIrmaos) {
		this.listaIrmaos = listaIrmaos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	

	
	

}
