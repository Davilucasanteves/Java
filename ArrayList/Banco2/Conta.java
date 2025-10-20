//Classe Conta
import java.util.ArrayList;
public abstract class Conta {
//Resposta da 7: Uma classe abstrata é uma classe demasiadamente geral, que não pode ser instanciada, ter um objeto criado a partir dela.
//Essas classes servem para definir uma estrutura comum para as suas subclasses.

      // atributos
    private int numeroConta;
    private String cliente;
    private double saldo;
    private ArrayList <String> historico;
    private static int identificador;
    
    //Construtores
    public Conta (){
       numeroConta = ++identificador;
       historico = new ArrayList();
    }
    
    public Conta(String cliente){
        numeroConta = ++identificador;
        this.cliente=cliente;
        saldo = 0.0;
        historico = new ArrayList();
    }
    public Conta (String cliente, double saldo){
        numeroConta=++identificador; 
        this.cliente = cliente;
        this.saldo = saldo;   
        historico = new ArrayList();
    }
    
    // métodos
    public abstract String getTipo();//{
        //return "Conta";
    //}

    public String recuperarDadosConta(){
    return "Numero: " + getNumeroConta() + 
                    "\nSaldo: " + getSaldo()+ 
                    "\nTipo: " + this.getTipo(); //Resposta 11: Sim, foi possível chamar um método abstrato de Conta em outro método de Conta.
    }
    
    // public String recuperarDadosConta(){
    //     return "Número da conta é: \n"+numeroConta+
    //            "Saldo é: \n"+saldo;
    // }
    
    public int getNumeroConta() {
        return numeroConta;
    }

    public String getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public ArrayList<String> getHistorico(){
        return historico;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void depositar (double valor){
        if (valor > 0){
            setSaldo(getSaldo() + valor);
            historico.add("\nDepositou R$ "+valor);
        }
    }
    public boolean sacar(double valor) {
        if (getSaldo() >= valor && valor > 0){
            setSaldo(getSaldo() - valor);
            historico.add("\nSacou R$ "+valor);
            return true;
        }
        return false;
    }
    public double consultarSaldo() {
        return getSaldo();
    }
    
    public void setCliente(String c){
        this.cliente = c;
    }
    
    public String mostrarHistorico(){
        String s = "";
        for(int i=0; i < historico.size(); i++)
            s = s + historico.get(i) + "\n";
        return s;
    }    
}