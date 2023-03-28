package controlador;
 
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.*;
 
/**
 * ESTA CLASE DEBE IMPLEMENTAR LA INTERFAZ DE JAVA ACTIONLISTENER
 * Y DEBE SOBREESCRIBIR TODOS LOS MÉTODOS QUE CONTENGA ESTA INTERFAZ
 */
 
public class ControlClics implements ActionListener {
 
    // Creamos una variable de tipo PintarVentana
    PintarVentana vistaPintarVentana;
     
    /**
     * EL MÉTODO CONSTRUCTOR RECIBIRÁ POR PARÁMETRO UN
     * OBJETO DE TIPO PINTAR VENTANA Y A ESTE OBJETO
     */
     
    public ControlClics(PintarVentana vPintar) {
        // A La variable vistaPintarVentana se le asignara
        // un objeto de la clase PintarVentana llamado vPintar
        // y el cual se le esta pasando por parámetro
        // en el constructor de esta clase
        vistaPintarVentana=vPintar;
    }
     
    /**
     * ESTE MÉTODO PONE A LA ESCUCHA DE LOS EVENTOS
     * DE CLIC DE RATON A CADA UNO DE LOS RADIOBUTTON
     * DE LA VENTANA CREADA EN EL PAQUETE VISTA
     */
    public void escucharEventos() {
        vistaPintarVentana.rdbAzul.addActionListener(this);
        vistaPintarVentana.rdbRojo.addActionListener(this);
        vistaPintarVentana.rdbVerde.addActionListener(this);
    }
     
    /**
     * ESTE MÉTODO SE ENCARGA DE EJECUTAR LAS ACCIONES
     * 
     */
    @Override
    public void actionPerformed(ActionEvent e) {
         
        // Si el RadioButton azul está seleccionado
        if(vistaPintarVentana.rdbAzul.isSelected()) {
             
            // Pintamos de azul la ventana
            vistaPintarVentana.lamina.setBackground(Color.BLUE);
             
            // Colocamos en el cuadro de texto "Azul"
            vistaPintarVentana.txtColor.setText("Azul");
             
        }
         
        // Sino, si el RadioButton rojo está seleccionado
        else if(vistaPintarVentana.rdbRojo.isSelected()) {
             
            // Pintamos de rojo la ventana
            vistaPintarVentana.lamina.setBackground(Color.RED);
             
            // Colocamos en el cuadro de texto "Rojo"
            vistaPintarVentana.txtColor.setText("Rojo");
        }
         
        // Sino, si el RadioButton verde esta seleccionado...
        else if(vistaPintarVentana.rdbVerde.isSelected()) {
             
            // Pintamos de rojo la ventana
            vistaPintarVentana.lamina.setBackground(Color.GREEN);
             
            // Colocamos en el cuadro de texto "Verde"
            vistaPintarVentana.txtColor.setText("Verde");
        }
    }
}
