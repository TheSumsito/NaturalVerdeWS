/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import modelo.dao.daoControlador;
import modelo.entidades.Equipo;
import modelo.entidades.Historial;
import modelo.entidades.Insumo;
import modelo.entidades.Proyecto;
import modelo.entidades.Solicitud;
import modelo.entidades.Usuario;

/**
 *
 * @author mjara
 */
@WebService(serviceName = "NaturalWS")
public class NaturalWS {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "listaProyecto")
    public List<Proyecto> listaProyecto() {
        daoControlador dao = new daoControlador();
        try {
            return dao.listarProyecto();
        } catch (SQLException ex) {
            Logger.getLogger(NaturalWS.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "listaSolicitud")
    public List<Solicitud> listaSolicitud() {
        daoControlador dao = new daoControlador();
        try {
            return dao.ListarSolicitud();
        } catch (SQLException ex) {
            Logger.getLogger(NaturalWS.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "listaHistorial")
    public List<Historial> listaHistorial() {
        daoControlador dao = new daoControlador();
        try {
            return dao.ListarHistorial();
        } catch (SQLException ex) {
            Logger.getLogger(NaturalWS.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "listaInsumo")
    public List<Insumo> listaInsumo() {
        daoControlador dao = new daoControlador();
        try {
            return dao.ListaInsumo();
        } catch (SQLException ex) {
            Logger.getLogger(NaturalWS.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "listaEquipo")
    public List<Equipo> listaEquipo() {
        daoControlador dao = new daoControlador();
        try {
            return dao.ListaEquipo();
        } catch (SQLException ex) {
            Logger.getLogger(NaturalWS.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "estadoProyecto")
    public boolean estadoProyecto(@WebParam(name = "pro") Proyecto pro) {
        daoControlador dao = new daoControlador();
        try {
            dao.cambiarEstadoPro(pro);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(NaturalWS.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "estadoAgendar")
    public boolean estadoAgendar(@WebParam(name = "soli") Solicitud soli) {
        daoControlador dao = new daoControlador();
        
        try {
            dao.cambiarEstadoSoli(soli);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(NaturalWS.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }















}
