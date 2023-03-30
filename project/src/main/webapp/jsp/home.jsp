<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Bibliothèque - Liste des livres</title>
	<link rel="icon" href="assets/img/icon.png">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-aFq/bzH65dt+w6FI2ooMVUpc+21e0SRygnTpmBvdBgSdnuTN7QbdgL+OapgHtvPp" crossorigin="anonymous">
</head>
<body>

	<!-- barre de navigation -->
	<jsp:include page="navbar.jsp" />
	
	<div class="m-4">
		<form class="w-50" method="post">
			<input class="form-control mt-2" type="text" placeholder="Entrez un nom de livre" name="bookName">
			<input class="form-control mt-2" type="text" placeholder="Entrez un nom d'auteur" name="authorName">
			<select class="form-select mt-2" name="genre">
			 	<option selected>Open this select menu</option>
			 	<option value="1">One</option>
			 	<option value="2">Two</option>
			 	<option value="3">Three</option>
			</select>
			<input class="form-check-input mt-2" type="checkbox" id="flexCheckChecked" name="dispo">
			<label class="form-check-label" for="flexCheckChecked">
			    Disponible
			</label>
		    <button class="btn btn-outline-success mt-2" type="submit">Chercher</button>
		</form>
		
		<!-- liste des livres -->
		<div class="mt-4">
			<c:forEach >
			
			</c:forEach>
			<div class="card" style="width: 18rem;">
				<img src="..." class="card-img-top" alt="...">
			  	<div class="card-body">
			    	<h5 class="card-title">Card title</h5>
			    	<p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
			  	</div>
			  	<div class="card-body">
			    	<a href="#" class="card-link">Card link</a>
			    	<a href="#" class="card-link">Another link</a>
		 		</div>
			</div>
		</div>
	</div>

	<!-- import bootstrap -->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/js/bootstrap.bundle.min.js" integrity="sha384-qKXV1j0HvMUeCBQ+QVp7JcfGl760yU08IQ+GpUo5hlbpg51QRiuqHAJz8+BrxE/N" crossorigin="anonymous"></script>

</body>
</html>