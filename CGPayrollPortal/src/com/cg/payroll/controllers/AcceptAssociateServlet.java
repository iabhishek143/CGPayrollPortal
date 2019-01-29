package com.cg.payroll.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.payroll.beans.Associate;
import com.cg.payroll.beans.BankDetails;
import com.cg.payroll.beans.Salary;
import com.cg.payroll.exceptions.AssociateDetailsNotFoundException;
import com.cg.payroll.services.PayrollServices;
import com.cg.payroll.services.PayrollServicesImpl;

@WebServlet("/AcceptAssociateServlet")
public class AcceptAssociateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PayrollServices services= new PayrollServicesImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String firstName= request.getParameter("firstname");
		String lastName= request.getParameter("lastname");
		String emailId = request.getParameter("email");
		String department= request.getParameter("department");
		String designation= request.getParameter("designation");
		String pancard= request.getParameter("pannumber");
		String bankName= request.getParameter("bankname");
		String ifscCode= request.getParameter("ifsc");
		int yearlyInvestmentUnder80C = Integer.parseInt(request.getParameter("investment"));
		int basicSalary= Integer.parseInt(request.getParameter("basicsal"));
		int accountNumber= Integer.parseInt(request.getParameter("accnumber"));
		int epf = Integer.parseInt(request.getParameter("epf"));
        int companyPf = Integer.parseInt(request.getParameter("cpf"));
        
        Associate associate=new Associate(yearlyInvestmentUnder80C, firstName, lastName, department, designation, pancard, emailId, 
                new Salary(basicSalary, epf, companyPf), new BankDetails(accountNumber, bankName, ifscCode));
		
		try {
			services.acceptAssociateDetails(associate);
		} catch (AssociateDetailsNotFoundException e) {
			e.printStackTrace();
		}
		request.setAttribute("associate", associate);
        RequestDispatcher dispatcher=request.getRequestDispatcher("AcceptedAssociate.jsp");
        dispatcher.forward(request, response);
	}
}
