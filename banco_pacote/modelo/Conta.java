package modelo;

//Classe Conta
public class Conta {
    private int numeroConta;
    private Cliente cliente;
    private double saldo;
    private static int identificador;

    //Construtores
    public Conta(Cliente cliente, double saldo, int numeroConta){
        this.cliente=cliente;
        this.saldo=saldo;
        this.numeroConta=numeroConta;
    }

    public Conta(Cliente cliente){
        this.cliente=cliente;
    }

    //métodos
    public boolean sacar(double valor){
        boolean sacou=false;
        if (saldo >= valor){
            saldo = saldo - valor;
            sacou=true;
        }
        return sacou;
    }

    public void depositar(double valor){
        if ( valor>0 )
            saldo +=valor;
    } 

    public void transferir(Conta conta, double valor){
        this.sacar(valor);
        conta.depositar(valor);
    }

    public String imprimir (){
        return "Numero: " + numeroConta + "\nTitular: " + cliente.getNome() + "\nSaldo: "+ saldo;
    }


    public boolean comparar(Conta conta){
        if(this.numeroConta== conta.numeroConta && this.cliente== conta.cliente){
            return true;
        }
        return false;
    }

    public void setSaldo(double saldo){
        this.saldo=saldo;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public Cliente getCliente(){
        return this.cliente;
    }

    public int getNumero(){
        return this.numeroConta;
    }
}