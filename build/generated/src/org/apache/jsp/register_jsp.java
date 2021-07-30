package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>  \n");
      out.write("<html>  \n");
      out.write("<head>  \n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">  \n");
      out.write("<style>  \n");
      out.write("body{  \n");
      out.write("  font-family: Calibri, Helvetica, sans-serif;  \n");
      out.write("  background: url(img/678.jpg);  \n");
      out.write("    background-size: cover;\n");
      out.write("    background-position: center;\n");
      out.write("}  \n");
      out.write(".container {  \n");
      out.write("    padding: 50px;  \n");
      out.write("    \n");
      out.write(" \n");
      out.write("}  \n");
      out.write("  \n");
      out.write("input[type=text], input[type=password], textarea {  \n");
      out.write("  width: 20%;  \n");
      out.write("  padding: 15px;  \n");
      out.write("  margin: 5px 0 20px 0;  \n");
      out.write("  display: inline-block;  \n");
      out.write("  border: 5px;  \n");
      out.write("  background: none; \n");
      out.write("  background-position:center; \n");
      out.write("  \n");
      out.write("}  \n");
      out.write("input[type=text]:focus, input[type=password]:focus {  \n");
      out.write("  background-color: none;  \n");
      out.write("  outline: 1px solid #f1f1f1;  \n");
      out.write("}  \n");
      out.write(" div {  \n");
      out.write("            padding: 10px 0;  \n");
      out.write("         }  \n");
      out.write("hr {  \n");
      out.write("  border: 1px solid #f1f1f1;  \n");
      out.write("  margin-bottom: 25px;  \n");
      out.write("}  \n");
      out.write(".registerbtn {  \n");
      out.write("  background-color: #FF0000;  \n");
      out.write("  color: white;  \n");
      out.write("  padding: 16px 20px;  \n");
      out.write("  margin: 8px 0;  \n");
      out.write("  border: none;  \n");
      out.write("  cursor: pointer;  \n");
      out.write("  width: 30%;  \n");
      out.write("  opacity: 0.9;  \n");
      out.write("}  \n");
      out.write(".registerbtn:hover {  \n");
      out.write("  opacity: 1;  \n");
      out.write("}\n");
      out.write("</style>  \n");
      out.write("</head>  \n");
      out.write("<body>  \n");
      out.write("    <form>  \n");
      out.write("  <div class=\"container\">  \n");
      out.write("  <center>  <h1>REGISTER TO SHIMMERNSHINE</h1> </center>  \n");
      out.write("  <hr>  \n");
      out.write("<label><strong> USERNAME* : </strong></label>   \n");
      out.write("<input type=\"text\" name=\"user_id\" placeholder= \"Enter username\" required />\n");
      out.write("</br> \n");
      out.write("  <label><strong> NAME* : </strong></label>   \n");
      out.write("<input type=\"text\" name=\"firstname\" placeholder= \"Firstname\" required />\n");
      out.write("<!--</br>-->   \n");
      out.write("<!--<label><strong> MIDDLENAME:</strong></label>-->  \n");
      out.write("<input type=\"text\" name=\"middlename\" placeholder=\"Middlename\" /> \n");
      out.write("<!--</br>-->\n");
      out.write("<!--<label><strong> LASTNAME:  </strong></label>-->    \n");
      out.write("<input type=\"text\" name=\"lastname\" placeholder=\"Lastname\" />\n");
      out.write("</br>   \n");
      out.write("<div>  \n");
      out.write("<label>   \n");
      out.write("<strong>GENDER* :   </strong> \n");
      out.write("</label>\n");
      out.write("<input type=\"radio\" value=\"Male\" name=\"gender\"> Male   \n");
      out.write("<input type=\"radio\" value=\"Female\" name=\"gender\"> Female   \n");
      out.write("<input type=\"radio\" value=\"Other\" name=\"gender\"> Other  \n");
      out.write("</br> \n");
      out.write("</div>  \n");
      out.write("<label>   \n");
      out.write("<strong>PHONE* :     </strong>\n");
      out.write("</label>  \n");
      out.write("<input type=\"text\" name=\"country_code\" placeholder=\"Country Code\"  value=\"+91\"/>   \n");
      out.write("<input type=\"text\" name=\"phone\" placeholder=\"phone no.\"  />\n");
      out.write("</br>  \n");
      out.write("<strong>CURRENT ADDRESS:</strong>\n");
      out.write("<!--</br>-->\n");
      out.write("<input type=\"text\" name=\"address\" placeholder=\"Current Address\" required/>\n");
      out.write("<!--<textarea cols=\"80\" rows=\"5\" name=\"address\" placeholder=\"Current Address\" value=\"address\" required>  \n");
      out.write("</textarea> -->\n");
      out.write("</br> \n");
      out.write(" <label for=\"email\"><b>EMAIL ID* :    </b></label>  \n");
      out.write(" <input type=\"text\" placeholder=\"Enter Email\" name=\"email\" required>  \n");
      out.write("  </br>\n");
      out.write("    <label for=\"psw\"><b>PASSWORD* :  </b></label>  \n");
      out.write("    <input type=\"password\" placeholder=\"Enter Password\" name=\"psw\" id=\"psw\" minlength=\"4\" required>  \n");
      out.write("  <!--</br>-->\n");
      out.write("    <!--<label for=\"psw-repeat\"><b>RE-TYPE PASSWORD</b> </label>-->  \n");
      out.write("    <input type=\"password\" placeholder=\"Retype Password\" name=\"psw-repeat\" id=\"psw-repeat\" required> \n");
      out.write("</br>\n");
      out.write("<button type=\"SUBMIT\" name=\"register\" value=\"register\" class=\"registerbtn\">Register</button>    \n");
      out.write("</form> \n");
      out.write("</body>  \n");
      out.write("</html>    \n");
      
	String id = request.getParameter("user_id");
	String fn = request.getParameter("firstname");
	String mn = request.getParameter("middlename");
	String ln = request.getParameter("lastname");
	String gen = request.getParameter("gender");
	String phn1 = request.getParameter("country_code");
        String phn2 = request.getParameter("phone");
        String add = request.getParameter("address");
	String em = request.getParameter("email");
	String pass = request.getParameter("psw");
        String pass2= request.getParameter("psw-repeat");
	String button=request.getParameter("register");
        try
	{
	Class.forName("org.apache.derby.jdbc.ClientDriver");
	Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/new","user1","user1");
        if(button.equals("register"))
        {
            if(id!="" && pass!="")
            {
        	PreparedStatement ps=conn.prepareStatement("insert into reg1 values(?,?,?,?,?,?,?,?,?,?)");
        	ps.setString(1, id);
        	ps.setString(2, fn);
  
                ps.setString(3, mn);
                ps.setString(4, ln);
                ps.setString(5, gen);
                ps.setString(6, phn1);
                ps.setString(7, phn2);
                ps.setString(8, add);
                ps.setString(9, em);
                ps.setString(10, pass);
             
                
      
       
        	int i=ps.executeUpdate();
        
         	if(i>0)
          	{
                    out.print("<script>alert('record insert successfully')</script>");
                    response.sendRedirect("navbar.html");
                    
                }
            }
                
            else
            {
                out.print("<script>alert('Please Enter the id. and Name')</script>");
                    
                
            }
                
            conn.close();
                
        }
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
