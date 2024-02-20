<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ajouter un Matériel</title>
</head>
<body>
<h2>Ajouter un Matériel:</h2>

<form:form action="addMat1" modelAttribute="m" method="POST">
<form:input path="id" type="hidden" />
Titre: <form:input path="titre" type="text" />
    Type:<form:select path="type">
<form:option value="Reseaux">Reseaux</form:option>
<form:option value="Civil">Civil</form:option>
<form:option value="Mecanique">Mecanique</form:option>
</form:select>
    Serie: <form:input path="Num" type="text" />
    Quantité: <form:input path="quantity" type="text" />
    Etat: <form:select path="etat">
<form:option value="true">fonctionnel</form:option>
<form:option value="false">defecueux</form:option>
</form:select>
<br>
    Departement: <form:select path="dep.id">
<form:options items="${ld}" itemLabel="titre" itemValue="id" />
</form:select>
<br>
<input type="submit" value="enregistrer">
</form:form>
</body>
</html>
