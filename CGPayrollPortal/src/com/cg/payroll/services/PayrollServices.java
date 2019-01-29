package com.cg.payroll.services;

import java.util.List;

import com.cg.payroll.beans.Associate;
import com.cg.payroll.beans.BankDetails;
import com.cg.payroll.beans.Salary;
import com.cg.payroll.exceptions.AssociateDetailsNotFoundException;

public interface PayrollServices {
	int acceptAssociateDetails(Associate associate) throws AssociateDetailsNotFoundException;

	int calculateNetSalary(int associateID) throws AssociateDetailsNotFoundException;
	Associate getAssociateDetails(int associateID) throws AssociateDetailsNotFoundException;
	List<Associate> getAllAssociateDetails();
}
