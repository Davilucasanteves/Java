/*
 *  O que o código faz?: O código imprime um menu e caso o usuário digite 0, o programa encerra,
 *  e caso escolha 1, pede-se para o usuário cadastrar um produto e depois mostra-o o nome do produto e seu o código.
 *  
 * 
 */

import java.util.Scanner;
public class Questao02d
{
	public static String menu(){
        return "Escolha uma opção:\n"
                + "1 - Cadastrar produto\n"
                + "2 - Vender produto\n"
                + "3 - Calcular valor do pedido\n"
                + "4 - Comprar produto\n" //comprar de produtos para lanchonete(COMPRAR)
                + "0 - sair";
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int op;
        final int NUM_PRODUTOS = 10;
        Produto produtos[] = new Produto[NUM_PRODUTOS];
        int contProduto=0;

        Produto p;
        Item item;
        Pedido pedido = null;

        System.out.println(menu());
        op = teclado.nextInt();

        while (op!=0){
            switch (op){
                case 1:
                    System.out.println("Digite o nome do produto: ");
                    String nome = teclado.next();
                    System.out.println("Digite o valor do produto: ");
                    double valor = teclado.nextDouble();
                    System.out.println("Digite a quantidade do produto a ir para estoque: ");
                    int quantidade = teclado.nextInt();
                    p = new Produto (nome, valor, quantidade); //27. Aqui, cria-se um objeto, um produto, da classe Produto.
                    produtos[contProduto]=p;//28. Aqui, insere-se um produto no vetor produtos.
                    contProduto++;
                    System.out.println("Produto cadastrado: \n"+p.imprimir()+"\n");
                    break;
            }
            System.out.println(menu());
            op = teclado.nextInt();
        }
    }
}

