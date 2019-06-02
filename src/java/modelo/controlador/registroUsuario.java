/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.dao.daoControlador;
import modelo.entidades.Cliente;
import modelo.entidades.Usuario;

/**
 *
 * @author mjara
 */
@WebServlet(name = "registroUsuario", urlPatterns = {"/registroUsuario"})
public class registroUsuario extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //CLIENTE
        String RutCliente = request.getParameter("txtRut").toUpperCase();
        String Nombre = request.getParameter("txtNombre").toUpperCase();
        String Apellido = request.getParameter("txtApellido").toUpperCase();
        int Telefono = Integer.parseInt(request.getParameter("txtNumero").toUpperCase());
        String Correo = request.getParameter("txtCorreo").toUpperCase();

        Cliente cli = new Cliente(RutCliente, Nombre, Apellido, Telefono, Correo);

        //USUARIO
        String Contrasena = request.getParameter("txtPass");
        String Tipo = "CLIENTE";

        Usuario usu = new Usuario(RutCliente, Contrasena, Tipo);

        daoControlador dao = new daoControlador();

        boolean resp = false;

        try {
            if (dao.AgregarCliente(cli)) {
                if (dao.AgregarUsuario(usu)) {
                    resp = true;
                }
            } else {
                resp = false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(registroUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        request.setAttribute("respuesta", resp);
        request.getRequestDispatcher("registro.jsp").forward(request, response);
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
