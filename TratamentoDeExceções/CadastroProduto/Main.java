import javax.swing.JOptionPane;

public class Main{
    public static void main(String args[]){
        CadastroProdutos cp = new CadastroProdutos();
        String nome, codigo;
        double preco;
        int op=1;

        Produto pTeste = new Produto("banana", "1", 1.50);

        try {
            cp.adicionar(pTeste);
            
            do{
                op= Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para cadastrar, 2 para remover, 3 para buscar, ou 0 pra sair e ver produtos: "));
                if(op==1){
                    nome= JOptionPane.showInputDialog("Diga o nome do produto: ");
                    codigo= JOptionPane.showInputDialog("Diga o código: ");
                    preco= Double.parseDouble(JOptionPane.showInputDialog("Digite o preço: "));
                    Produto p = new Produto(nome, codigo, preco);
                    cp.adicionar(p);
                } else if(op==2){
                    codigo= JOptionPane.showInputDialog("Diga o código: ");
                    cp.remover(codigo);
                }else if(op==3){
                    codigo= JOptionPane.showInputDialog("Diga o código: ");
                    Produto p = cp.buscar(codigo);
                    JOptionPane.showMessageDialog(null, "Seu produto se chama: "+p.getNome());
                }else
                    JOptionPane.showMessageDialog(null, cp.mostrarProdutos());
            }while(op!=0); 
        } catch (PrecoInvalidoException | ProdutoJaExisteException | ProdutoNaoEncontradoException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally{
            JOptionPane.showMessageDialog(null, "Correu!");
        }  
    }
}