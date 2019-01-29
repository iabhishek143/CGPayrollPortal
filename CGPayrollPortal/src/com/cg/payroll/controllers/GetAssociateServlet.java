package com.cg.payroll.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.payroll.beans.Associate;
import com.cg.payroll.exceptions.AssociateDetailsNotFoundException;
import com.cg.payroll.services.PayrollServices;
import com.cg.payroll.services.PayrollServicesImpl;

@WebServlet("/GetAssociateServlet")
public class GetAssociateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PayrollServices services= new PayrollServicesImpl();
	Associate associate;
	public GetAssociateServlet() {
		super();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		int associateID = Integer.parseInt(request.getParameter("associateID"));
		try {
			associate= services.getAssociateDetails(associateID);
		} catch (AssociateDetailsNotFoundException e) {
			e.printStackTrace();
		}
		request.setAttribute("associate", associate);
        request.getRequestDispatcher("AssociateDetails.jsp").forward(request, response);		
	}
}
