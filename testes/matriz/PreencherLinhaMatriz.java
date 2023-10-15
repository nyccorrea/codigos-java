package testes.matriz;
import java.util.Scanner;
/* QUESTÃO - ENUNCIADO
 *      Faça um programa que o usuário defina o tamanho da matriz, qual a linha que deseja preencher e o valor de tal.
 *      Como resultado, a matriz deve ser impressa na tela, com a linha preenchida pelo valor informado pelo usuário.
 */
public class PreencherLinhaMatriz {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Qual o tamanho da matriz? ");
        int tamanho = input.nextInt();

        int[][] mat = new int[tamanho][tamanho];

        System.out.println("Qual linha da matriz deseja preencher? ");
        int linha = input.nextInt();

        System.out.println("Por qual valor deseja preencher? ");
        int valor = input.nextInt();

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat.length; j++){
                mat[linha][j] = valor;
            }
        }

        //imprimi matriz 
        System.out.println("-------------- MATRIZ ---------------");
        for(int i = 0; i < mat.length; i++){
            System.out.println();
            for(int j = 0; j < mat.length; j++){
                System.out.print("    "+mat[i][j]+ "       ");
            }
        }
        System.out.println("\n-------------------------------------");
        input.close();
    }

}
