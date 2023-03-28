package definir;

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
import javax.swing.JOptionPane;

public class definir {

    Scanner entrada = new Scanner(System.in);
    int elementos;

    elementos =Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de elementos del array"));

    char[] letras = new char[elementos];
    
    System.out.println("digite elementos del arreglo: ");

    for(int i=0;i<elementos;i++){
        System.out.println((i+1)+"digite el caracter");
        letras[i]= entrada.next().chartAt(0);
    }
    System.out.println("\nlos caracteres del arreglo son: ");
    for(int i=0; i<elementos; i++){
    System.out.println(letras[i]);
}
}
