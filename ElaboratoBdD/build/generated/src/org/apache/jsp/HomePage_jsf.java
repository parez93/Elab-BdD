package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class HomePage_jsf extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\"\r\n");
      out.write("\"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\"\r\n");
      out.write("      xmlns:h=\"http://java.sun.com/jsf/html\"\r\n");
      out.write("      xmlns:f=\"http://java.sun.com/jsf/core\">\r\n");
      out.write("<head>\r\n");
      out.write("    <title> Home Page </title>\r\n");
      out.write("  </head>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <body>\r\n");
      out.write("\r\n");
      out.write("    <div>\r\n");
      out.write("      <div>\r\n");
      out.write("        <div align=\"left\">\r\n");
      out.write("          <b>Elaborato basi di dati di:</b>\r\n");
      out.write("          <br/>\r\n");
      out.write("          Federico Parezzan\r\n");
      out.write("          <br/>\r\n");
      out.write("          Gianluca Palazzo\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <h1 align=\"center\" style=\"color:red\">Benvenuto sul sito dell'erasmus</h1>\r\n");
      out.write("        <div align=\"center\">\r\n");
      out.write("          <img src=\"http://goo.gl/nDWnIi\"/>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>  \r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("  <a href=\"index.jsf\">\r\n");
      out.write("    <img src=\"http://goo.gl/m7SmFi\" alt=\"testo\" />\r\n");
      out.write("  </a>\r\n");
      out.write("\r\n");
      out.write("  <p align=\"center\">\r\n");
      out.write("    <font size=\"1\">clicca sull'immagine</font>\r\n");
      out.write("  </p>\r\n");
      out.write("  </body>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("  \r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
