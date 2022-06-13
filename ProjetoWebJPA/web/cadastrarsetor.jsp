<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setLocale value="pt_BR" scope="application"/>

<//%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ page contentType="text/html; charset=ISO-8859-1" language="java" pageEncoding="UTF-8" import="java.sql.*" errorPage="" %>

<!DCOTYPE html>

<html lang="pt-br">
    <head>
        <meta charset="utf-08" />
        <title> CADASTRO SETOR </title>

        <link rel="stylesheet" type="text/css" href="css/cadastrosetor.css" />

    </head>
    <body>
        <h1>Ferreiro Rocha</h1>

        <hr>

        <div id="cadastro">
            <h3> Cadastro Setor </h3>
            <form name="form2" id="form1" action="SetorServletAdd" method="post">

                <label> Setor: </label>
                <input type="text" name="setor" id="setor" maxlength="30" size="60" placeholder="Informe o nome do setor" required /> 

                <p>

                <div id="botoes">
                    <input type="submit" value="CADASTRAR" />
                    <input type="reset" value="LIMPAR" />
                </div>

                <br><br>
            </form>
        </div>
        
        <h4><a href="paginainicial.jsp">Voltar à Página Inicial</a></h4>
        
        <footer id="rodape">
            <p id="copy">@Copyright 2021 - Todos os direitos reservados</p>
            <p id="txtcopy"> Este site foi desenvolvido em uma aula prática de HTML - Turma EMIDES3BM SENAI/SE </p>
        </footer>



    </body>
</html>

