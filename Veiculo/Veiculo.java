/**
* A classe Veiculo representa um veículo do jogo Hora do Rush
*/

/** Respostas da Questão 1:
* a) A princípio, o código não correu devido a ausência dos getters. Ao implementá-lo corretamente, criando os devidos getters, o código solicita ao usuário informações sobre 
* o veículo, como o código dele, a cor e o tipo.
* 
* b) Os getters de todos os atributos privados são necessários para que a classe AppHoraRush os obtenha. Quanto aos setters, apenas se faz necessário o setter da variável posicao
* , que pode mudar seu valor durante a vida útil do projeto. Já as outras variáveis não devem ser modificadas, são inerentes àquele objeto, imutáveis. 
* Além disso, para a primeira e única definição dessas variáveis, já existe o construtor da classe Veiculo.
*/

public class Veiculo
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private char codigo;
    private String tipo;
    private String cor;
    private int posicao;
    private static int qtdVeiculo;

    // construtores
    public Veiculo(char codigo, String tipo, String cor, int posicao){
        this.codigo=codigo;
        this.tipo=tipo;
        this.cor=cor;
        this.posicao=posicao;
        qtdVeiculo++;
    }
    public Veiculo(char codigo, String tipo, String cor){
        this.codigo=codigo;
        this.tipo=tipo;
        this.cor=cor;
        qtdVeiculo++;
    }

    //métodos
    public static int getQtdVeiculo(){
        return qtdVeiculo;
    }
    public void frente(int deslocamento){
    
        posicao= posicao + deslocamento;
    }
    public void re (int deslocamento){
        posicao= posicao - deslocamento;
    }
    public String imprimir (){
        return "Veiculo: " + this.getCodigo() + " - " + this.getTipo() + " - "+
        this.getCor() + "\nPosição:" + this.getPosicao();
    }
    
    //getters e setters
    public int getPosicao(){
        return this.posicao;
    }
    
    public String getCor(){
        return this.cor;
    }
    
    public char getCodigo(){
        return this.codigo;
    }
    
    public String getTipo(){
        return this.tipo;
    }

    public void setPosicao(int posicao){
        this.posicao= posicao;
    }
}
