package testes.vetor;
import java.util.Scanner;

/* QUESTÃO FEITA
 *      Através de cinco valores inseridos pelo usuário, permita que o programa apresente 
 *      o maior valor digitado.
 * fonte: chatGPT
 */
public class MaiorValorDoVetor {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        //DECLARAR VETOR
        int[] meuVetor = new int [5];

        System.out.println("------------ Verifica maior valor ---------------");
        //percorre o vetor definindo seus valores pela posição i.
        for(int i = 0; i < meuVetor.length; i++){
            System.out.println("Insira o "+ (i+1)+ "º valor do vetor: ");
            int x = input.nextInt();
            meuVetor[i] = x;
        }

        //armazena o valor da posição zero na variável "maior".
        int maior = meuVetor[0];
                
        //percorre o vetor 
        for(int i = 0; i < meuVetor.length; i++){
            //faz a verificação se o valor do vetor na posição atual é maior que o valor na posição 0.
            /*
             * true --> o valor de "maior" é atualizado para o valor do vetor na posição atual, e continua-se o laço for.
             * false --> o valor de "maior" continua a ser o valor na posição 0, e em seguida, uma nova verificação é feita através do próximo loop.
             */
            if(meuVetor[i] > maior){
                    //valor de maior é atualizado para o valor do vetor na posição atual.
                    maior = meuVetor[i];
            }
        }

        System.out.println("-------------------------------------------------");
        //verificado todo o vetor através do último for, já tem o definitivo valor de "maior".
        System.out.println("O maior valor informado foi: "+ maior);

        input.close();
    }

}
