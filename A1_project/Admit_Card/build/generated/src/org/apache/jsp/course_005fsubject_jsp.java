package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;

public final class course_005fsubject_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("    <div id=\"nbody2\"><br>\n");
      out.write("        <h3><b>Add subjects to Course</b></h3>\n");
      out.write("    ");

        String connectionURL = "jdbc:mysql://localhost:3306/admitdb";
     try {
     String d=(String)request.getParameter("cid");
     String p=(String)request.getParameter("cn");
     Class.forName("com.mysql.jdbc.Driver");
     Connection conn = DriverManager.getConnection(connectionURL, "root", "root");
     Statement st = conn.createStatement();
     ResultSet rs;

      out.write("\n");
      out.write("<center>\n");
      out.write("    <form name=\"f3\" action=\"cs_code.jsp\" method=\"post\">\n");
      out.write("        <h2><b>Select Subject_Name</b></h2>\n");
      out.write("    ");

    Statement stmt1=conn.createStatement();
    ResultSet rs1=stmt1.executeQuery("SELECT * FROM subject");
        while(rs1.next())
        {
        
      out.write("\n");
      out.write("        <input type=\"checkbox\" name=\"id\" value=\"");
      out.print(rs1.getString(2) );
      out.write("\"><BR>\n");
      out.write("        ");
 } 
            String cid=(String)request.getParameter("cid");   
            request.setAttribute("cid",cid);
    
      out.write("\n");
      out.write("    <br><br>\n");
      out.write("    <input type=\"submit\" value =\"Add\" class=\"btn btn-primary\" style=\"height:30px;width:150px\">\n");
      out.write("    \n");
      out.write("    </form></center>\n");
      out.write("    ");

}
catch(SQLException ex)
{ 
out.println(ex);
}

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
