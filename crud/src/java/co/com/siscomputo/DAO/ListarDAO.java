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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author SISCOMPUTO
 */
public class ListarDAO {

    public ArrayList<CrudForm> list(){
       ArrayList<CrudForm>listU = null;
        String rta="";
        Connection con = null;
     

        try {
             
            con = DBConnection.getConnection();
           
             String sql= "SELECT IDU,NOMBRES,APELLIDOS,EDAD,PAIS,DEPARTAMENTO,CIUDAD,DIRECCION FROM USUARIOS";
             Statement st= con.createStatement();
               ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                    if(listU == null){
                    listU = new ArrayList<>();
                    }
                    
                  CrudForm aux = new  CrudForm();
                  aux.setIdU(rs.getInt("IDU"));
                  aux.setNombres(rs.getString("NOMRES"));
                  aux.setApellidos(rs.getString("APELLIDOS"));
                  aux.setEdad(rs.getInt("EDAD"));
                  aux.setPais(rs.getString("PAIS"));
                  aux.setDepartamento(rs.getString("DEPARTAMENTO"));
                  aux.setCiudad(rs.getString("CIUDAD"));
                  aux.setDireccion(rs.getString("DIRECCION"));
                  
                  listU.add(aux);
            }
           
        } catch (Exception e) {
            
            e.printStackTrace();
        }finally{
			try {
				
				con.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
       
        }
         return listU;
    }
}
