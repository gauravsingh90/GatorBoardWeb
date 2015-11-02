<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-nested" prefix="nested"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>GatorBoard Login</title>
<link rel="stylesheet" href="theme/master.css" type="text/css">

</head>
<body>
	<div class='ui-main'>
		<div class='ui-header'>Login</div>
		<form action="SectionOne.do" method="post">
		<div class='ui-row'>
			<div class='ui-lbl'>Enter Pin NO</div>
			<input class='ui-text' type="text" name="PinNo" >
			<div class='ui-lbl'></div>
			<!-- <input type="submit" value="Submit" class='ui-text'> -->
		</div>
		<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
		</form>		
	</div>

</body>
</html>


