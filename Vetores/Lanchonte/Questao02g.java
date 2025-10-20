import java.util.Scanner;
public class Questao02g
{
	public static String menu(){
        return "Escolha uma opção:\n"
                + "1 - Cadastrar produto\n"
                + "2 - Fazer pedido\n"
                + "3 - Inserir itens\n"
                + "4 - Calcular valor do pedido\n"
                + "5 - Comprar produto\n" //comprar de produtos para lanchonete
                + "6 - Produtos cadastrados\n"
                + "0 - sair";
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int op;
        final int NUM_PRODUTOS = 10;
        Produto produtos[] = new Produto[NUM_PRODUTOS];
        int contProduto=0;
        int codigo;

        Produto p = null;
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
                    codigo = teclado.nextInt();
                    if(codigo>contProduto){
                        System.out.println("Código inválido! Digite um válido ou cadastre algum produto!\n");
                        break;
                    }
                    if(item==null){
                        System.out.println("Insira itens primeiro!\n");
                    }
                    produtos[codigo].venderProduto(item.getQuantidade());
                    System.out.println("Agora tem "+produtos[codigo].getEstoque()+" desse produto.\n");
                    break;
                case 3:
                    if(pedido==null){
                        pedido = new Pedido("14/03/2413");//evita sobrescrever pedidos, é um só por execução de código
                    }
                    System.out.println("Digite o código do produto a inserir na compra: ");
                    codigo = teclado.nextInt();
                    if(codigo>contProduto){
                        System.out.println("Código inválido! Digite um válido ou cadastre algum produto!\n");
                        break;
                    }
                    System.out.println("Digite a quantidade do produto a inserir na compra: ");
                    int qtd = teclado.nextInt();
                    item = new Item(produtos[codigo]);
                    item.setQuantidade(qtd);
                    pedido.inserirItem(item);
                    break;
                case 4: 
                    if (pedido!= null) {
                        System.out.println("Seu pedido deu: " + pedido.calcularTotalPedido()+"\n");
                    } else {
                        System.out.println("Nenhum pedido criado!\n");
                    }
                    break;
                case 5:
                    System.out.println("Digite o nome do produto: ");
                    nome = teclado.next();
                    boolean achou= false;

                    if(pedido != null){
                        for(Item i : pedido.getItens()){
                            if(i != null){
                                Produto produto = i.getProduto();
                                if(produto != null && produto.getNome().equalsIgnoreCase(nome)){
                                    achou = true;
                                    System.out.println("Digite o valor do produto: ");
                                    valor = teclado.nextDouble();
                                    System.out.println("Digite a quantidade do produto a ser comprado: ");
                                    quantidade = teclado.nextInt();
                                    Produto p2 =  new Produto(nome, valor);//não pode ter quantidade, esse caso é só compra, não cadastro
                                    p2.comprarProduto(quantidade);
                                }
                            }
                        }
                    }

                    if(!achou){
                        System.out.println("Produto não consta nos cadastros, cadastre-o!\n");
                    }
                    break;
                case 6:
                    if(produtos==null) System.out.println("Não há produtos no sistema!\n");
                    else{
                        System.out.println("Produtos no sistema: \n");
                        for(Produto prod : produtos){
                            if(prod==null) break;
                            System.out.println(prod.imprimir());                            
                        }
                    }
                    break;
                default:
                    System.err.println("Opção inválida!");
            }
            System.out.println(menu());
            op = teclado.nextInt();
        }
    }
}

