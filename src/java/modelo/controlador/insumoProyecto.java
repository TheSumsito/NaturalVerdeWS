/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.dao.daoControlador;
import modelo.entidades.Insumo;
import modelo.entidades.Proyecto;

/**
 *
 * @author mjara
 */
@WebServlet(name = "insumoProyecto", urlPatterns = {"/insumoProyecto"})
public class insumoProyecto extends HttpServlet {

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
        daoControlador dao = new daoControlador();
        List<Proyecto> Proyecto = null;

        HttpSession sesion = request.getSession();
        String RutCliente = (String) sesion.getAttribute("rut");

        try {
            Proyecto = dao.buscarProyecto(RutCliente);
        } catch (Exception e) {
            Logger.getLogger(insumoProyecto.class.getName()).log(Level.SEVERE, null, e);
        }
        request.setAttribute("proyecto", Proyecto);
        request.getRequestDispatcher("insumoPro.jsp").forward(request, response);
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
        daoControlador dao = new daoControlador();
        List<Insumo> Insumo = new ArrayList<Insumo>();
        List<Proyecto> proyecto = null;
        
        HttpSession sesion = request.getSession();
        String RutCliente = (String) sesion.getAttribute("rut");
        
        String Nombre_Proyecto = request.getParameter("cboProyecto");
        
        try {
            Insumo = dao.buscarInsumo(Nombre_Proyecto);
            proyecto = dao.buscarProyecto(RutCliente);
        } catch (Exception e) {
            Logger.getLogger(insumoProyecto.class.getName()).log(Level.SEVERE, null, e);
        }
        request.setAttribute("proyecto", proyecto);
        request.setAttribute("insumo", Insumo);
        request.getRequestDispatcher("insumoPro.jsp").forward(request, response);
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
