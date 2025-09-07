/*
 *  f) Não há necessidade de implementar setData e setCodigo, já que eles sempre serão uma só data e só código para aquele pedido.
 */

public class Pedido {
    private int codigo;
    private String data;
    private Item[] itens;
    private int contItem=0;
    private static int geradorDeCodigo=0;
    
    public Pedido (String data){
        this.data=data;
        this.itens = new Item[10];
        this.codigo=geradorDeCodigo++;
    }
    
    public void inserirItem(Item i){
        itens[contItem]=i;
        contItem++;
    }
    
    public double calcularTotalPedido(){
        double total=0;
        for (Item i: itens){
            total+=i.calcularSubTotal();
        }
        return total;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getData() {
        return data;
    }

    public Item[] getItens() {
        return itens;
    }
}
