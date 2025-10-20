import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Usuario{
    private String nome;
    private String cpf;
    private ArrayList<Usuario> usuarios = new ArrayList();

    public Usuario(String nome, String cpf){
        this.nome= nome;
        this.cpf=cpf;
    }

    public void cadastrarUsuario(){
        String nome, cpf;
        nome = JOptionPane.showInputDialog("Digite o nome: ");
        cpf = JOptionPane.showInputDialog("Digite o cpf: ");
        Usuario usuario = new Usuario(nome, cpf);
        usuarios.add(usuario);
    }

    public String getNome(){
        return nome;
    }

    public String getCpf(){
        return cpf;
    }

    public ArrayList<Usuario> getUsuarios(){
        return usuarios;
    }

    public String mostrarUsuarios(){
        String mostra="";
        for(int i=0; i<usuarios.size(); i++){
            mostra+= usuarios.get(i).getNome()+ " - " + usuarios.get(i).getCpf() + "\n";
        }
        return "Info: " + mostra;
    }
}