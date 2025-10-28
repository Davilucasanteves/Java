package modelo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class RepositorioArquivoProduto implements IProduto{
    private final String nomeArquivo;
    private File arquivo;
    BufferedWriter bw = null;
    
    public RepositorioArquivoProduto(){
        nomeArquivo="produto.txt";
        arquivo = new File (nomeArquivo);
    }

    public void createProduto (Produto p){
        try{
            bw.write(""+p.getCodigo());
            bw.write("\t"+p.getDescricao());
            bw.write("\t"+p.getValor());
            bw.newLine();
        }catch(IOException e){
            System.out.println("Erro");
        }
           
    }
    
    public Produto readProduto(int codigo){//tem que procurar no arquivo! :( , num sei se sei fazer...
        try(Scanner sc = new Scanner(new FileReader(arquivo))) { 
            while (sc.hasNext()){
                if(sc.nextLine().equals(codigo)){
                    for(int i=0; i<getAllProdutos().size(); i++){
                        if(getAllProdutos().get(i).getCodigo()==codigo){
                            return getAllProdutos().get(i);
                        }
                    }
                }
            }
         }catch (FileNotFoundException ex){
             System.out.println("Erro na leitura do arquivo "+ nomeArquivo +ex.getMessage());
         }
         return null;

        //Aqui é o jeito via ArrayList👇
        // for(int i=0; i<getAllProdutos().size(); i++){
        //     if(getAllProdutos().get(i).getCodigo()==codigo){
        //         return getAllProdutos().get(i);
        //     }
        // }
        // return null;
    }
    
     public ArrayList<Produto> getAllProdutos() {
         ArrayList<Produto> produtos = new ArrayList();
         try(Scanner sc = new Scanner(new FileReader(arquivo))) { 
            while (sc.hasNext()){
                Produto p = new Produto(1,"banana", 0.50);
                int codigo = sc.nextInt();
                String descricao = sc.next();
                double valor = (Double.parseDouble(sc.next()));
                p.setCodigo(codigo);
                p.setDescricao(descricao);
                p.setValor(valor);
                produtos.add(p);
            }
         }catch (FileNotFoundException ex){
             System.out.println("Erro na leitura do arquivo "+ nomeArquivo +ex.getMessage());
         }
         return produtos;
     }

     public void deleteProduto(Produto produto){
        getAllProdutos().remove(produto);
     }
}