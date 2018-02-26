<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastro de Usuário</title>
</head>
<body>
	<form action="/cadastro-usuario" method="POST">
		<label>Nome</label>
		<input name="usuario" id="id_usuario" type="text">
		<label>E-mail</label>
		<input name="email" id="id_email" type="email">
		<label>Senha</label>
		<input name="senha" id="id_senha" type="password">
		<label>Data de Nascimento</label>
		<input name="data" id="id_data" type="date">
		<button type="submit">Enviar</button>
	</form>
</body>
</html>