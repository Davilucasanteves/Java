package controle;
import java.util.ArrayList;
import modelo.Contato;

public class ControleContato{
    private ArrayList<Contato> contatos = new ArrayList();

    public void cadastrarContato(int id,String nome,String telefone,String email){
        Contato c=new Contato(id,nome,telefone,email);
        contatos.add(c);
    }

    public Contato pesquisarContato(String nome){
        for(Contato c:contatos){
            if(c.getNome().equals(nome)){
                return c;
            }
        }
        return null;
    }

    public Contato pesquisarContato(int id){
        for(Contato c:contatos){
            if(c.getId()==id){
                return c;
            }
        }
        return null;
    }

    public void removerContato(String nome){
        Contato removido=null;
        for(Contato c:contatos){
            if(c.getNome().equals(nome)){
                removido=c;
                break;
            }
        }
        if(removido!=null){contatos.remove(removido);}
    }

    public String listarContato(){
        String resultado="";
        for(Contato c:contatos){
            resultado+=c.toString()+"\n";
        }
        return resultado;
    }
}
