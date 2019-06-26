package org.apache.jsp.pago;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class estadoPago_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_items_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_forEach_var_items_nobody.release();
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
      out.write("        <!-- JS VALIDACIONES -->\n");
      out.write("        <script src=\"static/js/jquery.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"static/js/jquery.validate.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("        <!-- VALIDACIONES -->\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(function () {\n");
      out.write("                $(\"#btnSeleccionar\").on(\"click\", function () {\n");
      out.write("                    $(\"#insumo\").validate({\n");
      out.write("                        rules: {\n");
      out.write("                            cboProyecto: {\n");
      out.write("                                required: true\n");
      out.write("                            }\n");
      out.write("                        },\n");
      out.write("                        messages: {\n");
      out.write("                            cboProyecto: {\n");
      out.write("                                required: 'Campo Obligatorio'\n");
      out.write("                            }\n");
      out.write("                        }\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>1\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--ETIQUETA-->\n");
      out.write("        <title>Insumos- Cliente</title>\n");
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
      out.write("                            <a href=\"indexCli.jsp\" class=\"brand\">NaturalVerde</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"navbar-header\">\n");
      out.write("                        <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#menu\">\n");
      out.write("                            <i class=\"fa fa-bars\"></i>\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"menu\">\n");
      out.write("                        <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                            <li><a href=\"indexCli.jsp\">Inicio</a></li>\n");
      out.write("                            <li><a href=\"solicitudProyecto\">Solicitud en Linea</a></li>\n");
      out.write("                            <li class=\"nav-item dropdown\">\n");
      out.write("                                <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\"\n");
      out.write("                                   data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                    Estado de Solicitud\n");
      out.write("                                </a>\n");
      out.write("                                <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"estadoSolicitud\">SOLICITUD PROYECTO</a>\n");
      out.write("                                    <div class=\"dropdown-divider\"></div>\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"estadoHora\">HORA AGENDADA</a>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item dropdown\">\n");
      out.write("                                <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\"\n");
      out.write("                                   data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                    Monitorear Proyectos\n");
      out.write("                                </a>\n");
      out.write("                                <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"historialProyecto\">HISTORIAL</a>\n");
      out.write("                                    <div class=\"dropdown-divider\"></div>\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"insumoProyecto\">INSUMOS</a>\n");
      out.write("                                    <div class=\"dropdown-divider\"></div>\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"informacionEquipo\">INFORMACIÓN DEL EQUIPO</a>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("                            <li><a href=\"login.jsp\">Cerrar Sesion</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("    <center>\n");
      out.write("        <section id=\"service\" class=\"home-section color-dark bg-gray\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-8 col-lg-offset-2\">\n");
      out.write("\n");
      out.write("                        <!-- TITULO -->\n");
      out.write("                        <div class=\"section-heading text-center\">\n");
      out.write("                            <br>\n");
      out.write("                            <h2 class=\"h-bold\" style=\"color: green\">Insumos Necesarios</h2>\n");
      out.write("                            <div class=\"divider-header\"></div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("\n");
      out.write("            <form id=\"insumo\" action=\"insumoProyecto\" method=\"POST\">\n");
      out.write("                <!-- INSUMOS -->\n");
      out.write("                <div class=\"text-center form-group\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row animatedParent\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"animated bounceInUp\">\n");
      out.write("\n");
      out.write("                                    <!-- NOMBRE DEL PROYECTO -->\n");
      out.write("                                    <center>\n");
      out.write("                                        <div class=\"service-desc\">\n");
      out.write("                                            <h5>Nombre del Proyecto:</h5>\n");
      out.write("                                            <br>\n");
      out.write("                                            <select class=\"form-control\" style=\" width:50%\" name=\"cboProyecto\">\n");
      out.write("                                                <option value=\"\">Seleccionar</option>\n");
      out.write("                                                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                            </select>\n");
      out.write("                                            <br>\n");
      out.write("                                            <input class=\"btn btn-skin\" type=\"submit\" name=\"btnAccion\" id=\"btnSeleccionar\" value=\"Seleccionar\">\n");
      out.write("                                            <hr>\n");
      out.write("                                        </div>\n");
      out.write("                                    </center>\n");
      out.write("\n");
      out.write("                                    <div class=\"box-register form-row\">\n");
      out.write("                                        <div class=\"container-fluid\">\n");
      out.write("                                            <!-- NUMERO REGISTRO -->\n");
      out.write("                                            <ul class=\"list-group col-md-1 service-desc\">\n");
      out.write("                                                <h5>Numero</h5>\n");
      out.write("                                            </ul>\n");
      out.write("\n");
      out.write("                                            <!-- REGISTROS DEL HISTORIAL -->\n");
      out.write("                                            <ul class=\"list-group col-md-4 service-desc\">\n");
      out.write("                                                <h5>Descripcion</h5>\n");
      out.write("                                            </ul>\n");
      out.write("\n");
      out.write("                                            <ul class=\"list-group col-md-2 service-desc\">\n");
      out.write("                                                <h5>Tienda</h5>\n");
      out.write("                                            </ul>\n");
      out.write("\n");
      out.write("                                            <!-- CANTIDAD -->\n");
      out.write("                                            <ul class=\"list-group col-md-1 service-desc\">\n");
      out.write("                                                <h5>Cantidad</h5>\n");
      out.write("                                            </ul>\n");
      out.write("\n");
      out.write("                                            <!--PRECIOS-->\n");
      out.write("                                            <ul class=\"list-group col-md-2 service-desc\">\n");
      out.write("                                                <h5>Precio Unitario</h5>\n");
      out.write("                                            </ul>\n");
      out.write("\n");
      out.write("                                            <!-- VALOR TOTAL -->\n");
      out.write("                                            <ul class=\"list-group col-md-2 service-desc\">\n");
      out.write("                                                <h5>Precio Total</h5>\n");
      out.write("                                            </ul>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                        <div class=\"container-fluid\">\n");
      out.write("                                            ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"box-register container-fluid\">\n");
      out.write("                                        <div class=\"service-desc form-group col-md\">\n");
      out.write("                                            ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                            ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                            <h5>Valor Total: <span>$ ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${total}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span></h5>\n");
      out.write("                                        </div>\n");
      out.write("                                        \n");
      out.write("                                        <!-- BOTONES -->\n");
      out.write("                                        <div class=\"services-desc col-md\">\n");
      out.write("                                            <!-- BOTON PAGAR -->\n");
      out.write("                                            ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                            ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("        </section>\n");
      out.write("    </center>\n");
      out.write("\n");
      out.write("    <!-- COMPLEMENTOS JS -->\n");
      out.write("    <script src=\"static/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"static/js/jquery.sticky.js\"></script>\n");
      out.write("    <script src=\"static/js/jquery.easing.min.js\"></script>\n");
      out.write("    <script src=\"static/js/jquery.scrollTo.js\"></script>\n");
      out.write("    <script src=\"static/js/jquery.appear.js\"></script>\n");
      out.write("    <script src=\"static/js/stellar.js\"></script>\n");
      out.write("    <script src=\"static/js/nivo-lightbox.min.js\"></script>\n");
      out.write("    <script src=\"static/js/custom.js\"></script>\n");
      out.write("    <script src=\"static/js/css3-animate-it.js\"></script>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("pro");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${proyecto}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                    <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pro.getNombre_Proyecto()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pro.getNombre_Proyecto()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setVar("insu");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${insumo}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                <!-- NUMERO REGISTRO -->\n");
          out.write("                                                <ul class=\"list-group col-md-1 service-desc\">\n");
          out.write("                                                    <li class=\"list-group-item\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${insu.getCodInsumo()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</li>\n");
          out.write("                                                </ul>\n");
          out.write("\n");
          out.write("                                                <!-- REGISTROS DEL HISTORIAL -->\n");
          out.write("                                                <ul class=\"list-group col-md-4 service-desc\">\n");
          out.write("                                                    <li class=\"list-group-item\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${insu.getDescripcion()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</li>\n");
          out.write("                                                </ul>\n");
          out.write("\n");
          out.write("                                                <!-- TIENDA -->\n");
          out.write("                                                <ul class=\"list-group col-md-2 service-desc\">\n");
          out.write("                                                    <li class=\"list-group-item\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${insu.getTienda()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</li>\n");
          out.write("                                                </ul>\n");
          out.write("\n");
          out.write("                                                <!-- CANTIDAD -->\n");
          out.write("                                                <ul class=\"list-group col-md-1 service-desc\">\n");
          out.write("                                                    <li class=\"list-group-item\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${insu.getCantidad()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</li>\n");
          out.write("                                                </ul>\n");
          out.write("\n");
          out.write("                                                <!--PRECIOS-->\n");
          out.write("                                                <ul class=\"list-group col-md-2 service-desc\">\n");
          out.write("                                                    <li class=\"list-group-item\">$ ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${insu.getPrecio()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</li>\n");
          out.write("                                                </ul>\n");
          out.write("\n");
          out.write("                                                <!-- VALOR TOTAL -->\n");
          out.write("                                                <ul class=\"list-group col-md-2 service-desc\">\n");
          out.write("                                                    <li class=\"list-group-item\">$ ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${insu.getPrecio() * insu.getCantidad()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</li>\n");
          out.write("                                                </ul>\n");
          out.write("                                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items_nobody.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setVar("precio");
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${insumo}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items_nobody.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("total");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${insumo.stream().map(precio -> precio.getPrecio() * precio.getCantidad()).sum()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${total!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                <input class=\"btn btn-skin\" type=\"submit\" value=\"Pagar\">\n");
        out.write("                                            ");
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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${total==null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                <input class=\"btn btn-skin\" type=\"submit\" value=\"Pagar\" disabled>\n");
        out.write("                                            ");
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
