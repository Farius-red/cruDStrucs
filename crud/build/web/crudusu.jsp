

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
        function crud(c) {

    document.getElementById('metodo').value = c;
    let formulario = document.getElementById('crudForm');
    if (document.getElementById('metodo').value === '') {
        alert('el value del input esta vacio');
    } else {
        alert('envio correcto');
        formulario.submit();
    }

}   
        </script>
        <html:form styleId="crudForm"  action="/crud" >
            id: <input name="idU"/>
       Nombres: <input name="nombres"/>
       Apellidos:  <input name="apellidos"/>
       edad: <input name="edad"/>
       pais: <input name="pais"/>
        departamento:<input name="departamento"/>
        ciudad:<input name="ciudad"/>
       direccion:  <input name="direccion"/>
        <input id="metodo" name="crear" type="hidden"  />
        
        <button  onclick="crud('insertar')"  type="button">crear</button>
        <button  onclick="crud('actualizar')"  type="button">actualizar</button>
        <button  onclick="crud('eliminar')"  type="button">eliminar</button>
    </html:form>
    </body>
</html>
