
package SQL;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author gris_
 */
public class SQL {
    Connection conectar=null;
    public Connection conexion(){
         try{
            Class.forName("com.mysql.jdbc.Driver");
             conectar = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/alumnos","root","");
            JOptionPane.showMessageDialog(null, "Conexion Exitosa");
        } catch ( Exception e){
            JOptionPane.showMessageDialog(null,"Error Conexion " + e.getMessage());
        }
         return conectar;
}
}

