package projeto1;

// Importações
import java.util.ArrayList;
import java.util.List;

public class Turma {
	
	private Aluno ultimoAlunoRemovido;
	
	// Lista de objeto Aluno
	private List<Aluno> alunos;
	
	// Construtor com instância de ArrayList, iniciando uma lista vazia quando uma nova turma é criada.
	public Turma(){
		alunos = new ArrayList<>();
	}
	
	// Método para adicionar um objeto aluno à lista
	public void adicionarAluno(Aluno aluno) {
		alunos.add(aluno);
	}
	
	// Médodo para remover um aluno da turma com base na matrícula.
	public void removerAluno(int matricula) {
		for (Aluno aluno : alunos) {
			if (aluno.getMatricula() == matricula) {
				ultimoAlunoRemovido = aluno;
				alunos.remove(aluno);
				return; // Sair do loop após remover o aluno
			}
		}
	}
	
	// Método para exibir a lista de alunos na turma.
	public void exibirListaDeAlunos() {
		System.out.println();
		System.out.println("Lista de Alunos da Turma: ");
		for(Aluno aluno : alunos) { // A classe e variável representa cada elemento da lista alunos
			System.out.println(aluno);
		}
		System.out.println();
	}
	
	public Aluno getUltimoAlunoRemovido() { // Armazenar o último aluno removido
		return ultimoAlunoRemovido;
		
	}
	
}
