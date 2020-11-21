<%@ page language="java" contentType="text/html; charset=windows-1256"
 pageEncoding="windows-1256"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<link rel="stylesheet" type="text/css"
href="webjars/bootstrap/4.3.1/css/bootstrap.min.css" />
<c:url value="/css/main.css" var="jstlCss" />
<link href="${jstlCss}" rel="stylesheet" />
<script type="text/javascript"
src="webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Modifier un Movie</title>
</head>
<body>
<div class="container mt-5">
<div class="card-body">
<form action="updateMovie" method="post">
 <div class="form-group">
 <label class="control-label">ID Movie :</label>
 <input type="text" name="idMovie" value="${movie.idMovie}"
readonly class="form-control"/>
 </div>
 <div class="form-group">
 <label class="control-label">Nom Movie :</label>
 <input type="text" name="nomMovie" value="${movie.nomMovie}"
class="form-control"/>
 </div>
 <div class="form-group">
 <label class="control-label">Prix Movie :</label>
 <input type="text" name="prixMovie" value="${movie.prixMovie}"
class="form-control"/>
 </div>
 <div class="form-group">
 <label class="control-label"> Date création :</label>
 <fmt:formatDate pattern="yyyy-MM-dd" value="${movie.dateCreation}"
var="formatDate" />
 <input type="date" name="date" value="${formatDate}" class="formcontrol"/>
 </div>
 <div>
 <button type="submit" class="btn btn-primary">Modifier</button>
</div>
</form>
</div>
<br/>
<br/>
<a href="Listemovies">Liste movies</a>
</div>
</body>
</html>