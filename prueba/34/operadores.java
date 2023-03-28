package operadores;

import java.util.Scanner;

public class operadores{

public static void main(String[] args) {

    int raiz = (int)Math.sqrt(9);
    System.out.println(raiz);
    float numero= 4.23f;
    long resultado = Math.round(numero);
    System.out.println(resultado);
    double base = 5;
    double exponente =2;

    double resultado3 = Math.pow(base, exponente);
    System.out.println(resultado3);




    System.exit(0);
}
}