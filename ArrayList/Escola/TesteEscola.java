import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TesteEscola{
    public static String menu(){
        return "Digite: \n1 - Pessoa"
                    + "\n2 - Aluno" 
                    + "\n3 - Coordenador" 
                    + "\n4 - Professor"
                    + "\n5 - Funcionário"
                    + "\n6 - Imprimir"
                    + "\n0 - sair";
    }
    
    public static void main(String[] args){
        /*
        Pessoa p = new Pessoa("Arthur","123456","machado mineiro");
        Aluno aluno = new Aluno("Breno","654321","veredinha","0001");
        Funcionario f = new Funcionario("Carlin", "213456","vca","08",10000);
        Coordenador c = new Coordenador("Débora","987654","angra dos reis","23", 2000,"CC");
        Professor prof = new Professor("Flaulles","888888","ilhéus","01", 99999, "DCET");
        */
        
        String nome, cpf, endereco, matricula, codigo, curso, departamento;
        double salario;
       
        ArrayList<Pessoa> pessoas= new ArrayList();
        int op=0;
        String menu=menu();
        do{
            op= Integer.parseInt(JOptionPane.showInputDialog(menu));  

            switch(op){
                case 1:
                    nome= JOptionPane.showInputDialog("Digite o nome: ");
                    cpf= JOptionPane.showInputDialog("Digite o cpf: ");
                    endereco= JOptionPane.showInputDialog("Digite o endereço: ");
                    Pessoa p = new Pessoa(nome, cpf, endereco);
                    pessoas.add(p);
                    break;
                case 2: 
                    nome= JOptionPane.showInputDialog("Digite o nome: ");
                    cpf= JOptionPane.showInputDialog("Digite o cpf: ");
                    endereco= JOptionPane.showInputDialog("Digite o endereço: ");
                    matricula= JOptionPane.showInputDialog("Digite a matrícula: ");
                    Aluno aluno = new Aluno(nome, cpf, endereco, matricula);
                    pessoas.add(aluno);
                    break;
                case 3:
                    nome= JOptionPane.showInputDialog("Digite o nome: ");
                    cpf= JOptionPane.showInputDialog("Digite o cpf: ");
                    endereco= JOptionPane.showInputDialog("Digite o endereço: ");
                    codigo= JOptionPane.showInputDialog("Digite o código: ");
                    salario= Double.parseDouble(JOptionPane.showInputDialog("Digite o salário: "));
                    curso= JOptionPane.showInputDialog("Digite o curso: ");
                    Coordenador c = new Coordenador(nome, cpf, endereco, codigo, salario, curso);
                    pessoas.add(c);
                    break;
                case 4:
                    nome= JOptionPane.showInputDialog("Digite o nome: ");
                    cpf= JOptionPane.showInputDialog("Digite o cpf: ");
                    endereco= JOptionPane.showInputDialog("Digite o endereço: ");
                    codigo= JOptionPane.showInputDialog("Digite o código: ");
                    salario= Double.parseDouble(JOptionPane.showInputDialog("Digite o salário: "));
                    departamento= JOptionPane.showInputDialog("Digite o departamento: ");
                    Professor prof = new Professor(nome, cpf, endereco, codigo, salario, departamento);
                    pessoas.add(prof);
                    break;
                case 5:
                    nome= JOptionPane.showInputDialog("Digite o nome: ");
                    cpf= JOptionPane.showInputDialog("Digite o cpf: ");
                    endereco= JOptionPane.showInputDialog("Digite o endereço: ");
                    codigo= JOptionPane.showInputDialog("Digite o código: ");
                    salario= Double.parseDouble(JOptionPane.showInputDialog("Digite o salário: "));
                    Funcionario f = new Funcionario(nome, cpf, endereco, codigo, salario);
                    pessoas.add(f);
                    break;
                case 6:
                    String lista="";
                    for(int i=0; i<pessoas.size(); i++){
                        lista+= pessoas.get(i).imprimir()+"\n--------\n";
                    }
                    JOptionPane.showMessageDialog(null, lista);
                    break;
                case 0:  JOptionPane.showMessageDialog(null, "Saindo..."); break;
                default: JOptionPane.showMessageDialog(null, "Opção inválida!");
            }   
        }while (op!=0);
    }
}
