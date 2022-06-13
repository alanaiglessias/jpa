/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.servlet;

import br.com.controle.PessoaControle;
import br.com.modelo.Pessoa;
import br.com.modelo.Setor;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PessoaServletAlterar extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int op = Integer.parseInt(request.getParameter("op"));
        int id = Integer.parseInt(request.getParameter("id"));

        Setor s = new Setor();
        s.setIdsetor(Integer.parseInt(request.getParameter("idsetor")));
        
        Pessoa p = new Pessoa();
        PessoaControle pControl = new PessoaControle();

        if (op == 1) {
            p = pControl.listarPessoa(id);

            request.setAttribute("pessoa", p);
            request.getRequestDispatcher("alterarpessoa.jsp").forward(request, response);
        } else {

            p.setNome(request.getParameter("nome"));
            p.setCpf(Long.parseLong(request.getParameter("cpf")));
            p.setSenha(request.getParameter("senha"));
            p.setId(Integer.parseInt(request.getParameter("id")));
            p.setSetor(s);

            pControl.alterarPessoa(p);

            request.setAttribute("mensagem", "Alterado com  Sucesso!!!");
            request.getRequestDispatcher("listarpessoas.jsp").forward(request, response);

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
