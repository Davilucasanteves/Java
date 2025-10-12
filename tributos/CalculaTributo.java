import java.util.ArrayList;

public class CalculaTributo{
    static double total=0;
    ArrayList<ITributavel> tributaveis = new ArrayList();

    public void adicionarTributo(ITributavel it){
        tributaveis.add(it);
    }

    public double calculaTotalTributo(){
        for(int i=0; i<tributaveis.size(); i++){
            total+=tributaveis.get(i).getValorImposto();
        }
        return total;
    }

    public ArrayList<ITributavel> getTributaveis(){
        return tributaveis;
    }

}