package inicio;

public class Matriz {
    public static void main (String[] args){
    /* EXPLICAÇÃO MATRIZ
    * São arrays bidimensionais. Possuem linhas e colunas.
    *      A declaração é feita por tipo, nome, instanciação e tamanho
    *      int[][] nome = new int[3][3]      --> matriz do tipo inteiro
    *                                        de tamanho 3 por 3.
    * 
    * posições ----------------------------------
    * -   colunas     0       1       2         -
    * -   linhas  0 | a |   | b |   | c |       -
    * -           1 | d |   | e |   | f |       -
    * -           2 | g |   | h |   | i |       -
    * -------------------------------------------
    * 
    * A matriz é acessada do seguinte modo: 
    *                    --> int[linha] [coluna] = valorDeclarado;
    *                    --> por padrão, no Java onde não é declarado valor tem o 0;
    */
        //declarando matriz
        int[][] minhaMatriz = new int[3][3];
        //acessando pelo índice e definindo o valor.
        minhaMatriz[0][1] = 10;
        minhaMatriz[0][2] = 3;

        //percorrendo a matriz e apresentando-a na tela
        System.out.println("-------------- MATRIZ ---------------");

        for(int linha = 0; linha < minhaMatriz.length; linha++){
            System.out.println();
            for(int coluna = 0; coluna < minhaMatriz.length; coluna++){
                System.out.print("    "+minhaMatriz[linha][coluna]+ "       ");
            }
        }

        System.out.println("\n-------------------------------------");
        //realizando soma através da posição da matriz
        int soma = minhaMatriz[0][1] + minhaMatriz[0][2];
        System.out.printf("Soma: %d", soma);
        System.out.println("\n-------------------------------------");

    }


}
