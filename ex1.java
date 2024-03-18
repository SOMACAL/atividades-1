//Escreva um algoritmo que leia um número digitado pelo usuário e mostre amensagem 
//“Número maior do que 10!”, caso este número seja maior,
// ou “Número menor ou igual a 10!”, caso este número seja menor ou igual

import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);


         System.out.println("Digite o numero:");
         int a = leitor.nextInt();
         
         if (a >= 10) {
        System.out.println("numero maior ou igual a 10!");
        } if (a < 9) {
        System.out.println("numero menor que 10!");
        
        
        leitor.close();
    }
}

}
