package ayuda;

import javax.swing.JOptionPane;

public class ayuda{
    public static void main(String[] args) {
        

        //if 
        int numero;
        int dato=5;

        numero = Integer.parseInt(JOptionPane.showInputDialog("digite el numero"));

        if(numero == dato){
            System.out.println("el numero es 5");

        }else{
            System.out.println("el numero no es 5");

        }

        System.exit(0);
    }
    private class ayuda{

        //switch
        int dat;

        dat = Integer.parseInt(JOptionPane.showInputDialog("digite un valor: "));
 
 
        switch(dato){
            case 1: JOptionPane.showMessageDialog(null, "es el numero 1");
                break;
            case 2: JOptionPane.showMessageDialog(null,"es el numero 2");
                break;
            case 3: JOptionPane.showMessageDialog(null, "es el numero 3");
                break;
            case 4: JOptionPane.showMessageDialog(null, "es el numero 4");
                break;
            default: JOptionPane.showInputDialog(null, " el numero no se encuentra")
 
        }

    
 
 
         System.exit(0);
    
}