package visao;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.Conta;

public class AppBanco {

    public static String menu(){
        return "Digite:\n" +
                "1 - Abrir conta \n"+
                "2 - Depositar \n"+
                "3 - Sacar \n"+
                "4 - Consultar saldo\n"+
                "5 - Imprimir conta\n" +
                "0 - para sair";
    }

    public static void main(String[] args) {
        
        ArrayList<Conta> contas = new ArrayList();

        Conta conta1=null, conta2=null;
        String nome;
        int numero, cpf;
        int contConta=0;
        int op;
        
        op =  Integer.parseInt(JOptionPane.showInputDialog(menu()));
        
        while (op!=0){
            switch (op){
                case 1:{//Cadastrar conta
                    
            		if (contConta ==0){
            		    nome = JOptionPane.showInputDialog("Digite o nome do cliente: ");
                        cpf = Integer.parseInt(JOptionPane.showInputDialog("Digite o cpf do cliente: "));
                        Cliente cliente = new Cliente(nome, cpf);

                        numero =  Integer.parseInt (JOptionPane.showInputDialog("Digite o número da conta: "));

                        conta1 = new Conta(cliente, 1000, numero);
                        contas.add(conta1);
                        contConta++;
                        JOptionPane.showMessageDialog (null, "Conta criada com sucesso!");
                        break;
			        }else if(contConta ==1){
                        nome = JOptionPane.showInputDialog("--Segunda Conta--\nDigite o nome do cliente: ");
                        cpf = Integer.parseInt(JOptionPane.showInputDialog("Digite o cpf do cliente: "));
                        Cliente cliente = new Cliente(nome, cpf);

                        numero =  Integer.parseInt (JOptionPane.showInputDialog("Digite o número da conta: "));
                        conta2 = new Conta(cliente, 500, numero);
                        contas.add(conta2);
                        contConta++;
                        JOptionPane.showMessageDialog (null, "Conta criada com sucesso!");;
                    }else {
                        JOptionPane.showMessageDialog (null, "Já existem duas contas criadas!");
                    }
                    break;
                }
                case 2:{//Depositar
                    int numConta;
                    numConta=  Integer.parseInt (JOptionPane.showInputDialog("Digite o número da conta: "));
                    double valor =  Double.parseDouble (JOptionPane.showInputDialog("Digite o valor do deposito: "));
                    if (numConta == conta1.getNumero())
                        conta1.depositar(valor);
                    else if (numConta == conta2.getNumero())
                        conta2.depositar(valor);
                    else
                        JOptionPane.showMessageDialog (null, "Conta não encontrada!");
                    break;
                }
                case 3:{//sacar
                    int numConta=  Integer.parseInt (JOptionPane.showInputDialog("Digite o número da conta: "));
                    double valor =  Double.parseDouble (JOptionPane.showInputDialog("Digite o valor a ser sacado: "));
                    if (numConta == conta1.getNumero())
                        conta1.sacar(valor);
                    else if (numConta == conta2.getNumero())
                        conta2.sacar(valor);
                    else
                        JOptionPane.showMessageDialog (null, "Conta não encontrada!");
                    break;
                }
                case 4: {//Consultar saldo
                    int numConta=  Integer.parseInt (JOptionPane.showInputDialog("Digite o número da conta para ver o saldo: "));
                    if (numConta == conta1.getNumero())
                        JOptionPane.showMessageDialog (null, "O saldo é: "+ contas.get(0).getSaldo());
                    else if (numConta == conta2.getNumero())
                        JOptionPane.showMessageDialog (null, "O saldo é: "+ conta2.getSaldo());
                    else
                        JOptionPane.showMessageDialog (null, "Conta não encontrada!");
				    break;
                }
                case 5: {//Imprimir dados da conta
                    int numConta=  Integer.parseInt (JOptionPane.showInputDialog("Digite o número da conta: "));
                    if (numConta == conta1.getNumero())
                        JOptionPane.showMessageDialog(null, contas.get(0).imprimir());
                    else if (numConta == conta2.getNumero())
                        JOptionPane.showMessageDialog(null, conta2.imprimir());
                    else
                        JOptionPane.showMessageDialog (null, "Conta não encontrada!");
				    break;
                }
                default:
                    JOptionPane.showMessageDialog (null, "Opção inválida!");
            }
            op =  Integer.parseInt(JOptionPane.showInputDialog(menu()));
        }
    }    
}
