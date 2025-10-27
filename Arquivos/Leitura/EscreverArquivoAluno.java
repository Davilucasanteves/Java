//Classe EscreverArquivoAluno

/*
 * Repostas 1.a) Da linha 26 a 32 é o escopo do finally, que sempre rodará. Aqui, se o usuário
  tiver escrito algo, o arquivio é encerrado e mostra-se uma mensagem informando o que aconteceu.
 * 
 * 1.b) Aqueles dados inseridos em tempo de execução se mantêm naquela execução, mas se eu correr o código de novo,
 * eles desaparecem.
 * 
 * 1.c) Agora o arquivo mantém os dados da antiga execução.
 * 
 * 
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class EscreverArquivoAluno
{
    public static void main(String[] args) {
        String nome;
        long matricula;
        File arquivo = new File("aluno.txt");
        FileWriter fw=null;
        BufferedWriter bw = null;
        try{
            fw = new FileWriter(arquivo, true);
            bw = new BufferedWriter(fw);
            int op=1;
            while (op !=0){
                nome = JOptionPane.showInputDialog("Digite o nome do aluno");
                matricula = Long.parseLong(JOptionPane.showInputDialog("Digite a matricula do aluno"));
                bw.write (nome);
                bw.write ("\t " + matricula );
                bw.newLine();
                op = Integer.parseInt(JOptionPane.showInputDialog("Deseja cadastrar outro aluno?\n 1 - sim \n0 - não"));
            }
                    
        }catch (IOException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        } finally { 
            try( FileReader fr = new FileReader(arquivo) ){
                BufferedReader br = new BufferedReader(fr);
                while( br.ready() ){
                    String linha = br.readLine();
                    System.out.println(linha);
                }
                br.close();
            }catch(IOException ex){
                ex.printStackTrace();
            }
            try {
                if (bw!=null)
                    bw.close();
            } catch (IOException e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        } 
    }
}