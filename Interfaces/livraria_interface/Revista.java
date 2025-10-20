public class Revista implements IProduto, IPromocional {
    private String nome;
    private String descricao;
    private double valor;
    private String editora ;
    
    
    public Revista (String nome, String descricao, double valor, String editora){
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor; 
        this.editora = editora;
    }
    
    
    
    public String getNome(){
        return nome;
    }

    public String getDescricao(){
        return descricao;
    }
    
    public double getValor(){
        return valor;
    }
    
    public String getEditora(){
        return editora;
    }
    
    public void setNome(String nome){
        this.nome=nome;
    }
    
    public void setDescricao(String descricao){
        this.descricao=descricao;
    }
    
    public void setValor(double valor){
        this.valor=valor;
    }
    
    public void setEditora(String editora){
        this.editora=editora;
    }
    
    public boolean aplicaDesconto(double porcentagem){
        return false;
    }
    
}

