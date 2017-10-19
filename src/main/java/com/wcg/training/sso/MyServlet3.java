package com.wcg.training.sso;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.HttpConstraint;
import javax.servlet.annotation.ServletSecurity;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "MyServlet3", urlPatterns = { "/MyServlet3"})
@ServletSecurity(@HttpConstraint(rolesAllowed = { "MyRole" }))
public class MyServlet3 extends HttpServlet {

	private static final long serialVersionUID = 4524049326350176514L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().print("<HTML><body>");
        resp.getWriter().print("<h2><font color=\"#0000FF\"><b>My Servlet in Servlet 3.X</b></font></h2>");

        MyServletUtil.printUserPrincipal(req, resp);
        
        resp.getWriter().print("</body></HTML>");
        resp.getWriter().flush();
	}
}
