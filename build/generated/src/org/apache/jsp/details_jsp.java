package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class details_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<!-- jQuery library -->\n");
      out.write("\n");
      out.write("<html lang=\"en\" dir=\"ltr\">\n");
      out.write("  <head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\n");
      out.write("    <title> ShimmerNShine </title> \n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("<script src=\"multiselect/jquery.multiselect.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"multiselect/jquery.multiselect.css\">\n");
      out.write("    <style>\n");
      out.write("\t*{\n");
      out.write("  padding: 0;\n");
      out.write("  margin: 0;\n");
      out.write("  text-decoration: none;\n");
      out.write("  list-style: none;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("}\n");
      out.write("body{\n");
      out.write("  font-family: montserrat;\n");
      out.write("}\n");
      out.write("nav{\n");
      out.write("  background: #0082e6;\n");
      out.write("  height: 80px;\n");
      out.write("  width: 100%;\n");
      out.write("}\n");
      out.write("label.logo{\n");
      out.write("  color: white;\n");
      out.write("  font-size: 35px;\n");
      out.write("  line-height: 80px;\n");
      out.write("  padding: 0 100px;\n");
      out.write("  font-weight: bold;\n");
      out.write("}\n");
      out.write("nav ul{\n");
      out.write("  float: right;\n");
      out.write("  margin-right: 20px;\n");
      out.write("}\n");
      out.write("nav ul li{\n");
      out.write("  display: inline-block;\n");
      out.write("  line-height: 80px;\n");
      out.write("  margin: 0 5px;\n");
      out.write("}\n");
      out.write("nav ul li a{\n");
      out.write("  color: white;\n");
      out.write("  font-size: 17px;\n");
      out.write("  padding: 7px 13px;\n");
      out.write("  border-radius: 3px;\n");
      out.write("  text-transform: uppercase;\n");
      out.write("}\n");
      out.write("a.active,a:hover{\n");
      out.write("  background: #1b9bff;\n");
      out.write("  transition: .5s;\n");
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
      out.write("@media (max-width: 952px){\n");
      out.write("  label.logo{\n");
      out.write("    font-size: 30px;\n");
      out.write("    padding-left: 50px;\n");
      out.write("  }\n");
      out.write("  nav ul li a{\n");
      out.write("    font-size: 16px;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("@media (max-width: 858px){\n");
      out.write("  .checkbtn{\n");
      out.write("    display: block;\n");
      out.write("  }\n");
      out.write("  ul{\n");
      out.write("    position: fixed;\n");
      out.write("    width: 100%;\n");
      out.write("    height: 100vh;\n");
      out.write("    background: #2c3e50;\n");
      out.write("    top: 80px;\n");
      out.write("    left: -100%;\n");
      out.write("    text-align: center;\n");
      out.write("    transition: all .5s;\n");
      out.write("  }\n");
      out.write("  nav ul li{\n");
      out.write("    display: block;\n");
      out.write("    margin: 50px 0;\n");
      out.write("    line-height: 30px;\n");
      out.write("  }\n");
      out.write("  nav ul li a{\n");
      out.write("    font-size: 20px;\n");
      out.write("  }\n");
      out.write("  a:hover,a.active{\n");
      out.write("    background: none;\n");
      out.write("    color: #0082e6;\n");
      out.write("  }\n");
      out.write("  #check:checked ~ ul{\n");
      out.write("    left: 0;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("section{\n");
      out.write("  /*background: url(https://thecrimsonbride.com/wp-content/uploads/2020/02/Top-Wedding-Themes-50-768x512.jpg);*/\n");
      out.write("  height: 100%;\n");
      out.write("  \n");
      out.write("  /*background: url(https://thecrimsonbride.com/wp-content/uploads/2020/02/Top-Wedding-Themes-50-768x512.jpg) no-repeat center; background-size: cover; background-attachment: fixed;*/\n");
      out.write("\n");
      out.write("position: relative;\n");
      out.write("  justify-content:center;\n");
      out.write("align-items:center;\n");
      out.write("display:flex;\n");
      out.write("padding: 50px;\n");
      out.write("padding-bottom:200px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".booking{\n");
      out.write("width:100%;\n");
      out.write("padding:50px 100px;\n");
      out.write("background-color:rgba(0,0,0,0.5);\n");
      out.write(" font-size: 25px;\n");
      out.write(" border-radius:10px;\n");
      out.write(" border: 1px solid rgba(255,255,255,0.3);\n");
      out.write(" box-shadow:2px 2px 15px rgba(0,0,0,0.3);\n");
      out.write(" color:white;\n");
      out.write("}\n");
      out.write("input, select, textarea {\n");
      out.write("  border-radius: 2px;\n");
      out.write("  border: 2px solid #777;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("  font-size: 22px;\n");
      out.write("  font-family: 'Nanum Gothic';\n");
      out.write("  width: 100%;\n");
      out.write("  padding: 6px;\n");
      out.write("}\n");
      out.write("h2{\n");
      out.write("font-size:40px;\n");
      out.write("font-weight:bold;\n");
      out.write("position:relative;\n");
      out.write("font-family: 'Cursive',lucida handwriting;\n");
      out.write("padding-bottom:20px;\n");
      out.write("color:orange;\n");
      out.write("}\n");
      out.write("input#name{\n");
      out.write(" width:300px;\n");
      out.write(" border: 1px solid #ddd;\n");
      out.write(" border-radius: 3px;\n");
      out.write(" outline: 0;\n");
      out.write(" padding: 7px;\n");
      out.write("background-color: #fff; \n");
      out.write(" box-shadow: insert 1px 1px 5px rgba(0,0,0,0.3);\n");
      out.write("}\n");
      out.write("button{\n");
      out.write(" \n");
      out.write("height: 50px;\n");
      out.write("  background: pink;\n");
      out.write("opacity:0.9;\n");
      out.write("  border: none;\n");
      out.write("  color: black;\n");
      out.write("  font-size: 1.25em;\n");
      out.write("  font-family: 'Nanum Gothic';\n");
      out.write("  border-radius: 4px;\n");
      out.write("  cursor: pointer;\n");
      out.write("  margin-left:30%;\n");
      out.write("  margin-bottom: 100px;\n");
      out.write("width:200px;\n");
      out.write("padding:7px;\n");
      out.write("\n");
      out.write("border: 1px solid rgba(255,255,255,0.3);\n");
      out.write("box-shadow: 1px 1px 5px rgba(0,0,0,0.3);\n");
      out.write("margin-bottom:20px;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("  </head>\n");
      out.write("  <body style=\"background: url(https://thecrimsonbride.com/wp-content/uploads/2020/02/Top-Wedding-Themes-50-768x512.jpg) no-repeat center; background-size: cover; background-attachment: fixed;\">\n");
      out.write("    <nav>\n");
      out.write("      <input type=\"checkbox\" id=\"check\">\n");
      out.write("      <label for=\"check\" class=\"checkbtn\">\n");
      out.write("        <i class=\"fas fa-bars\"></i>\n");
      out.write("      </label>\n");
      out.write("      <label class=\"logo\">Celebrate with ShimmerNShine</label>\n");
      out.write("      <ul>\n");
      out.write("\t<li><a href=\"#\">Home</a></li>\n");
      out.write("        <li><a class=\"active\" href=\"#\">Book Now</a></li>\n");
      out.write("        <li><a href=\"#\">Booking status</a></li>\n");
      out.write("        <li><a href=\"#\">Review Us</a></li>\n");
      out.write("        <li><a href=\"#\">Help</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </nav>\n");
      out.write("    <section>\n");
      out.write("\t<div class=\"main\">\n");
      out.write("\t<div class=\"booking\">\n");
      out.write("\t\t<h2>Make Booking</h2>\n");
      out.write("\t\t<form id=\"booking\"> \n");
      out.write("                    \n");
      out.write("                    <label> USERNAME* : </label>   <br>\n");
      out.write("<input type=\"text\" name=\"userid\" placeholder= \"Enter username\" required />\n");
      out.write("</br>\n");
      out.write("<br>\t\t<label>Type of Event:</label>\n");
      out.write("\t\t<br>\n");
      out.write("\t\t<select id=\"event-selection\" name=\"event\" required>\n");
      out.write("        \t<option selected disabled>--Choose Event Type--</option>\n");
      out.write("        \t<option value=\"wedding\">Wedding</option>\n");
      out.write("        \t<option value=\"birthday_party\">Birthday Party</option>\n");
      out.write("        \t<option value=\"ring_ceremony\">Ring ceremony</option>\n");
      out.write("\t\t<option value=\"anniversary\">Anniversary</option>\n");
      out.write("\t\t<option value=\"business_party\">Business party</option>\n");
      out.write("\t\t<option value=\"wedding_function\">Wedding Function</option>\n");
      out.write("\t\t<option value=\"bachelor's_party\">Bachelor's party</option>\n");
      out.write("\t\t<option value=\"others\">Others</option>\t\n");
      out.write("    \t\t</select>\n");
      out.write("\t<br><br>\n");
      out.write("\t\t<label>Cuisine:</label>\n");
      out.write("\t\t<br>\n");
      out.write("                <select name=\"cuisine\" id=\"cuisine\">\n");
      out.write("        \t<option selected disabled>--Choose Cuisine Type--</option>\n");
      out.write("        \t<optgroup label=\"Indian\">\n");
      out.write("\t\t<option value=\"punjabi\">Punjabi</option>\n");
      out.write("\t\t<option value=\"south_indian\">South Indian</option>\n");
      out.write("\t\t<option value=\"gujarati\">Gujarati</option>\n");
      out.write("\t\t<option value=\"rajasthani\">Rajasthani</option>\n");
      out.write("\t\t<option value=\"bengali\">Bengali</option>\n");
      out.write("\t\t<option value=\"mughalai\">Mughalai</option>\n");
      out.write("\t\t</optgroup>\n");
      out.write("                <optgroup label=\"Others\">\t\n");
      out.write("        \t<option value=\"italian\">Italian</option>\n");
      out.write("\t\t<option value=\"chinese\">Chinese</option>\n");
      out.write("\t\t<option value=\"american\">American</option>\n");
      out.write("\t\t<option value=\"japanese\">Japanese</option>\n");
      out.write("\t\t<option value=\"thai\">Thai</option>\n");
      out.write("        \t</optgroup>\n");
      out.write("\t\t\n");
      out.write("    \t\t</select>\n");
      out.write("\t\t<script>\n");
      out.write("\t\t$('#cuisine').multiselect({\n");
      out.write("    \t\tcolumns: 1,\n");
      out.write("   \t\t placeholder: 'Select Cuisine',\n");
      out.write("\t\tsearch:true\n");
      out.write("\t\t});\n");
      out.write("\t\t</script>\n");
      out.write("\t\t<br><br>\n");
      out.write("\t\t<label>Decoration:</label>\n");
      out.write("\t\t<br>\n");
      out.write("\t\t<select id=\"decoration\" name=\"decoration\" required>\n");
      out.write("        \t<option selected disabled>--Choose Decoration Type--</option>\n");
      out.write("        \t<option value=\"flowral\">All Floral</option>\n");
      out.write("        \t<option value=\"drapes\">Fabric Drapes/curtains</option>\n");
      out.write("\t\t<option value=\"led\">LED</option>\n");
      out.write("\t\t<option value=\"balloons\">Balloons</option>\n");
      out.write("        \t<option value=\"colourful\">Vibrant and Colourful</option>\n");
      out.write("\t\t<option value=\"metallic\">Metallic</option>\n");
      out.write("\t\t</select>\n");
      out.write("\t\t<br> <br>\n");
      out.write("\t\t<label>Theme:</label>\n");
      out.write("\t\t<br>\n");
      out.write("\t\t<select id=\"theme\" name=\"theme\" required>\n");
      out.write("        \t<option selected disabled>--Choose Theme--</option>\n");
      out.write("\t\t<option value=\"none\">None</option>\n");
      out.write("\t\t<option value=\"bollywood\">Bollywood Theme</option>\n");
      out.write("\t\t<option value=\"retro\">Retro Theme</option>\n");
      out.write("\t\t<option value=\"traditional\">Traditional theme</option>\n");
      out.write("\t\t<option value=\"boho_chic\">Boho Chic</option>\n");
      out.write("\t\t<option value=\"western\">Western Theme</option>\n");
      out.write("\t\t<option value=\"rustic\">Rustic Theme</option>\n");
      out.write("\t\t<option value=\"moroccan\">Moroccan Theme</option>\n");
      out.write("\t\t<option value=\"vintage\">Vintage Theme</option>\n");
      out.write("\t\t<option value=\"fairytale\">Fairytale Theme</option>\n");
      out.write("\t\t<option value=\"others\">Others</option>\t\n");
      out.write("    \t\t</select>\n");
      out.write("\t\t<br> <br>\n");
      out.write("\t\t<label>Entertainment source:</label>\n");
      out.write("\t\t<br>\n");
      out.write("\t\t<select id=\"source\" name=\"source\" required>\n");
      out.write("        \t<option selected disabled>--Choose Entertainment source--</option>\n");
      out.write("\t\t<option value=\"none\">None</option>\n");
      out.write("\t\t<option value=\"dj\">DJ</option>\n");
      out.write("\t\t<option value=\"qawaali\">Qawaali</option>\n");
      out.write("\t\t<option value=\"band\">Musician's Band</option>\n");
      out.write("\t\t<option value=\"dancers\">Dancers</option>\n");
      out.write("\t\t<option value=\"folk\">Folk Dancers</option>\n");
      out.write("\t\t<option value=\"magic\">Magic Show</option>\n");
      out.write("\t\t<option value=\"singers\">Singers</option>\n");
      out.write("\t\t<option value=\"host\">Party Host</option>\n");
      out.write("\t\t<option value=\"performers\">Performers or Entertainers</option>\n");
      out.write("\t\t<option value=\"others\">Others</option>\t\n");
      out.write("    \t\t</select>\n");
      out.write("\t\t<br><br>\n");
      out.write("\t\t<button type=\"submit\" id= \"Submit\" value=\"Submit\" name=\"Submit\">Submit</button>\n");
      out.write("\t</form>\n");
      out.write("\t</div>\n");
      out.write("\t</div>\n");
      out.write("</section>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
   
       String event =request.getParameter("event");
          String cuisine=request.getParameter("cuisine");
          String decor=request.getParameter("decoration");
          String theme=request.getParameter("theme");
         String entertainment=request.getParameter("source");
         String button=request.getParameter("Submit");
         String stdate=session.getAttribute("startdate").toString();
         String endate=session.getAttribute("enddate").toString();
         String gu=session.getAttribute("guest").toString();
         String vn=session.getAttribute("venue").toString();
          String us=request.getParameter("userid");
        try
	{
	Class.forName("org.apache.derby.jdbc.ClientDriver");
	Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/new","user1","user1");
//        out.print("<script>alert('record insert successfully')</script>");
        if(button.equals("Submit"))
        {
//            out.print("<script>alert('record insert successfully')</script>");
       
            if(event!="" && cuisine!="")
		{
//                    out.print("<script>alert('record insert successfully')</script>");
        	PreparedStatement ps=conn.prepareStatement("insert into tt2 values(?,?,?,?,?,?,?,?,?,?)");
        	ps.setString(1,event);
                ps.setString(2,cuisine);
                ps.setString(3,decor);
                ps.setString(4,theme);
                ps.setString(5,entertainment);
                ps.setString(6,stdate);
                ps.setString(7,endate);
                ps.setString(8,gu);
                ps.setString(9,vn);
                ps.setString(10,us);
//       out.print("<script>alert('record insert successfully')</script>");
        	int i=ps.executeUpdate();
        
         	 if(i>0)
          	{
                    out.print("<script>alert('record insert successfully')</script>");
                    
                }
                 }
                
                else
                {
                    out.print("<script>alert('Please Enter the details')</script>");
                    conn.close();
                }
        } 
//        response.sendRedirect("navbar.jsp");
        conn.close();
        }catch(Exception se)
        	{
            	se.printStackTrace();
   
        	}

      out.write('\n');
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
