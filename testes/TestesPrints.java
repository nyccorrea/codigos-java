package testes;
import java.util.Scanner;

public class TestesPrints {
    public static void main (String[] args) throws Exception{
        //PRINT COM MSG DE ERRO --> System.err.println();
        
        Scanner sc = new Scanner(System.in,"ISO-8859-1");
        System.out.println("Informe seu nome: ");
        String nome = sc.nextLine();
        
        System.out.println("Informe seu ano de nascimento: ");
        String ano = sc.nextLine();
        int converteAno = Integer.parseInt(ano);
        /* explicação converteAno 
        essa variável está pegando o ano em string, e transformando em inteiro 
        por meio do método "parseInt" que utiliza a classe Integer (classe para inteiro) 
        e finalizando com o valor da String.    *ou seja, o "(ano)".
        */

        System.out.println("Informe o nome da sua mãe: ");
        String mae = sc.nextLine();
        
        if(converteAno > 2023){
            System.err.println("Ano de nascimento inválido!");
        }else{
            System.out.format("Olá, %s! Registramos os seguintes dados sobre você. \nAno de Nascimento: %d | Nome da sua Mãe: %s\n", nome, converteAno, mae);
        }
        sc.close();
    }
}
