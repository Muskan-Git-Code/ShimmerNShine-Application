<%-- 
    Document   : index.jsp
    Created on : 28 Apr, 2021, 12:00:25 AM
    Author     : Muskan
--%>




<%@page import ="java.sql.*" contentType="text/html" pageEncoding="UTF-8"%>
 <html>
<head>
<title> Forget Password </title>
<style>
body{
	margin: 0;
	padding: 0;
	background: url(img/pic1.jpg);
	background-size: cover;
	background-position: center;
	font-family: sans-serif;
}

.loginbox{
 	width:320px;
	height:420px;
	background:#000;
	color: #fff;
	top: 50%;
	left: 50%;
	position: absolute;
	transform: translate(-50%,-50%);
	box-sizing: border-box;
	padding:70px 30px;
}

.pic2{
	width: 100px;
	height: 100px;
	border-radius: 50%;
	position: absolute;
	top: -50px;
	left: calc(50% - 50px);
}

h1{
	margin: 0;
	padding: 0 0 20px;
	text-align: center;
	font-size: 22px;
}

.loginbox p{
	margin:0;
	padding:0;
	font-weight: bold;
}

.loginbox input{
	width: 100%;
	margin-bottom: 20px;
	
}
.loginbox input[type="text"], input[type="password"]
{	
	border: none;
	border-bottom: 1px solid #fff;
	background: transparent;
	outline: none;
	height: 40px;
	color: #fff;
	font-size: 16px;
}
.loginbox input[type="submit"]
{
	border: none;
	outline: none;
	height: 40px;
	background: #fb2525;
	color: #fff;
	font-size: 18px;
	border-radius: 20px;
}
.loginbox input[type="submit"]:hover
{
	cursor:pointer;
	background: #ffc107;
	color: #000;
}
.loginbox a{
	text-decoration: none;
	font-size: 12px;
	line-height:20px;
	color: darkgrey;
}
.loginbox a:hover
{
	color: #ffc107;	
}

</style>
</head>
 
<body>
   
	<div class="loginbox">
	<img src="img/p1.jfif" class="pic2">
	<h1>Create New Password</h1>
        <form method="post" action="login.jsp">
	<p>User ID</p>
	<input type="text" name="userid" placeholder="Enter User ID">
        <p>Registered Email ID</p>
	<input type="text" name="email" placeholder="Enter Email ID">
	<p>New Password</p>
	<input type="password" name="passw" placeholder="Enter New Password">
        <p>Confirm Password</p>
	<input type="password" name="confirm" placeholder="Retype Password">
	<input type="submit" name="btn" value="Create New Password" >
	</form>
	</div>
</body> 
</html>
<%
    String uname = request.getParameter("userid");    
    String em = request.getParameter("email");
    String pass = request.getParameter("passw");
    String cn = request.getParameter("confirm");
    String bn = request.getParameter("btn"); 
    try{
    Class.forName("org.apache.derby.jdbc.ClientDriver");  
    Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/new","user1","user1");
    if(bn.equals("Create New Password"))
    { 
        out.print("<script>alert('Password Changed Successfully.')</script>");
//        if(pass.equals(cn))
//        {  
//            out.print("<script>alert('Password Changed Successfully.')</script>"); 
//            PreparedStatement ps=con.prepareStatement("Update reg1 set pass='"+pass+"' where id=? "); 
//            out.print("<script>alert('Password Changed Successfully.')</script>");      	
//            int i=ps.executeUpdate();
//            out.print("<script>alert('Password Changed Successfully.')</script>");  
//            if(i>0)
//            {
//                out.print("<script>alert('Password Changed Successfully.')</script>");  
//            }
//            else {
//                out.print("<script>alert('incorrect userid or email_id2345')</script>");
////                      con.close();
//            }
//        }
//        else{
//            out.print("<script>alert('Passwords doesnt match...')</script>");  
////        con.close();
//        }
    }
    }
    catch(Exception se)
        	{
            	se.printStackTrace();
   
        	}
    
    %>
