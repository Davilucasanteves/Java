public class Teste5 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        String alunos[] = new String[11];
        String alunoMaior="s", alunoMenor="s";
        int notas[] = new int[11];
        int soma = 0, maiorNota=0, menorNota=Integer.MAX_VALUE, tam=10;
        float media;   

        for(int i = 1; i <= tam; i++){
            System.out.println("Digite a nota do aluno "+ i +": ");
            notas[i] = scanner.nextInt();
            System.out.println("Digite o nome do aluno "+ i +": ");
            alunos[i] = scanner.next();
            soma = soma + notas[i];

            if(maiorNota < notas[i]){
                maiorNota = notas[i];
                alunoMaior = alunos[i];
            }
            if(menorNota > notas[i]){
                menorNota = notas[i];
                alunoMenor = alunos[i];
            }
        }

        media = soma/tam;
        System.out.println("A maior nota foi: "+ maiorNota +
        ". Do aluno: "+ alunoMaior +
        "\nA menor nota foi: "+ menorNota +
        ". Do aluno: "+ alunoMenor +
        "\nA média da turma foi: "+ media);

    }
}