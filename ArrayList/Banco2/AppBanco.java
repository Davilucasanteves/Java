import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AppBanco {     
    public static void main(String[] args) {
        String nome;
        
        ArrayList <Conta> contas = new ArrayList();
        contas.add(new ContaCorrente("joao", 0, 0.05));
        contas.add(new ContaCorrente("maria", 10, 0.05));
        contas.add(new Poupanca("joao", 10, 0.1));
        contas.add(new Poupanca("maria", 0, 0.1));
        
        
        for(int i=0; i<contas.size(); i++){
            if(contas.get(i) instanceof ContaCorrente){
                JOptionPane.showMessageDialog(null, "O saldo da conta "+ (i+1) + " é: "+((ContaCorrente)contas.get(i)).getSaldo());
                JOptionPane.showMessageDialog(null, "O tipo da conta "+ (i+1) + " é: "+ contas.get(i).getTipo());
            }else if(contas.get(i) instanceof Poupanca){
                JOptionPane.showMessageDialog(null, "O montante da conta "+ (i+1) + " é: "+((Poupanca)contas.get(i)).calcularRendimento());
                JOptionPane.showMessageDialog(null, "O tipo da conta "+ (i+1) + " é: "+ contas.get(i).getTipo());
            }
            JOptionPane.showMessageDialog(null, "Dados da conta "+ (i+1) + " é: "+ contas.get(i).recuperarDadosConta());
        }

        
        
        
    }
}