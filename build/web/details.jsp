<%-- 
    Document   : bkdetails
    Created on : 27 Apr, 2021, 4:58:00 AM
    Author     : Muskan
--%>



<%@page import="java.sql.*" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- jQuery library -->

<html lang="en" dir="ltr">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title> ShimmerNShine </title> 
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="multiselect/jquery.multiselect.js"></script>
<link rel="stylesheet" href="multiselect/jquery.multiselect.css">
    <style>
	*{
  padding: 0;
  margin: 0;
  text-decoration: none;
  list-style: none;
  box-sizing: border-box;
}
body{
  font-family: montserrat;
}
nav{
  background: #0082e6;
  height: 80px;
  width: 100%;
}
label.logo{
  color: white;
  font-size: 35px;
  line-height: 80px;
  padding: 0 100px;
  font-weight: bold;
}
nav ul{
  float: right;
  margin-right: 20px;
}
nav ul li{
  display: inline-block;
  line-height: 80px;
  margin: 0 5px;
}
nav ul li a{
  color: white;
  font-size: 17px;
  padding: 7px 13px;
  border-radius: 3px;
  text-transform: uppercase;
}
a.active,a:hover{
  background: #1b9bff;
  transition: .5s;
}
.checkbtn{
  font-size: 30px;
  color: white;
  float: right;
  line-height: 80px;
  margin-right: 40px;
  cursor: pointer;
  display: none;
}
#check{
  display: none;
}
@media (max-width: 952px){
  label.logo{
    font-size: 30px;
    padding-left: 50px;
  }
  nav ul li a{
    font-size: 16px;
  }
}
@media (max-width: 858px){
  .checkbtn{
    display: block;
  }
  ul{
    position: fixed;
    width: 100%;
    height: 100vh;
    background: #2c3e50;
    top: 80px;
    left: -100%;
    text-align: center;
    transition: all .5s;
  }
  nav ul li{
    display: block;
    margin: 50px 0;
    line-height: 30px;
  }
  nav ul li a{
    font-size: 20px;
  }
  a:hover,a.active{
    background: none;
    color: #0082e6;
  }
  #check:checked ~ ul{
    left: 0;
  }
}
section{
  /*background: url(https://thecrimsonbride.com/wp-content/uploads/2020/02/Top-Wedding-Themes-50-768x512.jpg);*/
  height: 100%;
  
  /*background: url(https://thecrimsonbride.com/wp-content/uploads/2020/02/Top-Wedding-Themes-50-768x512.jpg) no-repeat center; background-size: cover; background-attachment: fixed;*/

position: relative;
  justify-content:center;
align-items:center;
display:flex;
padding: 50px;
padding-bottom:200px;
}

.booking{
width:100%;
padding:50px 100px;
background-color:rgba(0,0,0,0.5);
 font-size: 25px;
 border-radius:10px;
 border: 1px solid rgba(255,255,255,0.3);
 box-shadow:2px 2px 15px rgba(0,0,0,0.3);
 color:white;
}
input, select, textarea {
  border-radius: 2px;
  border: 2px solid #777;
  box-sizing: border-box;
  font-size: 22px;
  font-family: 'Nanum Gothic';
  width: 100%;
  padding: 6px;
}
h2{
font-size:40px;
font-weight:bold;
position:relative;
font-family: 'Cursive',lucida handwriting;
padding-bottom:20px;
color:orange;
}
input#name{
 width:300px;
 border: 1px solid #ddd;
 border-radius: 3px;
 outline: 0;
 padding: 7px;
background-color: #fff; 
 box-shadow: insert 1px 1px 5px rgba(0,0,0,0.3);
}
button{
 
height: 50px;
  background: pink;
opacity:0.9;
  border: none;
  color: black;
  font-size: 1.25em;
  font-family: 'Nanum Gothic';
  border-radius: 4px;
  cursor: pointer;
  margin-left:30%;
  margin-bottom: 100px;
width:200px;
padding:7px;

border: 1px solid rgba(255,255,255,0.3);
box-shadow: 1px 1px 5px rgba(0,0,0,0.3);
margin-bottom:20px;

}

</style>
  </head>
  <body style="background: url(https://thecrimsonbride.com/wp-content/uploads/2020/02/Top-Wedding-Themes-50-768x512.jpg) no-repeat center; background-size: cover; background-attachment: fixed;">
<!--    <nav>
      <input type="checkbox" id="check">
      <label for="check" class="checkbtn">
        <i class="fas fa-bars"></i>
      </label>
      <label class="logo">Celebrate with ShimmerNShine</label>
      <ul>
	<li><a href="#">Home</a></li>
        <li><a class="active" href="#">Book Now</a></li>
        <li><a href="#">Booking status</a></li>
        <li><a href="#">Review Us</a></li>
        <li><a href="#">Help</a></li>
      </ul>
    </nav>-->
    <section>
	<div class="main">
	<div class="booking">
		<h2>Make Booking</h2>
		<form id="booking"> 
                    
                    <label> USERNAME* : </label>   <br>
