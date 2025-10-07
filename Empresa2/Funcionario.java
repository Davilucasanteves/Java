public abstract class  Funcionario{
    
    private String nome;
    private int id;

    public Funcionario(String nome, int id){
        this.nome=nome;
        this.id=id;
    }

    abstract double calcularPagamento();

    abstract String detalharPagamento();//é interessante que esse método esteja abstrato nesta classe mãe abstrata, uma vez que 
    //ele deve ser implemetado em todas as classes filhas, dando estruturação ao código.

    public String getNome(){
        return nome;
    }
    public int getId(){
        return id;
    }


}