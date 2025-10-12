public class ProfissionalAutonomo implements ITributavel{
    private double remuneracao;
    //private double tamanho;
    private String endereco, nome, cpf;

    public ProfissionalAutonomo(double remuneracao, String endereco, String cpf, String nome){
        this.remuneracao=remuneracao;
        this.cpf=cpf;
        this.nome=nome;
        this.endereco=endereco;
    }

    public String getTipoImposto(){
        return "INSS";
    }
    public double getAliquota(){
        return 0.11;
    }
    public double getValorImposto(){
        return pagarINSS();
    }

    public double pagarINSS(){
        double inss= remuneracao*(0.11);
        if(inss>8157.41)
            return 8157.41;
        else 
            return inss;
    }


    public double getRemuneracao(){
        return remuneracao;
    }
    public void setRemuneracao(){
        this.remuneracao=remuneracao;
    }

    public String getCpf(){
        return cpf;
    }

    public String getNome(){
        return nome;
    }

    public String getEndereco(){
        return endereco;
    }

}