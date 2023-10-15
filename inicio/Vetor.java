package inicio;
import java.util.Scanner;

public class Vetor {
    public static void main(String[] args){
        /* EXPLICAÇÃO VETOR
        * Quando o arranjo é unidimensional é denominado vetor.
        *          O que é arranjo em java?[Array]
        *          "É uma estrutura de dados que armazena um conjunto de elementos do 
        *           mesmo tipo em uma única variável."
        * Exemplo: int [] meuArray = new int[5]    --> é um Array unidimensional de 5 
        *                                              posiçoes, iniciado na posição zero. 
        */
        Scanner input = new Scanner(System.in);
        /*DECLARAR VETOR
        * 1º definir o tipo do vetor (int, String, Double...)
        * 2º definir o nome 
        * 3º definir que é um vetor através do [], 
        *              pode ser anexado na frente ou 
        *              atrás do nome da variável. 
        *              Exemplo: "int[] A" ou "int A[]";
        * 4º instanciar a referência(variável) criada para o vetor, com o comando new. 
        * 
        * Obs: o vetor só começa a existir na memória quando é instanciado.                                         
        */
        //tipo nome = instanciar e definir tamanho
        int[] meuVetor = new int [5];

        //percorre o vetor definindo seus valores pela posição i.
        for(int i = 0; i < meuVetor.length; i++){
            System.out.println("Insira o "+ (i+1)+ "º valor do vetor: ");
            int x = input.nextInt();
            meuVetor[i] = x;
        }
        
        //apresenta valores inseridos
        System.out.println("Valores do seu vetor:");
        for(int i = 0; i < meuVetor.length; i++){
            System.out.print(meuVetor[i]+ " ");
        }
        input.close();

        System.out.println("\n------------------------------------------------");
        System.out.println("         VETOR JÁ COM VALORES DEFINIDOS:        ");
        System.out.println("------------------------------------------------");


        //VETOR COM VALORES JÁ INFORMADOS
        int[] valores = {1, 2, 3, 4, 5};

        for(int i = 0; i < valores.length; i++){
            System.out.print("   "+ valores[i] + "   ");
        }
    }
}
