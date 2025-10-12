public interface ITributavel {
    public String getTipoImposto(); //tipo de imposto, exemplo ICMS, ISS, IPTU, etc...
    public double getAliquota();
    public double getValorImposto(); 
}
