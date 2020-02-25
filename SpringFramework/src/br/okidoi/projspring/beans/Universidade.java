package br.okidoi.projspring.beans;

public class Universidade {
	
	private Aluno aluno = null;
	private Professor professor = null;
	private QuadroNegro quadroNegro= null;
	
	
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public QuadroNegro getQuadroNegro() {
		return quadroNegro;
	}
	public void setQuadroNegro(QuadroNegro quadroNegro) {
		this.quadroNegro = quadroNegro;
	}
	
	public void aula() {
		quadroNegro.mostraPerguntaReposta("Bem vidos a aula");
		
		String pergunta = aluno.pergunta();
		quadroNegro.mostraPerguntaReposta(pergunta);
		
		String resposta = professor.resposta();
		quadroNegro.mostraPerguntaReposta(resposta);
	
		quadroNegro.mostraPerguntaReposta("Fim da aula");
		
		
	}
	

}
