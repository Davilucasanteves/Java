package visao;
import controle.ControleContato;
import modelo.Contato;

public class AppControle{
    public static void main(String[] args){
        ControleContato cc = new ControleContato();
        cc.cadastrarContato(1,"Ana","1111-1111","ana@email.com");
        cc.cadastrarContato(2,"Bruno","2222-2222","bruno@email.com");
        System.out.println(cc.listarContato());
        System.out.println(cc.pesquisarContato("Ana"));
        cc.removerContato("Bruno");
        System.out.println(cc.listarContato());
    }
}
