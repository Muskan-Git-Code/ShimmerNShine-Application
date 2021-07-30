<%-- 
    Document   : index
    Created on : Apr 15, 2021, 10:30:35 AM
    Author     : DELL
--%>

<%@page import="java.sql.* " contentType="text/html"  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html;">
      <meta name="viewport" content="width=device-width">
      <title>ShimmerNShine</title>
      
      
    
      <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
       <link rel="stylesheet" href="style.css">
        <!-- Compiled and minified CSS -->
      <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.98.2/css/materialize.min.css">
      <script src="https://code.jquery.com/jquery-3.0.0.js"></script>
      <!-- Compiled and minified JavaScript -->
      <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.98.2/js/materialize.min.js"></script>
        
      <link rel="stylesheet" href="animate.css">

      <script src="wow.min.js"></script>
      
      
      <style>
/* navbar styling */
.navbar1{
    position: fixed;
    width: 100%;
    z-index: 999;
    padding: 5px 0;
    opacity: 20%;
   
    font-family: 'Ubuntu', sans-serif;
    transition: all 0.3s ease;
    
}

.navbar1 .max-width{
    display: flex;
    align-items: center;
    justify-content: space-between;
}
.navbar1 .logo a{
    color: #fff;
    font-size: 35px;
    font-weight: 600;

}

.navbar1 .menu1 li{
    list-style: none;
    display: inline-block;
}
.navbar1 .menu1 li a{
    display: block;
    color: #fff;
    font-size: 18px;
    font-weight: 500;
    margin-left: 25px;
    transition: color 0.3s ease;
}
.navbar1 .menu1 li a:hover{
    color: crimson;
}


/* menu btn styling */
.menu-btn1{
    color: #fff;
    font-size: 23px;
    cursor: pointer;
    display: none;
}
</style>
    </head>


    <body>
<!--         The button for scrolling up to the home. Hidden initially 
     <div class="scroll-up-btn"><i class="fas fa-angle-up"></i></div> 

  <nav class="navbar sticky-top navbar-expand-lg navbar-dark bg-dark" style="opacity: 40%; background-color: blueviolet">
    <button class="navbar-toggler" type="button" data-toggle="collapse" style="opacity: 40%; background-color: blueviolet" data-target="#navbarTogglerDemo01" aria-controls="navbarTogglerDemo01" aria-expanded="false" aria-label="Toggle navigation"> <span class="navbar-toggler-icon"></span> </button>
    <div class="collapse navbar-collapse" id="navbarTogglerDemo01" style="opacity: 20%">
      <ul class="navbar-nav mr-auto mt-2 mt-lg-0 pl-3" style="opacity: 40%;">
        <li class="nav-item active"> <a style="opacity: 40%;" class="nav-link" href="#home"><img src="img/logo.png" class="img-fluid pl-5"> <span class="sr-only">(current)</span></a></li>
        <li class="nav-item active pl-2"> <a style="opacity: 40%;"  class="nav-link" href="#home">ShimmerNShine</a></li>
        <li class="nav-item pl-5"> <a style="opacity: 40%;" class="nav-link" href="#about">About</a></li>
        <li class="nav-item pl-5"> <a style="opacity: 40%;" class="nav-link" href="#services">Services</a></li>
        <li class="nav-item pl-5"> <a style="opacity: 40%;" class="nav-link" href="#gallery">Gallery</a></li>
        <li class="nav-item pl-5"> <a style="opacity: 40%" class="nav-link" href="#teams">Team</a></li>
        <li class="nav-item pl-5"> <a style="opacity: 40%;" class="nav-link" href="#contact">Contact</a></li>
        <li class="nav-item pl-5"> <a style="opacity: 40%;" class="nav-link" href="login.jsp">Login</a></li>
      </ul>      
    </div>
  </nav> -->


<nav class="navbar1"  py-10  style="background-color: rgba(100, 100, 100, 0.5); opacity: 30%;">
        <div class="max-width">
          <div class="logo"><a href="#home"><img src="img/logo.png" class="img-fluid" width="50px" height="50px">ShimmerNShine</a></div>
            <ul class="menu1">
              <li><a href="#home" class="menu-btn">Home</a></li>
                <li><a href="#about" class="menu-btn">About</a></li>
                <li><a href="#services" class="menu-btn">Services</a></li>
                <li><a href="#gallery" class="menu-btn">Gallery</a></li>
                <li><a href="#teams" class="menu-btn">Team</a></li>
                <li><a href="#contact" class="menu-btn">Contact</a></li>
                <li><a href="login.jsp" class="menu-btn">Login</a></li>
            </ul>
            <div class="menu-btn1">
                <i class="fas fa-bars"></i>
            </div>
        </div>
    </nav>

