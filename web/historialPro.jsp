<%-- 
    Document   : historial
    Created on : May 18, 2019, 4:54:57 PM
    Author     : mjara
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <!-- COMPLEMENTOS CSS-->
        <link rel="stylesheet" href="static/css/animations.css">
        <link rel="stylesheet" href="static/css/bootstrap.css">
        <link rel="stylesheet" href="static/css/bootstrap.min.css">
        <link rel="stylesheet" href="static/css/nivo-lightbox.css">
        <link rel="stylesheet" href="static/css/style.css">
        <link rel="stylesheet" href="static/css/nivo-lightbox-theme/default/default.css">
        <link rel="stylesheet" href="adicionales/color/default.css">
        <link rel="stylesheet" href="adicionales/font-awesome/css/font-awesome.css">
        <link rel="stylesheet" href="adicionales/font-awesome/css/font-awesome.min.css">

        <!--ETIQUETA-->
        <title>Historial - Cliente</title>

    </head>

    <body>
        <!-- MENU -->
        <div class="navigation navbar-fixed-top">
            <nav class="navbar navbar-default" role="navigation">
                <div class="container">
                    <div class="col-md-2">
                        <div class="site-logo">
                            <a href="index.jsp" class="brand">NaturalVerde</a>
                        </div>
                    </div>
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#menu">
                            <i class="fa fa-bars"></i>
                        </button>
                    </div>
                    <div class="collapse navbar-collapse" id="menu">
                        <ul class="nav navbar-nav navbar-right">
                            <li><a href="indexCli.jsp">Inicio</a></li>
                            <li><a href="solicitudProyecto">Solicitud en Linea</a></li>
                            <li><a href="estadoSolicitud">Estado de Solicitud</a></li>
                            <li class="nav-item dropdown">
                                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
                                   data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                    Monitorear Proyectos
                                </a>
                                <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                    <a class="dropdown-item" href="historialProyecto">HISTORIAL</a>
                                    <div class="dropdown-divider"></div>
                                    <a class="dropdown-item" href="insumoProyecto">INSUMOS</a>
                                    <div class="dropdown-divider"></div>
                                    <a class="dropdown-item" href="informacionEquipo">INFORMACIÓN DEL EQUIPO</a>
                                </div>
                            </li>
                            <li><a href="login.jsp">Cerrar Sesion</a></li>
                        </ul>
                    </div>
                </div>
            </nav>
        </div>
    <center>
        <section id="service" class="home-section color-dark bg-gray">
            <div class="container">
                <div class="row">
                    <div class="col-lg-8 col-lg-offset-2">

                        <!-- TITULO -->
                        <div class="section-heading text-center">
                            <br>
                            <h2 class="h-bold" style="color: green">Historial del Servicio</h2>
                            <div class="divider-header"></div>
                        </div>


                    </div>
                </div>
            </div>
            <br>

            <!-- HISTORIAL -->
            <form action="historialProyecto" method="POST">
                <div class="text-center form-group">
                    <div class="container">
                        <div class="row animatedParent">
                            <div class="row">
                                <div class="animated bounceInUp">

                                    <!-- NOMBRE DEL PROYECTO -->
                                    <center>
                                        <div class="service-desc">
                                            <h5>Nombre del Proyecto:</h5>
                                            <br>
                                            <select class="form-control" style=" width:50%" name="cboNombre"
                                                    id="cboNombre">
                                                <option>Seleccionar</option>
                                                <c:forEach var="pro" items="${proyecto}">
                                                    <option>${pro.getNombre_Proyecto()}</option>
                                                </c:forEach>
                                            </select>
                                            <br>
                                            <input class="btn btn-skin" type="submit" value="Seleccionar">
                                            <hr>
                                        </div>
                                    </center>


                                    <c:forEach var="hist" items="${historial}">
                                        <div class="box-register form-row">

                                            <!-- FASE REGISTRO -->
                                            <ul class="list-group col-md-1 service-desc">
                                                <h5>Fase</h5>
                                                <li class="list-group-item">${hist.getFase()}</li>
                                            </ul>

                                            <!-- FECHAS -->
                                            <ul class="list-group col-md-2 service-desc">
                                                <h5>Fecha</h5>
                                                <li class="list-group-item">${hist.getFecha()}</li>
                                            </ul>

                                            <!-- REGISTROS DEL HISTORIAL -->
                                            <ul class="list-group col-md-6 service-desc">
                                                <h5>Descripcion</h5>
                                                <li class="list-group-item">${hist.getDescripcion()}</li>
                                            </ul>

                                            <!-- APROBACIONES - PENDIENTE -->
                                            <ul class="list-group col-md-3 service-desc">
                                                <h5>Estado</h5>
                                                <li class="list-group-item">${hist.getEstado()}</li>
                                            </ul>
                                        </div>
                                    </c:forEach>

                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </form>

        </section>
    </center>

    <!-- COMPLEMENTOS JS -->
    <script src="static/js/jquery.min.js"></script>
    <script src="static/js/bootstrap.min.js"></script>
    <script src="static/js/jquery.sticky.js"></script>
    <script src="static/js/jquery.easing.min.js"></script>
    <script src="static/js/jquery.scrollTo.js"></script>
    <script src="static/js/jquery.appear.js"></script>
    <script src="static/js/stellar.js"></script>
    <script src="static/js/nivo-lightbox.min.js"></script>
    <script src="static/js/custom.js"></script>
    <script src="static/js/css3-animate-it.js"></script>
    <script src="static/otros/contactform/contactform.js  "></script>
</body>

</html>