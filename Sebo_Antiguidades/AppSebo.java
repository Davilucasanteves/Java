public class AppSebo {
    public static void main(String[] args) {
        
        Livro livro1= new Livro("Dom Casmurro", "Machado de Assis", "Principis", 1899, 256, 20.0);
        Livro livro2= new Livro("O Hobbit", "J.R.R. Tolkien", "HarperCollins", 1937, 320, 35.0);

        Cliente cliente1= new Cliente("João", "joao@gmail.com", "99999-1111", true);
        Cliente cliente2= new Cliente("Maria", "maria@gmail.com", "88888-2222", false);

        System.out.println("=== LIVROS ===");
        livro1.imprimirInfo();
        System.out.println("\n");
        livro2.imprimirInfo();

        System.out.println("\n=== CLIENTES ===");
        cliente1.imprimirInfo();
        System.out.println("\n");
        cliente2.imprimirInfo();
    }
}