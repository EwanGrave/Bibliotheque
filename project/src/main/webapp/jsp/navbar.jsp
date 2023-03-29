<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<nav class="navbar navbar-expand-lg bg-body-tertiary">
	<div class="container-fluid">
		<a class="navbar-brand" href="#">Biblioth�que</a>
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
	          <a class="nav-link" href="#">Connexion</a>
	        </li>
	        <li class="nav-item">
	          <a class="nav-link" href="#">D�connexion</a>
	        </li>
	      </ul>
	    </div>
	    <form class="d-flex" role="search">
	      <input class="form-control me-2" type="search" placeholder="Chercher un livre" aria-label="Search">
	      <button class="btn btn-outline-success" type="submit">Chercher</button>
	    </form>
	</div>
</nav>