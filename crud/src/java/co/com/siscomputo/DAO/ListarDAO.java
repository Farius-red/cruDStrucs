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
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author SISCOMPUTO
 */
public class ListarDAO {

    public String list(){
       
        String rta="";
        Connection con = null;
        PreparedStatement pst = null;

        try {
             
            con = DBConnection.getConnection();
           
             String sql= "SELECT * FROM USUARIOS";
            
             pst.execute();
            
             rta="Esta listandoCorrectamente";
        } catch (Exception e) {
            rta="algo salio mal";
            e.printStackTrace();
        }finally{
			try {
				pst.close();
				con.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
       
        }
         return rta;
    }
}
