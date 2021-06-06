package br.com.lucasagw.servlet.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.lucasagw.servlet.model.PapelEnum;
import br.com.lucasagw.servlet.model.Usuario;

public class UsuarioDAO {

	private static final List<Usuario> usuarios = new ArrayList<>();

	static {
		usuarios.add(new Usuario("pedro", "1234", PapelEnum.ADMINISTRADOR));
	}

	public void insert(Usuario usuario) {
		usuarios.add(usuario);
	}

	public void remove(String login) {
		Usuario paraExcluir = null;
		for (Usuario usuario : usuarios) {
			if (usuario.getLogin().equals(login)) {
				paraExcluir = usuario;
			}
		}
		if (paraExcluir != null) {
			this.remove(paraExcluir);
		}
	}

	public void remove(Usuario usuario) {
		usuarios.remove(usuario);

	}

	public List<Usuario> selectAll() {
		return usuarios;
	}

	public boolean login(Usuario usuario) {
		return usuarios.contains(usuario);
	}

	public Usuario findByUsuario(Usuario usuario) {
		int index = usuarios.indexOf(usuario);
		return usuarios.get(index);
	}

}
