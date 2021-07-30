package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.time.LocalDate;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

public final class check_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\" dir=\"ltr\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <title> ShimmerNShine </title> \n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-2.2.4.js\"></script>\n");
      out.write("    <script src=\"https://code.jquery.com/ui/1.12.1/jquery-ui.js\"></script>\n");
      out.write("    <link href=\"https://code.jquery.com/ui/1.11.3/themes/smoothness/jquery-ui.css\" rel=\"stylesheet\">\n");
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
      out.write("div.elem-group.inlined input {\n");
      out.write("  width: 30%;\n");
      out.write("  display: inline-block;\n");
      out.write("}\n");
      out.write("button {\n");
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
      out.write("div.elem-group {\n");
      out.write("  margin: 20px 0;\n");
      out.write("margin-left: 30%;\n");
      out.write("margin-right: 30%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("div.elem-group.inlined {\n");
      out.write("  width: 50%;\n");
      out.write("  display: inline-block;\n");
      out.write("  float: left;\n");
      out.write(" margin-left: 30%;\n");
      out.write("\t\n");
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
      out.write("label.bm{\n");
      out.write("\tfont-family: 'Cursive',lucida handwriting;\n");
      out.write("  padding-bottom: 7px;\n");
      out.write("  font-size: 1.95em;\n");
      out.write("color: purple;\n");
      out.write("font-weight: bold;\n");
      out.write("\n");
      out.write("margin-left:60px;\n");
      out.write("\n");
      out.write("}\n");
      out.write("input, select, textarea {\n");
      out.write("  border-radius: 2px;\n");
      out.write("  border: 2px solid #777;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("  font-size: 1.25em;\n");
      out.write("  font-family: 'Nanum Gothic';\n");
      out.write("  width: 100%;\n");
      out.write("  padding: 6px;\n");
      out.write("}\n");
      out.write("button:hover {\n");
      out.write("  border: 2px solid black;\n");
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
      out.write("  margin-right: 5%;\n");
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
      out.write("\n");
      out.write("section{\n");
      out.write("  background-image:url(\"https://frugal2fab.com/wp-content/uploads/2017/06/udaivilas.jpg\");\n");
      out.write(" height: 100%;\n");
      out.write("background-position: center;\n");
      out.write("background-repeat: no-repeat;\n");
      out.write("background-size: cover;\n");
      out.write("position: relative;\n");
      out.write("\n");
      out.write("justify-content:center;\n");
      out.write("align-items:center;\n");
      out.write("padding: 20px;\n");
      out.write("padding-bottom:200px;\n");
      out.write("\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("<script>\n");
      out.write("    $(document).ready(function () {\n");
      out.write("        var minDate = new Date();\n");
      out.write("        $(\"#checkin-date\").datepicker({\n");
      out.write("            showAnim: 'drop',\n");
      out.write("            numberOfMonth: 1,\n");
      out.write("            minDate: minDate,\n");
      out.write("            dateFormmat: 'dd/MM/yyyy',\n");
      out.write("            onClose: function (selectedDate){\n");
      out.write("                $('#checkout-date').datepicker(\"option\",\"minDate\",selectedDate);\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("        $(\"#checkout-date\").datepicker({\n");
      out.write("            showAnim: 'drop',\n");
      out.write("            numberOfMonth: 1,\n");
      out.write("            minDate: minDate,\n");
      out.write("            dateFormmat: 'dd/MM/yyyy',\n");
      out.write("            onClose: function (selectedDate){\n");
      out.write("                $('#checkout-date').datepicker(\"option\",\"minDate\",selectedDate);\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("    \n");
      out.write("</script>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("<!--    <nav>\n");
      out.write("      <input type=\"checkbox\" id=\"check\">\n");
      out.write("      <label for=\"check\" class=\"checkbtn\">\n");
      out.write("        <i class=\"fas fa-bars\"></i>\n");
      out.write("      </label>\n");
      out.write("      <label class=\"logo\">Celebrate With ShimmerNShine</label>\n");
      out.write("      <ul>\n");
      out.write("\t<li><a href=\"#\">Home</a></li>\n");
      out.write("        <li><a class=\"active\" href=\"#\">Book Now</a></li>\n");
      out.write("        <li><a href=\"#\">Booking Status</a></li>\n");
      out.write("        <li><a href=\"#\">Review Us</a></li>\n");
      out.write("\t<li><a href=\"#\">Help</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </nav>-->\n");
      out.write("    <section>\n");
      out.write("<div class=\"book\">\n");
      out.write("<form method=\"post\">\n");
      out.write("  \n");
      out.write("  <hr>\n");
      out.write("  <div class=\"elem-group inlined\">\n");
      out.write("    <label class=\"bm\" >Make Booking</label>\n");
      out.write("    \n");
      out.write("  </div>\n");
      out.write("  <div class=\"elem-group inlined\">\n");
      out.write("    <label class=\"fm\" for=\"guest\">No. of Guests</label>\n");
      out.write("    <input type=\"text\" id=\"guest\" name=\"total_guest\" placeholder=\"50\"  required>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"elem-group inlined\">\n");
      out.write("    <label class=\"fm\" for=\"checkin-date\">Event Starting Date</label>\n");
      out.write("    <input type=\"text\" id=\"checkin-date\" name=\"checkin\" required>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"elem-group inlined\">\n");
      out.write("    <label class=\"fm\" for=\"checkout-date\">Event Ending Date</label>\n");
      out.write("    <input type=\"text\" id=\"checkout-date\" name=\"checkout\" required>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"elem-group\">\n");
      out.write("    <label class=\"fm\" for=\"venue-selection\">Select Venue Preference</label>\n");
      out.write("    <select id=\"venue-selection\" name=\"venue_preference\" required>\n");
      out.write("        <option value=\"\">Choose a venue from the List</option>\n");
      out.write("        <option value=\"hall_1\">Hall 1</option>\n");
      out.write("        <option value=\"hall_2\">Hall 2</option>\n");
      out.write("        <option value=\"hall_3\">Hall 3</option>\n");
      out.write("\t<option value=\"pool_side\">Pool Side</option>\n");
      out.write("\t<option value=\"terrace\">Terrace</option>\n");
      out.write("\t<option value=\"garden_area\">Garden Area</option>\t\n");
      out.write("    </select>\n");
      out.write("  </div>\n");
      out.write("  <button type=\"submit\" name=\"Check_Availability\" value=\"Check_Availability\">Check Availability</button>\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("</div>\n");
      out.write("</section>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
   
	String sd = request.getParameter("checkin");
	String ed= request.getParameter("checkout");
       String g= request.getParameter("total_guest");
        String v= request.getParameter("venue_preference");
	String button=request.getParameter("Check_Availability");
        try
	{
	Class.forName("org.apache.derby.jdbc.ClientDriver");
	Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/new","user1","user1");
        if(button.equals("Check_Availability"))
        {
     /*  try{
		 PreparedStatement ps=conn.prepareStatement("select * from tt2 where venue='"+v+"'");
           ResultSet rs=ps.executeQuery();
           while(rs.next()){
               Date indt=rs.getDate("date_to");
               Date outdt=rs.getDate("date_from");
                int guest_no=rs.getInt("no_of_guest");
                String venue_loc=rs.getString("venue");
            if((sd.after(indt)||sd.equals(indt))&&(ed.before(outdt)||ed.equals(outdt))){
                
              out.print("<script>alert('Venue is not available on the selectes dates')</script>");
           }
 
           }
            }
           catch(Exception e){
           System.out.println(e.toString()); 
       }
       return flag;
   }*/
            session.setAttribute("startdate",sd);
            session.setAttribute("enddate",ed);
            session.setAttribute("guest",g);
            session.setAttribute("venue",v);
            if(v!="" && g!="" && sd!="" && ed!="")
		{
        	/*PreparedStatement ps=conn.prepareStatement("insert into tt1 values(?,?,?,?)");
                ps.setString(1,sd);
                ps.setString(2, ed);
                ps.setString(3,g);
                ps.setString(4,v);
        	int i=ps.executeUpdate();
        
         	 if(i>0)
          	{
                   out.print("<script>alert('record insert successfully')</script>");
                  
                }*/
                    response.sendRedirect("details.jsp");
                 }
                
                else
                {
                    out.print("<script>alert('Please Enter the details')</script>");
                    conn.close();
                }
        } 
         response.sendRedirect("details.jsp");
        conn.close();
        }catch(Exception se)
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
