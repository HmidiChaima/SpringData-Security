<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Liste des Matériels</title>
</head>
<body>
<h2>Liste des Matériels</h2>
<h4>Département choisi : ${d.titre}</h4>
<c:set var="cxt" value="${pageContext.request.contextPath}" />
<a href="${cxt}/addMat">Ajouer un matériel</a>
<table border="1">
<thead>
<tr>
<th>ID</th>
<th>Titre</th>
<th>Type</th>
<th>Série</th>
<th>Quantité</th>
<th>Etat</th>
<th>Action</th>
</tr>
</thead>
<tbody>
<c:forEach var="mat" items="${mat}">
<tr>
<td>${mat.id}</td>
<td>${mat.titre}</td>
<td>${mat.type}</td>
<td>${mat.num}</td>
<td>${mat.quantity}</td>
<td>${mat.etat}</td>
<td><a href="${cxt}/delMat/${mat.id}/${d.id}">Supprimer</a></td>
</tr>
</c:forEach>
</tbody>
</table>
</body>
</html>
