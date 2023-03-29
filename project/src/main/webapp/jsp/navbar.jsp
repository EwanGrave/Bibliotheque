<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<nav class="navbar navbar-expand-lg bg-body-tertiary">
	<div class="container-fluid">
		<a class="navbar-brand" href="#">Bibliothèque</a>
	    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
	      <span class="navbar-toggler-icon"></span>
	    </button>
	    <div class="collapse navbar-collapse" id="navbarNavDropdown">
	      <ul class="navbar-nav">
	        <li class="nav-item">
	          <a class="nav-link" href="#">Livres</a>
	        </li>
	        <li class="nav-item">
	          <a class="nav-link" href="#">Mes emprunts</a>
	        </li>
	        <li class="nav-item">
	          <a class="nav-link" href="login">Connexion</a>
	        </li>
	        <li class="nav-item">
	          <a class="nav-link" href="#">Inscription</a>
	        </li>
	        <li class="nav-item">
	          <a class="nav-link" href="#">Déconnexion</a>
	        </li>
	      </ul>
	    </div>
	    <form class="d-flex" role="search">
	      <input class="form-control me-2" type="search" size="30" placeholder="Entrez un nom de livre" aria-label="Search">
	      <button class="btn btn-outline-success" type="submit">Chercher</button>
	    </form>
	</div>
</nav>