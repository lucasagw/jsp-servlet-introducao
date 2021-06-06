package br.com.lucasagw.servlet;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/alomundo")
public class AloMundoServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5367576952634431381L;

	/**
	 * HttpServletRequest request - requisição do usuario
	 * HttpServletResponse response - resposta do servidor
	 */

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Writer out = resp.getWriter();
		out.write("<!DOCTYPE html>");
		out.write("<HTML>");
		out.write("<HEAD>");
		out.write("<TITLE>PAGINA DO SERVLET</TITLE>");
		out.write("</HEAD>");
		out.write("<BODY>");

		out.write("<H1>SERVICE "+req.getMethod() + "</H1>");

		out.write("</BODY>");
		out.write("</HTML>");
	}


	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("no console");

		//posso pegar parametros ou dados enviados pelo cliente
		//request
		String valor = request.getParameter("nome");
		System.out.println("nome: " + valor);

		Writer out = response.getWriter();
		out.write("<!DOCTYPE html>");
		out.write("<HTML>");
		out.write("<HEAD>");
		out.write("<TITLE>PAGINA DO SERVLET</TITLE>");
		out.write("</HEAD>");
		out.write("<BODY>");

		out.write("<H1>ALO MUNDO</H1>");

		out.write("</BODY>");
		out.write("</HTML>");




	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Writer out = resp.getWriter();
		out.write("<!DOCTYPE html>");
		out.write("<HTML>");
		out.write("<HEAD>");
		out.write("<TITLE>PAGINA DO SERVLET</TITLE>");
		out.write("</HEAD>");
		out.write("<BODY>");

		out.write("<H1>DO POST</H1>");

		out.write("</BODY>");
		out.write("</HTML>");


	}

}
