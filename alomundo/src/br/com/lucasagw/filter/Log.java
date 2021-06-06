package br.com.lucasagw.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class Log
 */
@WebFilter("/*") //filtrando qualquer chamada com destino pra qualquer recurso do servidor
public class Log implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("Requisição " + request.getRemoteAddr());
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		Object object = httpRequest.getSession().getAttribute("usuario");
		if(object == null) {
			System.out.println("ANONIMO");	

		}
		chain.doFilter(request, response);//Continua a chamada
		System.out.println("Response");
	}
}
