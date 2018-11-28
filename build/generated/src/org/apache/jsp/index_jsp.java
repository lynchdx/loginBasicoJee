package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Index Login</title>\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\"/>\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body id=\"LoginForm\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h1 class=\"form-heading\">Michel Charnay</h1>\n");
      out.write("            <div class=\"login-form\">\n");
      out.write("                <div class=\"main-div\">\n");
      out.write("                    <div class=\"panel\">\n");
      out.write("                        <h2>Login</h2>\n");
      out.write("                        <p>Por favor, ingrese su email y contraseña</p>\n");
      out.write("                    </div>\n");
      out.write("                    <form action=\"valida\" method=\"post\" id=\"Login\">\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"txt_user\" name=\"txt_user\" placeholder=\"Dirección Email\">\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("\n");
      out.write("                            <input type=\"password\" class=\"form-control\" id=\"txt_contrasena\" name=\"txt_contrasena\" placeholder=\"Contraseña\">\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <!--\n");
      out.write("                        <div class=\"forgot\">\n");
      out.write("                            <a href=\"reset.html\">Forgot password?</a>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        -->\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary\">Ingrear</button>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </div></div></div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
}
