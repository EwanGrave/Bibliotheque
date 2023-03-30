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
	          <a class="nav-link" href="books">Livres</a>
	        </li>
	        <c:choose>
	        	<c:when test="${ USER != null }">
			        <li class="nav-item">
			         	<a class="nav-link" href="#">Mes emprunts</a>
			        </li>
			        <li class="nav-item">
			         	<a class="nav-link" href="logout">Déconnexion</a>
			        </li>
	        	</c:when>
	        	<c:otherwise>
	        		<li class="nav-item">
			         	<a class="nav-link" href="login">Connexion</a>
			        </li>
			        <li class="nav-item">
			         	<a class="nav-link" href="signin">Inscription</a>
			        </li>
	        	</c:otherwise>
	        </c:choose>
	      </ul>
	    </div>
	</div>
</nav>