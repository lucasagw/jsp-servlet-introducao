package br.com.lucasagw.servlet.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.com.lucasagw.servlet.dao.UsuarioDAO;
import br.com.lucasagw.servlet.model.Usuario;


@WebServlet("/sistema/listar")
public class ListarServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6533332496158057034L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		UsuarioDAO dao = new UsuarioDAO();
		dao.selectAll();
		List<Usuario> usuarios = dao.selectAll();
	
		//req.getSession().getAttribute("usuario");
		
		req.setAttribute("lista", usuarios);
		req.getRequestDispatcher("lista.jsp").forward(req, resp);

	}

}
