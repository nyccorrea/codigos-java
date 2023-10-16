package testes.matriz;
import java.util.Scanner;

public class SomaDiagonalPrincipal {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Qual a ordem da matriz? ");
        int ordem = input.nextInt();

        double[][] mat = new double[ordem][ordem];
        double soma = 0;

        System.out.println("Digite os valores da matriz: ");
        //percorre a linha
        for(int i = 0; i < mat.length; i++){
            //percorre a coluna
            /*
                a coluna(variável j) vai sendo implementada em 1 até o j ser menor que o tamanho das colunas na matriz.
                Quando ele atinge um tamanho maior o laço for para, e retorna ao for da linha.
                Desse modo, quando a linha for incrementada em 1, o for é executado novamente, até o fim das colunas
                referente a linha presente. 
                Exemplo:
                        passo I --> o i vale 1
                        for(int i = 0; i < mat.length; i++){
                            --> na linha 1, o j vai ser implementado em 1 a cada vez que o laço abaixo é repetido.
                            for(int j = 0; j < mat.length; j++){
                                //bloco de comandos é repetido a cada laço.
                            } passo II --> quando o valor de j for maior que o tamanho da matriz, o laço para.
                        }
                        passo III --> o i é incrementado em 1. Passa a valer 2... Retorna ao passo I, agora com i = 2.
            */    
            for(int j = 0; j < mat.length; j++){
                //incrementa os valores na matriz
                mat[i][j] = input.nextDouble();

                //se a linha == coluna faz parte da diagonal principal
                if(i == j){
                    //é somado a diagonal principal
                    soma = soma + mat[i][j];
                }
            }
        }

        System.out.println("Soma da diagonal principal: "+ soma);
        input.close();
    }
}
