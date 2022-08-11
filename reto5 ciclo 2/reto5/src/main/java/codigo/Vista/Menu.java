package codigo.Vista;
import java.awt.BorderLayout;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Menu {

    public Menu(){

    JFrame ventana1= new JFrame("Vista consultas");
        ventana1.setSize(800, 500);
        
        

        
        

        //contenedor

        

        

        
        
        
        

        //bara

        


        JPanel panel1 = new JPanel();
        panel1.setLayout(null);


        //boton
        JLabel label1= new JLabel("Realizar Consulta");
        label1.setFont(new Font("Verdana", Font.PLAIN, 25));
        label1.setBounds(280, 30, 300, 40);
        panel1.add(label1);

    

        JButton boton1= new JButton("Consulta 1");
        boton1.setBounds(200, 80, 100, 40);

        ActionListener l1= new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                new Interfaz1();
                
            }

        };
        boton1.addActionListener(l1);
        panel1.add(boton1);

        JButton boton2= new JButton("Consulta 2");
        boton2.setBounds(350, 80, 100, 40);
        ActionListener l2= new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                new Interfaz2();
                
            }

        };
        boton2.addActionListener(l2);
        panel1.add(boton2);

        
        JButton boton3= new JButton("Consulta 3");
        boton3.setBounds(500, 80, 100, 40);
        ActionListener l3= new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                new Interfaz3();
                
            }

        };
        boton3.addActionListener(l3);
        panel1.add(boton3);

        ventana1.getContentPane().add(BorderLayout.CENTER,panel1);


        


        ventana1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana1.setVisible(true);

        //label

        


    }
    
}
