package visao;
import modelo.Aluno;
import controle.ControleAluno;
import controle.ControleTurma;
import java.util.Scanner;

public class AppAcademico{
    private static ControleAluno controleAluno = new ControleAluno();
    private static ControleTurma controleTurma = new ControleTurma();
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\n--- SISTEMA ACADÊMICO ---");
            System.out.println("1. Cadastrar aluno");
            System.out.println("2. Pesquisar aluno");
            System.out.println("3. Listar alunos");
            System.out.println("4. Remover aluno");
            System.out.println("5. Cadastrar turma");
            System.out.println("6. Matricular aluno em turma");
            System.out.println("7. Desmatricular aluno de turma");
            System.out.println("8. Listar alunos de uma turma");
            System.out.println("9. Listar turmas");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcao) {
                case 1 -> cadastrarAluno();
                case 2 -> pesquisarAluno();
                case 3 -> listarAlunos();
                case 4 -> removerAluno();
                case 5 -> cadastrarTurma();
                case 6 -> matricularAluno();
                case 7 -> desmatricularAluno();
                case 8 -> listarAlunosTurma();
                case 9 -> listarTurmas();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }
    
    private static void cadastrarAluno() {
        System.out.print("Nome do aluno: ");
        String nome = scanner.nextLine();
        System.out.print("Matrícula: ");
        int matricula = scanner.nextInt();
        scanner.nextLine();
        
        controleAluno.cadastrarAluno(nome, matricula);
        System.out.println("Aluno cadastrado com sucesso!");
    }
    
    private static void pesquisarAluno() {
        System.out.print("Matrícula do aluno: ");
        int matricula = scanner.nextInt();
        scanner.nextLine();
        
        Aluno aluno = controleAluno.pesquisarAluno(matricula);
        if (aluno != null) {
            System.out.println("Aluno encontrado: " + aluno.imprimir());
        } else {
            System.out.println("Aluno não encontrado!");
        }
    }
    
    private static void listarAlunos() {
        System.out.println("\n--- ALUNOS CADASTRADOS ---");
        System.out.println(controleAluno.listarAlunos());
    }
    
    private static void removerAluno() {
        System.out.print("Matrícula do aluno a remover: ");
        int matricula = scanner.nextInt();
        scanner.nextLine();
        
        controleAluno.removerAluno(matricula);
        System.out.println("Aluno removido com sucesso!");
    }
    
    private static void cadastrarTurma() {
        System.out.print("Disciplina: ");
        String disciplina = scanner.nextLine();
        System.out.print("Número máximo de alunos: ");
        int maxAlunos = scanner.nextInt();
        scanner.nextLine();
        
        controleTurma.cadastrarTurma(disciplina, maxAlunos);
        System.out.println("Turma cadastrada com sucesso!");
    }
    
    private static void matricularAluno() {
        System.out.print("Matrícula do aluno: ");
        int matricula = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Código da turma: ");
        int codigoTurma = scanner.nextInt();
        scanner.nextLine();
        
        Aluno aluno = controleAluno.pesquisarAluno(matricula);
        if (aluno != null) {
            controleTurma.matricularAluno(aluno, codigoTurma);
            System.out.println("Aluno matriculado com sucesso!");
        } else {
            System.out.println("Aluno não encontrado!");
        }
    }
    
    private static void desmatricularAluno() {
        System.out.print("Matrícula do aluno: ");
        int matricula = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Código da turma: ");
        int codigoTurma = scanner.nextInt();
        scanner.nextLine();
        
        Aluno aluno = controleAluno.pesquisarAluno(matricula);
        if (aluno != null) {
            controleTurma.desmatricularAluno(aluno, codigoTurma);
            System.out.println("Aluno desmatriculado com sucesso!");
        } else {
            System.out.println("Aluno não encontrado!");
        }
    }
    
    private static void listarAlunosTurma() {
        System.out.print("Código da turma: ");
        int codigoTurma = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("\n--- ALUNOS DA TURMA ---");
        System.out.println(controleTurma.listarAlunosTurma(codigoTurma));
    }
    
    private static void listarTurmas() {
        System.out.println("\n--- TURMAS CADASTRADAS ---");
        System.out.println(controleTurma.listarTurmas());
    }
}