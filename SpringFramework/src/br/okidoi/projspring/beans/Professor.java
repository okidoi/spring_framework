package br.okidoi.projspring.beans;

import javax.swing.JOptionPane;

public class Professor {

	
	public String resposta() {
		String resposta = JOptionPane.showInputDialog("Resposta");
		return resposta;
	}
}
