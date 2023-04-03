package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        
    	Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
        int num = scanner.nextInt();

        int num1 = 0, num2 = 1, proximo;
        boolean pertence = false;

        if (num == num1 || num == num2) {
            pertence = true;
        } else {
            while (num2 <= num) {
                proximo = num1 + num2;
                if (num == proximo) {
                    pertence = true;
                    break;
                }
                num1 = num2;
                num2 = proximo;
            }
        }

        if (pertence) {
            System.out.println(num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(num + " não pertence à sequência de Fibonacci.");
        }
        
    }
}





