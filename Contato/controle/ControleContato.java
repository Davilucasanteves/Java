package controle;

public class ControleContato{
    public void cadastrarContato (String nome, String telefone, String email);//instancia um contato e adiciona na lista de contatos
    public Contato pesquisarContato(String nome); /* procura na lista de contatos um contato com o nome fornecido, se encontrar retorna o contato, caso contrário, retorna null*/
    public Contato pesquisarContato(int id); /* procura na lista de contatos um contato com o id fornecido, se encontrar retorna o contato, caso contrário, retorna null*/
    public void removerContato (String nome);
    public String listarContato (); //lista todos os contatos cadastrados

    public ControleContato(){

    }
}