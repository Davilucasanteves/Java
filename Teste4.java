public class Teste4 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int nota100=0, nota50=0, nota20=0, nota10=0, nota5=0;

        System.out.println("Digite um valor inteiro para sacar do caixa: ");
        int x = scanner.nextInt();

        if(x%5!=0){
            System.out.println("O valor a ser sacado não será totalmente recebido.");
        }if(x/100>=1){
            nota100= x/100;
            System.out.println("Saque autorizado, "+ nota100 +" notas de 100." );
            x= x - (nota100*100);
        }if(x/50>=1){
            nota50= x/50;
            System.out.println("Saque autorizado, "+ nota50 +" notas de 50." );
            x= x - (nota50*50);
        }if(x/20>=1){
            nota20= x/20;
            System.out.println("Saque autorizado, "+ nota20 +" notas de 20." );
            x= x - (nota20*20);
        }if(x/10>=1){
            nota10= x/10;
            System.out.println("Saque autorizado, "+ nota10 +" notas de 10." );
            x= x - (nota10*10);
        }if(x/5>=1){
            nota5= x/5;
            System.out.println("Saque autorizado, "+ nota5 +" notas de 5." );
        }
    }
}