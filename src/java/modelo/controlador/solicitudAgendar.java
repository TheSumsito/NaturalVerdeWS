/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.controlador;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.dao.daoControlador;
import modelo.entidades.Proyecto;
import modelo.entidades.Solicitud;

/**
 *
 * @author mjara
 */
@WebServlet(name = "solicitudAgendar", urlPatterns = {"/solicitudAgendar"})
public class solicitudAgendar extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            daoControlador dao = new daoControlador();
            List<Proyecto> listadoProyecto = null;
            
            try {
                listadoProyecto = dao.listarProyecto();
            } catch (SQLException ex) {
                Logger.getLogger(solicitudAgendar.class.getName()).log(Level.SEVERE, null, ex);
            }
            request.setAttribute("proyecto", listadoProyecto);
            request.getRequestDispatcher("agendarHora.jsp").forward(request, response);
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
        boolean resp = false;

        int Codigo = 123;
        String Hora = request.getParameter("txtHora");
        String Fecha = request.getParameter("txtFecha");
        String Estado = "PENDIENTE";
        String Proyecto = request.getParameter("cboProyecto");
        
        Solicitud soli = new Solicitud(Codigo, Hora, Fecha, Estado, Proyecto);
        daoControlador dao = new daoControlador();
        
        try {
            if(dao.AgregarSolicitud(soli))
            {
                resp=true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(solicitudAgendar.class.getName()).log(Level.SEVERE, null, ex);
        }
        request.setAttribute("resp", resp);
        request.getRequestDispatcher("agendarHora.jsp").forward(request, response);

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
