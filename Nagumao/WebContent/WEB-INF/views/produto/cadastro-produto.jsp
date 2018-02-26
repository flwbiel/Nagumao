<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastro de Produtos</title>
</head>
<body>
	<form action="/cadastro-produto" method="POST">
		<label>Produto</label>
		<input name="produto" id="id_produto" type="text">
		<label>Preço</label>
		<input name="preco" id="id_preco" type=text">
		<label>Data de Cadastro</label>
		<input name="data" id="id_data" type="date">
		<button type="submit">Enviar</button>
	</form>
</body>
</html>