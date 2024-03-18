// Escreva um algoritmo que leia dois números digitados pelo usuário e exiba oresultado da sua soma
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double n1 = scanner.nextDouble();

        System.out.println("Digite o segundo número:");
        double n2 = scanner.nextDouble();

        double soma = n1 + n2;

        System.out.println("A soma é: " + soma);

        scanner.close();
    }
}
