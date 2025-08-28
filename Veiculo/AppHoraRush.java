import javax.swing.JOptionPane;
public class AppHoraRush {
    public static String menu(){
        return "Escolha a opção:\n"+
                "1 - Continuar\n"+
                "0 - Sair";
    }
    
    public static void main (String[] args){
      Veiculo veiculo;
      String listaVeiculo=""; 
      int opcao = Integer.parseInt(JOptionPane.showInputDialog(menu()));
      while (opcao==1){
          char codigo = JOptionPane.showInputDialog ("Digite o código do veículo ").charAt(0);
           String cor = JOptionPane.showInputDialog ("Digite a cor do veículo ");
           String tipo = JOptionPane.showInputDialog ("Digite o tipo do veículo ");
           int posicao = Integer.parseInt (JOptionPane.showInputDialog("Digite a posição inicial do veículo"));
           veiculo = new Veiculo(codigo, cor, tipo, posicao);
           listaVeiculo += veiculo.imprimir()+ "\n";
           opcao = Integer.parseInt(JOptionPane.showInputDialog(menu()));
      }
      JOptionPane.showMessageDialog (null, "Quantidade de veiculos: "+Veiculo.getQtdVeiculo() + "\n"+listaVeiculo);
    }
}