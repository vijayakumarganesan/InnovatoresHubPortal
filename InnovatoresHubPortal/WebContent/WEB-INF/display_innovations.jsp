<%@ page language="java" import="java.util.List" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.innovatoreshub.project.bean.InnovatoresPersonalInfo"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% List<InnovatoresPersonalInfo> innvoatoreslist = (List<InnovatoresPersonalInfo>) request.getAttribute("innovations"); %>
<table border="1">
<tr>
<th>Date</th>
<th>Id_Aadar</th>
<th>UserName</th>
<th>Password</th>
<th>Gender</th>
<th>Date of Birth</th>
<th>Department</th>
<th>CollegeName</th>
<th>ContactNo</th>
<th>EmailId</th>
<th>Address</th>
<th>innovations</th>
</tr>

<% for(InnovatoresPersonalInfo i:innvoatoreslist)
{
	pageContext.setAttribute("Date",i.getDate());
	pageContext.setAttribute("Idadhar",i.getIdadhar());
	pageContext.setAttribute("Username",i.getUsername())	;
	pageContext.setAttribute("Password",i.getPassword());
	pageContext.setAttribute("Gender",i.getGender());
	pageContext.setAttribute("Dateofbirth",i.getDob());
	pageContext.setAttribute("Department",i.getDepartment());
	pageContext.setAttribute("collegename",i.getCollegename());
	pageContext.setAttribute("ContactNo",i.getContactno());
	pageContext.setAttribute("Emailid",i.getEmail());
	pageContext.setAttribute("Address",i.getAddress());

%>
<tr>
<td>${Date}</td>
<td>${Idadhar}</td>
<td>${Username}</td>
<td>${Password}</td>
<td>${Gender}</td>
<td>${Dateofbirth}</td>
<td>${Department}</td>
<td>${collegename}</td>
<td>${ContactNo}</td>
<td>${Emailid}</td>
<td>${Address}</td>
</tr>

<%
}
%>
</table>
</body>

</html>