<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setLocale value="pt_BR" scope="application"/>

<//%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ page contentType="text/html; charset=ISO-8859-1" language="java" pageEncoding="UTF-8" import="java.sql.*" errorPage="" %>

<!DCOTYPE html>

<html lang="pt-br">
    <head>
        <meta charset="utf-08" />
        <title> CADASTRO PESSOA </title>

        <link rel="stylesheet" type="text/css" href="css/cadastrarpessoa.css" />

    </head>
    <body>
        <h1>Ferreiro Rocha</h1>

        <hr>

        <div id="cadastro">
            <h3> Cadastro Pessoa </h3>
            <form name="form1" id="form1" action="CadastroServlet" method="post">
                <label> Nome: </label>
                <input type="text" name="nome" id="nome" maxlength="30" size="60" placeholder="Informe o seu nome" required /> 

                <p>

                    <label> CPF:  </label>
                    <input type="number" name="cpf" id="cpf" maxlength="11" size="20" placeholder="Informe seu CPF" required /> 

                <p>

                    <label> Setor: </label>

                    <select name="idsetor" required>

                        <option value="">Selecione o setor</option>

                        <c:forEach var="i" items="${lista}" varStatus="cont">
                            <option value="${i.idsetor}">${i.setor}</option>    
                        </c:forEach>

                    </select>

                <p>

                    <label> Senha:  </label>
                    <input type="password" name="senha" id="senha" maxlength="6" size="10" placeholder="Informe a senha" required />

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
