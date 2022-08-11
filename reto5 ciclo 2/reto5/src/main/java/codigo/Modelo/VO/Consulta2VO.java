
package codigo.Modelo.VO;
import codigo.Modelo.DAO.*;

import java.sql.*;
import java.util.ArrayList;

public class Consulta2VO {
    public static ArrayList<String[]> valores2(){

        ResultSet rs = null;
        ArrayList<String[]> salida = new ArrayList<String[]>();
        try {

            rs=Consulta2DAO.consulta2();
            
            while (rs.next()) {
                int ID=rs.getInt("ID_Proyecto");
                String constructora=rs.getString("Constructora");
                String habitaciones=rs.getString("Numero_Habitaciones");
                String ciudad=rs.getString("Ciudad");
                salida.add(new String[]{ID+"", constructora, habitaciones, ciudad});
                
            }
            
        } catch (Exception e) {
            //TODO: handle exception
        }
        return salida;


    }
}