<%-- 
    Document   : index.jsp
    Created on : 25/05/2020, 18:49:37
    Author     : abner
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="POST" action="LoginController">
             <input type="text" size="10" name="tUsuario" placeholder="Nome">
            <input type="password" size="10" name="tSenha" placeholder="Senha">
            <input type="submit" >
            </form>
    </body>
</html>
