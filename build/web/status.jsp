<!--<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>-->


<%--
    Document   : index
    Created on : May 20, 2021, 12:37:06 PM
    Author     : DELL
--%>



<%@page import="java.sql.*" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Booking Status!</title>
        <!--<link rel="stylesheet" href="style.css">-->
       
        <style>
           
            @import url('https://fonts.googleapis.com/css2?family=Berkshire+Swash&display=swap');


*{
    margin: 0;
    padding: 0;
    box-sizing: border-box;
    text-decoration: none;
}


body{
     background: url(img/456.jpg) no-repeat center;
     background-size: cover;
    background-attachment: fixed;
}

/* navbar styling */
.navbar{
    background-color:black;
    overflow: hidden;
    opacity: 0.6;
}

/* logo*/
.navbar .logo a{
    color: #fff;
    font-size: 35px;
    font-weight: 600;
}
/* Style the links inside the navigation bar */
.navbar a {
    float: left;
    color: #f2f2f2;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
    font-size: 27px;
  }
 
  /* Change the color of links on hover */
  .navbar a:hover {
    background:none;
    color: red;
  }
 
  /* Right-aligned section inside the top navigation */
.navbar .topnav-right {
    float: right;
   
  }

  /*Table*/
 


/*logout*/
.feedback .table2 {
  /*border-collapse: collapse;*/
  border-spacing: 0;
  width: 50%;
  border: 6px double black;
  align-content: centre;
 
}
.feedback .table2 { margin: 30px auto; }
.feedback .table2 th,td {
        border: 1px solid blue;
      }
      td {
        height: 30px;
        width: 50%;
        text-align: center;
      vertical-align: middle;
    }

.feedback .table2 th, td {
padding: 30px;
}
.feedback .table2 tr {
  background-color:lightskyblue;
}
.feedback{

  background-size: cover;
  background-attachment: fixed;
 
}
.table1Wrapper {
  max-width: 600px;
  margin: 0 auto;
  }
  #table1 th, td {
  white-space: nowrap;
  }
  table.dataTable thead .sorting:after,
  table.dataTable thead .sorting:before,
  table.dataTable thead .sorting_asc:after,
  table.dataTable thead .sorting_asc:before,
  table.dataTable thead .sorting_asc_disabled:after,
  table.dataTable thead .sorting_asc_disabled:before,
  table.dataTable thead .sorting_desc:after,
  table.dataTable thead .sorting_desc:before,
  table.dataTable thead .sorting_desc_disabled:after,
  table.dataTable thead .sorting_desc_disabled:before {
  bottom: .5em;
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
div.elem-group.inlined {
  width: 50%;
  display: inline-block;
  float: left;
 margin-left: 30%;
	
}
div.elem-group.inlined input {
  width: 30%;
  display: inline-block;
}
div.elem-group {
  margin: 20px 0;
margin-left: 30%;
margin-right: 30%;
}
label.fm {
  display: block;
  font-family: 'Nanum Gothic';
  padding-bottom: 10px;
  color: white;
  font-size: 1.65em;
 

}
button:hover {
  border: 2px solid black;
}
label.logo{
  color: white;
  font-size: 35px;
  line-height: 80px;
  padding: 0 100px;
  font-weight: bold;
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
a:hover,a.active{
    background: none;
    color: #0082e6;
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
hidden{
display:none;
}
   </style>
<script>
     //function dispFunc() {document.getElementById('cc').style.display="block";
    // function dispFunc() {

  //document.getElementById("cc").classList.toggle("hidden");

//}
</script>

    
</head>
<body >

    <!-- The navbar-->
  <nav class="navbar" style="background-color: black;">

    <div class="logo"><a href="#">ShimmerNShine</a></div>
 
  <div class="topnav-right">
     <a href="admin.jsp">Feedback</a>
      <a href="query.jsp">Query</a>
      <a href="user.jsp">Registered User</a>
    <a href="#booking">Booking Status</a>
    <a href="index.jsp">Logout</a>
  </div>
     
</nav>
   
   
    <section class="feedback" id="feedback">
  <h5 style="margin-top: 60px; font-family:cursive; color: Blue; text-align: center; font-size: 30px;">Booking Status</h5>
  <div class="elem-group inlined">
    <label class="fm" for="userid">User Id</label>
    <input type="text" id="userid" name="userid" placeholder="Enter id"  required>
  </div>
  <br>
  <br>
  <button type="button" id="Check" name="Check"  value="Check">Check</button>
  <table class= table2  id="cc">
      <div class=c2>
    <tr style="background-color: khaki; color: dodgerblue;" >
      <th>User ID</th>
      <th>Date From</th>
      <th>Date To</th>
      <th>Venue</th>
      <th>Booking status</th>
    </tr>
 
                <%
                  
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
                       %>
      </div>
                </table>
</section>
</body>
</html>
<%
            conn.close();
        }catch(Exception se)
        {
            se.printStackTrace();
   
        }
%>