import java.util.ArrayList;

public class FolhaPagamento{
    private ArrayList<Funcionario> funcionarios = new ArrayList();

    public void adicionarFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }

    //Ao adicionar a classe Estagiario, não é necessário modificar esta classe FolhaPagamento, 
    //já que ela, Estagiario, tem os mesmos métodos que a classe FolhaPagamento exige.

    public String retornarPagamento(){
        String result="";
        for(int i=0; i<funcionarios.size(); i++){
            result+= "\nInfo de "+ (i+1) +"\nNome: " + funcionarios.get(i).getNome()+ 
            "\nid: "+ funcionarios.get(i).getId() + 
            "\nPagamento: " + funcionarios.get(i).calcularPagamento()+ "\n";
        }
        return result;
    }

    public ArrayList<Funcionario> getFuncionarios(){
        return funcionarios;
    }

}