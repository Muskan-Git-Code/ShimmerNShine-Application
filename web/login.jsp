


<%@page import ="java.sql.*" contentType="text/html" pageEncoding="UTF-8"%>
 <html>
<head>
<title> Login </title>
<style>
body{
	margin: 0;
	padding: 0;
	background: url('img/pic1.jpg');
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
<body>
	<div class="loginbox">
	<h1>Login Here 
        
        
            <select id="selection" name="event">
        	<!--<option selected disabled>--Choose Event Type--</option>-->
        	<option value="user">User</option>
        	<option value="admin">Admin</option>
    		</select>
        </h1>
        <form>
            
<!--            <label>Type of Event:</label>
		<br>-->
		

<br><br>
                
	<p>Username</p>
	<input type="text" name="userid" placeholder="Enter username">
	<p>Password</p>
	<input type="password" name="passw" placeholder="Enter Password">
	<input type="submit" name="btn" value="Login"  on>
        <!--<button type="submit" name="btn" value="Login" >Login</button>-->
	<a href="forget.jsp"> Forgot Password?</a></br>
	<a href="register.jsp"> New to ShimmerNShine?</a>
	</form>
	</div>
</body>
</head>
</html>
<%
    String uname = request.getParameter("userid");    
    String pass = request.getParameter("passw");
    String button=request.getParameter("btn");
    String button2=request.getParameter("event");
    try{
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/new","user1", "user1");
//      out.print("<script>alert('successful login')</script>");
    
        if(button.equals("Login"))
        {
            
//            if(button2.equals("admin")){
//            response.sendRedirect("admin.jsp");
//            }
            if(uname=="admin"){
                response.sendRedirect("admin.jsp");
            }
            else if(uname=="" && pass==""){
                out.print("<script>alert('Enter Valid Details....')</script>");
                response.sendRedirect("login.jsp");
            }
            else{
//            out.print("<script>alert('successful login')</script>");
                PreparedStatement ps=con.prepareStatement("Select * from reg1 ");
    //            out.print("<script>alert('successful login')</script>");
                ResultSet rs=ps.executeQuery();  
    //            out.print("<script>alert('successful login')</script>");
                while(rs.next()){
                    out.print("<script>alert('successful login')</script>");
                    response.sendRedirect("navbar.html");
                }
//            while(rs.next()){  
////            System.out.println(rs.getInt(1)+" "+rs.getString(2));  
//                out.print("<script>alert('successful login')</script>");
            }
            
//            out.print("<script>alert('successful login')</script>");
//    Statement st = con.createStatement();
//    ResultSet rs;
//    rs = st.executeQuery("select * from reg1 where user_id='" + uname + "' and password='" + pass + "'");
//    out.print("<script>alert('successful login')</script>");
//    if (rs.next()) {
//        session.setAttribute("userid", uname);
//      out.print("<script>alert('successful login')</script>");
//      response.sendRedirect("navbar.html");
//        }
//        else {
//            out.print("<script>alert('incorrect userid or password')</script>");
////            con.close();
        }
        con.close();
        
    }catch(Exception se)
        	{
            	se.printStackTrace();
   
        	}
    
    %>