<!--<nav class="navbar11"  py-10  style="background-color: black;">
      <div class="max-width11">
        <div class="logo11"><a href="#home"><img src="img/logo.png" class="img-fluid" width="50px" height="50px">ShimmerNShine</a></div>
          <ul class="menu11">
            <li><a href="#home" class="menu-btn11">Home</a></li>
              <li><a href="#about" class="menu-btn11">About</a></li>
              <li><a href="#services" class="menu-btn11">Services</a></li>
              <li><a href="#gallery" class="menu-btn11">Gallery</a></li>
              <li><a href="#teams" class="menu-btn11">Team</a></li>
              <li><a href="#contact" class="menu-btn11">Contact</a></li>
              <li><a href="#login" class="menu-btn11">Login</a></li>
          </ul>
          <div class="menu-btn11">
              <i class="fas fa-bars"></i>
          </div>
      </div>
  </nav>-->

  
  <!-- home section start -->
  <section class="home" id="home">
    <div class="max-width">
        <div class="home-content">
            <div class="text-1">Making your dream event</div>
            <div class="text-3">Memorable Weddings, Glitzy Parties, Scenic Photoshoot</div>
            
            <div class="text-2">"Be part of the bigger picture"</div>
            <a href="login.jsp" class="wow tada">Book Now</a>
        </div>
    </div>
</section> 


<!-- about section start -->
 <section class="about " id="about">
  </div> -->
  <div class="max-width">
      <h2 class="title wow bounceIn">About Us</h2>
      <div class="about-content">
          <div class="column left wow slideInLeft">
              <img src="img/i9.jpg" alt="">
          </div>
          <div class="column right wow slideInRight">
              <div class="text">The biggest adventure you can take is to live the life of your Dreams<span class="typing-2"></span></div>
              <p style="font-size: 20px;">ShimmerNShine is an application that eases the exhausting and tiresome process of planning huge gatherings. Whether it is a wedding or a birthday bash, we cover it all. We believe that technology can solve the gravest problems in the easiest way, and we are committed to alleviate your troubles through it. Our team can help organise a wide range of functions for Birthday, Christmas, Weddings, Anniversaries, Functions, Parties and many more.
            </p>
          </div>
      </div>
  </div>
</section> 


<!-- services section start -->
 <section class="services" id="services">
  <div class="max-width">
    <h2 class="title wow bounceIn">Services</h2>
    <div class="services-content wow slideInLeft">
      <div class="box-set">
        <figure class="box"> <span style="color: transparent;  text-shadow: 0 0 0 blue; ">&#9830;</span>WEDDING PLANNING<br>
          We do complete event planning including event flow, venue, guest reception, decoration, catering, bridal make-up, photography and many more.
        </figure>
        <figure class="box"><span style="color: transparent;  text-shadow: 0 0 0 blue; ">&#9830;</span>VENUE BOOKING<br>
          We manage to choose the right venue to excite people to attend an event. 
        </figure>
        <figure class="box"><span style="color: transparent;  text-shadow: 0 0 0 blue; ">&#9830;</span>DECORATION<br>
          These type of events are one of the most special moments in your life. We use an fantastic and stunning venue with modern and traditional ideas.
        </figure>                
                
                <figure class="box"><span style="color: transparent;  text-shadow: 0 0 0 blue; ">&#9830;</span>CATERING<br>
                  A great event relies on great food. We caterer to all kind of special occasions with good quality of hygienic food, service at an affordable budget.
                </figure>
                <figure class="box"><span style="color: transparent;  text-shadow: 0 0 0 blue; ">&#9830;</span>BIRTHDAY PARTY<br>
                  Everyone wants to celebrate their birthday party in a grand manner, and we plan every detail of your birthday party with great care.
                  </figure>
                    <figure class="box"><span style="color: transparent;  text-shadow: 0 0 0 blue; ">&#9830;</span>WEDDING ANNIVERSARY<br>
                      Wedding anniversary celebrate an important milestones in a couple’s life together. We Provide an excellent colorful and memorable event to you.
                    </figure>
                    
                    <figure class="box"><span style="color: transparent;  text-shadow: 0 0 0 blue; ">&#9830;</span>PHOTOSHOOT<br>
                    The most important part of any function, so that you can relive your memories, we provide: Normal, Delux and Royal types of photoshoots. 
                    </figure>
                    <figure class="box"><span style="color: transparent;  text-shadow: 0 0 0 blue; ">&#9830;</span>ENTERTAINMENT<br>
                    Without entertainment you may feel bored, but no worrries we are here with: Music, Dancers, Stage, Speakers, Magic shows and many more. 
                </figure>
                    <figure class="box"><span style="color: transparent;  text-shadow: 0 0 0 blue; ">&#9830;</span>BRIADAL MAKEOVER<br>
                      Bridal makeup is an essential part of the wedding planning process. We focus, to make every bride look like ultra natural with a touch of elegance.
                    </figure>
                    <figure class="box"><span style="color: transparent;  text-shadow: 0 0 0 rgb(42, 170, 82); ">&#9899;</span>
                  <span style="color: transparent;  text-shadow: 0 0 0 blue; ">&#9830;</span>
                  <span style="color: transparent;  text-shadow: 0 0 0 blue; ">&#9830;</span>
                  <span style="color: transparent;  text-shadow: 0 0 0 rgb(42, 170, 82); ">&#9899;</span>
                  </figure>
                    <figure class="box"><span style="color: transparent;  text-shadow: 0 0 0 rgb(42, 170, 82); ">&#9899;</span>
                  <span style="color: transparent;  text-shadow: 0 0 0 blue; ">&#9830;</span>
                  <span style="color: transparent;  text-shadow: 0 0 0 blue; ">&#9830;</span>
                  
                  <span style="color: transparent;  text-shadow: 0 0 0 rgb(42, 170, 82); ">&#9899;</span>
                </figure>
                  <figure class="box"><span style="color: transparent;  text-shadow: 0 0 0 rgb(42, 170, 82); ">&#9899;</span>
                <span style="color: transparent;  text-shadow: 0 0 0 blue; ">&#9830;</span>
                <span style="color: transparent;  text-shadow: 0 0 0 blue; ">&#9830;</span>
                
                <span style="color: transparent;  text-shadow: 0 0 0 rgb(42, 170, 82); ">&#9899;</span>
                </figure>
                </div>
        </div>
