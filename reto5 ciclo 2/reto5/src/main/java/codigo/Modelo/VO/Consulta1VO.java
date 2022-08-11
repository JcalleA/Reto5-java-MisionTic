package codigo.Modelo.VO;
import codigo.Modelo.DAO.*;

import java.sql.*;
import java.util.ArrayList;

public class Consulta1VO {

    public static ArrayList<String[]> valores1(){

        ResultSet rs = null;
        ArrayList<String[]> salida = new ArrayList<String[]>();
        try {

            rs=Consulta1DAO.consulta1();
            while (rs.next()) {
                int ID=rs.getInt("ID_Lider");
                String nombre=rs.getString("Nombre");
                String apellido=rs.getString("Primer_Apellido");
                String ciudad=rs.getString("Ciudad_Residencia");
                salida.add(new String[]{ID+"",nombre, apellido, ciudad});
            }
            
        } catch (Exception e) {
            //TODO: handle exception
        }
        return salida;


    }


    
}
