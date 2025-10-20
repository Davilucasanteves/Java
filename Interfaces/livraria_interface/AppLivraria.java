//Classe AppLivraria
public class AppLivraria {
    public static void main(String[] args) {
        CarrinhoCompra carrinho = new CarrinhoCompra();
        LivroFisico fisico = new LivroFisico() ;
        fisico.setNome("Java como programar");
        fisico.setValor(200);
        carrinho.adicionar(fisico);
        
        Revista revista = new Revista("Mamax", "gay", 69, "LGBT");
        carrinho.adicionar(revista);
        
        Ebook ebook = new Ebook();
        ebook.setNome("Java");
        ebook.setValor(55.5);
        carrinho.adicionar(ebook);
        carrinho.aplicarDesconto(ebook, 0.05);
        System.out.println("Total do carrinho R$: " + carrinho.getTotal());
        
    }
}