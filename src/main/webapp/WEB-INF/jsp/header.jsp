<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false" isELIgnored="false"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>Student Details</title>
<style type="text/css">
body {
	padding-top: 60px;
	padding-bottom: 40px;
	background: yellow;
}

.fixed-header, .fixed-footer {
	width: 100%;
	position: fixed;
	background: darkblue;
	padding: 10px 0;
	color: #fff;
}

.fixed-header {
	top: 0;
}

.fixed-footer {
	bottom: 0;
}

.container {
	width: 80%;
	margin: 0 auto; /* Center the DIV horizontally */
}

nav a {
	color: #fff;
	text-decoration: none;
	padding: 7px 25px;
	display: inline-block;
}
    h1{
        text-decoration-color: chocolate;
    }
</style>
</head>
<body>
	<center>
		<u><h1>Registration Form</h1></u>
	</center>
	<center><div class="fixed-header">
		<div class="container">
			<nav>
				<a href="index">Home</a> <a href="studentDetails">StudentDetails</a>
			</nav>
		</div>
	</div>
	
	<div class="fixed-footer">
		<div class="container">Copyright &copy; 2020</div>
	</div></center>
	<a href="studentDetails">StudentDetails</a>
	
</body>
</html>


