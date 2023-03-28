package inicio;

import java.util.Scanner;

import javax.annotation.processing.SupportedOptions;
import javax.swing.JOptionPane;

public class errores {
    public static void main(String[] args) {
        System.out.println("hola mundo");
        int entero = 12;
        System.out.println("numero entero: "+entero);

        String palabra = "hola que tal?";
        System.out.println(palabra);

        entero = 20;
        System.out.println(entero);
        
        // final int = 23; // crear una constante 

        Scanner entrada = new Scanner(System.in);
        String cadena;

        //System.out.println("digite una cadena: ");
        //cadena = entrada.nextLine();
        //System.out.println("la cadena es: "+cadena);

        //cadena = JOptionPane.showInputDialog("digite una cadena: ");
        //JOptionPane.showMessageDialog(null,"la cadena es:"+cadena);

        float numero1,numero2;

        System.out.println("digite 2 numeros");
        numero1 = entrada.nextFloat();
        numero2 = entrada.nextFloat();

        float suma = numero1+numero2;
        float resta = numero1-numero2;
        float mult = numero1*numero2;
    

        System.out.println("la suma es"+ suma);
        System.out.println("la resta es: "+resta);
        System.out.println("la multiplicacion es: "+mult);


        
        System.exit(0);

    }
}