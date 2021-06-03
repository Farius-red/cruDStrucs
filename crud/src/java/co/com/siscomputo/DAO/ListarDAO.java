/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.siscomputo.DAO;

import co.com.siscomputo.conexion.DBConnection;
import co.com.siscomputo.crud.forms.CrudForm;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author SISCOMPUTO
 */
public class ListarDAO {
    
    public String list(){
       
        String rta="";
        Connection con = null;
        CallableStatement stmt = null;

        try {
             CrudForm crudform = new CrudForm();
            con = DBConnection.getConnection();
            stmt = con.prepareCall("{aqui nombre proceso(?,?,?,?,?,?,?)}");
            
            stmt.registerOutParameter(1, java.sql.Types.VARCHAR);
            stmt.registerOutParameter(2, java.sql.Types.VARCHAR);
            stmt.registerOutParameter(3, java.sql.Types.NUMERIC);
            stmt.registerOutParameter(4, java.sql.Types.VARCHAR);
            stmt.registerOutParameter(5, java.sql.Types.VARCHAR);
            stmt.registerOutParameter(6, java.sql.Types.VARCHAR);
            stmt.registerOutParameter(7, java.sql.Types.VARCHAR);
            
            stmt.execute();
    
             rta="Esta listandoCorrectamente";
        } catch (Exception e) {
            rta="algo salio mal";
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
