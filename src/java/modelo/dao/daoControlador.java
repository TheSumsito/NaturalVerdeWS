/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modelo.conexion.Conexion;
import modelo.entidades.Cliente;
import modelo.entidades.Equipo;
import modelo.entidades.Historial;
import modelo.entidades.Insumo;
import modelo.entidades.Proyecto;
import modelo.entidades.Solicitud;
import modelo.entidades.Usuario;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author mjara
 */
public class daoControlador {

    private Connection conexion;

    public daoControlador() {
    }

    public boolean AgregarUsuario(Usuario usu) throws SQLException {
        boolean respuesta = false;
        try {
            this.conexion = new Conexion().obtenerConexion();
            String agregarUsuario = "{ CALL SP_AGREGAR_USUARIO(?,?,?) }";
            CallableStatement cstmt = this.conexion.prepareCall(agregarUsuario);
            cstmt.setString(1, usu.getRutCliente());
            cstmt.setString(2, usu.getContrasena());
            cstmt.setString(3, usu.getTipo_Usuario());

            if (cstmt.executeUpdate() > 0) {
                respuesta = true;
            } else {
                respuesta = false;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            this.conexion.close();
        }
        return respuesta;
    }

    public boolean AgregarCliente(Cliente cli) throws SQLException {
        boolean respuesta = false;
        try {
            this.conexion = new Conexion().obtenerConexion();
            String AgregarCliente = "{ CALL SP_AGREGAR_CLIENTE(?,?,?,?,?) }";
            CallableStatement cstmt = this.conexion.prepareCall(AgregarCliente);
            cstmt.setString(1, cli.getRutCliente());
            cstmt.setString(2, cli.getNombre());
            cstmt.setString(3, cli.getApellido());
            cstmt.setInt(4, cli.getTelefono());
            cstmt.setString(5, cli.getCorreo());

            if (cstmt.executeUpdate() > 0) {
                respuesta = true;
            } else {
                respuesta = false;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            this.conexion.close();
        }
        return respuesta;
    }

    public boolean AgregarProyecto(Proyecto pro) throws SQLException {
        boolean respuesta = false;

        try {
            this.conexion = new Conexion().obtenerConexion();
            String AgregarProyecto = "{ CALL SP_AGREGAR_PROYECTO(?,?,?,?,?) }";
            CallableStatement cstmt = this.conexion.prepareCall(AgregarProyecto);
            cstmt.setString(1, pro.getNombre_Proyecto());
            cstmt.setString(2, pro.getServicio());
            cstmt.setString(3, pro.getEstado());
            cstmt.setString(4, pro.getRutCliente());
            cstmt.setString(5, pro.getNombre_Equipo());

            if (cstmt.executeUpdate() > 0) {
                respuesta = true;
            } else {
                respuesta = false;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            this.conexion.close();
        }
        return respuesta;
    }

    public boolean AgregarInsumo(Insumo in) throws SQLException {
        boolean respuesta = false;

        try {
            this.conexion = new Conexion().obtenerConexion();
            String AgregarInsumo = "{ CALL SP_AGREGAR_INSUMO (?,?,?,?,?,?) }";
            CallableStatement cstmt = this.conexion.prepareCall(AgregarInsumo);
            cstmt.setInt(1, in.getCodInsumo());
            cstmt.setString(2, in.getDescripcion());
            cstmt.setString(3, in.getTienda());
            cstmt.setInt(4, in.getCantidad());
            cstmt.setInt(5, in.getPrecio());
            cstmt.setString(6, in.getNombre_Proyecto());

            if (cstmt.executeUpdate() > 0) {
                respuesta = true;
            } else {
                respuesta = false;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            this.conexion.close();
        }
        return respuesta;
    }

    public boolean AgregarHistorial(Historial hist) throws SQLException {
        boolean respuesta = false;

        try {
            this.conexion = new Conexion().obtenerConexion();
            String AgregarHistorial = "{ CALL SP_AGREGAR_HISTORIAL(?,?,?,?,?) }";
            CallableStatement cstmt = this.conexion.prepareCall(AgregarHistorial);
            cstmt.setInt(1, hist.getFase());
            cstmt.setString(2, hist.getFecha());
            cstmt.setString(3, hist.getDescripcion());
            cstmt.setString(4, hist.getEstado());
            cstmt.setString(5, hist.getNombre_Proyecto());

            if (cstmt.executeUpdate() > 0) {
                respuesta = true;
            } else {
                respuesta = false;
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            this.conexion.close();
        }
        return respuesta;
    }

    public boolean AgregarSolicitud(Solicitud soli) throws SQLException {
        boolean respuesta = false;

        try {
            this.conexion = new Conexion().obtenerConexion();
            String AgregarSolicitud = "{ CALL SP_AGREGAR_SOLICITUD(?,?,?,?,?) }";
            CallableStatement cstmt = this.conexion.prepareCall(AgregarSolicitud);
            cstmt.setInt(1, soli.getCodSolicitud());
            cstmt.setString(2, soli.getHora());
            cstmt.setString(3, soli.getFecha());
            cstmt.setString(4, soli.getEstado());
            cstmt.setString(5, soli.getNombre_Proyecto());

            if (cstmt.executeUpdate() > 0) {
                respuesta = true;
            } else {
                respuesta = false;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            this.conexion.close();
        }
        return respuesta;
    }

    //LISTADOS
    public List<Proyecto> listarProyecto() throws SQLException {
        List<Proyecto> listaProyecto = new ArrayList<Proyecto>();
        try {
            this.conexion = new Conexion().obtenerConexion();
            String lista = "{ CALL SP_LISTAR_PROYECTO (?) }";
            CallableStatement cstmt = this.conexion.prepareCall(lista);
            cstmt.registerOutParameter(1, OracleTypes.CURSOR);
            cstmt.execute();

            ResultSet rs = (ResultSet) cstmt.getObject(1);

            while (rs.next()) {
                Proyecto pro = new Proyecto();
                pro.setNombre_Proyecto(rs.getString("Nombre_Proyecto"));
                pro.setServicio(rs.getString("Servicio"));
                pro.setEstado(rs.getString("Estado"));
                pro.setRutCliente(rs.getString("RutCliente"));
                pro.setNombre_Equipo(rs.getString("Nombre_Equipo"));

                listaProyecto.add(pro);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            this.conexion.close();
        }
        return listaProyecto;
    }

    public List<Solicitud> ListarSolicitud() throws SQLException {
        List<Solicitud> listaSolicitud = new ArrayList<Solicitud>();
        try {
            this.conexion = new Conexion().obtenerConexion();
            String lista = "{ CALL SP_LISTAR_SOLICITUD(?) }";
            CallableStatement cstmt = this.conexion.prepareCall(lista);
            cstmt.registerOutParameter(1, OracleTypes.CURSOR);
            cstmt.execute();

            ResultSet rs = (ResultSet) cstmt.getObject(1);

            while (rs.next()) {
                Solicitud soli = new Solicitud();
                soli.setCodSolicitud(rs.getInt("CodSolicitud"));
                soli.setHora(rs.getString("Hora"));
                soli.setHora(rs.getString("Fecha"));
                soli.setEstado(rs.getString("Estado"));
                soli.setNombre_Proyecto(rs.getString("Nombre_Proyecto"));

                listaSolicitud.add(soli);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            this.conexion.close();
        }
        return listaSolicitud;
    }

    public List<Historial> ListarHistorial() throws SQLException {
        List<Historial> listaHistorial = new ArrayList<Historial>();
        try {
            this.conexion = new Conexion().obtenerConexion();
            String lista = "{ CALL SP_LISTAR_HISTORIAL(?) }";
            CallableStatement cstmt = this.conexion.prepareCall(lista);
            cstmt.registerOutParameter(1, OracleTypes.CURSOR);
            cstmt.execute();

            ResultSet rs = (ResultSet) cstmt.getObject(1);

            while (rs.next()) {
                Historial hist = new Historial();
                hist.setFase(rs.getInt("Fase"));
                hist.setFecha(rs.getString("Fecha"));
                hist.setDescripcion(rs.getString("Descripcion"));
                hist.setEstado(rs.getString("Estado"));
                hist.setNombre_Proyecto(rs.getString("Nombre_Proyecto"));

                listaHistorial.add(hist);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            this.conexion.close();
        }
        return listaHistorial;
    }

    public List<Insumo> ListaInsumo() throws SQLException {
        List<Insumo> listaInsumo = new ArrayList<Insumo>();
        try {
            this.conexion = new Conexion().obtenerConexion();
            String lista = "{ CALL SP_LISTAR_INSUMO(?) }";
            CallableStatement cstmt = this.conexion.prepareCall(lista);
            cstmt.registerOutParameter(1, OracleTypes.CURSOR);
            cstmt.execute();

            ResultSet rs = (ResultSet) cstmt.getObject(1);

            while (rs.next()) {
                Insumo ins = new Insumo();
                ins.setCodInsumo(rs.getInt("CodInsumo"));
                ins.setDescripcion(rs.getString("Descripcion"));
                ins.setTienda(rs.getString("Tienda"));
                ins.setCantidad(rs.getInt("Cantidad"));
                ins.setPrecio(rs.getInt("Precio"));
                ins.setNombre_Proyecto(rs.getString("Nombre_Proyecto"));

                listaInsumo.add(ins);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            this.conexion.close();
        }
        return listaInsumo;
    }

    public List<Equipo> ListaEquipo() throws SQLException {
        List<Equipo> listaEquipo = new ArrayList<Equipo>();
        try {
            this.conexion = new Conexion().obtenerConexion();
            String lista = "{ CALL SP_LISTAR_EQUIPO(?) }";
            CallableStatement cstmt = this.conexion.prepareCall(lista);
            cstmt.registerOutParameter(1, OracleTypes.CURSOR);
            cstmt.execute();

            ResultSet rs = (ResultSet) cstmt.getObject(1);

            while (rs.next()) {
                Equipo equi = new Equipo();
                equi.setNombre_Equipo(rs.getString("Nombre_Equipo"));

                listaEquipo.add(equi);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            this.conexion.close();
        }
        return listaEquipo;
    }

    //VALIDACION DE LOGIN
    public boolean Login(String rut, String contrasena) throws SQLException {
        boolean respuesta = false;
        try {
            this.conexion = new Conexion().obtenerConexion();
            String login = "SELECT * FROM USUARIO WHERE RUTCLIENTE = ? AND CONTRASENA = ?";
            CallableStatement cstmt = this.conexion.prepareCall(login);
            cstmt.setString(1, rut);
            cstmt.setString(2, contrasena);
            cstmt.execute();

            ResultSet rs = cstmt.getResultSet();

            while (rs.next()) {
                respuesta = true;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            this.conexion.close();
        }
        return respuesta;
    }
}
