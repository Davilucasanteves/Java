package modelo;

//Interface IProduto
import java.util.ArrayList;

public interface IProduto
{
    public ArrayList<Produto> getAllProdutos();
    public void createProduto (Produto produto);
    public Produto readProduto(int codigo);
    public void deleteProduto(Produto produto);
}