<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search</title>
</head>
<body>
<h1>WELCOME TO SEARCH PAGE...</h1><br><hr><br>

<s:form action="tutorials/getTutorial">
<s:textfield label="Enter the language to search" key="language"/>
<s:submit/>
</s:form>

<!-- <form method="post" action="tutorials/getTutorial">
<input type="text" name="language" id="language"/>
<input type="submit"/>
</form> -->

</body>
</html>