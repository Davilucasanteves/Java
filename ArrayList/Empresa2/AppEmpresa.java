import javax.swing.JOptionPane;

public class AppEmpresa{
    static String nome;
    static int id;
    static double valorPagoHora, bonus, salarioBase, horasTrabalhadas, bolsa;
    static FolhaPagamento fPaga = new FolhaPagamento();

    public static void main(String args[]){
        
        fPaga.getFuncionarios().add(new FuncionarioFixo("Davi", 8, 1000, 20));

        int op;
        do{
            op= Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para adicionar um funcionario fixo\n"+
            "-2 para adicionar freelancer\n-3 para adicionar um estagiário \n-4 para ver a folha de pagamento de todos os funcionários \n-0 para sair: "));
            switch(op){
                case 1-> adicionaFFixo();
                case 2-> adicionaFreelancer();
                case 3-> adicionaEstagiario();
                case 4-> JOptionPane.showMessageDialog(null, fPaga.retornarPagamento());
                case 0-> JOptionPane.showMessageDialog(null, "Saindo...");
                default-> JOptionPane.showMessageDialog(null, "Opção Inválida!");
            }
        }while(op!=0);

    }

    public static void adicionaFFixo(){
        nome= JOptionPane.showInputDialog("Digite o nome: ");
        id= Integer.parseInt(JOptionPane.showInputDialog("Digite o id: "));
        salarioBase= Double.parseDouble(JOptionPane.showInputDialog("Digite o salario base: "));
        bonus= Double.parseDouble(JOptionPane.showInputDialog("Digite o bonus: "));
        FuncionarioFixo fFixo = new FuncionarioFixo(nome, id, salarioBase, bonus);
        JOptionPane.showMessageDialog(null, fFixo.detalharPagamento());
        fPaga.adicionarFuncionario(fFixo);
    }

    public static void adicionaFreelancer(){
        nome= JOptionPane.showInputDialog("Digite o nome: ");
        id= Integer.parseInt(JOptionPane.showInputDialog("Digite o id: "));
        valorPagoHora= Double.parseDouble(JOptionPane.showInputDialog("Digite o salario base: "));
        horasTrabalhadas= Double.parseDouble(JOptionPane.showInputDialog("Digite o bonus: "));
        Freelancer freelancer = new Freelancer(nome, id, valorPagoHora, horasTrabalhadas);
        JOptionPane.showMessageDialog(null, freelancer.detalharPagamento());
        fPaga.adicionarFuncionario(freelancer);
    }

    public static void adicionaEstagiario(){
        nome= JOptionPane.showInputDialog("Digite o nome: ");
        id= Integer.parseInt(JOptionPane.showInputDialog("Digite o id: "));
        bolsa= Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da bolsa: "));
        Estagiario estagiario = new Estagiario(nome, id, bolsa);
        JOptionPane.showMessageDialog(null, estagiario.detalharPagamento());
        fPaga.adicionarFuncionario(estagiario);
    }
}