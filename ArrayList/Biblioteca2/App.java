import javax.swing.JOptionPane;

public class App{
    public static void main(String[] args) {

       Livro livro = new Livro("Harry Potter", "Jacking Rolling");
       livro.getLivros().add(livro);
       Usuario usuario = new Usuario("Davi", "150830");
       usuario.getUsuarios().add(usuario);
       livro.adicionarLivros();
       Emprestimo emprestimo = new Emprestimo("17/01/2006", "28/01/2006", 2, 1, livro);
       emprestimo.livrosParaEmprestimo();
       JOptionPane.showMessageDialog(null, emprestimo.mostarEmprestados());
       usuario.cadastrarUsuario();
       JOptionPane.showMessageDialog(null, usuario.mostrarUsuarios());
    }
}