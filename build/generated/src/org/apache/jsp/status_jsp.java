package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class status_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!--<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("    </body>\n");
      out.write("</html>-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <title>Booking Status!</title>\n");
      out.write("        <!--<link rel=\"stylesheet\" href=\"style.css\">-->\n");
      out.write("       \n");
      out.write("        <style>\n");
      out.write("           \n");
      out.write("            @import url('https://fonts.googleapis.com/css2?family=Berkshire+Swash&display=swap');\n");
      out.write("\n");
      out.write("\n");
      out.write("*{\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("    text-decoration: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("body{\n");
      out.write("     background: url(img/456.jpg) no-repeat center;\n");
      out.write("     background-size: cover;\n");
      out.write("    background-attachment: fixed;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* navbar styling */\n");
      out.write(".navbar{\n");
      out.write("    background-color:black;\n");
      out.write("    overflow: hidden;\n");
      out.write("    opacity: 0.6;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* logo*/\n");
      out.write(".navbar .logo a{\n");
      out.write("    color: #fff;\n");
      out.write("    font-size: 35px;\n");
      out.write("    font-weight: 600;\n");
      out.write("}\n");
      out.write("/* Style the links inside the navigation bar */\n");
      out.write(".navbar a {\n");
      out.write("    float: left;\n");
      out.write("    color: #f2f2f2;\n");
      out.write("    text-align: center;\n");
      out.write("    padding: 14px 16px;\n");
      out.write("    text-decoration: none;\n");
      out.write("    font-size: 27px;\n");
      out.write("  }\n");
      out.write(" \n");
      out.write("  /* Change the color of links on hover */\n");
      out.write("  .navbar a:hover {\n");
      out.write("    background:none;\n");
      out.write("    color: red;\n");
      out.write("  }\n");
      out.write(" \n");
      out.write("  /* Right-aligned section inside the top navigation */\n");
      out.write(".navbar .topnav-right {\n");
      out.write("    float: right;\n");
      out.write("   \n");
      out.write("  }\n");
      out.write("\n");
      out.write("  /*Table*/\n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("/*logout*/\n");
      out.write(".feedback .table2 {\n");
      out.write("  /*border-collapse: collapse;*/\n");
      out.write("  border-spacing: 0;\n");
      out.write("  width: 50%;\n");
      out.write("  border: 6px double black;\n");
      out.write("  align-content: centre;\n");
      out.write(" \n");
      out.write("}\n");
      out.write(".feedback .table2 { margin: 30px auto; }\n");
      out.write(".feedback .table2 th,td {\n");
      out.write("        border: 1px solid blue;\n");
      out.write("      }\n");
      out.write("      td {\n");
      out.write("        height: 30px;\n");
      out.write("        width: 50%;\n");
      out.write("        text-align: center;\n");
      out.write("      vertical-align: middle;\n");
      out.write("    }\n");
      out.write("\n");
      out.write(".feedback .table2 th, td {\n");
      out.write("padding: 30px;\n");
      out.write("}\n");
      out.write(".feedback .table2 tr {\n");
      out.write("  background-color:lightskyblue;\n");
      out.write("}\n");
      out.write(".feedback{\n");
      out.write("\n");
      out.write("  background-size: cover;\n");
      out.write("  background-attachment: fixed;\n");
      out.write(" \n");
      out.write("}\n");
      out.write(".table1Wrapper {\n");
      out.write("  max-width: 600px;\n");
      out.write("  margin: 0 auto;\n");
      out.write("  }\n");
      out.write("  #table1 th, td {\n");
      out.write("  white-space: nowrap;\n");
      out.write("  }\n");
      out.write("  table.dataTable thead .sorting:after,\n");
      out.write("  table.dataTable thead .sorting:before,\n");
      out.write("  table.dataTable thead .sorting_asc:after,\n");
      out.write("  table.dataTable thead .sorting_asc:before,\n");
      out.write("  table.dataTable thead .sorting_asc_disabled:after,\n");
      out.write("  table.dataTable thead .sorting_asc_disabled:before,\n");
      out.write("  table.dataTable thead .sorting_desc:after,\n");
      out.write("  table.dataTable thead .sorting_desc:before,\n");
      out.write("  table.dataTable thead .sorting_desc_disabled:after,\n");
      out.write("  table.dataTable thead .sorting_desc_disabled:before {\n");
      out.write("  bottom: .5em;\n");
      out.write("  }\n");
      out.write(" button {\n");
      out.write("  height: 50px;\n");
      out.write("  background: green;\n");
      out.write("opacity:0.9;\n");
      out.write("  border: none;\n");
      out.write("  color: white;\n");
      out.write("  font-size: 1.25em;\n");
      out.write("  font-family: 'Nanum Gothic';\n");
      out.write("  border-radius: 4px;\n");
      out.write("  cursor: pointer;\n");
      out.write("  margin-left:30%;\n");
      out.write("  margin-bottom: 100px;\n");
      out.write("}\n");
      out.write("div.elem-group.inlined {\n");
      out.write("  width: 50%;\n");
      out.write("  display: inline-block;\n");
      out.write("  float: left;\n");
      out.write(" margin-left: 30%;\n");
      out.write("\t\n");
      out.write("}\n");
      out.write("div.elem-group.inlined input {\n");
      out.write("  width: 30%;\n");
      out.write("  display: inline-block;\n");
      out.write("}\n");
      out.write("div.elem-group {\n");
      out.write("  margin: 20px 0;\n");
      out.write("margin-left: 30%;\n");
      out.write("margin-right: 30%;\n");
      out.write("}\n");
      out.write("label.fm {\n");
      out.write("  display: block;\n");
      out.write("  font-family: 'Nanum Gothic';\n");
      out.write("  padding-bottom: 10px;\n");
      out.write("  color: white;\n");
      out.write("  font-size: 1.65em;\n");
      out.write(" \n");
      out.write("\n");
      out.write("}\n");
      out.write("button:hover {\n");
      out.write("  border: 2px solid black;\n");
      out.write("}\n");
      out.write("label.logo{\n");
      out.write("  color: white;\n");
      out.write("  font-size: 35px;\n");
      out.write("  line-height: 80px;\n");
      out.write("  padding: 0 100px;\n");
      out.write("  font-weight: bold;\n");
      out.write("}\n");
      out.write(".checkbtn{\n");
      out.write("  font-size: 30px;\n");
      out.write("  color: white;\n");
      out.write("  float: right;\n");
      out.write("  line-height: 80px;\n");
      out.write("  margin-right: 40px;\n");
      out.write("  cursor: pointer;\n");
      out.write("  display: none;\n");
      out.write("}\n");
      out.write("#check{\n");
      out.write("  display: none;\n");
      out.write("}\n");
      out.write("a:hover,a.active{\n");
      out.write("    background: none;\n");
      out.write("    color: #0082e6;\n");
      out.write("  }\n");
      out.write("  input, select, textarea {\n");
      out.write("  border-radius: 2px;\n");
      out.write("  border: 2px solid #777;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("  font-size: 1.25em;\n");
      out.write("  font-family: 'Nanum Gothic';\n");
      out.write("  width: 100%;\n");
      out.write("  padding: 6px;\n");
      out.write("}\n");
      out.write("hidden{\n");
      out.write("display:none;\n");
      out.write("}\n");
      out.write("   </style>\n");
      out.write("<script>\n");
      out.write("     //function dispFunc() {document.getElementById('cc').style.display=\"block\";\n");
      out.write("    // function dispFunc() {\n");
      out.write("\n");
      out.write("  //document.getElementById(\"cc\").classList.toggle(\"hidden\");\n");
      out.write("\n");
      out.write("//}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("    \n");
      out.write("</head>\n");
      out.write("<body >\n");
      out.write("\n");
      out.write("    <!-- The navbar-->\n");
      out.write("  <nav class=\"navbar\" style=\"background-color: black;\">\n");
      out.write("\n");
      out.write("    <div class=\"logo\"><a href=\"#\">ShimmerNShine</a></div>\n");
      out.write(" \n");
      out.write("  <div class=\"topnav-right\">\n");
      out.write("     <a href=\"admin.jsp\">Feedback</a>\n");
      out.write("      <a href=\"query.jsp\">Query</a>\n");
      out.write("      <a href=\"user.jsp\">Registered User</a>\n");
      out.write("    <a href=\"#booking\">Booking Status</a>\n");
      out.write("    <a href=\"index.jsp\">Logout</a>\n");
      out.write("  </div>\n");
      out.write("     \n");
      out.write("</nav>\n");
      out.write("   \n");
      out.write("   \n");
      out.write("    <section class=\"feedback\" id=\"feedback\">\n");
      out.write("  <h5 style=\"margin-top: 60px; font-family:cursive; color: Blue; text-align: center; font-size: 30px;\">Booking Status</h5>\n");
      out.write("  <div class=\"elem-group inlined\">\n");
      out.write("    <label class=\"fm\" for=\"userid\">User Id</label>\n");
      out.write("    <input type=\"text\" id=\"userid\" name=\"userid\" placeholder=\"Enter id\"  required>\n");
      out.write("  </div>\n");
      out.write("  <br>\n");
      out.write("  <br>\n");
      out.write("  <button type=\"button\" id=\"Check\" name=\"Check\"  value=\"Check\">Check</button>\n");
      out.write("  <table class= table2  id=\"cc\">\n");
      out.write("      <div class=c2>\n");
      out.write("    <tr style=\"background-color: khaki; color: dodgerblue;\" >\n");
      out.write("      <th>User ID</th>\n");
      out.write("      <th>Date From</th>\n");
      out.write("      <th>Date To</th>\n");
      out.write("      <th>Venue</th>\n");
      out.write("      <th>Booking status</th>\n");
      out.write("    </tr>\n");
      out.write(" \n");
      out.write("                ");

                  
                 //String id1="pk";
                    try{
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/new","user1","user1");
//                String id1=session.getAttribute("name").toString();
               // PreparedStatement ps=conn.prepareStatement("select * from status where id='" + id1 + "' ");
                //ResultSet rs=ps.executeQuery();
                 Statement st = conn.createStatement();
                ResultSet rs;
                rs = st.executeQuery("Select * from tt3 ");
             //  PreparedStatement st=conn.prepareStatement("select * from status where id=?");
               // st.setString(1, id1);
                //ResultSet rs=st.executeQuery();
              while(rs.next())
                       {
                           
out.println("<tr><td>" + rs.getString(1) + "</td><td>" + rs.getString(2) + "</td><td>" + rs.getString(3) + "</td><td>" +rs.getString(4) + "</td><td>" +rs.getString(5) +"</td></tr>");
}
                    /*
//                    if(request.getParameter("btn")!=null)
//                    {
//                        response.sendRedirect("student.jsp");
//                    }
                try{
                    
                String gu=session.getAttribute("name").toString();
                out.print("<script>alert('User id invalid')</script>");
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/bk1","root","root");
            //    if(button.equals("Check"))
              // {out.print("<script>alert('User id invalid')</script>");
                PreparedStatement ps=conn.prepareStatement("select * from status");
                out.print("<script>alert('User id invalid')</script>");
                ResultSet rs=ps.executeQuery();
              while(rs.next())
                       {
        out.println("<tr><td>" + rs.getString(1) + "</td><td>" + rs.getString(2) + "</td><td>" + rs.getString(3) + "</td><td>" + rs.getString(4) + "</td><td>" +rs.getString(5) + "</td></tr>");
}*/
             /*  }
                 else
              {
                       out.print("<script>alert('User id invalid')</script>");
                      }*/
                       
      out.write("\n");
      out.write("      </div>\n");
      out.write("                </table>\n");
      out.write("</section>\n");
      out.write("</body>\n");
      out.write("</html>\n");

            conn.close();
        }catch(Exception se)
        {
            se.printStackTrace();
   
        }

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