</section> 


<!-- gallery section start -->
 <section class="g2" id="gallery">
    <h2 class="title wow bounceIn">Gallery</h2>
    <div class="carousel m2">
      
      <div class="carousel-item"> <img src="img/q10.jpg"></div>
      <div class="carousel-item"> <img src="img/t.jpg"></div>
      <div class="carousel-item"> <img src="img/q6.jpg"></div>
      <div class="carousel-item"> <img src="img/w.jpg"></div>
      <div class="carousel-item"> <img src="img/q8.jpg"></div>
      <div class="carousel-item"><img src="img/q9.jpg"></div>
      <div class="carousel-item"><img src="img/a.jpg">  </div>
      <div class="carousel-item"> <img src="img/b.jpg">  </div>
      <div class="carousel-item"> <img src="img/g.jpg"></div>
      <div class="carousel-item"> <img src="img/h.jpg"></div>
      <div class="carousel-item"> <img src="img/i4.jpg"></div>
      <div class="carousel-item"> <img src="img/i5.png"></div>
      <div class="carousel-item"> <img src="img/i6.png"></div>
      <div class="carousel-item"> <img src="img/i7.jpg"></div>
      <div class="carousel-item"> <img src="img/i11.jpg"></div>
      <div class="carousel-item"> <img src="img/i12.jpg"></div>
      <div class="carousel-item"> <img src="img/i13.jpg"></div>
      <div class="carousel-item"> <img src="img/i14.jpg"></div>
      <div class="carousel-item"> <img src="img/i15.jpg"></div>
      <div class="carousel-item"> <img src="img/i17.jpg"></div>
      <div class="carousel-item"> <img src="img/i18.jpg"></div>
      <div class="carousel-item"> <img src="img/i19.webp"></div>
      <div class="carousel-item"> <img src="img/i16.jfif"></div>
      <div class="carousel-item"> <img src="img/i20.jpg"></div>
      <div class="carousel-item"> <img src="img/i21.jpg"></div>
      <div class="carousel-item"> <img src="img/i22.jpg"></div>
      <div class="carousel-item"> <img src="img/i23.jpeg"></div>
      <div class="carousel-item"> <img src="img/k.jpg"></div>
      <div class="carousel-item"> <img src="img/q7.jpg"></div>
      <div class="carousel-item"> <img src="img/q1.jpg"></div>
      <div class="carousel-item"> <img src="img/q2.jpg"></div>
      <div class="carousel-item"> <img src="img/q3.jpg"></div>
      <div class="carousel-item"> <img src="img/q4.jpg"></div>

    </div>
  </section> 


