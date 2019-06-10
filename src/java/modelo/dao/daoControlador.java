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
import modelo.entidades.Trabajador;
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

    //AGREGAR USUARIO
    public boolean AgregarUsuario(Usuario usu) throws SQLException {
        boolean respuesta = false;
        try {
            //OBTENEMOS LA CONEXION
            this.conexion = new Conexion().obtenerConexion();
            //LLAMAMOS AL PROCEDIMIENTO ALMACENANDOLO EN UNA VARIABLE
            String agregarUsuario = "{ CALL SP_AGREGAR_USUARIO(?,?,?) }";
            //LLAMAMOS A LA CONEXION NUEVAMENTE PARA ASI VALIDAR EL ARREGLO ALMACENADO
            CallableStatement cstmt = this.conexion.prepareCall(agregarUsuario);
            //VARIABLES DE CAPTURA
            cstmt.setString(1, usu.getRutCliente());
            cstmt.setString(2, usu.getContrasena());
            cstmt.setString(3, usu.getTipo_Usuario());

            //VALIDAMOS 
            if (cstmt.executeUpdate() > 0) {
                respuesta = true;
            } else {
                respuesta = false;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            //CERRAMOS LA CONEXION
            this.conexion.close();
        }
        return respuesta;
    }

    public boolean AgregarCliente(Cliente cli) throws SQLException {
        boolean respuesta = false;
        try {
            //OBTENEMOS LA CONEXION
            this.conexion = new Conexion().obtenerConexion();
            //LLAMAMOS AL PROCEDIMIENTO ALMACENANDOLO EN UNA VARIABLE
            String AgregarCliente = "{ CALL SP_AGREGAR_CLIENTE(?,?,?,?,?) }";
            //LLAMAMOS A LA CONEXION NUEVAMENTE PARA ASI VALIDAR EL ARREGLO ALMACENADO
            CallableStatement cstmt = this.conexion.prepareCall(AgregarCliente);
            //VARIABLES DE CAPTURA
            cstmt.setString(1, cli.getRutCliente());
            cstmt.setString(2, cli.getNombre());
            cstmt.setString(3, cli.getApellido());
            cstmt.setInt(4, cli.getTelefono());
            cstmt.setString(5, cli.getCorreo());

            //VALIDAMOS 
            if (cstmt.executeUpdate() > 0) {
                respuesta = true;
            } else {
                respuesta = false;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            //CERRAMOS LA CONEXION
            this.conexion.close();
        }
        return respuesta;
    }

    public boolean AgregarProyecto(Proyecto pro) throws SQLException {
        boolean respuesta = false;

        try {
            //OBTENEMOS LA CONEXION
            this.conexion = new Conexion().obtenerConexion();
            //LLAMAMOS AL PROCEDIMIENTO ALMACENANDOLO EN UNA VARIABLE
            String AgregarProyecto = "{ CALL SP_AGREGAR_PROYECTO(?,?,?,?,?) }";
            //LLAMAMOS A LA CONEXION NUEVAMENTE PARA ASI VALIDAR EL ARREGLO ALMACENADO
            CallableStatement cstmt = this.conexion.prepareCall(AgregarProyecto);
            //VARIABLES DE CAPTURA
            cstmt.setString(1, pro.getNombre_Proyecto());
            cstmt.setString(2, pro.getServicio());
            cstmt.setString(3, pro.getEstado());
            cstmt.setString(4, pro.getRutCliente());
            cstmt.setString(5, pro.getNombre_Equipo());

            //VALIDAMOS 
            if (cstmt.executeUpdate() > 0) {
                respuesta = true;
            } else {
                respuesta = false;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            //CERRAMOS LA CONEXION
            this.conexion.close();
        }
        return respuesta;
    }

    public boolean AgregarInsumo(Insumo in) throws SQLException {
        boolean respuesta = false;

        try {
            //OBTENEMOS LA CONEXION
            this.conexion = new Conexion().obtenerConexion();
            //LLAMAMOS AL PROCEDIMIENTO ALMACENANDOLO EN UNA VARIABLE
            String AgregarInsumo = "{ CALL SP_AGREGAR_INSUMO (?,?,?,?,?,?) }";
            //LLAMAMOS A LA CONEXION NUEVAMENTE PARA ASI VALIDAR EL ARREGLO ALMACENADO
            CallableStatement cstmt = this.conexion.prepareCall(AgregarInsumo);
            //VARIABLES DE CAPTURA
            cstmt.setInt(1, in.getCodInsumo());
            cstmt.setString(2, in.getDescripcion());
            cstmt.setString(3, in.getTienda());
            cstmt.setInt(4, in.getCantidad());
            cstmt.setInt(5, in.getPrecio());
            cstmt.setString(6, in.getNombre_Proyecto());

            //VALIDAMOS
            if (cstmt.executeUpdate() > 0) {
                respuesta = true;
            } else {
                respuesta = false;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            //CERRAMOS LA CONEXION
            this.conexion.close();
        }
        return respuesta;
    }

    public boolean AgregarHistorial(Historial hist) throws SQLException {
        boolean respuesta = false;

        try {
            //OBTENEMOS LA CONEXION
            this.conexion = new Conexion().obtenerConexion();
            //LLAMAMOS AL PROCEDIMIENTO ALMACENANDOLO EN UNA VARIABLE
            String AgregarHistorial = "{ CALL SP_AGREGAR_HISTORIAL(?,?,?,?,?) }";
            //LLAMAMOS A LA CONEXION NUEVAMENTE PARA ASI VALIDAR EL ARREGLO ALMACENADO
            CallableStatement cstmt = this.conexion.prepareCall(AgregarHistorial);
            //VARIABLES DE CAPTURA
            cstmt.setInt(1, hist.getFase());
            cstmt.setString(2, hist.getFecha());
            cstmt.setString(3, hist.getDescripcion());
            cstmt.setString(4, hist.getEstado());
            cstmt.setString(5, hist.getNombre_Proyecto());

            //VALIDAMOS
            if (cstmt.executeUpdate() > 0) {
                respuesta = true;
            } else {
                respuesta = false;
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            //CERRAMOS LA CONEXION
            this.conexion.close();
        }
        return respuesta;
    }

    public boolean AgregarSolicitud(Solicitud soli) throws SQLException {
        boolean respuesta = false;

        try {
            //OBTENEMOS LA CONEXION
            this.conexion = new Conexion().obtenerConexion();
            //LLAMAMOS AL PROCEDIMIENTO ALMACENANDOLO EN UNA VARIABLE
            String AgregarSolicitud = "{ CALL SP_AGREGAR_SOLICITUD(?,?,?,?,?) }";
            //LLAMAMOS A LA CONEXION NUEVAMENTE PARA ASI VALIDAR EL ARREGLO ALMACENADO
            CallableStatement cstmt = this.conexion.prepareCall(AgregarSolicitud);
            //VARIABLES DE CAPTURA
            cstmt.setInt(1, soli.getCodSolicitud());
            cstmt.setString(2, soli.getHora());
            cstmt.setString(3, soli.getFecha());
            cstmt.setString(4, soli.getEstado());
            cstmt.setString(5, soli.getNombre_Proyecto());

            //VALIDAMOS
            if (cstmt.executeUpdate() > 0) {
                respuesta = true;
            } else {
                respuesta = false;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            //CERRAMOS LA CONEXION
            this.conexion.close();
        }
        return respuesta;
    }

    //LISTADOS
    public List<Proyecto> listarProyecto() throws SQLException {
        List<Proyecto> listaProyecto = new ArrayList<Proyecto>();
        try {
            //OBTENEMOS LA CONEXION
            this.conexion = new Conexion().obtenerConexion();
            //LLAMAMOS AL PROCEDIMIENTO ALMACENANDOLO EN UNA VARIABLE
            String lista = "{ CALL SP_LISTAR_PROYECTO (?) }";
            //LLAMAMOS A LA CONEXION NUEVAMENTE PARA ASI VALIDAR EL ARREGLO ALMACENADO
            CallableStatement cstmt = this.conexion.prepareCall(lista);
            //LLAMAMOS A UN CURSOR PARA PODER GENERAR UN LISTADO
            cstmt.registerOutParameter(1, OracleTypes.CURSOR);

            //EJECUTAMOS LA CONSULTA
            cstmt.execute();

            //RESCATAMOS LOS DATOS
            ResultSet rs = (ResultSet) cstmt.getObject(1);

            //MOSTRAMOS LOS DATOS EXISTETES
            while (rs.next()) {
                Proyecto pro = new Proyecto();
                pro.setNombre_Proyecto(rs.getString("Nombre_Proyecto"));
                pro.setServicio(rs.getString("Servicio"));
                pro.setEstado(rs.getString("Estado"));
                pro.setRutCliente(rs.getString("RutCliente"));
                pro.setNombre_Equipo(rs.getString("Nombre_Equipo"));

                //AGREGAMOS LOS DATOS RESCATADOS A LA LISTA
                listaProyecto.add(pro);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            //CERRAMOS LA CONEXION
            this.conexion.close();
        }
        return listaProyecto;
    }

    public List<Solicitud> ListarSolicitud() throws SQLException {
        List<Solicitud> listaSolicitud = new ArrayList<Solicitud>();
        try {
            //OBTENEMOS LA CONEXION
            this.conexion = new Conexion().obtenerConexion();
            //LLAMAMOS AL PROCEDIMIENTO ALMACENANDOLO EN UNA VARIABLE
            String lista = "{ CALL SP_LISTAR_SOLICITUD(?) }";
            //LLAMAMOS A LA CONEXION NUEVAMENTE PARA ASI VALIDAR EL ARREGLO ALMACENADO
            CallableStatement cstmt = this.conexion.prepareCall(lista);
            //LLAMAMOS A UN CURSOR PARA PODER GENERAR UN LISTADO
            cstmt.registerOutParameter(1, OracleTypes.CURSOR);
            //EJECUTAMOS LA CONSULTA
            cstmt.execute();

            //RESCATAMOS LOS DATOS
            ResultSet rs = (ResultSet) cstmt.getObject(1);

            //MOSTRAMOS LOS DATOS EXISTETES
            while (rs.next()) {
                Solicitud soli = new Solicitud();
                soli.setCodSolicitud(rs.getInt("CodSolicitud"));
                soli.setHora(rs.getString("Hora"));
                soli.setFecha(rs.getString("Fecha"));
                soli.setEstado(rs.getString("Estado"));
                soli.setNombre_Proyecto(rs.getString("Nombre_Proyecto"));

                //AGREGAMOS LOS DATOS RESCATADOS A LA LISTA
                listaSolicitud.add(soli);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            //CERRAMOS LA CONEXION
            this.conexion.close();
        }
        return listaSolicitud;
    }

    public List<Historial> ListarHistorial() throws SQLException {
        List<Historial> listaHistorial = new ArrayList<Historial>();
        try {
            //OBTENEMOS LA CONEXION
            this.conexion = new Conexion().obtenerConexion();
            //LLAMAMOS AL PROCEDIMIENTO ALMACENANDOLO EN UNA VARIABLE
            String lista = "{ CALL SP_LISTAR_HISTORIAL(?) }";
            //LLAMAMOS A LA CONEXION NUEVAMENTE PARA ASI VALIDAR EL ARREGLO ALMACENADO
            CallableStatement cstmt = this.conexion.prepareCall(lista);
            //LLAMAMOS A UN CURSOR PARA PODER GENERAR UN LISTADO
            cstmt.registerOutParameter(1, OracleTypes.CURSOR);
            //EJECUTAMOS LA CONSULTA
            cstmt.execute();

            //RESCATAMOS LOS DATOS
            ResultSet rs = (ResultSet) cstmt.getObject(1);

            //MOSTRAMOS LOS DATOS EXISTETES
            while (rs.next()) {
                Historial hist = new Historial();
                hist.setFase(rs.getInt("Fase"));
                hist.setFecha(rs.getString("Fecha"));
                hist.setDescripcion(rs.getString("Descripcion"));
                hist.setEstado(rs.getString("Estado"));
                hist.setNombre_Proyecto(rs.getString("Nombre_Proyecto"));

                //AGREGAMOS LOS DATOS RESCATADOS A LA LISTA
                listaHistorial.add(hist);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            //CERRAMOS LA CONEXION
            this.conexion.close();
        }
        return listaHistorial;
    }

    public List<Insumo> ListaInsumo() throws SQLException {
        List<Insumo> listaInsumo = new ArrayList<Insumo>();
        try {
            //OBTENEMOS LA CONEXION
            this.conexion = new Conexion().obtenerConexion();
            //LLAMAMOS AL PROCEDIMIENTO ALMACENANDOLO EN UNA VARIABLE
            String lista = "{ CALL SP_LISTAR_INSUMO(?) }";
            //LLAMAMOS A LA CONEXION NUEVAMENTE PARA ASI VALIDAR EL ARREGLO ALMACENADO
            CallableStatement cstmt = this.conexion.prepareCall(lista);
            //LLAMAMOS A UN CURSOR PARA PODER GENERAR UN LISTADO
            cstmt.registerOutParameter(1, OracleTypes.CURSOR);
            //EJECUTAMOS LA CONSULTA
            cstmt.execute();

            //RESCATAMOS LOS DATOS
            ResultSet rs = (ResultSet) cstmt.getObject(1);

            //MOSTRAMOS LOS DATOS EXISTETES
            while (rs.next()) {
                Insumo ins = new Insumo();
                ins.setCodInsumo(rs.getInt("CodInsumo"));
                ins.setDescripcion(rs.getString("Descripcion"));
                ins.setTienda(rs.getString("Tienda"));
                ins.setCantidad(rs.getInt("Cantidad"));
                ins.setPrecio(rs.getInt("Precio"));
                ins.setNombre_Proyecto(rs.getString("Nombre_Proyecto"));

                //AGREGAMOS LOS DATOS RESCATADOS A LA LISTA
                listaInsumo.add(ins);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            //CERRAMOS LA CONEXION
            this.conexion.close();
        }
        return listaInsumo;
    }

    public List<Equipo> ListaEquipo() throws SQLException {
        List<Equipo> listaEquipo = new ArrayList<Equipo>();
        try {
            //OBTENEMOS LA CONEXION
            this.conexion = new Conexion().obtenerConexion();
            //LLAMAMOS AL PROCEDIMIENTO ALMACENANDOLO EN UNA VARIABLE
            String lista = "{ CALL SP_LISTAR_EQUIPO(?) }";
            //LLAMAMOS A LA CONEXION NUEVAMENTE PARA ASI VALIDAR EL ARREGLO ALMACENADO
            CallableStatement cstmt = this.conexion.prepareCall(lista);
            //LLAMAMOS A UN CURSOR PARA PODER GENERAR UN LISTADO
            cstmt.registerOutParameter(1, OracleTypes.CURSOR);
            //EJECUTAMOS LA CONSULTA
            cstmt.execute();

            //RESCATAMOS LOS DATOS
            ResultSet rs = (ResultSet) cstmt.getObject(1);

            //MOSTRAMOS LOS DATOS EXISTETES
            while (rs.next()) {
                Equipo equi = new Equipo();
                equi.setNombre_Equipo(rs.getString("Nombre_Equipo"));

                //AGREGAMOS LOS DATOS RESCATADOS A LA LISTA
                listaEquipo.add(equi);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            //CERRAMOS LA CONEXION
            this.conexion.close();
        }
        return listaEquipo;
    }

    public List<Trabajador> listarTrabajador() throws SQLException {
        List<Trabajador> listaTrabajador = new ArrayList<Trabajador>();
        try {
            //OBTENEMOS LA CONEXION
            this.conexion = new Conexion().obtenerConexion();
            //LLAMAMOS AL PROCEDIMIENTO ALMACENANDOLO EN UNA VARIABLE
            String lista = "{ CALL SP_LISTAR_TRABAJADORES(?) }";
            //LLAMAMOS A LA CONEXION NUEVAMENTE PARA ASI VALIDAR EL ARREGLO ALMACENADO
            CallableStatement cstmt = this.conexion.prepareCall(lista);
            //LLAMAMOS A UN CURSOR PARA PODER GENERAR UN LISTADO
            cstmt.registerOutParameter(1, OracleTypes.CURSOR);
            //EJECUTAMOS LA CONSULTA
            cstmt.execute();

            //RESCATAMOS LOS DATOS
            ResultSet rs = (ResultSet) cstmt.getObject(1);

            //MOSTRAMOS LOS DATOS EXISTETES
            while (rs.next()) {
                Trabajador tra = new Trabajador();
                tra.setRut_Trabajador(rs.getString("Rut_Trabajador"));
                tra.setNombre_Trabajador(rs.getString("Nombre_Trabajador"));
                tra.setCargo(rs.getString("Cargo"));
                tra.setNombre_Equipo(rs.getString("Nombre_Equipo"));

                //AGREGAMOS LOS DATOS RESCATADOS A LA LISTA
                listaTrabajador.add(tra);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            //CERRAMOS LA CONEXION
            this.conexion.close();
        }
        return listaTrabajador;
    }

    //VALIDACION DE LOGIN
    public boolean Login(String rut, String contrasena) throws SQLException {
        boolean respuesta = false;
        try {
            //OBTENEMOS LA CONEXION
            this.conexion = new Conexion().obtenerConexion();
            //LLAMAMOS AL PROCEDIMIENTO ALMACENANDOLO EN UNA VARIABLE
            String login = "SELECT * FROM USUARIO WHERE RUTCLIENTE = ? AND CONTRASENA = ?";
            //LLAMAMOS A LA CONEXION NUEVAMENTE PARA ASI VALIDAR LA CONSULTA
            CallableStatement cstmt = this.conexion.prepareCall(login);
            cstmt.setString(1, rut);
            cstmt.setString(2, contrasena);
            //EJECUTAMOS LA CONSULTA
            cstmt.execute();

            //RESCATAMOS LOS DATOS
            ResultSet rs = cstmt.getResultSet();

            //VALIDAMOS USUARIO
            while (rs.next()) {
                respuesta = true;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            //CERRAMOS LA CONEXION
            this.conexion.close();
        }
        return respuesta;
    }

    //FILTROS
    public boolean filtrarTrabajadores(String equipo) throws SQLException {
        boolean respuesta = false;
        try {
            //OBTENEMOS LA CONEXION
            this.conexion = new Conexion().obtenerConexion();
            //LLAMAMOS AL PROCEDIMIENTO ALMACENANDOLO EN UNA VARIABLE
            String buscarTrabajadores = "SELECT * FROM TRABAJADOR WHERE NOMBRE_EQUIPO='" + equipo + "'";
            //LLAMAMOS A LA CONEXION NUEVAMENTE PARA ASI VALIDAR LA CONSULTA
            CallableStatement cstmt = this.conexion.prepareCall(buscarTrabajadores);

            //RESCATAMOS LOS DATOS
            ResultSet rs = cstmt.getResultSet();

            //VALIDAMOS
            if (cstmt.executeUpdate() == 1) {
                respuesta = true;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            //CERRAMOS LA CONEXION
            this.conexion.close();
        }
        return respuesta;
    }

    public boolean filtrarProyecto(String rutcliente) throws SQLException {
        boolean respuesta = false;
        try {
            //OBTENEMOS LA CONEXION
            this.conexion = new Conexion().obtenerConexion();
            //LLAMAMOS AL PROCEDIMIENTO ALMACENANDOLO EN UNA VARIABLE
            String buscarProyecto = "SELECT * FROM PROYECTO WHERE RUTCLIENTE='" + rutcliente + "'";
            //LLAMAMOS A LA CONEXION NUEVAMENTE PARA ASI VALIDAR LA CONSULTA
            CallableStatement cstmt = this.conexion.prepareCall(buscarProyecto);

            //RESCATAMOS LOS DATOS
            ResultSet rs = cstmt.getResultSet();

            //VALIDAMOS
            if (cstmt.executeUpdate() == 1) {
                respuesta = true;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            //CERRAMOS LA CONEXION
            this.conexion.close();
        }
        return respuesta;
    }

    //BUSCAR
    public List<Proyecto> buscarProyecto(String rutcliente) throws SQLException {
        List<Proyecto> proyecto = new ArrayList<Proyecto>();
        try {
            //OBTENEMOS LA CONEXION
            this.conexion = new Conexion().obtenerConexion();
            //LLAMAMOS AL PROCEDIMIENTO ALMACENANDOLO EN UNA VARIABLE
            String buscarProyecto = "SELECT * FROM PROYECTO WHERE RUTCLIENTE='" + rutcliente + "'";
            //LLAMAMOS A LA CONEXION NUEVAMENTE PARA ASI VALIDAR LA CONSULTA
            CallableStatement cstmt = this.conexion.prepareCall(buscarProyecto);
            //EJECUTAMOS LA CONSULTA
            cstmt.execute();
            
            //RESCATAMOS LOS DATOS
            ResultSet rs = cstmt.getResultSet();

            //MOSTRAMOS LOS DATOS EXISTETES
            while (rs.next()) {
                Proyecto pro = new Proyecto();
                pro.setNombre_Proyecto(rs.getString("Nombre_Proyecto"));
                pro.setServicio(rs.getString("Servicio"));
                pro.setEstado(rs.getString("Estado"));
                pro.setRutCliente(rs.getString("RutCliente"));
                pro.setNombre_Equipo(rs.getString("Nombre_Equipo"));

                //AGREGAMOS LOS DATOS RESCATADOS A LA LISTA
                proyecto.add(pro);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            //CERRAMOS LA CONEXION
            this.conexion.close();
        }
        return proyecto;
    }

    public List<Historial> buscarHistorial(String nombre) throws SQLException {
        List<Historial> historial = new ArrayList<Historial>();
        try {
            //OBTENEMOS LA CONEXION
            this.conexion = new Conexion().obtenerConexion();
            //LLAMAMOS AL PROCEDIMIENTO ALMACENANDOLO EN UNA VARIABLE
            String buscarHistorial = "SELECT * FROM HISTORIAL WHERE NOMBRE_PROYECTO='" + nombre + "'";
            //LLAMAMOS A LA CONEXION NUEVAMENTE PARA ASI VALIDAR LA CONSULTA
            CallableStatement cstmt = this.conexion.prepareCall(buscarHistorial);
            //EJECUTAMOS LA CONSULTA
            cstmt.execute();
            
            //RESCATAMOS LOS DATOS
            ResultSet rs = cstmt.getResultSet();

            //MOSTRAMOS LOS DATOS EXISTETES
            while (rs.next()) {
                Historial his = new Historial();
                his.setFase(rs.getInt("Fase"));
                his.setFecha(rs.getString("Fecha"));
                his.setDescripcion(rs.getString("Descripcion"));
                his.setNombre_Proyecto(rs.getString("Nombre_Proyecto"));
                his.setEstado(rs.getString("Estado"));

                //AGREGAMOS LOS DATOS RESCATADOS A LA LISTA
                historial.add(his);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            //CERRAMOS LA CONEXION
            this.conexion.close();
        }
        return historial;
    }

    public List<Insumo> buscarInsumo(String nombre) throws SQLException {
        List<Insumo> insumo = new ArrayList<Insumo>();
        try {
            //OBTENEMOS LA CONEXION
            this.conexion = new Conexion().obtenerConexion();
            //LLAMAMOS AL PROCEDIMIENTO ALMACENANDOLO EN UNA VARIABLE
            String buscarInsumo = "SELECT * FROM INSUMO WHERE NOMBRE_PROYECTO = '" + nombre + "'";
            //LLAMAMOS A LA CONEXION NUEVAMENTE PARA ASI VALIDAR LA CONSULTA
            CallableStatement cstmt = this.conexion.prepareCall(buscarInsumo);
            //EJECUTAMOS LA CONSULTA
            cstmt.execute();
            
            //RESCATAMOS LOS DATOS
            ResultSet rs = cstmt.getResultSet();

            //MOSTRAMOS LOS DATOS EXISTETES
            while (rs.next()) {
                Insumo insu = new Insumo();
                insu.setCodInsumo(rs.getInt("CodInsumo"));
                insu.setDescripcion(rs.getString("Descripcion"));
                insu.setTienda(rs.getString("Tienda"));
                insu.setCantidad(rs.getInt("Cantidad"));
                insu.setPrecio(rs.getInt("Precio"));

                //AGREGAMOS LOS DATOS RESCATADOS A LA LISTA
                insumo.add(insu);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            //CERRAMOS LA CONEXION
            this.conexion.close();
        }
        return insumo;
    }

    public List<Trabajador> buscarTrabajador(String nombre) throws SQLException {
        List<Trabajador> trabajador = new ArrayList<Trabajador>();
        try {
            //OBTENEMOS LA CONEXION
            this.conexion = new Conexion().obtenerConexion();
            //LLAMAMOS AL PROCEDIMIENTO ALMACENANDOLO EN UNA VARIABLE
            String buscarTrabajador = "SELECT * FROM TRABAJADOR WHERE NOMBRE_EQUIPO='" + nombre + "'";
            //LLAMAMOS A LA CONEXION NUEVAMENTE PARA ASI VALIDAR LA CONSULTA
            CallableStatement cstmt = this.conexion.prepareCall(buscarTrabajador);
            //EJECUTAMOS LA CONSULTA
            cstmt.execute();
            
            //RESCATAMOS LOS DATOS
            ResultSet rs = cstmt.getResultSet();

            //MOSTRAMOS LOS DATOS EXISTETES
            while (rs.next()) {
                Trabajador tra = new Trabajador();
                tra.setRut_Trabajador(rs.getString("Rut_Trabajador"));
                tra.setNombre_Trabajador(rs.getString("Nombre_Trabajador"));
                tra.setCargo(rs.getString("Cargo"));
                tra.setNombre_Equipo(rs.getString("Nombre_Equipo"));

                //AGREGAMOS LOS DATOS RESCATADOS A LA LISTA
                trabajador.add(tra);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            //CERRAMOS LA CONEXION
            this.conexion.close();
        }
        return trabajador;
    }

    public Solicitud buscarSolicitud(String nombre) throws SQLException {
        Solicitud solicitud = new Solicitud(0, "false", "false", "false", "false");

        try {
            //OBTENEMOS LA CONEXION
            this.conexion = new Conexion().obtenerConexion();
            //LLAMAMOS AL PROCEDIMIENTO ALMACENANDOLO EN UNA VARIABLE
            String buscarSolicitud = "SELECT * FROM SOLICITUD WHERE NOMBRE_PROYECTO='" + nombre + "'";
            //LLAMAMOS A LA CONEXION NUEVAMENTE PARA ASI VALIDAR LA CONSULTA
            CallableStatement cstmt = this.conexion.prepareCall(buscarSolicitud);
            //EJECUTAMOS LA CONSULTA
            cstmt.execute();

            //RESCATAMOS LOS DATOS
            ResultSet rs = cstmt.getResultSet();

            //MOSTRAMOS LOS DATOS EXISTETES
            while (rs.next()) {
                solicitud.setCodSolicitud(rs.getInt("CodSolicitud"));
                solicitud.setHora(rs.getString("Hora"));
                solicitud.setFecha(rs.getString("Fecha"));
                solicitud.setEstado(rs.getString("Estado"));
                solicitud.setNombre_Proyecto(rs.getString("Nombre_Proyecto"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            //CERRAMOS LA CONEXION
            this.conexion.close();
        }
        return solicitud;
    }

    public Proyecto estadoProyecto(String nombre) throws SQLException {
        Proyecto proyecto = new Proyecto("false", "false", "false", "false", "false");
        try {
            //OBTENEMOS LA CONEXION
            this.conexion = new Conexion().obtenerConexion();
            //LLAMAMOS AL PROCEDIMIENTO ALMACENANDOLO EN UNA VARIABLE
            String estadoProyecto = "SELECT * FROM PROYECTO WHERE NOMBRE_PROYECTO ='" + nombre + "'";
            //LLAMAMOS A LA CONEXION NUEVAMENTE PARA ASI VALIDAR LA CONSULTA
            CallableStatement cstmt = this.conexion.prepareCall(estadoProyecto);
            //EJECUTAMOS LA CONSULTA
            cstmt.execute();
            
            //RESCATAMOS LOS DATOS
            ResultSet rs = cstmt.getResultSet();

            //MOSTRAMOS LOS DATOS EXISTETES
            while (rs.next()) {
                proyecto.setNombre_Proyecto(rs.getString("Nombre_Proyecto"));
                proyecto.setServicio(rs.getString("Servicio"));
                proyecto.setEstado(rs.getString("Estado"));
                proyecto.setRutCliente(rs.getString("RutCliente"));
                proyecto.setNombre_Equipo(rs.getString("Nombre_Equipo"));
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            //CERRAMOS LA CONEXION
            this.conexion.close();
        }
        return proyecto;
    }

    public Proyecto buscarEquipo(String nombre) throws SQLException {
        Proyecto proyecto = new Proyecto("false", "false", "false", "false", "false");
        try {
            //OBTENEMOS LA CONEXION
            this.conexion = new Conexion().obtenerConexion();
            //LLAMAMOS AL PROCEDIMIENTO ALMACENANDOLO EN UNA VARIABLE
            String buscarEquipo = "SELECT * FROM PROYECTO WHERE NOMBRE_PROYECTO='" + nombre + "'";
            //LLAMAMOS A LA CONEXION NUEVAMENTE PARA ASI VALIDAR LA CONSULTA
            CallableStatement cstmt = this.conexion.prepareCall(buscarEquipo);
            //EJECUTAMOS LA CONSULTA
            cstmt.execute();
            
            //RESCATAMOS LOS DATOS
            ResultSet rs = cstmt.getResultSet();

            //MOSTRAMOS LOS DATOS EXISTETES
            while (rs.next()) {
                proyecto.setNombre_Proyecto(rs.getString("Nombre_Proyecto"));
                proyecto.setNombre_Equipo(rs.getString("Nombre_Equipo"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            //CERRAMOS LA CONEXION
            this.conexion.close();
        }
        return proyecto;
    }

    //MODIFICAR
    public boolean cambiarEstadoPro(Proyecto pro) throws SQLException {
        boolean respuesta = false;
        try {
            //OBTENEMOS LA CONEXION
            this.conexion = new Conexion().obtenerConexion();
            //LLAMAMOS AL PROCEDIMIENTO ALMACENANDOLO EN UNA VARIABLE
            String cambiarEstado = "{ CALL SP_CAMBIAR_ESTADO_PROYECTO (?,?,?,?,?)}";
            //LLAMAMOS A LA CONEXION NUEVAMENTE PARA ASI VALIDAR EL ARREGLO ALMACENADO
            CallableStatement cstmt = this.conexion.prepareCall(cambiarEstado);
            //VARIABLES DE CAPTURA
            cstmt.setString(1, pro.getNombre_Proyecto());
            cstmt.setString(2, pro.getServicio());
            cstmt.setString(3, pro.getEstado());
            cstmt.setString(4, pro.getRutCliente());
            cstmt.setString(5, pro.getNombre_Equipo());

            //VALIDAMOS
            if (cstmt.executeUpdate() == 1) {
                respuesta = true;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            //CERRAMOS LA CONEXION
            this.conexion.close();
        }
        return respuesta;
    }

    public boolean cambiarEstadoSoli(Solicitud soli) throws SQLException {
        boolean respuesta = false;
        try {
            //OBTENEMOS LA CONEXION
            this.conexion = new Conexion().obtenerConexion();
            //LLAMAMOS AL PROCEDIMIENTO ALMACENANDOLO EN UNA VARIABLE
            String cambiarEstado = "{ CALL SP_CAMBIAR_ESTADO_SOLICITUD (?,?,?,?,?)}";
            //LLAMAMOS A LA CONEXION NUEVAMENTE PARA ASI VALIDAR EL ARREGLO ALMACENADO
            CallableStatement cstmt = this.conexion.prepareCall(cambiarEstado);
            //VARIABLES DE CAPTURA
            cstmt.setInt(1, soli.getCodSolicitud());
            cstmt.setString(2, soli.getHora());
            cstmt.setString(3, soli.getFecha());
            cstmt.setString(4, soli.getEstado());
            cstmt.setString(5, soli.getNombre_Proyecto());

            //VALIDAMOS
            if (cstmt.executeUpdate() == 1) {
                respuesta = true;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            //CERRAMOS LA CONEXION
            this.conexion.close();
        }
        return respuesta;

    }
}
