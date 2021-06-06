package br.com.lucasagw.servlet.controller;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.lucasagw.servlet.dao.UsuarioDAO;
import br.com.lucasagw.servlet.model.Usuario;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6294305486895538521L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Writer out = response.getWriter();

		// Parametro = Serve para Enviar dados do Cliente para o Servidor
		// sempre retorna e guarda String.
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		Usuario usuario = new Usuario(login, senha); //objeto simples da tela de login

		// Atributos
		// Ficam em um escopo - PAGE, REQUEST, SESSION, APLICATION
		// Sempre retorna e guarda "Object"

//		if (usuario.getLogin() != null && usuario.getLogin().equals(usuario.getSenha())) {
		UsuarioDAO dao = new UsuarioDAO();
		if (dao.login(usuario)) {
			HttpSession session = request.getSession();
			usuario = dao.findByUsuario(usuario); //pra selecionar exatamente o usuario completo de atributos, valido da dao. 
			// session.setAttribute("USER", usuario.getLogin());
			// Instancia do Tipo Usuario
			session.setAttribute("usuario", usuario);

//			//Application... registrando quantas pessoas logaram no servidor.
//			Object logins =	request.getSession().getServletContext().getAttribute("LOGINS");
//			//Se não existe um atributo LOGINS = NULL
//			if(logins == null) {
//				//criando
//				request.getSession().getServletContext().setAttribute("LOGINS", 1);
//			}else {
//				int l = (int) logins;
//				l++;
//				//atualizando
//				request.getSession().getServletContext().setAttribute("LOGINS", l);
//
//			}
			// forward
			// 200
			// > play >> forward
			response.sendRedirect("./sistema/sistema.jsp");
			
			//os dados estão na session. Perdeu a necessidade de encaminhar a requisição.
//			RequestDispatcher dispatcher = request.getRequestDispatcher("./sistema/sistema.jsp");
//			dispatcher.forward(request, response);

		
		} else {
			// 3XX
			// redirect
			response.sendRedirect("./login.jsp");

			// <a href="./login.jsp">voltar</a>
		}

	}

	// 2XX - OK
	// 3XX - REDIRECIONAR
	// 400 - BAD REQUEST - ERRO DO CLIENTE, DIGITAÇÃO
	// 404 - NÃO ENCONTRADO
	// 405 - NÃO SUPORTA METODO (POST/GET)
	// 500 - ERRO DO LADO DO SERVIDOR

}
