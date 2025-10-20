package modelo;
import java.util.ArrayList;

public class Turma{
    private int codigo, numeroMaximoAluno=40;
    private static int cont=0;
    private String disciplina;
    private ArrayList<Aluno> alunos; //referencia a lista alunos...

    public Turma(String disciplina, int numeroMaximoAlunos){
        this.codigo= ++cont;
        this.numeroMaximoAluno= numeroMaximoAlunos;
        this.disciplina= disciplina;
        this.alunos = new ArrayList();//relação de composição...
    }

    public String imprimir(){
        return "Cógigo da turma: " + codigo + ". Número máximo de alunos: " + numeroMaximoAluno + ". Disciplina: " + disciplina;
    }

    int contAluno=0;
    public void matricular(Aluno aluno){
        boolean jaMatriculado=false;
        for(Aluno a : alunos){
            if(aluno.equals(a)){
                System.out.println("Aluno já matriculado!");
                jaMatriculado=true;
                break;
            }
        }
        if(contAluno < numeroMaximoAluno && jaMatriculado==false /* podia ser: !jaMatriculado */){
            alunos.add(aluno);
            contAluno++;
        }else if(contAluno >= numeroMaximoAluno && jaMatriculado==false)
            System.out.println("Turma cheia!");
    }

    /* VERSÃO REDUZIDA ☝️
    public void matricular(Aluno aluno) {
        if (alunos.contains(aluno)) {
            System.out.println("Aluno já matriculado!");
            return;
        }
        
        if (alunos.size() < numeroMaximoAluno) {
            alunos.add(aluno);
        } else {
            System.out.println("Turma cheia!");
        }
    }
    */

    public void desmatricular(Aluno aluno){
        alunos.remove(aluno);
    }


    public String getDisciplina(){return disciplina;}
    public int getCodigo(){return codigo;}
    public int getNumeroMaximoAluno(){return numeroMaximoAluno;}
    public ArrayList<Aluno> getAlunos() {return alunos;}
}