<!-- teams section start -->
<section class="about" id="teams" style="background: url('img/234.png') no-repeat; background-size: cover; background-attachment: fixed;">
      <h2 class="title wow bounceIn">Our Team</h2>
      
      <div class="card-deck wow fadeInUpBig" style="padding: 30px; ">
        <div class="card zoomin frame shadow p-3 mb-5 rounded" style="border: none; background-color:linen">
          <img src="img/mahi.jpg" class="card-img-top rounded-circle " alt="..." >
          <div class="card-body"><center>
            <h5 class="card-title">MAHIMA SHARMA</h5>
            <p class="card-text">Student ID: BTBTC18254</p></center>
          </div>
        </div>
        <div class="card zoomin frame shadow p-3 mb-5 rounded" style="border: none; background-color:linen">
          <img src="img/me.jpg" class="card-img-top rounded-circle" alt="...">
          <div class="card-body"><center>
            <h5 class="card-title">MUSKAN</h5>
            <p class="card-text">Student ID: BTBTC18179</p></center>
          </div>
        </div>

        <div class="card zoomin frame shadow p-3 mb-5 rounded" style="border: none; background-color:linen">
          <img src="img/saxena.jpg" class="card-img-top rounded-circle" alt="...">
          <div class="card-body"><center>
            <h5 class="card-title">MUSKAN SAXENA</h5>
            <p class="card-text">Student ID: BTBTC18208</p>
          </center></div>
        </div>

        <div class="card zoomin frame shadow p-3 mb-5 rounded" style="border: none; background-color:linen">
          <img src="img/neeti.jpg" class="card-img-top rounded-circle" alt="...">
          <div class="card-body"><center>
            <h5 class="card-title">NEETI PANDEY</h5>
            <p class="card-text">Student ID: BTBTC18119</p></center>
          </div>
        </div>
        
      </div>
  </div>
</section> 


      <!-- Contact Section start -->
<!--       <section class="contact1 wow fadeInDownBig" id="contact">
            <div class="contact-content1">
                <h2 class="wow bounceIn">Request a quote?</h2>
                <h5 style=" padding: 40px 0;">Please leave your contact info, and we will get back to you. Thanks!</h5>
                
                <div class="d-flex justify-content-around"> 
                    <input type="name" id="name" class="form-control" placeholder="Name" style="width: 200px; background: none;" required>      
                    <input type="email" id="email" class="form-control" placeholder="Email" style="width: 200px; background: none;" required>            
                    <a href="#" class="wow tada">Submit</a>
                </div>
          
            </div>
    </section>   -->

      
      <section class="contact1 wow fadeInDownBig" id="contact">
            <div class="contact-content1">
                <h2 class="wow bounceIn">Request a quote?</h2>
                <h5 style=" padding: 40px 0;">Please leave your contact info, and we will get back to you. Thanks!</h5>
                
                <form name='f'>
	<table border='0' cellspacing='4' cellpadding='3' align='center'>
            <tr ><td ><input type='name' value='' name='txtrno' id='name' class='form-control' placeholder='Name' style='width: 400px; background: none;' required/></td>
	<td ><input type='email' value='' name='txtname' id='email' class='form-control' placeholder='Email' style='width: 400px; background: none;' required/> </td>
        <td><input type ='submit' value='SUBMIT' name='btn' class='wow tada ur' style="display: inline-block;
    background: rgb(168, 71, 103);
    color: #fff;
    font-size: 15px;
    padding: 12px 36px;
    margin-top: 20px;
    font-weight: 400;
    border-radius: 6px;
    border: 2px solid palevioletred;
    transition: all 0.3s ease;"/> </td></tr>
	</table>
	</form>
          
            </div>
    </section>




    <script>$(document).ready(function(){$('.carousel').carousel();});</script>
   <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
     <script>var wow = new WOW(
      {
        boxClass:     'wow',      // animated element css class (default is wow)
        animateClass: 'animated', // animation css class (default is animated)
        offset:       0,          // distance to the element when triggering the animation (default is 0)
        mobile:       true,       // trigger animations on mobile devices (default is true)
        live:         true,       // act on asynchronously loaded content (default is true)
        callback:     function(box) {
          // the callback is fired every time an animation is started
          // the argument that is passed in is the DOM node being animated
        },
        scrollContainer: null // optional scroll container selector, otherwise use window
      }
    );
    wow.init();</script>
    
    <!-- <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script> -->
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <!-- <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>  -->

    </body>
</html>


<%    
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
       %>