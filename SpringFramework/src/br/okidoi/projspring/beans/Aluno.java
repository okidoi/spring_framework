package br.okidoi.projspring.beans;

import javax.swing.JOptionPane;

public class Aluno {

	public String pergunta;
	
	public String pergunta() {
		String pergunta = JOptionPane.showInputDialog("Pergunta");
		return pergunta;
	}
	
}
