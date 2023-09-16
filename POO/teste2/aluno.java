package JAVA.POO.teste2;

public class aluno {

	String nome;
	int idade;
	curso curso;
	
	String getReg() {
		return this.nome + ";" + this.idade + ";" + this.curso.nome;
	}
	
}
