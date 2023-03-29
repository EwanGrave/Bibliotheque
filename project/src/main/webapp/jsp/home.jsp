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
	<nav class="navbar navbar-expand-lg bg-body-tertiary">
	  <div class="container-fluid">
	    <a class="navbar-brand" href="#">Bibliothèque</a>
	    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
	      <span class="navbar-toggler-icon"></span>
	    </button>
	    <div class="collapse navbar-collapse" id="navbarNavDropdown">
	      <ul class="navbar-nav">
	        <li class="nav-item">
	          <a class="nav-link active" aria-current="page" href="#">Livres</a>
	        </li>
	        <li class="nav-item">
	          <a class="nav-link" href="#">Mes emprunts</a>
	        </li>
	        <li class="nav-item">
	          <a class="nav-link" href="#">Connexion</a>
	        </li>
	        <li class="nav-item">
	          <a class="nav-link" href="#">Déconnexion</a>
	        </li>
	      </ul>
	    </div>
	    <form class="d-flex" role="search">
	      <input class="form-control me-2" type="search" placeholder="Chercher un livre" aria-label="Search">
	      <button class="btn btn-outline-success" type="submit">Chercher</button>
	    </form>
	  </div>
	</nav>
	
	<!-- liste des livres -->
	<div class="mt-4">
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

	<!-- import bootstrap -->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/js/bootstrap.bundle.min.js" integrity="sha384-qKXV1j0HvMUeCBQ+QVp7JcfGl760yU08IQ+GpUo5hlbpg51QRiuqHAJz8+BrxE/N" crossorigin="anonymous"></script>

</body>
</html>