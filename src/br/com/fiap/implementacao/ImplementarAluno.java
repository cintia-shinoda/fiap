package br.com.fiap.implementacao;

import br.com.fiap.beans.Aluno;

public class ImplementarAluno {

	public static void main(String[] args) {
		
		Aluno objeto = new Aluno();
		objeto.setNome("Cintia");
		objeto.setEmail("cintia.shinoda@me.com");
		objeto.setFone("91239123");
		objeto.setRm(123);
		
		
		System.out.println(objeto.getNome());
		System.out.println(objeto.getEmail());
		System.out.println(objeto.getFone());
		System.out.println(objeto.getRm());
		
		
		
		
		Aluno objeto2 = new Aluno();
		
		objeto2.setAll(
				456,
				"Izumi",
				"cintia.shinoda@mac.com",
				"1194948474");
		
		System.out.println(objeto2.getAll());
		
		
		
		
		
		
		
		
		
	}

}
