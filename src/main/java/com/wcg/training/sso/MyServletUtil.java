package com.wcg.training.sso;

import java.io.IOException;
import java.security.Principal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServletUtil {
	private static final String MY_ROLE = "MyRole";
	
	private MyServletUtil(){
		
	}

	public static void printUserPrincipal(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		Principal userPrincipal = req.getUserPrincipal();
		
		resp.getWriter().print("<p>");
        resp.getWriter().print("User Principal = "+(userPrincipal==null ? null :userPrincipal.getClass().getName()));
        resp.getWriter().print("</p>");
        
        resp.getWriter().print("<p>");
        resp.getWriter().print("Login user = "+ (userPrincipal==null ? null : userPrincipal.getName()));
        resp.getWriter().print("</p>");
        
        resp.getWriter().print("<p>");
        resp.getWriter().print("User in role 'MyRole' = "+ req.isUserInRole(MY_ROLE));
        resp.getWriter().print("</p>");
	}
}
