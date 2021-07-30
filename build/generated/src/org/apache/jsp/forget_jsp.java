package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class forget_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" <html>\n");
      out.write("<head>\n");
      out.write("<title> Forget Password </title>\n");
      out.write("<style>\n");
      out.write("body{\n");
      out.write("\tmargin: 0;\n");
      out.write("\tpadding: 0;\n");
      out.write("\tbackground: url(img/pic1.jpg);\n");
      out.write("\tbackground-size: cover;\n");
      out.write("\tbackground-position: center;\n");
      out.write("\tfont-family: sans-serif;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".loginbox{\n");
      out.write(" \twidth:320px;\n");
      out.write("\theight:420px;\n");
      out.write("\tbackground:#000;\n");
      out.write("\tcolor: #fff;\n");
      out.write("\ttop: 50%;\n");
      out.write("\tleft: 50%;\n");
      out.write("\tposition: absolute;\n");
      out.write("\ttransform: translate(-50%,-50%);\n");
      out.write("\tbox-sizing: border-box;\n");
      out.write("\tpadding:70px 30px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".pic2{\n");
      out.write("\twidth: 100px;\n");
      out.write("\theight: 100px;\n");
      out.write("\tborder-radius: 50%;\n");
      out.write("\tposition: absolute;\n");
      out.write("\ttop: -50px;\n");
      out.write("\tleft: calc(50% - 50px);\n");
      out.write("}\n");
      out.write("\n");
      out.write("h1{\n");
      out.write("\tmargin: 0;\n");
      out.write("\tpadding: 0 0 20px;\n");
      out.write("\ttext-align: center;\n");
      out.write("\tfont-size: 22px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".loginbox p{\n");
      out.write("\tmargin:0;\n");
      out.write("\tpadding:0;\n");
      out.write("\tfont-weight: bold;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".loginbox input{\n");
      out.write("\twidth: 100%;\n");
      out.write("\tmargin-bottom: 20px;\n");
      out.write("\t\n");
      out.write("}\n");
      out.write(".loginbox input[type=\"text\"], input[type=\"password\"]\n");
      out.write("{\t\n");
      out.write("\tborder: none;\n");
      out.write("\tborder-bottom: 1px solid #fff;\n");
      out.write("\tbackground: transparent;\n");
      out.write("\toutline: none;\n");
      out.write("\theight: 40px;\n");
      out.write("\tcolor: #fff;\n");
      out.write("\tfont-size: 16px;\n");
      out.write("}\n");
      out.write(".loginbox input[type=\"submit\"]\n");
      out.write("{\n");
      out.write("\tborder: none;\n");
      out.write("\toutline: none;\n");
      out.write("\theight: 40px;\n");
      out.write("\tbackground: #fb2525;\n");
      out.write("\tcolor: #fff;\n");
      out.write("\tfont-size: 18px;\n");
      out.write("\tborder-radius: 20px;\n");
      out.write("}\n");
      out.write(".loginbox input[type=\"submit\"]:hover\n");
      out.write("{\n");
      out.write("\tcursor:pointer;\n");
      out.write("\tbackground: #ffc107;\n");
      out.write("\tcolor: #000;\n");
      out.write("}\n");
      out.write(".loginbox a{\n");
      out.write("\ttext-decoration: none;\n");
      out.write("\tfont-size: 12px;\n");
      out.write("\tline-height:20px;\n");
      out.write("\tcolor: darkgrey;\n");
      out.write("}\n");
      out.write(".loginbox a:hover\n");
      out.write("{\n");
      out.write("\tcolor: #ffc107;\t\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write(" \n");
      out.write("<body>\n");
      out.write("   \n");
      out.write("\t<div class=\"loginbox\">\n");
      out.write("\t<img src=\"img/p1.jfif\" class=\"pic2\">\n");
      out.write("\t<h1>Create New Password</h1>\n");
      out.write("        <form method=\"post\" action=\"login.jsp\">\n");
      out.write("\t<p>User ID</p>\n");
      out.write("\t<input type=\"text\" name=\"userid\" placeholder=\"Enter User ID\">\n");
      out.write("        <p>Registered Email ID</p>\n");
      out.write("\t<input type=\"text\" name=\"email\" placeholder=\"Enter Email ID\">\n");
      out.write("\t<p>New Password</p>\n");
      out.write("\t<input type=\"password\" name=\"passw\" placeholder=\"Enter New Password\">\n");
      out.write("        <p>Confirm Password</p>\n");
      out.write("\t<input type=\"password\" name=\"confirm\" placeholder=\"Retype Password\">\n");
      out.write("\t<input type=\"submit\" name=\"btn\" value=\"Create New Password\" >\n");
      out.write("\t</form>\n");
      out.write("\t</div>\n");
      out.write("</body> \n");
      out.write("</html>\n");

    String uname = request.getParameter("userid");    
    String em = request.getParameter("email");
    String pass = request.getParameter("passw");
    String cn = request.getParameter("confirm");
    String bn = request.getParameter("btn"); 
    try{
    Class.forName("org.apache.derby.jdbc.ClientDriver");  
    Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/new","user1","user1");
    if(bn.equals("Create New Password"))
    { 
        out.print("<script>alert('Password Changed Successfully.')</script>");
//        if(pass.equals(cn))
//        {  
//            out.print("<script>alert('Password Changed Successfully.')</script>"); 
//            PreparedStatement ps=con.prepareStatement("Update reg1 set pass='"+pass+"' where id=? "); 
//            out.print("<script>alert('Password Changed Successfully.')</script>");      	
//            int i=ps.executeUpdate();
//            out.print("<script>alert('Password Changed Successfully.')</script>");  
//            if(i>0)
//            {
//                out.print("<script>alert('Password Changed Successfully.')</script>");  
//            }
//            else {
//                out.print("<script>alert('incorrect userid or email_id2345')</script>");
////                      con.close();
//            }
//        }
//        else{
//            out.print("<script>alert('Passwords doesnt match...')</script>");  
////        con.close();
//        }
    }
    }
    catch(Exception se)
        	{
            	se.printStackTrace();
   
        	}
    
    
      out.write('\n');
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
