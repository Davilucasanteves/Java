package controle;
import modelo.Turma;
import modelo.Aluno;
import java.util.ArrayList;
import java.util.List;

public class ControleTurma {
    private List<Turma> turmas;
    
    public ControleTurma() {
        turmas = new ArrayList<>();
    }
    
    public void cadastrarTurma(String disciplina, int numeroMaximoAluno) {
        Turma turma = new Turma(disciplina, numeroMaximoAluno);
        turmas.add(turma);
    }
    
    public Turma pesquisarTurma(int codigo) {
        for (Turma turma : turmas) {
            if (turma.getCodigo() == codigo) {
                return turma;
            }
        }
        return null;
    }
    
    public void matricularAluno(Aluno aluno, int codigoTurma) {
        Turma turma = pesquisarTurma(codigoTurma);
        if (turma != null) {
            turma.matricular(aluno);
        }
    }
    
    public void desmatricularAluno(Aluno aluno, int codigoTurma) {
        Turma turma = pesquisarTurma(codigoTurma);
        if (turma != null) {
            turma.desmatricular(aluno);
        }
    }
    
    public String listarTurmas() {
        StringBuilder lista = new StringBuilder();
        for (Turma turma : turmas) {
            lista.append(turma.imprimir()).append("\n");
        }
        return lista.toString();
    }
    
    public String listarAlunosTurma(int codigoTurma) {
        Turma turma = pesquisarTurma(codigoTurma);
        if (turma != null) {
            StringBuilder lista = new StringBuilder();
            for (Aluno aluno : turma.getAlunos()) {
                lista.append(aluno.imprimir()).append("\n");
            }
            return lista.toString();
        }
        return "Turma não encontrada!";
    }
}