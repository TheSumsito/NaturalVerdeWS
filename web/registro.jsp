<%-- 
    Document   : registro
    Created on : May 18, 2019, 4:06:51 PM
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

        <!-- ETIQUETA -->
        <title>Registro</title>

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
                            <li><a href="index.jsp">Home</a></li>
                            <li class="active"><a href="registro.jsp">Registro</a></li>
                            <li><a href="login.jsp">Login</a></li>
                        </ul>
                    </div>
                </div>
            </nav>
        </div>
    <center>

        <!-- TITULO -->
        <section id="service" class="home-section color-dark bg-gray">
            <div class="container">
                <div class="row">
                    <div class="col-lg-8 col-lg-offset-2">
                        <div class="section-heading text-center">
                            <br>
                            <h2 class="h-bold" style="color: green">Formulario de Registro</h2>
                            <div class="divider-header"></div>

                            <!-- MENSAJE DE ALERTA -->
                            <div class="container-fluid">
                                <c:if test="${respuesta==true}">
                                    <div class="alert alert-success">Usuario Creado Correctamente</div>
                                </c:if>
                                <c:if test="${respuesta==false}">
                                    <div class="alert alert-danger">Usuario Existente</div>
                                </c:if>
                            </div>

                        </div>
                    </div>
                </div>
            </div>
            <br>

            <!-- FORMULARIO REGISTRO -->
            <form id="registro" method="POST" action="registroUsuario" autocomplete="off">
                <div class="text-center form-group">
                    <div class="container">
                        <div class="row animatedParent">
                            <div class="row">
                                <div class="animated  animated bounceInUp">
                                    <div class="box-register form-row">

                                        <!-- NOMBRE -->
                                        <div class="service-desc form-group col-md-6">
                                            <h5>Ingrese su Nombre:</h5>
                                            <input class="form-control" style="text-align: center" type="text"
                                                   name="txtNombre" id="txtNombre" placeholder="Ingrese su Nombre" 
                                                   
                                                   required>
                                        </div>




                                        <!-- APELLIDO -->
                                        <div class="service-desc form-group col-md-6">
                                            <h5>Ingrese su Apellido:</h5>
                                            <input class="form-control" style="text-align: center" type="text"
                                                   name="txtApellido" id="txtApellido" placeholder="Ingrese su Apellido"
                                                   title="Porfavor, no puede ingresar valores que no sean Letras" pattern="[A-Za-z]+" required>
                                        </div>

                                        <!-- NUMERO DE CONTACTO -->
                                        <div class="service-desc form-group col-md-6">
                                            <h5>Ingrese Numero Contacto</h5>

                                            <!-- CODIGO -->
                                            <div class="col-md-3">
                                                <input class="form-control" style="text-align: center" type="text"
                                                       name="txtCodigo" id="txtCodigo" value="+56" readonly="readonly">
                                            </div>


                                            <!--NUMERO -->
                                            <div class="col-md-8">
                                                <input class="form-control" style="text-align: center" type="text"
                                                       name="txtNumero" id="txtNumero"
                                                       placeholder="Ingrese Numero de Contacto" 
                                                       title="Porfavor, no puede ingresar valores que no sean Numericos" pattern="[0-9]+" required>
                                            </div>
                                        </div>

                                        <!-- CORREO ELECTRONICO -->
                                        <div class="service-desc form-group col-md-6">
                                            <h5>Ingrese su Correo:</h5>
                                            <input class="form-control" style="text-align: center" type="text"
                                                   name="txtCorreo" id="txtCorreo" placeholder="Ingrese su Correo" 
                                                   title="Formato del Correo no Valido"pattern="[a-zA-Z0-9._-]+[@][a-zA-Z]+[.]+[a-zA-Z]+" required>
                                        </div>

                                        <!-- RUT -->
                                        <div class="service-desc form-group col-md-6">
                                            <h5>Ingrese su Rut:</h5>
                                            <input class="form-control" style="text-align: center" type="text"
                                                   name="txtRut" id="txtRut" placeholder="Ingrese su Rut (11111111-1)" 
                                                   title="Rut no valido, Ingrese rut con el siguiente Formato : 11111111-1" pattern="[0-9]+[-]+[0-9K-k]" required>
                                        </div>

                                        <!-- CONTRASEÑA -->
                                        <div class="service-desc form-group col-md-6">
                                            <h5>Asigne una Contraseña:</h5>
                                            <input class="form-control" style="text-align: center" type="password"
                                                   name="txtPass" id="txtPass" placeholder="Ingrese Contraseña"
                                                   title="Contraseña no valida" pattern="[0-9a-zA-Z]+" required>
                                        </div>

                                        <br>

                                        <!-- BOTON -->
                                        <div class="box-register">
                                            <input class="btn btn-skin" type="submit" value="Registrarse">
                                        </div>
                                    </div>
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