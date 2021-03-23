package br.com.fiap.implementacao;

import br.com.fiap.beans.Aluno;

public class ImplementarAlunoConstrutor {

	public static void main(String[] args) {
		Aluno objeto = new Aluno(
				123,
				"Cintia",
				"cintia.shinoda@me.com",
				"110000000"
				);
		
		System.out.println(objeto.getAll());
	}

}
