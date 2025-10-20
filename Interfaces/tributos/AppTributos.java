import javax.swing.JOptionPane;

public class AppTributos{
    static String nome, cpf, endereco, descricao;
    static double valor, remuneracao, tamanho;

    static Consultoria consultoria;
    static Imovel imovel;
    static ProfissionalAutonomo profissa;
    static CalculaTributo calcTributo= new CalculaTributo();

    public static void main(String[] args){
        calcTributo.getTributaveis().add(new Imovel(9999, 1000, "rua jasmin"));
        int op;
        
        do{
            op= Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para cadastrar um imóvel,\n" +
            "2 para um profissional autônomo,\n3 para uma consultoria,\nOu 0 para sair e ver total de impostos: "));
            switch(op){
                case 1->criaImovel();
                case 2->criaProfissa();
                case 3->criaConsultoria();
                case 0->JOptionPane.showMessageDialog(null, "Saindo...\n"+ "Total de impostos é: "+ calcTributo.calculaTotalTributo());
                default->JOptionPane.showMessageDialog(null, "Opção inválida!");
            }

        }while(op!=0);

    }

    static public void criaImovel(){
        endereco= JOptionPane.showInputDialog("Digite o endereço do imóvel: ");
        valor= Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do imóvel: "));
        tamanho= Double.parseDouble(JOptionPane.showInputDialog("Digite o tamanho do imóvel: "));
        imovel = new Imovel(valor, tamanho, endereco);
        calcTributo.getTributaveis().add(imovel);
    }

    static public void criaProfissa(){
        endereco= JOptionPane.showInputDialog("Digite o endereço do profissional: ");
        remuneracao= Double.parseDouble(JOptionPane.showInputDialog("Digite a remuneração do profissional: "));
        cpf= JOptionPane.showInputDialog("Digite o cpf do profissional: ");
        nome= JOptionPane.showInputDialog("Digite o nome do profissional: ");
        profissa = new ProfissionalAutonomo(remuneracao, endereco, cpf, nome);
        calcTributo.adicionarTributo(profissa);//outro jeito de adicionar
    }

    static public void criaConsultoria(){
        descricao= JOptionPane.showInputDialog("Digite o endereço do imóvel: ");
        valor= Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do imóvel: "));
        consultoria = new Consultoria(descricao, valor);
        calcTributo.getTributaveis().add(consultoria);
    }
}