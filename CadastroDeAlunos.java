package projeto1;

public class CadastroDeAlunos {

	public static void main(String[] args) {
		
		Turma turma = new Turma();
		
		// Adicionar alunos à turma
		turma.adicionarAluno(new Aluno("Thiago", 18, 10));
		turma.adicionarAluno(new Aluno("Clara", 19, 11));
		turma.adicionarAluno(new Aluno("Carol", 20, 12));
		turma.adicionarAluno(new Aluno("Jéssica", 23, 13));
		turma.adicionarAluno(new Aluno("Yanko", 21, 14));
		turma.adicionarAluno(new Aluno("Helena", 22, 15));
		turma.adicionarAluno(new Aluno("Guilherme", 22, 16));
		
		// Exibir lista de alunos
		turma.exibirListaDeAlunos();
		
		//Remover um aluno pelo número da matrícula
		int matriculaRemovida = 10;
		turma.removerAluno(matriculaRemovida);
		
		//Exibir a lista atualizada de alunos
		System.out.println("___________ || ___________ || __________ || ___________");
		System.out.println();
		Aluno alunoRemovido = turma.getUltimoAlunoRemovido();
		if (alunoRemovido != null) {
			System.out.println("                 LISTA ATUALIZADA              ");
			System.out.println();
			System.out.println(" O aluno com matrícula " + matriculaRemovida + " foi excluido!");
		}else {
			System.out.println("                 LISTA ATUALIZADA              ");
			System.out.println("Nenhum aluno foi excluído");
		}
	}
}
