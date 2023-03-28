package vista;

import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class PanelMostrar extends JPanel{
    //Atributos
    private JTextArea taResultados;
    private JScrollPane spResultados;

    //metodos
    //metodos constructor
    public PanelMostrar(){
        this.setLayout(null);
        this.setBackground(Color.BLACK);

        taResultados = new JTextArea();
        spResultados = new JScrollPane(taResultados);   
        spResultados.setBounds(15, 15, 340, 140);
        this.add(spResultados);

        TitledBorder borde = BorderFactory.createTitledBorder("resultados");
        borde.setTitleColor(Color.WHITE);
        this.setBorder(borde);

    }
    public void mostrarResultados(double area, double perimetro){
        taResultados.setText("area: "+area+ "\tPerimetro: "+perimetro);
    }
}
/**crecion panel 
 *    public PanelOperaciones(){
        this.setLayout(null);
        this.setBackground(Color.BLUE);
    
 */