package RESTANTEZ;

import java.util.Scanner;

public class restantez{

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float participacion;
        float primerexamen;
        float segundoexamen;
        float examenfinal;

        System.out.println("Digite la nota de participacion: ");
        participacion= entrada.nextFloat();
        System.out.println("Digite la nota del primer examen: " );
        primerexamen=entrada.nextFloat();
        System.out.println("Digite la nota del segundo examen: ");
        segundoexamen=entrada.nextFloat();
        System.out.println("Digite el valor del examen final: ");
        examenfinal=entrada.nextFloat();


        participacion *=0.10f;
        primerexamen *=0.25;
        segundoexamen *=0.25;
        examenfinal *=0.40;

        float notafianl = participacion+primerexamen+segundoexamen+examenfinal;

        System.out.println("la nota final es: "+notafianl);
    }
}