<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
	String info = request.getParameter("x_info");
	if(info != null && info.length() > 0){
		out.print(info);
	}else{
		out.print("Parametr x_info nie zostal przekazany!");
	}
 %>
 <br/><hr/>
 
 <%="Hello world!"%><br/>
 
 Data: <%=new SimpleDateFormat("dd-MM-yyyy").format(new Date())%><br/>
 
 ID Studenta: <%=request.getParameter("x_student_id")%><br/>
 
 Informacja przekierowana z serwletu: <%= request.getAttribute("x_redirect")%><br/>
 
</body>
</html>