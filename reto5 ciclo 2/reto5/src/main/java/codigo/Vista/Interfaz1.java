package codigo.Vista;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import codigo.Modelo.VO.*;

import java.awt.*;
import java.util.ArrayList;
public class Interfaz1 extends JFrame{

    JPanel panel1;
    JTable tabla1;
    DefaultTableModel modelo1;
    JScrollPane acpane1;

    public Interfaz1(){
        setTitle("Consulta 1");
        setSize(500, 500);
        setResizable(false);
        String[] columnas ={"ID", "Nombre", "Apellido", "Ciudad", };
        ArrayList<String[]> d=Consulta1VO.valores1();
        String[][] datos=new String[d.size()][4];
        for (int i=0; i< d.size(); i++) {
            int j=0;

            for(String s: d.get(i)){
                datos[i][j]=s;
                j++;

            }
        }
        //String[][] datos = {{"","","",},{"","","",}};
        modelo1 = new DefaultTableModel(datos,columnas);
        tabla1 = new JTable(modelo1);
        acpane1 = new JScrollPane(tabla1);
        acpane1.setBounds(20,20,440,460);
        add(acpane1);


        panel1=new JPanel();
        panel1.setBackground(new Color(75,25,125));
        add(panel1);

        setVisible(true);

        

    }
    

    
    
}
