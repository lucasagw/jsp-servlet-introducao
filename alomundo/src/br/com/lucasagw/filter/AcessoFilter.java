package br.com.lucasagw.filter;

import javax.servlet.annotation.WebFilter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter("/sistema/*")
public class AcessoFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		Object object = httpRequest.getSession().getAttribute("usuario");
		System.out.println("Filtro de Acesso");
		if(object == null) {
			HttpServletResponse httpResponse = (HttpServletResponse) response;
			httpResponse.sendRedirect("login.jsp");

		}else {
		chain.doFilter(request, response);//Continua a chamada
	}
	}
}
