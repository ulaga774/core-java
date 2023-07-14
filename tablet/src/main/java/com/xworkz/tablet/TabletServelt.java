package com.xworkz.tablet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.tablet.dto.TabletDto;
@WebServlet(urlPatterns = "/medical")
public class TabletServelt extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("this is dopost method");
		TabletDto dto = new TabletDto();
		dto.setName(req.getParameter("name"));
		dto.setDosage(req.getParameter("dosage"));
		dto.setManufacturingDate(req.getParameter("date"));
		dto.setType(req.getParameter("type"));
		dto.setCompanyName(req.getParameter("companyName"));

		resp.setContentType("text/HTML");
		PrintWriter writer = resp.getWriter();
		writer.println(dto);
	}

}
