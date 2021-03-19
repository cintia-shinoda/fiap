package br.com.fiap.beans;

/*
Design Patterns
DTO  (Data Transfer Object): melhores práticas para a classe modelo
- TODOS os atributos devem ser private,
- cada atributo deve possuir INDIVIDUALMENTE um método GETTER e um método SETTER;
- ...
*/


public class Aluno {
	private int rm;
	private String nome;
	private String email;
	private String fone;
	
	
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
	
	
	
	
	
	
	
	
}
