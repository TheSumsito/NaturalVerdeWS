package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class solicitud_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("        <!-- COMPLEMENTOS CSS-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"static/css/animations.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"static/css/bootstrap.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"static/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"static/css/nivo-lightbox.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"static/css/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"static/css/nivo-lightbox-theme/default/default.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"adicionales/color/default.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"adicionales/font-awesome/css/font-awesome.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"adicionales/font-awesome/css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("        <!-- ETIQUETA -->\n");
      out.write("        <title>Crear Proyecto - Cliente</title>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <!-- MENU -->\n");
      out.write("        <div class=\"navigation navbar-fixed-top\">\n");
      out.write("            <nav class=\"navbar navbar-default\" role=\"navigation\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"col-md-2\">\n");
      out.write("                        <div class=\"site-logo\">\n");
      out.write("                            <a href=\"index.jsp\" class=\"brand\">NaturalVerde</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"navbar-header\">\n");
      out.write("                        <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#menu\">\n");
      out.write("                            <i class=\"fa fa-bars\"></i>\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"menu\">\n");
      out.write("                        <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                            <li><a href=\"index.jsp\">Inicio</a></li>\n");
      out.write("                            <li class=\"active\"><a href=\"solicitud.jsp\">Solicitud en Linea</a></li>\n");
      out.write("                            <li><a href=\"estado.jsp\">Estado de Solicitud</a></li>\n");
      out.write("                            <li><a href=\"monitorear.jsp\">Monitorear Proyectos</a></li>\n");
      out.write("                            <li><a href=\"login.jsp\">Cerrar Sesion</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <center>\n");
      out.write("        <!-- TITULO -->\n");
      out.write("        <section id=\"service\" class=\"home-section color-dark bg-gray\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-8 col-lg-offset-2\">\n");
      out.write("                        <div class=\"section-heading text-center\">\n");
      out.write("                            <br>\n");
      out.write("                            <h2 class=\"h-bold\" style=\"color: green\">Solicitud de Servicios</h2>\n");
      out.write("                            <div class=\"divider-header\"></div>\n");
      out.write("                            \n");
      out.write("                            <!-- MENSAJE DE ALERTA -->\n");
      out.write("                            <div class=\"container-fluid\">\n");
      out.write("                                ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("\n");
      out.write("            <!-- FORMULARIO -->\n");
      out.write("            <form method=\"POST\" action=\"SolicitudServicio\" autocomplete=\"off\">\n");
      out.write("                <div class=\"text-center form-group\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row animatedParent\">\n");
      out.write("                            <div class=\"animated bounceInUp\">\n");
      out.write("                                <div class=\"box-register form-row\">\n");
      out.write("\n");
      out.write("                                    <!-- NOMBRE PROYECTO NUEVO -->\n");
      out.write("                                    <div class=\"service-desc form-group col-md-6\">\n");
      out.write("                                        <h5>Nombre Proyecto:</h5>\n");
      out.write("                                        <input class=\"form-control\" style=\"text-align: center\" type=\"text\" name=\"txtNombre\">\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <!-- SERVICIO A CONTRATAR -->\n");
      out.write("                                    <div class=\"service-desc form-group col-md-6\">\n");
      out.write("                                        <h5>Servicio a Contratar:</h5>\n");
      out.write("                                        <select class=\"form-control\" name=\"cboServicio\" id=\"cboServicio\">\n");
      out.write("                                            <option value=\"\">Seleccionar</option>\n");
      out.write("                                            <option value=\"DISEÑO DE JARDIN\">Diseño de Jardines</option>\n");
      out.write("                                            <option value=\"PAISAJISMO\">Paisajismo</option>\n");
      out.write("                                            <option value=\"SISTEMA DE RIEGOS\">Sistema de Riegos</option>\n");
      out.write("                                            <option value=\"OBRAS CIVILES\">Obras Civiles</option>\n");
      out.write("                                            <option value=\"COTIZACION\">Cotizaciones y Desarrollo de Proyectos</option>\n");
      out.write("                                        </select>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <!-- EQUIPOS A TERRENO -->\n");
      out.write("                                    <div class=\"service-desc form-group col-md-6\">\n");
      out.write("                                        <h5>Seleccione Equipo a Terreno</h5>\n");
      out.write("                                        <Select class=\"form-control\" name=\"cboEquipo\" id=\"cboEquipo\">\n");
      out.write("                                            <option value=\"\">Seleccionar</option>\n");
      out.write("                                            <option value=\"REBOOT SOFTWARE\">Reboot Software</option>\n");
      out.write("                                        </Select>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <!-- BOTON -->\n");
      out.write("                                    <div class=\"box-register\">\n");
      out.write("                                        <input class=\"btn btn-skin\" type=\"submit\" value=\"Enviar Solicitud\">\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <!-- BOTON AGENDAR HORA -->\n");
      out.write("                                    <div class=\"service-desc box-register\">\n");
      out.write("                                        <h5>Agendar Hora a Terreno</h5>\n");
      out.write("                                        <a class=\"btn btn-skin\" href=\"listaProyecto\">Agendar Hora</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </section>\n");
      out.write("    </center>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- COMPLEMENTOS JS -->\n");
      out.write("    <script src=\"static/js/jquery.min.js\"></script>\n");
      out.write("    <script src=\"static/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"static/js/jquery.sticky.js\"></script>\n");
      out.write("    <script src=\"static/js/jquery.easing.min.js\"></script>\n");
      out.write("    <script src=\"static/js/jquery.scrollTo.js\"></script>\n");
      out.write("    <script src=\"static/js/jquery.appear.js\"></script>\n");
      out.write("    <script src=\"static/js/stellar.js\"></script>\n");
      out.write("    <script src=\"static/js/nivo-lightbox.min.js\"></script>\n");
      out.write("    <script src=\"static/js/custom.js\"></script>\n");
      out.write("    <script src=\"static/js/css3-animate-it.js\"></script>\n");
      out.write("    <script src=\"static/otros/contactform/contactform.js  \"></script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${respuesta==true}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    <div class=\"alert alert-success\">Proyecto enviado</div>\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${respuesta==false}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    <div class=\"alert alert-danger\">Nombre proyecto ya existente</div>\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }
}
