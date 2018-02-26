<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="/spring-livraria/usuario/salvar">
		<label>
			Nome
			<input type="text" name="nome">
		</label><br>
		<label>
			Sobrenome
			<input type="text" name="sobrenome">
		</label><br>
		<label>
			Data de nascimento
			<input type="date" name="dataNascimento">
		</label><br>
		<label>
			Email
			<input type="email" name="email">
		</label><br>
		<label>
			Senha
			<input type="password" name="senha">
		</label><br>
		<label>
			Confirmar senha
			<input type="password">
		</label><br>
		<button type="submit">Salvar</button>
	</form>
</body>
</html>