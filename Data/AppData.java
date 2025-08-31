import javax.swing.JOptionPane;

public class AppData{
    public static void main (String[] args){
        int dia, mes, ano;

        dia = Integer.parseInt(JOptionPane.showInputDialog("      --Dados da primeira data--\nDigite o dia: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês: "));
        ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano: "));
        Data data1 = new Data(dia, mes, ano);

        dia = Integer.parseInt(JOptionPane.showInputDialog("      --Dados da segunda data--\nDigite o dia: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês: "));
        ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano: "));
        JOptionPane.showMessageDialog (null, "Qualquer data irreal se converterá em 01/01/0001!");
        Data data2 = new Data(dia, mes, ano);
        Data dataCopia = new Data(1, 1, 1);

        int valor= data1.comparar(data2);
        if(valor==0){
            JOptionPane.showMessageDialog (null, "Suas datas são iguais!");
        }else if(valor==1){
            JOptionPane.showMessageDialog (null, "Data 1 maior que data 2!");
        }else
            JOptionPane.showMessageDialog (null, "Data 2 maior que data 1!");

        int ctrl=1, copia=1;
        do { 
            int op = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 se quiser copiar a primira data, 2 para copiar a segunda: "));
            if(op==1){
                dataCopia = data1.clone();
                ctrl=0;
                copia=1;
            }
            else if(op==2){
                dataCopia = data2.clone();
                ctrl=0;
                copia=2;
            }
            else 
                JOptionPane.showMessageDialog (null, "Opção inválida!");
        } while (ctrl==1);

        ctrl=1;
        do { 
            int op = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para dados da primira data, 2 para dados da segunda: "));
            switch(op){
                case 1:
                    if(data1.isBissexto()){
                        JOptionPane.showMessageDialog (null, "Seu ano é Bissexto!" + "\nSeu dia é: "+ data1.getDia()+ "\nSeu mês é: "+ data1.getMes()+ 
                        "\nSeu mês por extenso é: "+ data1.getMesExtenso()+ "\nSeu ano é: "+ data1.getAno()+ "\nData: "+ data1.data);
                    }else
                        JOptionPane.showMessageDialog (null, "Seu ano não é Bissexto!" + "\nSeu dia é: "+ data1.getDia()+ "\nSeu mês é: "+ data1.getMes()+ 
                        "\nSeu mês por extenso é: "+ data1.getMesExtenso()+ "\nSeu ano é: "+ data1.getAno()+ "\nData: "+ data1.data);
                    
                    
                    JOptionPane.showMessageDialog (null, "Seu mês da cópia(" + copia + ") por extenso é: "+ dataCopia.getMesExtenso());
                    ctrl=0;
                    break;

                case 2:
                    if(data2.isBissexto()){
                        JOptionPane.showMessageDialog (null, "Seu ano é Bissexto!" + "\nSeu dia é: "+ data2.getDia()+ 
                        "\nSeu mês é: "+ data2.getMes()+ 
                        "\nSeu mês por extenso é: "+ data2.getMesExtenso()+ "\nSeu ano é: "+ data2.getAno()+ "\nData: "+ data2.data);
                    }else
                        JOptionPane.showMessageDialog (null, "Seu ano não é Bissexto!" + "\nSeu dia é: "+ data2.getDia()+ "\nSeu mês é: "+ data2.getMes()+ 
                        "\nSeu mês por extenso é: "+ data2.getMesExtenso()+ "\nSeu ano é: "+ data2.getAno()+ "\nData: "+ data2.data);
                   
                    JOptionPane.showMessageDialog (null, "Seu mês da cópia(" + copia + ") por extenso é: "+ dataCopia.getMesExtenso());
                    ctrl=0;
                    break;

                default:
                    JOptionPane.showMessageDialog (null, "Opção inválida!");
            } 
        } while(ctrl==1);
    }
}
