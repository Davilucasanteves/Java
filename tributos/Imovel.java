public class Imovel implements ITributavel{
    private double valor;
    private double tamanho;
    private String endereco;

    //por padrão, nas classes abstratas, os atributos são
    //static e final;

    public Imovel(double valor, double tamanho, String endereco){
        this.valor=valor;
        this.tamanho=tamanho;
        this.endereco=endereco;
    }

    public String getTipoImposto(){
        return "IPTU";
    }
    public double getAliquota(){
        return 0.01;
    }
    public double getValorImposto(){
        return pagarIPTU();
    }

    public double pagarIPTU(){
        return valor*(0.01);
    }


    public double getValor(){
        return valor;
    }

    public double getTamanho(){
        return tamanho;
    }

    public String getEndereco(){
        return endereco;
    }

}
