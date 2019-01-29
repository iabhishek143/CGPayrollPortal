package com.cg.payroll.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.payroll.beans.Salary;
import com.cg.payroll.exceptions.AssociateDetailsNotFoundException;
import com.cg.payroll.services.PayrollServices;
import com.cg.payroll.services.PayrollServicesImpl;

@WebServlet("/CalculateSalaryServlet")
public class CalculateSalaryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PayrollServices services= new PayrollServicesImpl();
	Salary salary;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		int associateID = Integer.parseInt(request.getParameter("associateID"));
		try {
			services.calculateNetSalary(associateID);
			salary= services.getAssociateDetails(associateID).getSalary();
		} catch (AssociateDetailsNotFoundException e) {
			e.printStackTrace();
		}		
		request.setAttribute("salary", salary);
        request.getRequestDispatcher("SalaryCalculated.jsp").forward(request, response);
	}
}
