package com.xworkz.engineering;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/send")
public class EngineeringServlet extends HttpServlet{
	
	public EngineeringServlet() {
		System.out.println("this is EngineeringServlet");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("this is do get method");
		
	}

}
