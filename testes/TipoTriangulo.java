package testes;
import java.util.Scanner;

public class TipoTriangulo {
    //ESTRUTURA DE SELECAO 
    /* TIPOS
     *      Simples: testar uma condição, e dar fim ao programa (apenas um if)
     *      Composta: testar uma condição, executando ações diferentes para V e F (if/else)
     *      Encadeada Heterogenea: verificação em ordem e assim que der V, o código associado é executado e o processo de verificação para (else if)
     *      Encadeada Homogênea: várias condições de verificação independentes. Todas as condições são verificadas. (vários if's)
     */
    
     /* Verifica se é triângulo e Tipo
     * É triângulo: (A<B+C) e (B<A+C) e (C<A+B)
     * É equilátero: (A = B) e (B = C)
     * É isósceles: (A = B) ou (A = C) ou (B = C)
     * É escaleno: (A <> B) e (B <> C) e (A <> C)
     */

    public static void main(String[] args){
        double a, b, c;
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor de a: ");
        a = sc.nextDouble();
        System.out.print("Informe o valor de b: ");
        b = sc.nextDouble();
        System.out.print("Informe o valor de c: ");
        c = sc.nextDouble();

        sc.close();

        //selecao encadeada heterogenea, pois existe várias verificações dentro do if (if else), e assim que uma é verdadeira, o programa para.
        if((a<(b+c)) && (b<(a+c)) && (c<(a+b))){
            System.out.print("Seu triangulo é: ");

                if((a == b) && (b == c)){
                    System.out.println("Equilátero");
                }else if((a == b)||(a == c)||(b == c)){
                    System.out.println("Isósceles");
                }else if((a != b)&&(b != c)&&(a != c)){
                    System.out.println("Escaleno");
                }

        }else{
            System.out.println("Não é triangulo");
        }
    }
}
