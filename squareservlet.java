package com.serveletdemo1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class squareservlet extends HttpServlet {
	public void service(HttpServletRequest req ,HttpServletResponse res)throws IOException{
		 HttpSession session=req.getSession();
			int result= (int) session.getAttribute("ans");
			
		 	result=result * result;
			PrintWriter out=res.getWriter();
			out.print("session square: "+result );
	}
}
