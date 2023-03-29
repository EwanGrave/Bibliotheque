<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Inscription</title>
	<link rel="icon" href="assets/img/icon.png">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-aFq/bzH65dt+w6FI2ooMVUpc+21e0SRygnTpmBvdBgSdnuTN7QbdgL+OapgHtvPp" crossorigin="anonymous">
</head>
<body>

	<!-- barre de navigation -->
	<jsp:include page="navbar.jsp" />
	
	<div class="m-4 d-flex justify-content-center">
	
		<form method="post" class="w-50">
			<h2 class="mb-3">Inscription</h2>
			<div class="form-group">
		  		<label for="username">Nom d'utilisateur</label>
		    	<input type="text" class="form-control" id="username" name="username" placeholder="Nom d'utilisateur">
		  	</div>
		  	<div class="form-group mt-3">
		    	<label for="password">Mot de passe</label>
		    	<input type="password" class="form-control" id="password" placeholder="Mot de passe" name="password">
		  	</div>
		  	<div class="form-group mt-3">
		    	<label for="password2">Confirmer mot de passe</label>
		    	<input type="password" class="form-control" id="password2" placeholder="Mot de passe" name="password2">
		  	</div>
		  	<button type="submit" class="btn btn-primary mt-3">S'inscrire</button>
		</form>
	</div>

	<!-- import bootstrap -->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/js/bootstrap.bundle.min.js" integrity="sha384-qKXV1j0HvMUeCBQ+QVp7JcfGl760yU08IQ+GpUo5hlbpg51QRiuqHAJz8+BrxE/N" crossorigin="anonymous"></script>

</body>
</html>