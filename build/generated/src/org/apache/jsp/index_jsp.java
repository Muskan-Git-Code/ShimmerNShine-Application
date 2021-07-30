package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html;\">\n");
      out.write("      <meta name=\"viewport\" content=\"width=device-width\">\n");
      out.write("      <title>ShimmerNShine</title>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("    \n");
      out.write("      <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\" integrity=\"sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z\" crossorigin=\"anonymous\">\n");
      out.write("       <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("        <!-- Compiled and minified CSS -->\n");
      out.write("      <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/0.98.2/css/materialize.min.css\">\n");
      out.write("      <script src=\"https://code.jquery.com/jquery-3.0.0.js\"></script>\n");
      out.write("      <!-- Compiled and minified JavaScript -->\n");
      out.write("      <script src=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/0.98.2/js/materialize.min.js\"></script>\n");
      out.write("        \n");
      out.write("      <link rel=\"stylesheet\" href=\"animate.css\">\n");
      out.write("\n");
      out.write("      <script src=\"wow.min.js\"></script>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("      <style>\n");
      out.write("/* navbar styling */\n");
      out.write(".navbar1{\n");
      out.write("    position: fixed;\n");
      out.write("    width: 100%;\n");
      out.write("    z-index: 999;\n");
      out.write("    padding: 5px 0;\n");
      out.write("    opacity: 20%;\n");
      out.write("   \n");
      out.write("    font-family: 'Ubuntu', sans-serif;\n");
      out.write("    transition: all 0.3s ease;\n");
      out.write("    \n");
      out.write("}\n");
      out.write("\n");
      out.write(".navbar1 .max-width{\n");
      out.write("    display: flex;\n");
      out.write("    align-items: center;\n");
      out.write("    justify-content: space-between;\n");
      out.write("}\n");
      out.write(".navbar1 .logo a{\n");
      out.write("    color: #fff;\n");
      out.write("    font-size: 35px;\n");
      out.write("    font-weight: 600;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write(".navbar1 .menu1 li{\n");
      out.write("    list-style: none;\n");
      out.write("    display: inline-block;\n");
      out.write("}\n");
      out.write(".navbar1 .menu1 li a{\n");
      out.write("    display: block;\n");
      out.write("    color: #fff;\n");
      out.write("    font-size: 18px;\n");
      out.write("    font-weight: 500;\n");
      out.write("    margin-left: 25px;\n");
      out.write("    transition: color 0.3s ease;\n");
      out.write("}\n");
      out.write(".navbar1 .menu1 li a:hover{\n");
      out.write("    color: crimson;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("/* menu btn styling */\n");
      out.write(".menu-btn1{\n");
      out.write("    color: #fff;\n");
      out.write("    font-size: 23px;\n");
      out.write("    cursor: pointer;\n");
      out.write("    display: none;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("<!--         The button for scrolling up to the home. Hidden initially \n");
      out.write("     <div class=\"scroll-up-btn\"><i class=\"fas fa-angle-up\"></i></div> \n");
      out.write("\n");
      out.write("  <nav class=\"navbar sticky-top navbar-expand-lg navbar-dark bg-dark\" style=\"opacity: 40%; background-color: blueviolet\">\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" style=\"opacity: 40%; background-color: blueviolet\" data-target=\"#navbarTogglerDemo01\" aria-controls=\"navbarTogglerDemo01\" aria-expanded=\"false\" aria-label=\"Toggle navigation\"> <span class=\"navbar-toggler-icon\"></span> </button>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarTogglerDemo01\" style=\"opacity: 20%\">\n");
      out.write("      <ul class=\"navbar-nav mr-auto mt-2 mt-lg-0 pl-3\" style=\"opacity: 40%;\">\n");
      out.write("        <li class=\"nav-item active\"> <a style=\"opacity: 40%;\" class=\"nav-link\" href=\"#home\"><img src=\"img/logo.png\" class=\"img-fluid pl-5\"> <span class=\"sr-only\">(current)</span></a></li>\n");
      out.write("        <li class=\"nav-item active pl-2\"> <a style=\"opacity: 40%;\"  class=\"nav-link\" href=\"#home\">ShimmerNShine</a></li>\n");
      out.write("        <li class=\"nav-item pl-5\"> <a style=\"opacity: 40%;\" class=\"nav-link\" href=\"#about\">About</a></li>\n");
      out.write("        <li class=\"nav-item pl-5\"> <a style=\"opacity: 40%;\" class=\"nav-link\" href=\"#services\">Services</a></li>\n");
      out.write("        <li class=\"nav-item pl-5\"> <a style=\"opacity: 40%;\" class=\"nav-link\" href=\"#gallery\">Gallery</a></li>\n");
      out.write("        <li class=\"nav-item pl-5\"> <a style=\"opacity: 40%\" class=\"nav-link\" href=\"#teams\">Team</a></li>\n");
      out.write("        <li class=\"nav-item pl-5\"> <a style=\"opacity: 40%;\" class=\"nav-link\" href=\"#contact\">Contact</a></li>\n");
      out.write("        <li class=\"nav-item pl-5\"> <a style=\"opacity: 40%;\" class=\"nav-link\" href=\"login.jsp\">Login</a></li>\n");
      out.write("      </ul>      \n");
      out.write("    </div>\n");
      out.write("  </nav> -->\n");
      out.write("\n");
      out.write("\n");
      out.write("<nav class=\"navbar1\"  py-10  style=\"background-color: rgba(100, 100, 100, 0.5); opacity: 30%;\">\n");
      out.write("        <div class=\"max-width\">\n");
      out.write("          <div class=\"logo\"><a href=\"#home\"><img src=\"img/logo.png\" class=\"img-fluid\" width=\"50px\" height=\"50px\">ShimmerNShine</a></div>\n");
      out.write("            <ul class=\"menu1\">\n");
      out.write("              <li><a href=\"#home\" class=\"menu-btn\">Home</a></li>\n");
      out.write("                <li><a href=\"#about\" class=\"menu-btn\">About</a></li>\n");
      out.write("                <li><a href=\"#services\" class=\"menu-btn\">Services</a></li>\n");
      out.write("                <li><a href=\"#gallery\" class=\"menu-btn\">Gallery</a></li>\n");
      out.write("                <li><a href=\"#teams\" class=\"menu-btn\">Team</a></li>\n");
      out.write("                <li><a href=\"#contact\" class=\"menu-btn\">Contact</a></li>\n");
      out.write("                <li><a href=\"login.jsp\" class=\"menu-btn\">Login</a></li>\n");
      out.write("            </ul>\n");
      out.write("            <div class=\"menu-btn1\">\n");
      out.write("                <i class=\"fas fa-bars\"></i>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("<!--<nav class=\"navbar11\"  py-10  style=\"background-color: black;\">\n");
      out.write("      <div class=\"max-width11\">\n");
      out.write("        <div class=\"logo11\"><a href=\"#home\"><img src=\"img/logo.png\" class=\"img-fluid\" width=\"50px\" height=\"50px\">ShimmerNShine</a></div>\n");
      out.write("          <ul class=\"menu11\">\n");
      out.write("            <li><a href=\"#home\" class=\"menu-btn11\">Home</a></li>\n");
      out.write("              <li><a href=\"#about\" class=\"menu-btn11\">About</a></li>\n");
      out.write("              <li><a href=\"#services\" class=\"menu-btn11\">Services</a></li>\n");
      out.write("              <li><a href=\"#gallery\" class=\"menu-btn11\">Gallery</a></li>\n");
      out.write("              <li><a href=\"#teams\" class=\"menu-btn11\">Team</a></li>\n");
      out.write("              <li><a href=\"#contact\" class=\"menu-btn11\">Contact</a></li>\n");
      out.write("              <li><a href=\"#login\" class=\"menu-btn11\">Login</a></li>\n");
      out.write("          </ul>\n");
      out.write("          <div class=\"menu-btn11\">\n");
      out.write("              <i class=\"fas fa-bars\"></i>\n");
      out.write("          </div>\n");
      out.write("      </div>\n");
      out.write("  </nav>-->\n");
      out.write("\n");
      out.write("  \n");
      out.write("  <!-- home section start -->\n");
      out.write("  <section class=\"home\" id=\"home\">\n");
      out.write("    <div class=\"max-width\">\n");
      out.write("        <div class=\"home-content\">\n");
      out.write("            <div class=\"text-1\">Making your dream event</div>\n");
      out.write("            <div class=\"text-3\">Memorable Weddings, Glitzy Parties, Scenic Photoshoot</div>\n");
      out.write("            \n");
      out.write("            <div class=\"text-2\">\"Be part of the bigger picture\"</div>\n");
      out.write("            <a href=\"login.jsp\" class=\"wow tada\">Book Now</a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</section> \n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- about section start -->\n");
      out.write(" <section class=\"about \" id=\"about\">\n");
      out.write("  </div> -->\n");
      out.write("  <div class=\"max-width\">\n");
      out.write("      <h2 class=\"title wow bounceIn\">About Us</h2>\n");
      out.write("      <div class=\"about-content\">\n");
      out.write("          <div class=\"column left wow slideInLeft\">\n");
      out.write("              <img src=\"img/i9.jpg\" alt=\"\">\n");
      out.write("          </div>\n");
      out.write("          <div class=\"column right wow slideInRight\">\n");
      out.write("              <div class=\"text\">The biggest adventure you can take is to live the life of your Dreams<span class=\"typing-2\"></span></div>\n");
      out.write("              <p style=\"font-size: 20px;\">ShimmerNShine is an application that eases the exhausting and tiresome process of planning huge gatherings. Whether it is a wedding or a birthday bash, we cover it all. We believe that technology can solve the gravest problems in the easiest way, and we are committed to alleviate your troubles through it. Our team can help organise a wide range of functions for Birthday, Christmas, Weddings, Anniversaries, Functions, Parties and many more.\n");
      out.write("            </p>\n");
      out.write("          </div>\n");
      out.write("      </div>\n");
      out.write("  </div>\n");
      out.write("</section> \n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- services section start -->\n");
      out.write(" <section class=\"services\" id=\"services\">\n");
      out.write("  <div class=\"max-width\">\n");
      out.write("    <h2 class=\"title wow bounceIn\">Services</h2>\n");
      out.write("    <div class=\"services-content wow slideInLeft\">\n");
      out.write("      <div class=\"box-set\">\n");
      out.write("        <figure class=\"box\"> <span style=\"color: transparent;  text-shadow: 0 0 0 blue; \">&#9830;</span>WEDDING PLANNING<br>\n");
      out.write("          We do complete event planning including event flow, venue, guest reception, decoration, catering, bridal make-up, photography and many more.\n");
      out.write("        </figure>\n");
      out.write("        <figure class=\"box\"><span style=\"color: transparent;  text-shadow: 0 0 0 blue; \">&#9830;</span>VENUE BOOKING<br>\n");
      out.write("          We manage to choose the right venue to excite people to attend an event. \n");
      out.write("        </figure>\n");
      out.write("        <figure class=\"box\"><span style=\"color: transparent;  text-shadow: 0 0 0 blue; \">&#9830;</span>DECORATION<br>\n");
      out.write("          These type of events are one of the most special moments in your life. We use an fantastic and stunning venue with modern and traditional ideas.\n");
      out.write("        </figure>                \n");
      out.write("                \n");
      out.write("                <figure class=\"box\"><span style=\"color: transparent;  text-shadow: 0 0 0 blue; \">&#9830;</span>CATERING<br>\n");
      out.write("                  A great event relies on great food. We caterer to all kind of special occasions with good quality of hygienic food, service at an affordable budget.\n");
      out.write("                </figure>\n");
      out.write("                <figure class=\"box\"><span style=\"color: transparent;  text-shadow: 0 0 0 blue; \">&#9830;</span>BIRTHDAY PARTY<br>\n");
      out.write("                  Everyone wants to celebrate their birthday party in a grand manner, and we plan every detail of your birthday party with great care.\n");
      out.write("                  </figure>\n");
      out.write("                    <figure class=\"box\"><span style=\"color: transparent;  text-shadow: 0 0 0 blue; \">&#9830;</span>WEDDING ANNIVERSARY<br>\n");
      out.write("                      Wedding anniversary celebrate an important milestones in a couple’s life together. We Provide an excellent colorful and memorable event to you.\n");
      out.write("                    </figure>\n");
      out.write("                    \n");
      out.write("                    <figure class=\"box\"><span style=\"color: transparent;  text-shadow: 0 0 0 blue; \">&#9830;</span>PHOTOSHOOT<br>\n");
      out.write("                    The most important part of any function, so that you can relive your memories, we provide: Normal, Delux and Royal types of photoshoots. \n");
      out.write("                    </figure>\n");
      out.write("                    <figure class=\"box\"><span style=\"color: transparent;  text-shadow: 0 0 0 blue; \">&#9830;</span>ENTERTAINMENT<br>\n");
      out.write("                    Without entertainment you may feel bored, but no worrries we are here with: Music, Dancers, Stage, Speakers, Magic shows and many more. \n");
      out.write("                </figure>\n");
      out.write("                    <figure class=\"box\"><span style=\"color: transparent;  text-shadow: 0 0 0 blue; \">&#9830;</span>BRIADAL MAKEOVER<br>\n");
      out.write("                      Bridal makeup is an essential part of the wedding planning process. We focus, to make every bride look like ultra natural with a touch of elegance.\n");
      out.write("                    </figure>\n");
      out.write("                    <figure class=\"box\"><span style=\"color: transparent;  text-shadow: 0 0 0 rgb(42, 170, 82); \">&#9899;</span>\n");
      out.write("                  <span style=\"color: transparent;  text-shadow: 0 0 0 blue; \">&#9830;</span>\n");
      out.write("                  <span style=\"color: transparent;  text-shadow: 0 0 0 blue; \">&#9830;</span>\n");
      out.write("                  <span style=\"color: transparent;  text-shadow: 0 0 0 rgb(42, 170, 82); \">&#9899;</span>\n");
      out.write("                  </figure>\n");
      out.write("                    <figure class=\"box\"><span style=\"color: transparent;  text-shadow: 0 0 0 rgb(42, 170, 82); \">&#9899;</span>\n");
      out.write("                  <span style=\"color: transparent;  text-shadow: 0 0 0 blue; \">&#9830;</span>\n");
      out.write("                  <span style=\"color: transparent;  text-shadow: 0 0 0 blue; \">&#9830;</span>\n");
      out.write("                  \n");
      out.write("                  <span style=\"color: transparent;  text-shadow: 0 0 0 rgb(42, 170, 82); \">&#9899;</span>\n");
      out.write("                </figure>\n");
      out.write("                  <figure class=\"box\"><span style=\"color: transparent;  text-shadow: 0 0 0 rgb(42, 170, 82); \">&#9899;</span>\n");
      out.write("                <span style=\"color: transparent;  text-shadow: 0 0 0 blue; \">&#9830;</span>\n");
      out.write("                <span style=\"color: transparent;  text-shadow: 0 0 0 blue; \">&#9830;</span>\n");
      out.write("                \n");
      out.write("                <span style=\"color: transparent;  text-shadow: 0 0 0 rgb(42, 170, 82); \">&#9899;</span>\n");
      out.write("                </figure>\n");
      out.write("                </div>\n");
      out.write("        </div>\n");
      out.write("</section> \n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- gallery section start -->\n");
      out.write(" <section class=\"g2\" id=\"gallery\">\n");
      out.write("    <h2 class=\"title wow bounceIn\">Gallery</h2>\n");
      out.write("    <div class=\"carousel m2\">\n");
      out.write("      \n");
      out.write("      <div class=\"carousel-item\"> <img src=\"img/q10.jpg\"></div>\n");
      out.write("      <div class=\"carousel-item\"> <img src=\"img/t.jpg\"></div>\n");
      out.write("      <div class=\"carousel-item\"> <img src=\"img/q6.jpg\"></div>\n");
      out.write("      <div class=\"carousel-item\"> <img src=\"img/w.jpg\"></div>\n");
      out.write("      <div class=\"carousel-item\"> <img src=\"img/q8.jpg\"></div>\n");
      out.write("      <div class=\"carousel-item\"><img src=\"img/q9.jpg\"></div>\n");
      out.write("      <div class=\"carousel-item\"><img src=\"img/a.jpg\">  </div>\n");
      out.write("      <div class=\"carousel-item\"> <img src=\"img/b.jpg\">  </div>\n");
      out.write("      <div class=\"carousel-item\"> <img src=\"img/g.jpg\"></div>\n");
      out.write("      <div class=\"carousel-item\"> <img src=\"img/h.jpg\"></div>\n");
      out.write("      <div class=\"carousel-item\"> <img src=\"img/i4.jpg\"></div>\n");
      out.write("      <div class=\"carousel-item\"> <img src=\"img/i5.png\"></div>\n");
      out.write("      <div class=\"carousel-item\"> <img src=\"img/i6.png\"></div>\n");
      out.write("      <div class=\"carousel-item\"> <img src=\"img/i7.jpg\"></div>\n");
      out.write("      <div class=\"carousel-item\"> <img src=\"img/i11.jpg\"></div>\n");
      out.write("      <div class=\"carousel-item\"> <img src=\"img/i12.jpg\"></div>\n");
      out.write("      <div class=\"carousel-item\"> <img src=\"img/i13.jpg\"></div>\n");
      out.write("      <div class=\"carousel-item\"> <img src=\"img/i14.jpg\"></div>\n");
      out.write("      <div class=\"carousel-item\"> <img src=\"img/i15.jpg\"></div>\n");
      out.write("      <div class=\"carousel-item\"> <img src=\"img/i17.jpg\"></div>\n");
      out.write("      <div class=\"carousel-item\"> <img src=\"img/i18.jpg\"></div>\n");
      out.write("      <div class=\"carousel-item\"> <img src=\"img/i19.webp\"></div>\n");
      out.write("      <div class=\"carousel-item\"> <img src=\"img/i16.jfif\"></div>\n");
      out.write("      <div class=\"carousel-item\"> <img src=\"img/i20.jpg\"></div>\n");
      out.write("      <div class=\"carousel-item\"> <img src=\"img/i21.jpg\"></div>\n");
      out.write("      <div class=\"carousel-item\"> <img src=\"img/i22.jpg\"></div>\n");
      out.write("      <div class=\"carousel-item\"> <img src=\"img/i23.jpeg\"></div>\n");
      out.write("      <div class=\"carousel-item\"> <img src=\"img/k.jpg\"></div>\n");
      out.write("      <div class=\"carousel-item\"> <img src=\"img/q7.jpg\"></div>\n");
      out.write("      <div class=\"carousel-item\"> <img src=\"img/q1.jpg\"></div>\n");
      out.write("      <div class=\"carousel-item\"> <img src=\"img/q2.jpg\"></div>\n");
      out.write("      <div class=\"carousel-item\"> <img src=\"img/q3.jpg\"></div>\n");
      out.write("      <div class=\"carousel-item\"> <img src=\"img/q4.jpg\"></div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("  </section> \n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- teams section start -->\n");
      out.write("<section class=\"about\" id=\"teams\" style=\"background: url('img/234.png') no-repeat; background-size: cover; background-attachment: fixed;\">\n");
      out.write("      <h2 class=\"title wow bounceIn\">Our Team</h2>\n");
      out.write("      \n");
      out.write("      <div class=\"card-deck wow fadeInUpBig\" style=\"padding: 30px; \">\n");
      out.write("        <div class=\"card zoomin frame shadow p-3 mb-5 rounded\" style=\"border: none; background-color:linen\">\n");
      out.write("          <img src=\"img/mahi.jpg\" class=\"card-img-top rounded-circle \" alt=\"...\" >\n");
      out.write("          <div class=\"card-body\"><center>\n");
      out.write("            <h5 class=\"card-title\">MAHIMA SHARMA</h5>\n");
      out.write("            <p class=\"card-text\">Student ID: BTBTC18254</p></center>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"card zoomin frame shadow p-3 mb-5 rounded\" style=\"border: none; background-color:linen\">\n");
      out.write("          <img src=\"img/me.jpg\" class=\"card-img-top rounded-circle\" alt=\"...\">\n");
      out.write("          <div class=\"card-body\"><center>\n");
      out.write("            <h5 class=\"card-title\">MUSKAN</h5>\n");
      out.write("            <p class=\"card-text\">Student ID: BTBTC18179</p></center>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"card zoomin frame shadow p-3 mb-5 rounded\" style=\"border: none; background-color:linen\">\n");
      out.write("          <img src=\"img/saxena.jpg\" class=\"card-img-top rounded-circle\" alt=\"...\">\n");
      out.write("          <div class=\"card-body\"><center>\n");
      out.write("            <h5 class=\"card-title\">MUSKAN SAXENA</h5>\n");
      out.write("            <p class=\"card-text\">Student ID: BTBTC18208</p>\n");
      out.write("          </center></div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"card zoomin frame shadow p-3 mb-5 rounded\" style=\"border: none; background-color:linen\">\n");
      out.write("          <img src=\"img/neeti.jpg\" class=\"card-img-top rounded-circle\" alt=\"...\">\n");
      out.write("          <div class=\"card-body\"><center>\n");
      out.write("            <h5 class=\"card-title\">NEETI PANDEY</h5>\n");
      out.write("            <p class=\"card-text\">Student ID: BTBTC18119</p></center>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("      </div>\n");
      out.write("  </div>\n");
      out.write("</section> \n");
      out.write("\n");
      out.write("\n");
      out.write("      <!-- Contact Section start -->\n");
      out.write("<!--       <section class=\"contact1 wow fadeInDownBig\" id=\"contact\">\n");
      out.write("            <div class=\"contact-content1\">\n");
      out.write("                <h2 class=\"wow bounceIn\">Request a quote?</h2>\n");
      out.write("                <h5 style=\" padding: 40px 0;\">Please leave your contact info, and we will get back to you. Thanks!</h5>\n");
      out.write("                \n");
      out.write("                <div class=\"d-flex justify-content-around\"> \n");
      out.write("                    <input type=\"name\" id=\"name\" class=\"form-control\" placeholder=\"Name\" style=\"width: 200px; background: none;\" required>      \n");
      out.write("                    <input type=\"email\" id=\"email\" class=\"form-control\" placeholder=\"Email\" style=\"width: 200px; background: none;\" required>            \n");
      out.write("                    <a href=\"#\" class=\"wow tada\">Submit</a>\n");
      out.write("                </div>\n");
      out.write("          \n");
      out.write("            </div>\n");
      out.write("    </section>   -->\n");
      out.write("\n");
      out.write("      \n");
      out.write("      <section class=\"contact1 wow fadeInDownBig\" id=\"contact\">\n");
      out.write("            <div class=\"contact-content1\">\n");
      out.write("                <h2 class=\"wow bounceIn\">Request a quote?</h2>\n");
      out.write("                <h5 style=\" padding: 40px 0;\">Please leave your contact info, and we will get back to you. Thanks!</h5>\n");
      out.write("                \n");
      out.write("                <form name='f'>\n");
      out.write("\t<table border='0' cellspacing='4' cellpadding='3' align='center'>\n");
      out.write("            <tr ><td ><input type='name' value='' name='txtrno' id='name' class='form-control' placeholder='Name' style='width: 400px; background: none;' required/></td>\n");
      out.write("\t<td ><input type='email' value='' name='txtname' id='email' class='form-control' placeholder='Email' style='width: 400px; background: none;' required/> </td>\n");
      out.write("        <td><input type ='submit' value='SUBMIT' name='btn' class='wow tada ur' style=\"display: inline-block;\n");
      out.write("    background: rgb(168, 71, 103);\n");
      out.write("    color: #fff;\n");
      out.write("    font-size: 15px;\n");
      out.write("    padding: 12px 36px;\n");
      out.write("    margin-top: 20px;\n");
      out.write("    font-weight: 400;\n");
      out.write("    border-radius: 6px;\n");
      out.write("    border: 2px solid palevioletred;\n");
      out.write("    transition: all 0.3s ease;\"/> </td></tr>\n");
      out.write("\t</table>\n");
      out.write("\t</form>\n");
      out.write("          \n");
      out.write("            </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <script>$(document).ready(function(){$('.carousel').carousel();});</script>\n");
      out.write("   <!-- Optional JavaScript -->\n");
      out.write("    <!-- jQuery first, then Popper.js, then Bootstrap JS -->\n");
      out.write("     <script>var wow = new WOW(\n");
      out.write("      {\n");
      out.write("        boxClass:     'wow',      // animated element css class (default is wow)\n");
      out.write("        animateClass: 'animated', // animation css class (default is animated)\n");
      out.write("        offset:       0,          // distance to the element when triggering the animation (default is 0)\n");
      out.write("        mobile:       true,       // trigger animations on mobile devices (default is true)\n");
      out.write("        live:         true,       // act on asynchronously loaded content (default is true)\n");
      out.write("        callback:     function(box) {\n");
      out.write("          // the callback is fired every time an animation is started\n");
      out.write("          // the argument that is passed in is the DOM node being animated\n");
      out.write("        },\n");
      out.write("        scrollContainer: null // optional scroll container selector, otherwise use window\n");
      out.write("      }\n");
      out.write("    );\n");
      out.write("    wow.init();</script>\n");
      out.write("    \n");
      out.write("    <!-- <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script> -->\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\" integrity=\"sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <!-- <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\" integrity=\"sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV\" crossorigin=\"anonymous\"></script>  -->\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
    
	String r = request.getParameter("txtrno");
	String n = request.getParameter("txtname");
	String button=request.getParameter("btn");
        
        try
	{
	Class.forName("org.apache.derby.jdbc.ClientDriver");
	Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/new","user1","user1");
         out.print("<script>alert('Welcome to ShimmerNShine')</script>");
        if(button.equals("SUBMIT"))
        {
		if(r!="" && n!="")
		{
        	PreparedStatement ps=conn.prepareStatement("insert into u1 values(?,?)");
        	ps.setString(1, r);
        	ps.setString(2, n);
       
        	int i=ps.executeUpdate();
        
         	 if(i>0)
          	{
                    out.print("<script>alert('Thank You!!   We will get back to you soon.')</script>");
                }
                 }
                
                else
                {
                    out.print("<script>alert('Please Enter the id. and Name')</script>");
                    conn.close();
                }
        } 
       
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
