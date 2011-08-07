package org.springframework.issues.spr8551;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class InitServlet extends HttpServlet{


	public void init() throws ServletException  {

		System.out.println("InitServlet initialized");
	}
}
