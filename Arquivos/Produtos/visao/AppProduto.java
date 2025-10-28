package visao;

import controle.ControleProduto;
import javax.swing.JOptionPane;
import modelo.Produto;

public class AppProduto{
    
    public static void main(String args[]){
        ControleProduto cp = new ControleProduto();
        String descricao;
        int codigo, op;
        double valor;

        try {
            do{ 
                op= Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para cadastrar produto\n-2 para pesquisar\n-3 para deletar\n-0 para sair: "));
                switch(op){
                    case 1: 
                        codigo= Integer.parseInt(JOptionPane.showInputDialog("Qual o código do produto: "));
                        descricao= JOptionPane.showInputDialog("Qual a descrição do produto: ");
                        valor= Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do produto: "));
                        cp.cadastraProduto(codigo, descricao, valor);
                    case 2:
                        codigo= Integer.parseInt(JOptionPane.showInputDialog("Qual o código do produto: "));
                        Produto p = cp.pesquisarProduto(codigo);
                        JOptionPane.showMessageDialog(null, "Seu produto é: "+ p.getDescricao());
                    case 3: 
                        codigo= Integer.parseInt(JOptionPane.showInputDialog("Qual o código do produto: "));
                        descricao= JOptionPane.showInputDialog("Qual a descrição do produto: ");
                        valor= Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do produto: "));
                        Produto pDeleta = new Produto(codigo, descricao, valor);
                        cp.removerProduto(pDeleta);
                }
            }while(op!=0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } 
    }
}