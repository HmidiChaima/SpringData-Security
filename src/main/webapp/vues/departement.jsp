<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Liste des Departements</title>
</head>
<body>
<h2>Liste des Departements</h2>

<c:set var="cxt" value="${pageContext.request.contextPath}" />

<table border="1">
<thead>
<tr>
<th>ID</th>
<th>Titre</th>
<th>Action</th>
</tr>
</thead>
<tbody>
<c:forEach var="deps" items="${deps}">
<tr>
<td>${deps.id}</td>
<td>${deps.titre}</td>
<td><a href="${cxt}/matieres/${deps.id}">Liste de Maieres</a></td>
</tr>
</c:forEach>
</tbody>
</table>
</body>
</html>
