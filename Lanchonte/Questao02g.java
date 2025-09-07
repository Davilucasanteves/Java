import java.util.Scanner;
public class Questao02g
{
	public static String menu(){
        return "Escolha uma opção:\n"
                + "1 - Cadastrar produto\n"
                + "2 - Fazer pedido\n"
                + "3 - Inserir itens\n"
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
        Item item = null;
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
                    p = new Produto (nome, valor, quantidade); 
                    produtos[contProduto]=p;
                    contProduto++;
                    System.out.println("Produto cadastrado: \n"+p.imprimir()+"\n");
                    break;
                case 2: 
                    System.out.println("Digite o código do produto a vender: ");
                    int codigo = teclado.nextInt();
                    produtos[codigo].venderProduto(item.getQuantidade());
                case 3:
                    System.out.println("Digite o código do produto a inserir: ");
                    codigo = teclado.nextInt();
                    System.out.println("Digite a quantidade do produto a inserir: ");
                    int qtd = teclado.nextInt();
                    item = new Item(produtos[codigo]);
                    item.setQuantidade(qtd);
                    pedido = new Pedido("14/03/2413");
                    pedido.inserirItem(item);
                case 4: 
                    System.out.println("Seu pedido deu: " + pedido.calcularTotalPedido());
                case 5:
                    System.out.println("Digite o nome do produto: ");
                    nome = teclado.next();
                    System.out.println("Digite o valor do produto: ");
                    valor = teclado.nextDouble();
                    System.out.println("Digite a quantidade do produto a ser comprado: ");
                    quantidade = teclado.nextInt();
                    Produto p2 =  new Produto(nome, valor);//não pode ter quantidade para não sobrescrever os trem tudo
                    p2.comprarProduto(quantidade);
            }
            System.out.println(menu());
            op = teclado.nextInt();
        }
    }
}

