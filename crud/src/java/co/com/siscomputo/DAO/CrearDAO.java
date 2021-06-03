package co.com.siscomputo.DAO;

import co.com.siscomputo.conexion.DBConnection;
import co.com.siscomputo.crud.forms.CrudForm;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;


public class CrearDAO {

    public String insert() {
        String rta = "";
        Connection con = null;
        CallableStatement stmt = null;

      

        try {
            CrudForm crudform = new CrudForm();
           
                
            con = DBConnection.getConnection();
            
            
            stmt = con.prepareCall("{CRUDU(?,?,?,?,?,?,?,?,?)}");
            stmt.setString(1, crudform.getNombres()) ;
            stmt.setString(2, crudform.getApellidos());
            stmt.setInt(3,crudform.getEdad());
            stmt.setString(4, crudform.getPais());
            stmt.setString(5, crudform.getDepartamento());
            stmt.setString(6, crudform.getCiudad());
            stmt.setString(7, crudform.getDireccion());
            
             stmt.setInt(8,crudform.getAction());
             stmt.registerOutParameter(9, java.sql.Types.VARCHAR);
             
            stmt.execute();
             
                rta =stmt.getString(9);
                
        } catch (Exception e) {
            
            rta ="nose logra hacer nada en bd";
            e.printStackTrace();
        }finally{
			try {
				stmt.close();
				con.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
       
    }
         return rta;
    }
}