package inicio;

public class Variaveis {
    public static void main (String[] args){
        //VARIAVEIS PRIMITIVAS 
        /*
         * Group INT:
         * BYTE < SHORT < INT < LONG    --> (Ordenadas por tamanho)
         *      BYTE --> recebe valores menores. (Entre -128 +127)
         *      SHORT --> recebe valores intermediários. (Entre -32768 a 32767)
         *      INT --> recebe valores grandes.
         *      LONG --> recebe valores MUITO GRANDES. Deve ser especificado um l no final do valor.
         * 
         * Group FLOAT:        ( todos devem usar o . ao invés de , )
         *      FLOAT --> recebe valores com vírgula, precisão de 6 casas decimais. Deve ser utilizado o f no final.
         *      DOUBLE --> recebes valores muito grandes ou muito pequenos, com precisão de 10 casas decimais.
         *      
         * Group CARACTER:
         *      CHAR --> recebe apenas um valor (uma letra);
         *      
         * Group BOOLEANO:
         *      BOOLEAN --> true ou false.
         * 
         * Group STRING:
         *      STRING --> Em java é uma classe, então deve ter a 1º letra maiuscula. Recebe textos.
         */

        System.out.println("Variaveis do tipo Inteiro");
        byte numeroPequeno1 = -128;
        byte numeroPequeno2 = 127;
        System.out.println("Byte: "+numeroPequeno1+" | "+numeroPequeno2);
    
        short numeroIntermediario1 = -32768;
        short numeroIntermediario2 = 32767;
        System.out.println("Short: "+numeroIntermediario1+" | "+numeroIntermediario2);
        
        int numeroGrande1 = -2147483648;
        int numeroGrande2 = 2147483647;
        System.out.println("Int: "+numeroGrande1+" | "+numeroGrande2);

        long numeroMuitoGrande1 = -21474836489001020l;
        long numeroMuitoGrande2 = 21474836489001020l;
        System.out.println("Long "+numeroMuitoGrande1+" | "+numeroMuitoGrande2);
        
        System.out.println("---------------------------------------------------");
        System.out.println("Variaveis do tipo Float");
        float valorFloat = 12.898989108f;
        double valorDouble = 12.898989898;
        System.out.printf("Tipo float %f \nTipo Double %f ", valorFloat, valorDouble);

        System.out.println("\n---------------------------------------------------");
        System.out.println("Variaveis do tipo Caracter");
        char umCaracter = 'N';
        System.out.println("Char: "+umCaracter);

        System.out.println("---------------------------------------------------");
        System.out.println("Variaveis do tipo Booleano");
        boolean trueOuFalse = false;
        System.out.println("Boolean: "+trueOuFalse);

        System.out.println("---------------------------------------------------");
        System.out.println("Variaveis do tipo String");
        String texto = "Nicoly Corrêa";
        System.out.println("String: "+texto);

    }
}
