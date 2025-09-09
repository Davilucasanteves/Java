import java.util.Scanner;

public class BibliotecaApp {
    private static Livro[] livros = new Livro[100];
    private static Usuario[] usuarios = new Usuario[100];
    private static Emprestimo[] emprestimos = new Emprestimo[100];
    private static Autor[] autores = new Autor[100];
    private static int contLivros = 0;
    private static int contUsuarios = 0;
    private static int contEmprestimos = 0;
    private static int contAutores = 0;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        do {
            System.out.println("\n=== SISTEMA DE BIBLIOTECA ===");
            System.out.println("1. Cadastrar Autor");
            System.out.println("2. Cadastrar Livro");
            System.out.println("3. Pesquisar Livro por Título");
            System.out.println("4. Cadastrar Usuário");
            System.out.println("5. Realizar Empréstimo");
            System.out.println("6. Listar Empréstimos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer
            
            switch (opcao) {
                case 1:
                    cadastrarAutor(scanner);
                    break;
                case 2:
                    cadastrarLivro(scanner);
                    break;
                case 3:
                    pesquisarLivro(scanner);
                    break;
                case 4:
                    cadastrarUsuario(scanner);
                    break;
                case 5:
                    realizarEmprestimo(scanner);
                    break;
                case 6:
                    listarEmprestimos();
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
        
        scanner.close();
    }
    
    private static void cadastrarAutor(Scanner scanner) {
        if (contAutores >= autores.length) {
            System.out.println("Limite de autores atingido!");
            return;
        }
        
        System.out.println("\n--- CADASTRO DE AUTOR ---");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Sobrenome: ");
        String sobrenome = scanner.nextLine();
        
        System.out.print("Ano de Nascimento: ");
        int anoNascimento = scanner.nextInt();
        scanner.nextLine();
        
        autores[contAutores] = new Autor(nome, sobrenome, anoNascimento);
        contAutores++;
        
        System.out.println("Autor cadastrado com sucesso!");
    }
    
    private static void cadastrarLivro(Scanner scanner) {
        if (contLivros >= livros.length) {
            System.out.println("Limite de livros atingido!");
            return;
        }
        
        System.out.println("\n--- CADASTRO DE LIVRO ---");
        
        // Listar autores disponíveis
        if (contAutores == 0) {
            System.out.println("Nenhum autor cadastrado. Cadastre um autor primeiro.");
            return;
        }
        
        System.out.println("Autores disponíveis:");
        for (int i = 0; i < contAutores; i++) {
            System.out.println((i + 1) + ". " + autores[i]);
        }
        
        System.out.print("Escolha o número do autor: ");
        int autorIndex = scanner.nextInt() - 1;
        scanner.nextLine();
        
        if (autorIndex < 0 || autorIndex >= contAutores) {
            System.out.println("Autor inválido!");
            return;
        }
        
        System.out.print("Código do livro: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        
        System.out.print("Editora: ");
        String editora = scanner.nextLine();
        
        System.out.print("ISSN: ");
        long issn = scanner.nextLong();
        scanner.nextLine();
        
        livros[contLivros] = new Livro(codigo, titulo, editora, issn, autores[autorIndex]);
        contLivros++;
        
        System.out.println("Livro cadastrado com sucesso!");
    }
    
    private static void pesquisarLivro(Scanner scanner) {
        System.out.println("\n--- PESQUISA DE LIVRO ---");
        System.out.print("Digite o título para pesquisa: ");
        String tituloPesquisa = scanner.nextLine();
        
        boolean encontrado = false;
        for (int i = 0; i < contLivros; i++) {
            if (livros[i].getTitulo().toLowerCase().contains(tituloPesquisa.toLowerCase())) {
                System.out.println(livros[i]);
                encontrado = true;
            }
        }
        
        if (!encontrado) {
            System.out.println("Nenhum livro encontrado com esse título.");
        }
    }
    
    private static void cadastrarUsuario(Scanner scanner) {
        if (contUsuarios >= usuarios.length) {
            System.out.println("Limite de usuários atingido!");
            return;
        }
        
        System.out.println("\n--- CADASTRO DE USUÁRIO ---");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        
        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();
        
        System.out.print("Profissão: ");
        String profissao = scanner.nextLine();
        
        usuarios[contUsuarios] = new Usuario(nome, cpf, endereco, profissao);
        contUsuarios++;
        
        System.out.println("Usuário cadastrado com sucesso!");
    }
    
    private static void realizarEmprestimo(Scanner scanner) {
        if (contEmprestimos >= emprestimos.length) {
            System.out.println("Limite de empréstimos atingido!");
            return;
        }
        
        System.out.println("\n--- REALIZAR EMPRÉSTIMO ---");
        
        // Listar livros disponíveis
        if (contLivros == 0) {
            System.out.println("Nenhum livro cadastrado.");
            return;
        }
        
        System.out.println("Livros disponíveis:");
        for (int i = 0; i < contLivros; i++) {
            System.out.println((i + 1) + ". " + livros[i].getTitulo());
        }
        
        System.out.print("Escolha o número do livro: ");
        int livroIndex = scanner.nextInt() - 1;
        scanner.nextLine();
        
        if (livroIndex < 0 || livroIndex >= contLivros) {
            System.out.println("Livro inválido!");
            return;
        }
        
        // Listar usuários
        if (contUsuarios == 0) {
            System.out.println("Nenhum usuário cadastrado.");
            return;
        }
        
        System.out.println("Usuários cadastrados:");
        for (int i = 0; i < contUsuarios; i++) {
            System.out.println((i + 1) + ". " + usuarios[i].getNome());
        }
        
        System.out.print("Escolha o número do usuário: ");
        int usuarioIndex = scanner.nextInt() - 1;
        scanner.nextLine();
        
        if (usuarioIndex < 0 || usuarioIndex >= contUsuarios) {
            System.out.println("Usuário inválido!");
            return;
        }
        
        System.out.print("Data do empréstimo (DD/MM/AAAA): ");
        String dataEmprestimo = scanner.nextLine();
        
        long codigoEmprestimo = System.currentTimeMillis();
        
        emprestimos[contEmprestimos] = new Emprestimo(
            codigoEmprestimo, 
            dataEmprestimo, 
            livros[livroIndex], 
            usuarios[usuarioIndex]
        );
        
        contEmprestimos++;
        System.out.println("Empréstimo realizado com sucesso!");
    }
    
    private static void listarEmprestimos() {
        System.out.println("\n--- LISTA DE EMPRÉSTIMOS ---");
        
        if (contEmprestimos == 0) {
            System.out.println("Nenhum empréstimo registrado.");
            return;
        }
        
        for (int i = 0; i < contEmprestimos; i++) {
            System.out.println(emprestimos[i]);
        }
    }
}