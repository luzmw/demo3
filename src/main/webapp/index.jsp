<%@ page import="com.example.demo3.Alumna" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
    Alumna a= new Alumna("juli", "back");
%>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>

<br
    <h2> <%=" Alumna:" + a.getNombre() %> </h2>
<h3><%=" Curso:" + a.getCurso() %> </h3>

    </h2>


<a href="hello-servlet">Hello Servlet</a>
</body>
</html>