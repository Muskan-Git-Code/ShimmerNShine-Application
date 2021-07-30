
<%@page  import="java.sql.*" import="java.io.*" contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>  
<html>  
<head>  
<meta name="viewport" content="width=device-width, initial-scale=1">  
<style>  
body{  
  font-family: Calibri, Helvetica, sans-serif;  
  background: url(img/678.jpg);  
    background-size: cover;
    background-position: center;
}  
.container {  
    padding: 50px;  
    
 
}  
  
input[type=text], input[type=password], textarea {  
  width: 20%;  
  padding: 15px;  
  margin: 5px 0 20px 0;  
  display: inline-block;  
  border: 5px;  
  background: none; 
  background-position:center; 
  
}  
input[type=text]:focus, input[type=password]:focus {  
  background-color: none;  
  outline: 1px solid #f1f1f1;  
}  
 div {  
            padding: 10px 0;  
         }  
hr {  
  border: 1px solid #f1f1f1;  
  margin-bottom: 25px;  
}  
.registerbtn {  
  background-color: #FF0000;  
  color: white;  
  padding: 16px 20px;  
  margin: 8px 0;  
  border: none;  
  cursor: pointer;  
  width: 30%;  
  opacity: 0.9;  
}  
.registerbtn:hover {  
  opacity: 1;  
}
</style>  
</head>  
<body>  
    <form>  
  <div class="container">  
  <center>  <h1>REGISTER TO SHIMMERNSHINE</h1> </center>  
  <hr>  
<label><strong> USERNAME* : </strong></label>   
<input type="text" name="user_id" placeholder= "Enter username" required />
</br> 
  <label><strong> NAME* : </strong></label>   
<input type="text" name="firstname" placeholder= "Firstname" required />
<!--</br>-->   
<!--<label><strong> MIDDLENAME:</strong></label>-->  
<input type="text" name="middlename" placeholder="Middlename" /> 
<!--</br>-->
<!--<label><strong> LASTNAME:  </strong></label>-->    
<input type="text" name="lastname" placeholder="Lastname" />
</br>   
<div>  
<label>   
<strong>GENDER* :   </strong> 
</label>
<input type="radio" value="Male" name="gender"> Male   
<input type="radio" value="Female" name="gender"> Female   
<input type="radio" value="Other" name="gender"> Other  
</br> 
</div>  
<label>   
<strong>PHONE* :     </strong>
</label>  
<input type="text" name="country_code" placeholder="Country Code"  value="+91"/>   
<input type="text" name="phone" placeholder="phone no."  />
</br>  
<strong>CURRENT ADDRESS:</strong>
<!--</br>-->
<input type="text" name="address" placeholder="Current Address" required/>
<!--<textarea cols="80" rows="5" name="address" placeholder="Current Address" value="address" required>  
</textarea> -->
</br> 
 <label for="email"><b>EMAIL ID* :    </b></label>  
 <input type="text" placeholder="Enter Email" name="email" required>  
  </br>
    <label for="psw"><b>PASSWORD* :  </b></label>  
    <input type="password" placeholder="Enter Password" name="psw" id="psw" minlength="4" required>  
  <!--</br>-->
    <!--<label for="psw-repeat"><b>RE-TYPE PASSWORD</b> </label>-->  
    <input type="password" placeholder="Retype Password" name="psw-repeat" id="psw-repeat" required> 
</br>
<button type="SUBMIT" name="register" value="register" class="registerbtn">Register</button>    
</form> 
</body>  
</html>    
<%      
	String id = request.getParameter("user_id");
	String fn = request.getParameter("firstname");
	String mn = request.getParameter("middlename");
	String ln = request.getParameter("lastname");
	String gen = request.getParameter("gender");
	String phn1 = request.getParameter("country_code");
        String phn2 = request.getParameter("phone");
        String add = request.getParameter("address");
	String em = request.getParameter("email");
	String pass = request.getParameter("psw");
        String pass2= request.getParameter("psw-repeat");
	String button=request.getParameter("register");
        try
	{
	Class.forName("org.apache.derby.jdbc.ClientDriver");
	Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/new","user1","user1");
        if(button.equals("register"))
        {
            if(id!="" && pass!="")
            {
        	PreparedStatement ps=conn.prepareStatement("insert into reg1 values(?,?,?,?,?,?,?,?,?,?)");
        	ps.setString(1, id);
        	ps.setString(2, fn);
  
                ps.setString(3, mn);
                ps.setString(4, ln);
                ps.setString(5, gen);
                ps.setString(6, phn1);
                ps.setString(7, phn2);
                ps.setString(8, add);
                ps.setString(9, em);
                ps.setString(10, pass);
             
                
      
       
        	int i=ps.executeUpdate();
        
         	if(i>0)
          	{
                    out.print("<script>alert('record insert successfully')</script>");
                    response.sendRedirect("navbar.html");
                    
                }
            }
                
            else
            {
                out.print("<script>alert('Please Enter the id. and Name')</script>");
                    
                
            }
                
            conn.close();
                
        }
               }catch(Exception se)
        	{
            	se.printStackTrace();
   
        	}
        
        
       %>
