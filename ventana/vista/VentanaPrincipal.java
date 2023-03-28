package vista;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class VentanaPrincipal extends JFrame{
    //extencion de jframe para crear la ventana
    public VentanaPrincipal(){

        
        this.setLayout(null);
        this.setBackground(Color.decode("#00ff00"));

        PanelMostrar miPanelMostrar = new PanelMostrar();
        miPanelMostrar.setBounds(10,10,370,170);
        this.add(miPanelMostrar);
 
        this.setTitle("calculadora");
        this.setSize(400,600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.GRAY);
        this.setVisible(true);

    }

}
/** Agregar un panel 
 * miPanelOperaciones = new PanelOperaciones();
        miPanelOperaciones.setBounds(10,231,660,115);
        this.add(miPanelOperaciones);

 */
