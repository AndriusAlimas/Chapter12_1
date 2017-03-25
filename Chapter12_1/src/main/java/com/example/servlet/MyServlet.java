package com.example.servlet;

import java.io.PrintWriter;
import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;

public class MyServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, 
			HttpServletResponse response)throws IOException,ServletException{
		PrintWriter out = response.getWriter();
		if(request.isUserInRole("Manager")){
		out.println("YES!! You are a Maneger and you can access it!");
		}
		
	}
}
