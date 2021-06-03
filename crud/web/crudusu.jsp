

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario CRUD</title>
    </head>
    <body>
        <script language="javascript">
            function actualizar(ac){
                document.getElementById('metodo').value = ac;
            }
            function crear(cr){
                document.getElementById('metodo').value = cr; 
            }   
             function eliminar(el){
                document.getElementById('metodo').value = el; 
            }  
        </script>
    <html:form action="/crud">
       Nombres: <input name="nombres"/>
       Apellidos:  <input name="apellidos"/>
       edad: <input name="edad"/>
       pais: <input name="pais"/>
        departamento:<input name="departamento"/>
        ciudad:<input name="ciudad"/>
       direccion:  <input name="direccion"/>
        <input id="metodo" name="crear" type="hidden"  />
        
        <button  onclick="crear('insertar')"  type="submit">crear</button>
        <button  onclick="actualizar('actualizar')"  type="submit">actualizar</button>
        <button  onclick="eliminar('eliminar')"  type="submit">eliminar</button>
    </html:form>
    </body>
</html>
