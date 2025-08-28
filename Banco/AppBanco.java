//import java.util.Scanner;
import javax.swing.JOptionPane;

public class AppBanco {

    public static String menu(){
        return "Digite:\n" +
                "1 - Criar conta \n"+
                "2 - Depositar \n"+
                "3 - Sacar \n"+
                "4 - Consultar saldo\n"+
                "5 - Imprimir conta\n" +
                "6 - Transferir\n" +
                "7 - Comparar contas\n" +
                "0 - para sair";
    }

    public static void main(String[] args) {
        Conta conta1=null, conta2=null;
        int contConta=0;
        int op;
        //Scanner teclado = new Scanner (System.in);
        
        //System.out.println(menu());
        op =  Integer.parseInt(JOptionPane.showInputDialog(menu()));
        
        while (op!=0){
            switch (op){
                case 1:{//Cadastrar conta
                    String nome;
                    int numero;
                    
				    if (contConta ==0){
                        nome = JOptionPane.showInputDialog("Digite o nome do cliente: ");

                        numero =  Integer.parseInt (JOptionPane.showInputDialog("Digite o número da conta: "));

                    	conta1 = new Conta(nome, 1000, numero);
                    	contConta++;
                    	JOptionPane.showMessageDialog (null, "Conta criada com sucesso!");
                        break;
				    }if(contConta ==1){
                        nome = JOptionPane.showInputDialog("Digite o nome do cliente: ");
                        numero =  Integer.parseInt (JOptionPane.showInputDialog("Digite o número da conta: "));
						conta2 = new Conta(nome, 500, numero);
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
                    if (numConta == conta2.getNumero())
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
                    if (numConta == conta2.getNumero())
                        conta2.sacar(valor);
                    else
                        JOptionPane.showMessageDialog (null, "Conta não encontrada!");
                    break;
                }
                case 4: {//Consultar saldo
                    int numConta=  Integer.parseInt (JOptionPane.showInputDialog("Digite o número da conta para ver o saldo: "));
                    if (numConta == conta1.getNumero())
                        JOptionPane.showMessageDialog (null, "O saldo é: "+ conta1.getSaldo());
                    if (numConta == conta2.getNumero())
                        JOptionPane.showMessageDialog (null, "O saldo é: "+ conta2.getSaldo());
                    else
                        JOptionPane.showMessageDialog (null, "Conta não encontrada!");
				    break;
                }
                case 5: {//Imprimir dados da conta
                    int numConta=  Integer.parseInt (JOptionPane.showInputDialog("Digite o número da conta: "));
                    if (numConta == conta1.getNumero())
                        conta1.imprimirConta();
                    if (numConta == conta2.getNumero())
                        conta2.imprimirConta();
                    else
                        JOptionPane.showMessageDialog (null, "Conta não encontrada!");
				    break;
                }
                case 6: {//Transferir
                    int numConta=  Integer.parseInt (JOptionPane.showInputDialog("Digite o número da conta que fará a transferência: "));
                    double valor =  Double.parseDouble (JOptionPane.showInputDialog("Digite o valor da transferência: "));
                    if (numConta == conta1.getNumero())
                        conta1.transferir(conta2, valor);
                    if (numConta == conta2.getNumero())
                        conta2.transferir(conta1, valor);
                    else
                        JOptionPane.showMessageDialog (null, "Conta não encontrada!");
                    break;
                }
                case 7: {//Comparar contas
                    boolean result= conta1.comparar(conta2);
                    if(result)
                        JOptionPane.showMessageDialog (null, "Contas iguais!");
                    else
                        JOptionPane.showMessageDialog (null, "Contas diferentes!");
                    break;
                }
                default:
                    JOptionPane.showMessageDialog (null, "Opção inválida!");
            }
            op =  Integer.parseInt(JOptionPane.showInputDialog(menu()));
        }
    }  
}
