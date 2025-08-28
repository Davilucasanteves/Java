public class Conta{
    String cliente;
    int numero;
    double saldo;

    //Construtores
    public Conta(String cliente, double saldo){
        this.cliente=cliente;
        this.saldo=saldo;
    }

    public Conta(String cliente){
        this.cliente=cliente;
    }

    //métodos
    boolean sacar(double valor){
        boolean sacou=false;
        if (saldo >= valor){
            saldo = saldo - valor;
            sacou=true;
        }
        return sacou;
    }

    void depositar(double valor){
        if ( valor>0 )
            saldo +=valor;
    } 

    void transferir(){

    }

    String imprimirConta(){

    } 

    boolean comparar(){
        if()
    }

    //Questão 3. l) Como saldo é uma variável que pode mudar ao longo do projeto, é importante que ela tenha um setSaldo.
    //getters e setters
    public void setSaldo(double saldo){
        this.saldo=saldo;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public String getCliente(){
        return this.cliente;
    }

    public int getNumero(){
        return this.numero;
    }
}