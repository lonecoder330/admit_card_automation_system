<%-- 
    Document   : del_a
    Created on : Mar 26, 2018, 5:46:47 PM
    Author     : Deepti
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
<%
String connectionURL = "jdbc:mysql://localhost:3306/admitdb";
 try 
 {
     String uid=request.getParameter("uid");
     Class.forName("com.mysql.jdbc.Driver");
    Connection conn = DriverManager.getConnection(connectionURL, "root", "root");
     Statement st = conn.createStatement();
     st.executeUpdate("delete from admin where A_ID='"+uid+"' ");
     response.sendRedirect("view_admin.jsp");
       conn.close();
 } 
 catch (SQLException ex) {
     response.sendRedirect("error.jsp");
 }
%>
    </body>
</html>

