package testes;
import java.util.Scanner;
//programa para ajustar salário com base no salario atual
/*
 * REGRAS:
 * Salario entre 2000 e 2299 --> aumento de 400 reais
 * Salario entre 2300 e 2699 --> aumento de 600 reais
 * Salario entre 2700 e 3000 --> aumento de 1000 reais
 */

public class SalarioComAjuste {

    //funcao que faz o ajuste com base nas regras
    /* 
    EXPLICACAO MÉTODO(Funcao com retorno):
         public(1) static(2) int(3) acrescentarAjuste(4)(int salario(5)){
            1. publica (acesso de qualquer classe) 
            2. estática (pertence a classe) 
            3. int (tipo do retorno) 
            5. variável que vai ser utilizada no método.
     */
    public static int acrescentarAjuste(int salario){
        if(salario >= 2000 && salario <= 3000){
            System.out.println("Voce teve direito ao ajuste");
                if(salario >= 2000 && salario < 2300){
                    salario += 400; 
                }else if(salario >= 2300 && salario < 2700){
                    salario += 600;  
                }else if(salario >= 2700 && salario <= 3000){
                    salario += 1000;
                }
        }
        //retorna o salario com o ajuste feito
        return salario;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int salario;
        String nome;
        String funcao;

        //coletando os dados do usuário
        System.out.print("Informe seu nome: ");
        nome = sc.nextLine();
        System.out.print("Informe sua funcao: ");
        funcao = sc.nextLine();
        System.out.print("Informe seu salario: ");
        salario = sc.nextInt();

        /*salarioAjustado
        recebe a classe SalarioComAjuste com o método acrescentarAjuste(), 
        aplicando o ajuste salarial para o valor informado pelo usuário.
        */
        int salarioAjustado = SalarioComAjuste.acrescentarAjuste(salario);

        /* EXPLICACAO IF/ELSE
        Se o salário do funcionário estiver entre 2000 e 4000 reais o "sysout" dentro do if será executado. 
        Caso contrário, será o "sysout" do bloco else.
        */
        if(salarioAjustado >= 2000 && salarioAjustado <= 4000 ){
            System.out.printf("Parabens, %s! Sua função informada foi %s \nVoce teve um aumento, seu salario agora é de: R$ %d", nome, funcao, salarioAjustado);
        }else{
            System.out.printf("Desculpe, %s! Infelizmente, na sua funcao de %s, tendo em vista seu salário de R$ %d, determinamos que nenhum ajuste foi feito :(", nome, funcao, salario);
        }

        sc.close();

    }
    
}
