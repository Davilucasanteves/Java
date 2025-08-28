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
                "0 - para sair";
    }

    public static void main(String[] args) {
        Conta conta1, conta2;
        int contConta=1;
        int op;
        Scanner teclado = new Scanner (System.in);
        
        System.out.println(menu());
        op = teclado.nextInt();
        
        while (op!=0){
            switch (op){
                case 1:{//Cadastrar conta
                    String nome;
                    System.out.print("Digite o nome do cliente: ");
                    nome = teclado.next();
				    if (contConta ==1){
                    	conta1 = new Conta(nome);
                    	//contConta++;
                    	System.out.println("Conta criada com sucesso!");
				    } else {
						conta2 = new Conta(nome);
                    	contConta++;
                    	System.out.println("Conta criada com sucesso!");
				    }
                    break;
                }
                case 2:{//Depositar
                    System.out.print("Digite o numero da conta: ");
                    int numConta = teclado.nextInt();
                    System.out.print("Digite o valor do deposito: ");
                    double valor = teclado.nextDouble();
                    If (numConta == conta1.getNumero())
                        conta1.depositar(valor);
                    If (numConta == conta2.getNumero())
                        conta2.depositar(valor);
                    break;
                }
                case 3:{//sacar
                    
                    break;
                }
                case 4: {//Consultar saldo
                    
				   break;
                }
                case 5: {//Imprimir dados da conta
                   
				   break;
                }
            }
            System.out.println(menu());
            op = teclado.nextInt();
        }
    }  
}
