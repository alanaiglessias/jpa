<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setLocale value="pt_BR" scope="application"/>

<//%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ page contentType="text/html; charset=ISO-8859-1" language="java" pageEncoding="UTF-8" import="java.sql.*" errorPage="" %>

<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <title> PROJETO CRUD - PÁGINA MODELO </title>
        <meta charset="utf-8" />

    </head>
    <body>
        <h1>Ferreiro Rocha</h1>
        
        <h3>Listar Pessoas</h3>
        
        <section id="corpo">
            <div id="conteudo">

                <c:forEach var="i" items="${lista}" varStatus="cont">
                    <div class="pessoa">
                            ${cont.count} ${i.nome} | ${i.cpf} | ${i.setor}
                    </div>
                </c:forEach>

                <span id="msn">${mensagem}</span>
            </div>
        </section>
        <footer id="rodape">
            <p>Copyright 2022 - Código Fonte©</p>
        </footer>

    </body>
</html>
