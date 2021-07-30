package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <title>Welcome Admin!</title>\n");
      out.write("        <!--<link rel=\"stylesheet\" href=\"style.css\">-->\n");
      out.write("       \n");
      out.write("        <style>\n");
      out.write("            \n");
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
      out.write("  \n");
      out.write("  /* Change the color of links on hover */\n");
      out.write("  .navbar a:hover {\n");
      out.write("    background:none;\n");
      out.write("    color: red;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  /* Right-aligned section inside the top navigation */\n");
      out.write(".navbar .topnav-right {\n");
      out.write("    float: right;\n");
      out.write("    \n");
      out.write("  }\n");
      out.write("\n");
      out.write("  /*Table*/\n");
      out.write("  \n");
      out.write("\n");
      out.write("\n");
      out.write("/*logout*/\n");
      out.write(".feedback .table2 {\n");
      out.write("  /*border-collapse: collapse;*/\n");
      out.write("  border-spacing: 0;\n");
      out.write("  width: 50%;\n");
      out.write("  border: 6px double black;\n");
      out.write("  align-content: centre;\n");
      out.write("  \n");
      out.write("}\n");
      out.write(".feedback .table2 { margin: 30px auto; }\n");
      out.write(".feedback .table2 th,td {\n");
      out.write("        border: 1px solid blue;\n");
      out.write("      }\n");
      out.write("      td {\n");
      out.write("        height: 30px;\n");
      out.write("        width: 400px;\n");
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
      out.write("  \n");
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
      out.write("  \n");
      out.write("   </style>\n");
      out.write("</head>\n");
      out.write("<body >\n");
      out.write("\n");
      out.write("    <!-- The navbar-->\n");
      out.write("  <nav class=\"navbar\" style=\"background-color: black;\">\n");
      out.write("\n");
      out.write("    <div class=\"logo\"><a href=\"#\">ShimmerNShine</a></div>\n");
      out.write("  \n");
      out.write("  <div class=\"topnav-right\">\n");
      out.write("     <a href=\"#feedback\">Feedback</a>\n");
      out.write("      <a href=\"#query\">Query</a>\n");
      out.write("    <a href=\"#booking\">Booking Status</a>\n");
      out.write("    \n");
      out.write("    <a href=\"index.jsp\">Logout</a>\n");
      out.write("  </div>\n");
      out.write("      \n");
      out.write("</nav>\n");
      out.write("<!-- Table-->\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Feedback-->\n");
      out.write("<section class=\"feedback\" id=\"feedback\">\n");
      out.write("  <h5 style=\"margin-top: 60px; font-family:cursive; color: Pink; text-align: center; font-size: 30px;\">Reviews given by our customer</h5>\n");
      out.write("  <table class= table2 >\n");
      out.write("    <div class=c2>\n");
      out.write("    <tr style=\"background-color: khaki; color: dodgerblue;\" >\n");
      out.write("      <th>Name</th>\n");
      out.write("      <th>Rating</th>\n");
      out.write("      <th>Review</th>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td>Mahima</td>\n");
      out.write("      <td>4</td>\n");
      out.write("      <td>it was very good, i fully enjoyed the services offered by shimmerNshine.\n");
      out.write("\n");
      out.write("      </td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td>Muskan</td>\n");
      out.write("      <td>5</td>\n");
      out.write("      <td>I want to thank ShimmernShine for making my wedding so memorable eveny of my life.</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td>Neeti</td>\n");
      out.write("        <td>3</td>\n");
      out.write("        <td>The services were very good. It helped in saving a lot time.</td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td>Radhika</td>\n");
      out.write("        <td>5</td>\n");
      out.write("        <td>The kind of professionalism they show is commendable.</td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td>Divya</td>\n");
      out.write("        <td>3</td>\n");
      out.write("        <td>Happy to be a part of Shimmer family.</td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td>Kapish</td>\n");
      out.write("        <td>3</td>\n");
      out.write("        <td>They did our wedding preparations, I think they'll do our silver jubilee anniversary as well.</td>\n");
      out.write("      </tr>\n");
      out.write("     \n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("    </table>\n");
      out.write("\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("\n");
      out.write("$(document).ready(function () {\n");
      out.write("$('#table1').DataTable({\n");
      out.write("\"scrollX\": true,\n");
      out.write("\"scrollY\": 200,\n");
      out.write("});\n");
      out.write("$('.dataTables_length').addClass('bs-select');\n");
      out.write("});\n");
      out.write("</script>\n");
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
