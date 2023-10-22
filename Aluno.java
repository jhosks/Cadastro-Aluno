package projeto1;

public class Aluno {

	// Instâncias privadas
	private String nome;
	private int idade;
	private int matricula;
	
	// Construtor para construção de um objeto com 3 parâmetros
	public Aluno(String nome, int idade, int matricula) {
		this.nome = nome;
		this.idade = idade;
		this.matricula = matricula;
	}

	// Método do acesso para pegar valores dos atributos privados (Getters)
	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public int getMatricula() {
		return matricula;
	}
	
	// Método toString - Anula o override - Fornece uma representação em String do objeto Aluno
	@Override // Opcional
	public String toString() {
		System.out.println("_____________________________________________");
		return " nome: " + nome + " | idade: " + idade + " | matricula: " + matricula + " ";
	}

}
