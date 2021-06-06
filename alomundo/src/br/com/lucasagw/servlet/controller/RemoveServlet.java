package br.com.lucasagw.servlet.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.lucasagw.servlet.dao.UsuarioDAO;

/**
 * Servlet implementation class RemoveServlet
 */

public class RemoveServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 411643245767933493L;
		
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	  String id = req.getParameter("id");
	  
	  UsuarioDAO dao = new UsuarioDAO();
	  dao.remove(id);
	 
	  resp.sendRedirect("./listar");
	  
		
		
	}


}


