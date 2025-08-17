public class Teste2 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int x = scanner.nextInt();
        System.out.println("Sucessor de x = "+ (x+1) +",\nAntecessor de x = "+ (x-1));
    }
}