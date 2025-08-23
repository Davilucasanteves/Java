public class Conta{
    String nome, agencia;
    int numeroConta;
    double saldo=0;

    void sacar(double valor){
        saldo-= valor;
    }
    void depositar(double valor){
            saldo+= valor;
    }
    void devolver(){
        System.out.println("Seu saldo é: " + saldo);
    }
}