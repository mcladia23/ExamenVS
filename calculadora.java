package calculadora;

import java.util.Scanner;

public class Calculadora {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
    System.out.println("Introduzca el primer número");
    int num1 = Integer.parseInt(Scanner.nextLine());

    System.out.println("Introduzca el segundo número");
    int num2 = Integer.parseInt(Scanner.nextLine());

    System.out.println("Introduzca la operación a realizar:");
    System.out.println("1- SUMA");
    System.out.println("Suma: "+ num1 + num2);

}
}