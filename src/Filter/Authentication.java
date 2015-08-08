package Filter;

import java.io.IOException;
//import java.nio.channels.SeekableByteChannel;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
// /Admin/*
public class Authentication implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		System.out.println("Authentication!");
		HttpSession session = ((HttpServletRequest)request).getSession();
		if(session.getAttribute("admin") == null){// || session.getAttribute("editor") == null){
			System.out.println("NULL");
			System.out.println(session.getAttribute("admin"));
			((HttpServletResponse)response).sendRedirect("/articleManagement/LoginProcess");
		}
		else{
			System.out.println("NOT NULL");
			chain.doFilter(request, response);
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
