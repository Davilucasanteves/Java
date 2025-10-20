import java.util.Objects;

public class Data{
    String data;
    private int dia, mes, ano;

    //construtor
    public Data(int dia, int mes, int ano){
        boolean bissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);

        if(dia<1 || mes<1 || ano<=0 || dia>31 ||
        (dia>30 && (mes==4 || mes==6 || mes==9 || mes==11)) ||
        (dia>=30 && mes==2) ||
        (mes==2 && ((bissexto && dia>29) || (bissexto && dia>28)))){
            this.data= "01/01/0001";
            this.dia= 1;
            this.mes= 1;
            this.ano= 1;
        }else{
            this.data= String.format("%02d/%02d/%04d", dia, mes, ano);
            this.dia= dia;
            this.mes= mes;
            this.ano= ano;
        }
    }

    //métodos
    public int comparar(Data datas){
        if (Objects.equals(this.data, datas.data) || 
        (this.ano==datas.ano && this.mes==datas.mes && this.dia==datas.dia)) {
            return 0;
        }else if (this.ano> datas.ano || (this.ano==datas.ano && this.mes>datas.mes) ||
        (this.ano==datas.ano && this.mes==datas.mes && this.dia>datas.dia)) {
            return 1;
        }else
            return -1;
    }

    public int getDia(){
        return this.dia;
    }

    public int getMes(){
        return this.mes;
    }

    public String getMesExtenso(){
        if(this.mes==1) return "Janeiro";
        else if(this.mes==2) return "Fevereiro";
        else if(this.mes==3) return "Março";
        else if(this.mes==4) return "Abril";
        else if(this.mes==5) return "Maio";
        else if(this.mes==6) return "Junho";
        else if(this.mes==7) return "Julho";
        else if(this.mes==8) return "Agosto";
        else if(this.mes==9) return "Setembro";
        else if(this.mes==10) return "Outubro";
        else if(this.mes==11) return "Novembro";
        else return "Dezembro";
    }

    public int getAno(){
        return this.ano;
    }

    public boolean isBissexto(){
        return (this.ano % 4 == 0 && this.ano % 100 != 0) || (this.ano % 400 == 0);
    }

    public Data clone(){
        Data newData = new Data(1,1,1);
        newData.data= this.data;
        newData.dia= this.dia;
        newData.mes= this.mes;
        newData.ano= this.ano;
        return newData;
    }
}