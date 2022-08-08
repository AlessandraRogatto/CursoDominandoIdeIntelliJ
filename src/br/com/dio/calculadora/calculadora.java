package br.com.dio.calculadora;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float a, b;

        System.out.println("Digite o primeiro número: ");
        a = scan.nextInt();

        System.out.println("Digite o segundo número: ");
        b = scan.nextInt();

        float somar = somar(a, b);
        float subtr = subtrair(a, b);
        float multipl = multiplicar(a, b);
        float divi = dividir(a, b);

        System.out.println("somar: " + somar);
        System.out.println("subtrair: " + subtr);
        System.out.println("Multiplicar: " + multipl);
        System.out.println("Dividir: " + divi);

    }

    public static float somar(float a, float b) {
        return a + b;
    }

    public static float subtrair(float a, float b) {
        return a - b;
    }

    public static float multiplicar(float a, float b) {
        return a * b;
    }

    public static float dividir(float a, float b) {
        return a / b;
    }


}
