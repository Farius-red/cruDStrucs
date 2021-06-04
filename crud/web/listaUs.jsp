

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html ng-app="listU">
    <head>
        <script src="angular.min.js" type="text/javascript"></script>
        <script src="app.js" type="text/javascript"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista Usuarios</title>
    </head>
    <body>
        <div ng-controller="clistU">
        <html:form action="/crud">
            <h1>la lista XD</h1>
        </html:form>
            
        </div>
    </body>
</html>
