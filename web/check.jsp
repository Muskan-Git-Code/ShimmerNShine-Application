<%-- 
    Document   : book1
    Created on : 26 Apr, 2021, 9:19:38 PM
    Author     : Muskan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%@page import="java.sql.*"%>
<%@page import="java.time.LocalDate"%>
<%@page import="java.text.ParseException"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>

<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title> ShimmerNShine </title> 
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="https://code.jquery.com/jquery-2.2.4.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
    <link href="https://code.jquery.com/ui/1.11.3/themes/smoothness/jquery-ui.css" rel="stylesheet">
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
div.elem-group.inlined input {
  width: 30%;
  display: inline-block;
}
button {
  height: 50px;
  background: green;
opacity:0.9;
  border: none;
  color: white;
  font-size: 1.25em;
  font-family: 'Nanum Gothic';
  border-radius: 4px;
  cursor: pointer;
  margin-left:30%;
  margin-bottom: 100px;
}
div.elem-group {
  margin: 20px 0;
margin-left: 30%;
margin-right: 30%;
}

div.elem-group.inlined {
  width: 50%;
  display: inline-block;
  float: left;
 margin-left: 30%;
	
}
label.fm {
  display: block;
  font-family: 'Nanum Gothic';
  padding-bottom: 10px;
  color: white;
  font-size: 1.65em;
 

}
label.bm{
	font-family: 'Cursive',lucida handwriting;
  padding-bottom: 7px;
  font-size: 1.95em;
color: purple;
font-weight: bold;

margin-left:60px;

}
input, select, textarea {
  border-radius: 2px;
  border: 2px solid #777;
  box-sizing: border-box;
  font-size: 1.25em;
  font-family: 'Nanum Gothic';
  width: 100%;
  padding: 6px;
}
button:hover {
  border: 2px solid black;
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
  margin-right: 5%;
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
  background-image:url("https://frugal2fab.com/wp-content/uploads/2017/06/udaivilas.jpg");
 height: 100%;
background-position: center;
background-repeat: no-repeat;
background-size: cover;
position: relative;

justify-content:center;
align-items:center;
padding: 20px;
padding-bottom:200px;


}

</style>
<script>
    $(document).ready(function () {
        var minDate = new Date();
        $("#checkin-date").datepicker({
            showAnim: 'drop',
            numberOfMonth: 1,
            minDate: minDate,
            dateFormmat: 'dd/MM/yyyy',
            onClose: function (selectedDate){
                $('#checkout-date').datepicker("option","minDate",selectedDate);
            }
        });
        $("#checkout-date").datepicker({
            showAnim: 'drop',
            numberOfMonth: 1,
            minDate: minDate,
            dateFormmat: 'dd/MM/yyyy',
            onClose: function (selectedDate){
                $('#checkout-date').datepicker("option","minDate",selectedDate);
            }
        });
    });
    
</script>
  </head>
  <body>
<!--    <nav>
      <input type="checkbox" id="check">
      <label for="check" class="checkbtn">
        <i class="fas fa-bars"></i>
      </label>
      <label class="logo">Celebrate With ShimmerNShine</label>
      <ul>
	<li><a href="#">Home</a></li>
        <li><a class="active" href="#">Book Now</a></li>
        <li><a href="#">Booking Status</a></li>
        <li><a href="#">Review Us</a></li>
	<li><a href="#">Help</a></li>
      </ul>
    </nav>-->
    <section>
<div class="book">
<form method="post">
  
  <hr>
  <div class="elem-group inlined">
    <label class="bm" >Make Booking</label>
    
  </div>
  <div class="elem-group inlined">
    <label class="fm" for="guest">No. of Guests</label>
    <input type="text" id="guest" name="total_guest" placeholder="50"  required>
  </div>
  <div class="elem-group inlined">
    <label class="fm" for="checkin-date">Event Starting Date</label>
    <input type="text" id="checkin-date" name="checkin" required>
  </div>
  <div class="elem-group inlined">
    <label class="fm" for="checkout-date">Event Ending Date</label>
    <input type="text" id="checkout-date" name="checkout" required>
  </div>
  <div class="elem-group">
    <label class="fm" for="venue-selection">Select Venue Preference</label>
    <select id="venue-selection" name="venue_preference" required>
        <option value="">Choose a venue from the List</option>
        <option value="hall_1">Hall 1</option>
        <option value="hall_2">Hall 2</option>
        <option value="hall_3">Hall 3</option>
	<option value="pool_side">Pool Side</option>
	<option value="terrace">Terrace</option>
	<option value="garden_area">Garden Area</option>	
    </select>
  </div>
  <button type="submit" name="Check_Availability" value="Check_Availability">Check Availability</button>

</form>
</div>
</section>
  </body>
</html>
<%   
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
%>
