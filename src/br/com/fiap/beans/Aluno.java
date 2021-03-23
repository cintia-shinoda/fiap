 package br.com.fiap.beans;

/*
Design Patterns
DTO  (Data Transfer Object): melhores práticas para a classe modelo
- TODOS os atributos devem ser private,
- Cada atributo deve possuir INDIVIDUALMENTE um método GETTER e um método SETTER;
- TODA classe modelo/padrão/beans deve possuir no mínimo dois construtores
a) uma vazio (sem nenhum parâmeetro
b) um cheio (permite preencher todo o objeto
*/


public class Aluno {
	private int rm;
	private String nome;
	private String email;
	private String fone;
	
	
	
	public void setAll(int rm, String nome, String email, String fone) {
		this.rm = rm;
		this.nome = nome;
		this.email = email;
		this.fone = fone;
	}
	
	
	public String getAll() {
		return rm + "\n" +  nome + "\n" + email + "\n" + fone;
	}
	
	
// GETTERS E SETTERS
	public int getRm() {
		return rm;
	}
	public void setRm(int rm) {
		this.rm = rm;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}


// CONSTRUTORES
	public Aluno(int rm, String nome, String email, String fone) {
		super();
		this.rm = rm;
		this.nome = nome;
		this.email = email;
		this.fone = fone;
	}


	public Aluno() {
		super();
	}
	
}
