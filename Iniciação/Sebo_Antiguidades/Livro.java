public class Livro{
    private String titulo, autor, editora;
    private int numPaginas, ano;
    private double precoCompra; //preço que o sebo pagou no livro

    //Construtor
    public Livro(String titulo, String autor, String editora, int ano, int numPaginas, double precoCompra){
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.ano = ano;
        this.numPaginas = numPaginas;
        this.precoCompra = precoCompra;
    }

    //getters, não há necessidade de setters...
    public String getTitulo(){ return titulo; }

    public String getAutor(){ return autor; }

    public String getEditora(){ return editora; }

    public int getAno(){ return ano; }

    public int getNumPaginas(){ return numPaginas; }

    public double getPrecoCompra() { return precoCompra; }

    //métodos
    public double calcularPrecoVenda(){
        return precoCompra * 1.5;
    }

    public void imprimirInfo(){
        System.out.println("Título: "+ titulo);
        System.out.println("Autor: "+ autor);
        System.out.println("Editora: "+ editora);
        System.out.println("Ano: "+ ano);
        System.out.println("Número de páginas: " +numPaginas);
        System.out.println("Preço de compra: R$ "+ precoCompra);
        System.out.println("Preço de venda: R$ "+ calcularPrecoVenda());
    }
}