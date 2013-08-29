package test.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * @author novas
 */
public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = -3209961134369299491L;

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		super.service(arg0, arg1);
		System.out.println("SimpleServlet-service(http)");
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		super.service(arg0, arg1);
		System.out.println("SimpleServlet-service(serlvet)");
	}

	@Override
	public void destroy() {
		super.destroy();
		System.out.println("SimpleServlet-destroy()");
	}

	@Override
	public void init() throws ServletException {
		super.init();
		System.out.println("SimpleServlet-init()");
	}
	
}
