public class Poupanca extends Conta{
    
    private double taxaRendimento;
    
    public Poupanca(String cliente, double saldo, double taxaRendimento){
        super(cliente, saldo);
        this.taxaRendimento= taxaRendimento;
    }


    //Respostas 8 e 10👇
    public String getTipo(){
        return "Poupança";
    }
    // public String getTipo(){
    //     return "Poupança";
    // }
    //Resposta da 8: Ao executar, o tipo das contas poupanças foi dado como 'Conta', isso porque o método getTipo() não é mais sobrescrevido.
    //Resposta da 10: Quando se retira o método getTipo() da classe Conta, ao chamá-lo no AppBanco via lista contas em 'contas.get(i).getTipo()',
    //é gerado um erro, isso porque 'contas.get(i)' retorna um tipo/classe Conta, o qual já não mais possui o método getTipo().

    public double calcularRendimento(){//montante
        setSaldo(getSaldo()*(1+taxaRendimento));
        return getSaldo();
    }
    
    public double getTaxaRendimento(){
        return taxaRendimento;
    }
    
    public void setTaxaRendimento(double taxaRendimento){
        this.taxaRendimento= taxaRendimento;
    }
    
}