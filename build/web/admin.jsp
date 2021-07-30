<%-- 
    Document   : admin
    Created on : May 20, 2021, 1:04:07 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        width: 400px;
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
<!-- Table-->


<!-- Feedback-->
<section class="feedback" id="feedback">
  <h5 style="margin-top: 60px; font-family:cursive; color: Pink; text-align: center; font-size: 30px;">Feedback given by our customer</h5>
  <table class= table2 >
    
    <tr style="background-color: khaki; color: dodgerblue;" >
      <th>Name</th>
      <th>Rating</th>
      <th>Review</th>
    </tr>
    <tr>
      <td>Mahima</td>
      <td>4</td>
      <td>it was very good, i fully enjoyed the services offered by shimmerNshine.

      </td>
    </tr>
    <tr>
      <td>Muskan</td>
      <td>5</td>
      <td>I want to thank ShimmernShine for making my wedding so memorable eveny of my life.</td>
    </tr>
    <tr>
        <td>Neeti</td>
        <td>3</td>
        <td>The services were very good. It helped in saving a lot time.</td>
      </tr>
      <tr>
        <td>Radhika</td>
        <td>5</td>
        <td>The kind of professionalism they show is commendable.</td>
      </tr>
      <tr>
        <td>Divya</td>
        <td>5</td>
        <td>Happy to be a part of Shimmer family.</td>
      </tr>
      <tr>
        <td>Kapish</td>
        <td>4</td>
        <td>They did our wedding preparations, I think they'll do our silver jubilee anniversary as well.</td>
      </tr>
      <tr>
        <td>ABCD</td>
        <td>4</td>
        <td>Amazing Website...</td>
      </tr>
     
      
    <!--</div>-->
    </table>

</section>

<script>

$(document).ready(function () {
$('#table1').DataTable({
"scrollX": true,
"scrollY": 200,
});
$('.dataTables_length').addClass('bs-select');
});
</script>

</body>
</html>
