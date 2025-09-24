import java.util.ArrayList;

public class Livro{
    private String titulo;
    private String autor;

    private ArrayList<Livro> livros = new ArrayList();

    public Livro(String titulo, String autor){
        this.autor=autor;
        this.titulo=titulo;
    }

    public void adicionarLivros(){
        livros.add(new Livro("O Carente", "Daniel Hartman"));
        livros.add(new Livro("O Carente 2", "Daniel Hartman"));
        livros.add(new Livro("O Carente 3", "Daniel Hartman"));
        livros.add(new Livro("O Carente 4", "Daniel Hartman"));
        livros.add(new Livro("O Carente 5", "Daniel Hartman"));
    }


    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public ArrayList<Livro> getLivros(){
        return livros;
    }
}