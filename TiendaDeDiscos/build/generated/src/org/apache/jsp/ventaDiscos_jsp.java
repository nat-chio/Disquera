package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ventaDiscos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h2>Eliga sus Discos</h2>\n");
      out.write("        <form>\n");
      out.write("            <table align=\"center\">\n");
      out.write("                <tr>\n");
      out.write("                    <td></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Album: </td>\n");
      out.write("                    <td><input type=\"text\" name=\"txt_album\" value=\"Blue & Lonesome\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Artista</td>\n");
      out.write("                    <td><input type=\"text\" name=\"txt_artista\" value=\"The Rolling Stones\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Año: </td>\n");
      out.write("                    <td><input type=\"text\" name=\"txt_año\" value=\"2016\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <td>\n");
      out.write("                    <select name=\"opt_formato\">\n");
      out.write("                        <option>EP</option>\n");
      out.write("                        <option>LP</option>\n");
      out.write("                        <option>CD</option>\n");
      out.write("                        <option>DVD</option>\n");
      out.write("                    </select>\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    ");

                        int txt_precio = 0;
                        switch ("opt_formato") {
                            case "EP":
                                txt_precio = 10000;
                                break;
                            case "LP":
                                txt_precio = 12000;
                                break;
                            case "CD":
                                txt_precio = 14000;
                                break;
                            case "DVD":
                                txt_precio = 16000;
                                break;
                        }
                    
      out.write("\n");
      out.write("                    <input type=\"text\" name=\"txt_precio\" value=");
      out.print(txt_precio);
      out.write(">\n");
      out.write("                </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
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
