package inicio;
import java.util.Scanner;

public class Ifelse {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número: ");
        int num = sc.nextInt();

        if(num > 5){
            System.out.println("O número inserido é maior que 5.");
        }else{
            System.out.println("O número inserido não é maior que 5.");
        }

        sc.close();
    }
}
