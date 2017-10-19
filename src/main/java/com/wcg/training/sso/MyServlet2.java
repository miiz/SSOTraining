package com.wcg.training.sso;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet2 extends HttpServlet {
	private static final long serialVersionUID = 7824126306997445766L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.getWriter().print("<HTML><body>");
        resp.getWriter().print("<h2><font color=\"#0000FF\"><b>My Servlet in Servlet 2.X</b></font></h2>");

        MyServletUtil.printUserPrincipal(req, resp);
        
        resp.getWriter().print("</body></HTML>");
        resp.getWriter().flush();
	}
}
