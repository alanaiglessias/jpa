<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setLocale value="pt_BR" scope="application"/>

<//%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ page contentType="text/html; charset=ISO-8859-1" language="java" pageEncoding="UTF-8" import="java.sql.*" errorPage="" %>

<!DCOTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ProjetoWeb JPA</title>

        <link rel="stylesheet" type="text/css" href="css/paginainicial.css" />

    </head>
    <body>
        <h1>Ferreiro Rocha</h1>

        <hr>

        <div id="menu">
            <h3>Pessoas</h3>
                <ul>
                    <li><a href="CadastroServlet">CADASTRAR &#9997</a></li>
                    <li><a href="alterarpessoa.jsp">ALTERAR &#128172</a></li> 
                    <li><a href="listarpessoas.jsp">LISTAR &#128203</a></li> 
                    <li><a href="removerpessoa.jsp">REMOVER &#10060</a></li> 
                </ul>

        <hr>
        
            <h3>Setores</h3>
                <ul>
                    <li><a href="cadastrarsetor.jsp">CADASTRAR &#9997</a></li>
                    <li><a href="alterarsetor.jsp">ALTERAR &#128172</a></li> 
                    <li><a href="listarsetor.jsp">LISTAR &#128203</a></li> 
                    <li><a href="removersetor.jsp">REMOVER &#10060</a></li> 
                </ul>
        </div>

    </body>
</html>
