package com.wcg.training.sso;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "MyServlet3NoRole", urlPatterns = { "/MyServlet3NoRole"})
public class MyServlet3NoRole extends HttpServlet {

	private static final long serialVersionUID = 4524049326350176514L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().print("<HTML><body>");
        resp.getWriter().print("<h2><font color=\"#0000FF\"><b>My Servlet in Servlet 3.X without Fixed Role</b></font></h2>");

        MyServletUtil.printUserPrincipal(req,resp);
        
        boolean authenticated = req.authenticate(resp);
        
        resp.getWriter().print("<p>");
        resp.getWriter().print("Authenticated = "+authenticated);
        resp.getWriter().print("</p>");
        
        if(authenticated){
        	MyServletUtil.printUserPrincipal(req,resp);
        }
        
        resp.getWriter().print("</body></HTML>");
        resp.getWriter().flush();
	}
}
