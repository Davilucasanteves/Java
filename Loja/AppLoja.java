public class AppLoja{
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int desconto= 10;
        int vendidos= 12;
        Produto produto= new Produto("qw2", "leite", 6.50, 50);
        
        double novoPreco= produto.calcularDesconto(desconto);
        int novoEstoque= produto.atualizarEstoque(vendidos);
        produto.setQtdEstoque(novoEstoque);
        produto.imprimirProduto(novoPreco, produto.getQtdEstoque());
    }
}