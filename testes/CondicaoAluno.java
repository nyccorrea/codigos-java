package testes;
import java.util.Scanner;

public class CondicaoAluno{

    public static void main(String[] args){
        //Esse programa obtém as notas bimestrais do aluno, retornando sua condição
        /*
         * Media 7 ou mais: passou direto
         * Entre 5 e 7: tem direito de fazer uma prova de recuperação
         * Abaixo de 5: reprovado direto
         */
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        double notas = 0;
        for(int i = 1; i <= 4; i++){
            System.out.printf("%dº bimestre: ", i);
            notas += sc.nextDouble();
        }

        double media = notas/4;

            if(media >= 7){
                System.out.println("Passou direto.");
            }else if(media > 5 && media < 7){
                System.out.println("Tem direito de fazer uma prova de recuperação");
            }else if(media < 5){
                System.out.println("Reprovado direto.");
            }

        System.out.printf("Olá, %s!\nRESUMO ------------------------\nSomatória das Notas: %.2f | Media: %.2f", nome, notas, media);
        sc.close();

    }

}