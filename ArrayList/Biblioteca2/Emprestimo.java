import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Emprestimo{
    private String data;
    private String dataDevolucao;
    private int diasDeAtraso=0;
    private int numLivros=0;
    private int multa=0;
    private Livro todosLivro= new Livro("A", "A-autor");

    private ArrayList<Livro> livrosEmprestados = new ArrayList();

    public Emprestimo(String data, String dataDevolucao, int numLivros, int diasDeAtraso, Livro livro){
        this.data=data;
        this.dataDevolucao= dataDevolucao;
        this.multa= diasDeAtraso;
        this.todosLivro= livro;
        if(numLivros>5)
            this.numLivros= 5;
        else
            this.numLivros= numLivros;
    }

    public void livrosParaEmprestimo(){
        int contLivros=0;
        while(contLivros < numLivros){
            int decide = Integer.parseInt(JOptionPane.showInputDialog("Quer procurar livro por título(1) ou autor(2)?"));
            boolean encontrou = false;
            if(decide==1){
                String titulo = JOptionPane.showInputDialog("Diga o título do livro");
                for (Livro livro : todosLivro.getLivros()){
                    if(livro.getTitulo().equalsIgnoreCase(titulo)){
                        livrosEmprestados.add(livro);
                        contLivros++;
                        encontrou=true;
                        break;
                    }
                }
            }else if(decide==2){
                String autor = JOptionPane.showInputDialog("Diga o autor do livro");
                for (Livro livro : todosLivro.getLivros()){
                    if(livro.getAutor().equalsIgnoreCase(autor)){
                        livrosEmprestados.add(livro);
                        contLivros++;
                        encontrou=true;
                        break; //pra não adicionar muitos do mesmo autor;
                    }
                }
            }else
                JOptionPane.showMessageDialog(null, "Opção inválida!");
            if(!encontrou)
                JOptionPane.showMessageDialog(null, "Não encontrado!");

            if(contLivros==5)
                JOptionPane.showMessageDialog(null, "Máximo de livros atingido!");
        }
    }

    public String mostarEmprestados(){
        String mostra="";
        for (int i=0; i<livrosEmprestados.size(); i++) {
            mostra+= livrosEmprestados.get(i).getTitulo() + " - " + livrosEmprestados.get(i).getAutor() + "\n";
        }
        return "Livros em empréstimo: \n" + mostra;
    }
}