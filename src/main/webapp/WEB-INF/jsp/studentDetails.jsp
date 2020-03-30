<%@ include file="header.jsp"%>

<html>
<head>
	<title>Page</title>
	<style type="text/css">
		.tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
		.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
		.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
		.tg .tg-4eph{background-color:#f9f9f9}
	</style>
</head>
<body>
<center><h1>
	Enter Details
</h1></center>



<c:url var="addAction" value="/student/add" ></c:url>

<center><form:form action="${addAction}" modelAttribute="student">
<table>
	<c:if test="${!empty student.studentName}">
	<tr>
		<td>
			<form:label path="studentId">
				<spring:message text="studentId"/>
			</form:label>
		</td>
		<td>
			<form:input path="studentId" readonly="true" size="8"  disabled="true" />
			<form:hidden path="studentId" />
		</td> 
	</tr>
	</c:if>
	<tr>
		<td>
			<form:label path="studentName">
				<spring:message text="Student Name"/>
			</form:label>
		</td>
		<td>
			<form:input path="studentName" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="studentAge">
				<spring:message text="Student Age"/>
			</form:label>
		</td>
		<td>
			<form:input path="studentAge" />
		</td>
	</tr>
	<tr>
		<td>
			<form:label path="studentPhone">
				<spring:message text="Student Phone"/>
			</form:label>
		</td>
		<td>
			<form:input path="studentPhone" />
		</td>
	</tr>
	
	<tr>
	<td></td>
		<td colspan="2">
			<c:if test="${!empty student.studentName}">
				<input type="submit"
					value="<spring:message text="Update"/>" />
			</c:if>
			<c:if test="${empty student.studentName}">
				<input type="submit"
					value="<spring:message text="Add Student"/>" />
			</c:if>
		</td>
	</tr>
</table>	
</form:form></center>
<br>
<center><h3>Student Details List</h3>
<c:if test="${!empty allStudents}">
	<table class="tg">
	<tr>
		<th width="100">Student ID</th>
		<th width="120">Student Name</th>
		<th width="120">Student Age</th>
		<th width="120">Student Phone</th>
		<th width="120">Update/Delete</th>
	</tr>
	<c:forEach items="${allStudents}" var="student">
		<tr>
			<td>${student.studentId}</td>
			<td>${student.studentName}</td>
			<td>${student.studentAge}</td>
			<td>${student.studentPhone}</td>
			<td><a href="<c:url value='/update/${student.studentId}' />" >Update</a> |
			<a href="<c:url value='/remove/${student.studentId}' />" >Delete</a></td>
		</tr>
	</c:forEach>
	</table>
</c:if></center>
</body>
</html>