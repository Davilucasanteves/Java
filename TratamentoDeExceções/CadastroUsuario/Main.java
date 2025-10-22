import javax.swing.JOptionPane;

public class Main{
    public static void main(String args[]){
        String nome;
        int idade;
        try {
            nome= JOptionPane.showInputDialog("Diga o nome do usuário: ");
            idade= Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: "));
            Usuario usu = new Usuario(nome, idade);
        } catch (IdadeInvalidaException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally{
            JOptionPane.showMessageDialog(null, "Deu bom!");
        }
        
    }
}