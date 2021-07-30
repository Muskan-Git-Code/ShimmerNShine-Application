<%-- 
    Document   : query.jsp
    Created on : May 20, 2021, 2:00:17 PM
    Author     : DELL
--%>

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
        <title>Welcome Admin!</title>
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
  
   </style>
</head>
<body >

    <!-- The navbar-->
  <nav class="navbar" style="background-color: black;">

    <div class="logo"><a href="#">ShimmerNShine</a></div>
  
  <div class="topnav-right">
     <a href="admin.jsp">Feedback</a>
      <a href="query.jsp">Query</a>
      <a href="user.jsp">Registered User</a>
    <a href="change.jsp">Show Status</a>
    <a href="index.jsp">Logout</a>
  </div>
      
</nav>
    
    
    <section class="feedback" id="feedback">
  <h5 style="margin-top: 60px; font-family:cursive; color: Pink; text-align: center; font-size: 30px;">Details of Registered User</h5>
  <table class= table2 >
      <div class=c2>
    <tr style="background-color: khaki; color: dodgerblue;" >
      <th>ID</th>
      <th>FIRST NAME</th>
      <th>MIDDLE NAME</th>
      <th>LAST NAME</th>
      <th>GENDER</th>
      <th>PHONE NUMBER</th>
      <th>ALTERNATE PHONE NUMBER</th>
      <th>ADDRESS</th>
      <th>EMAIL ADDRESS</th>
      <th>PASSWORD</th>
    </tr>
  
                <%
//                    if(request.getParameter("btn")!=null)
//                    {
//                        response.sendRedirect("student.jsp");
//                    }
                try{
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/new","user1","user1");
PreparedStatement ps=conn.prepareStatement("select * from reg1");
                ResultSet rs=ps.executeQuery();
              while(rs.next())
                       {
//out.println("<tr><td>" + rs.getString(1) + "</td><td>" + rs.getString(2) + "</td></tr>");

out.println("<tr><td>" + rs.getString(1) + "</td><td>" + rs.getString(2) + "</td><td>" + rs.getString(3) + "</td><td>" + rs.getString(4)+ "</td><td>" + rs.getString(5) + "</td><td>" + rs.getString(6) +"</td><td>" + rs.getString(7)+"</td><td>" + rs.getString(8)+"</td><td>" + rs.getString(9)+"</td><td>" + rs.getString(10)+ "</td></tr>");
}
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
