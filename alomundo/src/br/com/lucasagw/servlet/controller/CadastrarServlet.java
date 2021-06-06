package br.com.lucasagw.servlet.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.lucasagw.servlet.dao.UsuarioDAO;
import br.com.lucasagw.servlet.model.PapelEnum;
import br.com.lucasagw.servlet.model.Usuario;

/**
 * Servlet implementation class CadastrarServlet
 */
@WebServlet("/sistema/cadastrar")
public class CadastrarServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8290594942019766879L;
	
	
     @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	String login = req.getParameter("login");
    	String senha = req.getParameter("senha");
    	String papel = req.getParameter("papel");
    	
    	//testar se o papel é != ""
    	Usuario usuario = new Usuario(login, senha, PapelEnum.valueOf(papel));
    	
    	//DAO
    	UsuarioDAO dao = new UsuarioDAO();
    	dao.insert(usuario);
    	
    	resp.sendRedirect("./sistema.jsp");
    	
    	
         
 
      } 
  
}
