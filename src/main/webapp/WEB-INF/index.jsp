<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css" />
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Books Assignment</title>
</head>
<body>
	<h1>Books Render All Test</h1>
	<p>${allBooks}</p>
	<table>
		<thead>
			<tr>
				<th>Id</th>
				<th>Title</th>
				<th>Language</th>
				<th>Pages</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${allBooks}" var="book">
				<tr>
					<td><c:out value="${book.id}" /></td>
					<td><a href="/books/${book.id}">${book.title}</a></td>
					<td><c:out value="${book.language}" /></td>
					<td><c:out value="${book.numberOfPages}" /></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>