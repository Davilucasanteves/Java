public class Usuario{
    private String nome;
    private int idade;

    //Aqui, deve-se usar o thows pq a exceção criada deriva de Exception.
    //Se fosse de RunTimeException, só haveria o throw.
    public Usuario(String nome, int idade)throws IdadeInvalidaException{
        this.nome= nome;
        if(idade>120 || idade <0)
            throw new IdadeInvalidaException();
        else
            this.idade=idade;
    }
}