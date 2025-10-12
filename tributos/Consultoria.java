public class Consultoria implements ITributavel{
    private double valor;
    private String descrição;
    
    public Consultoria (String descricao, double valor){
        this.descrição=descricao;
        this.valor=valor;
    }

    @Override
    public String getTipoImposto() {
        return "ISS";
    }

    @Override
    public double getAliquota() {
        return 0.15;
    }

    @Override
    public double getValorImposto() {
        return getValor()*getAliquota();
    }

    public double getValor() {
        return valor;
    }

    public String getDescricao() {
        return descrição;
    }    
}
