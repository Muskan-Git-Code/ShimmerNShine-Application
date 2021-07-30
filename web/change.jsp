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
   <script>
       function productDelete() {
    //$(ctl).parents("tr").remove();
    var txtid = document.getElementById('userid').value;  
    var chng="Confirm";
            if (txtid.length != 0 && txtname.length!=0) {  
                var connection = new ActiveXObject("ADODB.Connection");  
                 Class.forName("org.apache.derby.jdbc.ClientDriver");
                Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/bk1","root","root"); 
                var rs = new ActiveXObject("ADODB.Recordset");  
                rs.Open("update status set bkstatus = '" + chng + "' where Id=" + txtid,connection);  
                alert("Update Record Successfuly");  
                txtid.value = " ";  
                connection.close();  
            }  
            else  
            {  
                alert("Please textbox's value");  
            }  
}
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
  <h5 style="margin-top: 60px; font-family:cursive; color: Pink; text-align: center; font-size: 30px;">Pending Booking of Users</h5>
  <table class= table2 >
      <div class=c2>
    <tr style="background-color: khaki; color: dodgerblue;" >
      <th>User Id</th>
      <th>Date From</th>
      <th>Date To</th>
      <th>Venue</th>
      <th>Status</th>
      
    </tr>
 
                <%
//                    if(request.getParameter("btn")!=null)
//                    {
//                        response.sendRedirect("student.jsp");
//                    }
            String changestatus="Confirm";
                try{
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/new","user1","user1");
PreparedStatement ps=conn.prepareStatement("select * from tt3 ");
                ResultSet rs=ps.executeQuery();
              while(rs.next())
                       {
                           String userid=rs.getString(1);
out.println("<tr><td>" + rs.getString(1) + "</td><td>" + rs.getString(2) + "</td><td>" + rs.getString(3) + "</td><td>" +rs.getString(4) + "</td><td>" +
        "<button type='submit' id='Confirm' name='Confirm' onclick='productDelete();' class='Confirm' value='Confirm'>" +
       "Confirm "+"</button>" +"</td></tr>");
}
              String button=request.getParameter("Confirm");
          /*    if(button.equals("Confirm"))
                {  
             out.print("<script>alert('Status ')</script>");
             PreparedStatement pt=conn.prepareStatement("Update status set bkstatus='"+changestatus+"'"); 
        	int i=pt.executeUpdate();
         	 if(i>0)
          	{
           	 out.print("<script>alert('Status CConfirmed Successfully.')</script>");  
                }
             else {
                      out.print("<script>alert('Status Already confirmed')</script>");
                  }
        }*/
                       %>
                       
      </div>
                </table>
</section>
</bod
</html>
<%
            conn.close();
        }catch(Exception se)
        {
            se.printStackTrace();
   
        }
%>
