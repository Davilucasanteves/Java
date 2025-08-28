import java.util.Scanner;

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
        Scanner teclado = new Scanner (System.in);
        
        System.out.println(menu());
        op = teclado.nextInt();
        
        while (op!=0){
            switch (op){
                case 1:{//Cadastrar conta
                    String nome;
                    
				    if (contConta ==0){
                        System.out.print("Digite o nome do cliente: ");
                        nome = teclado.next();
                    	conta1 = new Conta(nome, 1000);
                    	contConta++;
                    	System.out.println("Conta criada com sucesso!");
				    }if(contConta >1){
                        System.out.print("Digite o nome do cliente: ");
                        nome = teclado.next();
						conta2 = new Conta(nome, 500);
                    	contConta++;
                    	System.out.println("Conta criada com sucesso!");
				    }else {
                        System.out.println("Já existem duas contas cadastradas!");
                    }
                    break;
                }
                case 2:{//Depositar
                    System.out.print("Digite o numero da conta: ");
                    int numConta = teclado.nextInt();
                    System.out.print("Digite o valor do deposito: ");
                    double valor = teclado.nextDouble();
                    if (numConta == conta1.getNumero())
                        conta1.depositar(valor);
                    if (numConta == conta2.getNumero())
                        conta2.depositar(valor);
                    else
                        System.out.println("Conta não encontrada!");
                    break;
                }
                case 3:{//sacar
                    System.out.print("Digite o numero da conta: ");
                    int numConta = teclado.nextInt();
                    System.out.print("Digite o valor a ser sacado: ");
                    double valor = teclado.nextDouble();
                    if (numConta == conta1.getNumero())
                        conta1.sacar(valor);
                    if (numConta == conta2.getNumero())
                        conta2.sacar(valor);
                    else
                        System.out.println("Conta não encontrada!");
                    break;
                }
                case 4: {//Consultar saldo
                    System.out.print("Digite o numero da conta para ver o saldo: ");
                    int numConta = teclado.nextInt();
                    if (numConta == conta1.getNumero())
                        System.out.println("O saldo é: "+ conta1.getSaldo());
                    if (numConta == conta2.getNumero())
                        System.out.println("O saldo é: "+ conta2.getSaldo());
                    else
                        System.out.println("Conta não encontrada!");
				    break;
                }
                case 5: {//Imprimir dados da conta
                    System.out.print("Digite o numero da conta: ");
                    int numConta = teclado.nextInt();
                    if (numConta == conta1.getNumero())
                        conta1.imprimirConta();
                    if (numConta == conta2.getNumero())
                        conta2.imprimirConta();
                    else
                        System.out.println("Conta não encontrada!");
				    break;
                }
                case 6: {//Transferir
                    System.out.print("Digite o numero da conta que fará a transferência: ");
                    int numConta = teclado.nextInt();
                    System.out.print("Digite o valor de transferência: ");
                    double valor = teclado.nextDouble();
                    if (numConta == conta1.getNumero())
                        conta1.transferir(conta2, valor);
                    if (numConta == conta2.getNumero())
                        conta2.transferir(conta1, valor);
                    else
                        System.out.println("Conta não encontrada!");
                    break;
                }
                case 7: {//Comparar contas
                    boolean result= conta1.comparar(conta2);
                    if(result)
                        System.out.println("Contas iguais!!!");
                    else
                        System.out.println("Contas diferentes!!!");
                    break;
                }
                default:
                    System.out.println("Opção inválida!");
            }
            System.out.println(menu());
            op = teclado.nextInt();
        }
    }  
}
