package codigo.Modelo.DAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import codigo.Utilidades.*;

public class Consulta3DAO {

    public static ResultSet consulta3(){
        Connection conn=null;
        Statement stmt=null;
        ResultSet rs=null;
        String csql="SELECT  com.ID_Compra, p.Constructora , p.Banco_Vinculado FROM Proyecto p JOIN Compra com on com.ID_Proyecto = p.ID_Proyecto WHERE com.Proveedor = 'Homecenter' AND p.Ciudad IN( 'Salento');";
        
        try {
            conn=jdbcutilities.Conexion();
            stmt=conn.createStatement();
            rs=stmt.executeQuery(csql);
            
        } catch (Exception e) {
            //TODO: handle exception
        }
        return rs;
    }
    
}
