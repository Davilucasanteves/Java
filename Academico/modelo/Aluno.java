package modelo;

public class Aluno{
    private String nome;
    private int matricula;

    public Aluno(String nome, int matricula){
        this.matricula= matricula;
        this.nome= nome;
    }

    public String imprimir(){
        return "Nome do aluno: " + nome + ". Matrículas: " + matricula;
    }

    public String getNome(){return nome;}
    public int getMatricula(){return matricula;}

}