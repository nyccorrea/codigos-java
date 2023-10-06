package inicio;

public class TipoPrints {
    //TIPOS DE PRINTS EM JAVA
    /*Em java temos 3 tipos principais de saída de dados no console.
     *      1)System.out.print();
     *      padrão de print, sua saída é normal, sem quebras de linha.
     *      
     *      2)System.out.println();
     *      Imprime quebrando linha
     * 
     *      3)System.out.printf();
     *      Usa formatação (especificadores)/similar a System.out.format();
     */

    public static void main (String[] args){
        System.out.print("Olá Mundo! ");
        System.out.println("");
        System.out.println("Olá");
        System.out.println("Mundo² ");
        System.out.printf("Olá Mundo³, atualmente possuo %d anos de idade.", 18);
        System.out.println("");
    }

    //SYSTEM.OUT.PRINTF
    /* Especificadores para o printf() ou format();
    %d --> int
    %c --> caracter
    %f --> float
    %o --> octal
    %s --> String
    %x --> hexadecimal
    %% --> porcento */
}
