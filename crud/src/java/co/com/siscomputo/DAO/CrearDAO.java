package co.com.siscomputo.DAO;

import co.com.siscomputo.conexion.DBConnection;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;


public class CrearDAO {

    public String insert(
            Integer idU, 
            String nombres , 
            String apellidos,
            Integer edad,
            String pais,
            String departamento,
            String ciudad,
            String direccion,
            Integer action
    ) {
        String rta = "";
        Connection con = null;
        CallableStatement stmt = null;

      

        try {      
            con = DBConnection.getConnection();
            
            
            stmt = con.prepareCall("{call CRUDU(?,?,?,?,?,?,?,?,?,?)}");
            stmt.setInt(1, idU);
            stmt.setString(2, nombres) ;
            stmt.setString(3,apellidos);
            stmt.setInt(4,edad);
            stmt.setString(5,pais);
            stmt.setString(6, departamento);
            stmt.setString(7, ciudad);
            stmt.setString(8, direccion);
            
             stmt.setInt(9,action);
             stmt.registerOutParameter(10, java.sql.Types.VARCHAR);
             
            stmt.execute();
             
                rta =stmt.getString(10);
                
        } catch (Exception e) {
            
             System.out.println("nose logro nada insertar");
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