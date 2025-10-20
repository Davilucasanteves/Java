package controle;
import java.util.ArrayList;
import java.util.List;
import modelo.Aluno;

public class ControleAluno {
    private List<Aluno> alunos;
    
    public ControleAluno() {
        alunos = new ArrayList<>();
    }
    
    public void cadastrarAluno(String nome, int matricula) {
        Aluno aluno = new Aluno(nome, matricula);
        alunos.add(aluno);
    }
    
    public Aluno pesquisarAluno(int matricula) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula() == matricula) {
                return aluno;
            }
        }
        return null;
    }
    
    public void removerAluno(int matricula) {
        Aluno aluno = pesquisarAluno(matricula);
        if (aluno != null) {
            alunos.remove(aluno);
        }
    }
    
    public String listarAlunos() {
        StringBuilder lista = new StringBuilder();
        for (Aluno aluno : alunos) {
            lista.append(aluno.imprimir()).append("\n");
        }
        return lista.toString();
    }
}