<input type="text" name="userid" placeholder= "Enter username" required />
</br>
<br>		<label>Type of Event:</label>
		<br>
		<select id="event-selection" name="event" required>
        	<option selected disabled>--Choose Event Type--</option>
        	<option value="wedding">Wedding</option>
        	<option value="birthday_party">Birthday Party</option>
        	<option value="ring_ceremony">Ring ceremony</option>
		<option value="anniversary">Anniversary</option>
		<option value="business_party">Business party</option>
		<option value="wedding_function">Wedding Function</option>
		<option value="bachelor's_party">Bachelor's party</option>
		<option value="others">Others</option>	
    		</select>
	<br><br>
		<label>Cuisine:</label>
		<br>
                <select name="cuisine" id="cuisine">
        	<option selected disabled>--Choose Cuisine Type--</option>
        	<optgroup label="Indian">
		<option value="punjabi">Punjabi</option>
		<option value="south_indian">South Indian</option>
		<option value="gujarati">Gujarati</option>
		<option value="rajasthani">Rajasthani</option>
		<option value="bengali">Bengali</option>
		<option value="mughalai">Mughalai</option>
		</optgroup>
                <optgroup label="Others">	
        	<option value="italian">Italian</option>
		<option value="chinese">Chinese</option>
		<option value="american">American</option>
		<option value="japanese">Japanese</option>
		<option value="thai">Thai</option>
        	</optgroup>
		
    		</select>
		<script>
		$('#cuisine').multiselect({
    		columns: 1,
   		 placeholder: 'Select Cuisine',
		search:true
		});
		</script>
		<br><br>
		<label>Decoration:</label>
		<br>
		<select id="decoration" name="decoration" required>
        	<option selected disabled>--Choose Decoration Type--</option>
        	<option value="flowral">All Floral</option>
        	<option value="drapes">Fabric Drapes/curtains</option>
		<option value="led">LED</option>
		<option value="balloons">Balloons</option>
        	<option value="colourful">Vibrant and Colourful</option>
		<option value="metallic">Metallic</option>
		</select>
		<br> <br>
		<label>Theme:</label>
		<br>
		<select id="theme" name="theme" required>
        	<option selected disabled>--Choose Theme--</option>
		<option value="none">None</option>
		<option value="bollywood">Bollywood Theme</option>
		<option value="retro">Retro Theme</option>
		<option value="traditional">Traditional theme</option>
		<option value="boho_chic">Boho Chic</option>
		<option value="western">Western Theme</option>
		<option value="rustic">Rustic Theme</option>
		<option value="moroccan">Moroccan Theme</option>
		<option value="vintage">Vintage Theme</option>
		<option value="fairytale">Fairytale Theme</option>
		<option value="others">Others</option>	
    		</select>
		<br> <br>
		<label>Entertainment source:</label>
		<br>
		<select id="source" name="source" required>
        	<option selected disabled>--Choose Entertainment source--</option>
		<option value="none">None</option>
		<option value="dj">DJ</option>
		<option value="qawaali">Qawaali</option>
		<option value="band">Musician's Band</option>
		<option value="dancers">Dancers</option>
		<option value="folk">Folk Dancers</option>
		<option value="magic">Magic Show</option>
		<option value="singers">Singers</option>
		<option value="host">Party Host</option>
		<option value="performers">Performers or Entertainers</option>
		<option value="others">Others</option>	
    		</select>
		<br><br>
		<button type="submit" id= "Submit" value="Submit" name="Submit">Submit</button>
	</form>
	</div>
	</div>
</section>
  </body>
</html>
<%   
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
//        if(button.equals("Submit"))
//        {
//            out.print("<script>alert('record insert successfully')</script>");
       
//            if(event!="" && cuisine!="")
//		{
//                    out.print("<script>alert('record insert successfully')</script>");
        	PreparedStatement ps=conn.prepareStatement("insert into tt3 values(?,?,?,?,?)");
        	ps.setString(1,us);
                ps.setString(2,stdate);
                ps.setString(3,endate);
                ps.setString(4,vn);
                ps.setString(5,"Pending");
                
//                ps.setString(1,event);
//                ps.setString(2,cuisine);
//                ps.setString(3,decor);
//                ps.setString(4,theme);
//                ps.setString(5,entertainment);
//                
//                ps.setString(8,gu);
                
                
//       out.print("<script>alert('record insert successfully')</script>");
        	int i=ps.executeUpdate();
//        
//         	 if(i>0)
//          	{
//                    out.print("<script>alert('record insert successfully')</script>");
//                    
//                }
////                 }
//                
//                else
//                {
//                    out.print("<script>alert('Please Enter the details')</script>");
//                    conn.close();
//                }
//        } 
//        response.sendRedirect("navbar.html");
        
        
        
        
        conn.close();
        }catch(Exception se){
            	se.printStackTrace();
   
        	}
          
          
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
        response.sendRedirect("navbar.html");
        
        
        
        
        conn.close();
        }catch(Exception se){
            	se.printStackTrace();
   
        	}
%>

