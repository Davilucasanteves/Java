public class AppBanco{
    public static void main(String[] args){
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();
        Conta conta3 = new Conta();

        conta1.depositar(200);
        conta2.depositar(300);
        conta3.depositar(400);

        conta1.sacar(100);
        conta2.sacar(100);
        conta3.sacar(100);

        conta1.devolver();
        conta2.devolver();
        conta3.devolver();
    }
}