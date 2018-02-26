package br.senai.informatica.nagumao.DAO;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.senai.informatica.nagumao.models.Usuario;

@Repository
public class UsuarioDAO implements DAO<Usuario> {

	@Override
	public Usuario buscar(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void inserir(Usuario obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletar(Usuario obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterar(Usuario obj) {
		// TODO Auto-generated method stub
		
	}

}
