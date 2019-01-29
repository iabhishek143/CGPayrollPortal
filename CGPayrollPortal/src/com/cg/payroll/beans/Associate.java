package com.cg.payroll.beans;

import javax.persistence.*;

@Entity
public class Associate {
	@Id
	@GeneratedValue
	@Column(name = "associateID", updatable = false, nullable = false)
	private int associateID;
	private int yearlyInvestmentUnder80C;
	private String firstName, lastName, department, designation, pancard, emailId;
	@Embedded
	Salary salary;
	@Embedded
	BankDetails bankDetails;

	public Associate() {	}

	public Associate(int yearlyInvestmentUnder80C, String firstName, String lastName, String department,
			String designation, String pancard, String emailId, Salary salary, BankDetails bankDetails) {
		super();
		this.yearlyInvestmentUnder80C = yearlyInvestmentUnder80C;
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.designation = designation;
		this.pancard = pancard;
		this.emailId = emailId;
		this.salary = salary;
		this.bankDetails = bankDetails;
	}

	public Associate(int associateID, int yearlyInvestmentUnder80C, String firstName, String lastName,
			String department, String designation, String pancard, String emailId, Salary salary,
			BankDetails bankDetails) {
		super();
		this.associateID = associateID;
		this.yearlyInvestmentUnder80C = yearlyInvestmentUnder80C;
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.designation = designation;
		this.pancard = pancard;
		this.emailId = emailId;
		this.salary = salary;
		this.bankDetails = bankDetails;
	}
	public int getAssociateID() {
		return associateID;
	}
	public void setAssociateID(int associateID) {
		this.associateID = associateID;
	}
	public int getYearlyInvestmentUnder80C() {
		return yearlyInvestmentUnder80C;
	}
	public void setYearlyInvestmentUnder80C(int yearlyInvestmentUnder80C) {
		this.yearlyInvestmentUnder80C = yearlyInvestmentUnder80C;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getPancard() {
		return pancard;
	}
	public void setPancard(String pancard) {
		this.pancard = pancard;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Salary getSalary() {
		return salary;
	}
	public void setSalary(Salary salary) {
		this.salary = salary;
	}
	public BankDetails getBankDetails() {
		return bankDetails;
	}
	public void setBankDetails(BankDetails bankDetails) {
		this.bankDetails = bankDetails;
	}

	@Override
	public String toString() {
		return "Associate [associateID=" + associateID + ", "
				+ (firstName != null ? "firstName=" + firstName + ", " : "")
				+ (lastName != null ? "lastName=" + lastName + ", " : "")
				+ (department != null ? "department=" + department + ", " : "")
				+ (designation != null ? "designation=" + designation + ", " : "")
				+ (pancard != null ? "pancard=" + pancard + ", " : "")
				+ (emailId != null ? "emailId=" + emailId + ", " : "")
				+ (getSalary() != null ? "getSalary()=" + getSalary() + ", " : "")
				+ (getBankDetails() != null ? "getBankDetails()=" + getBankDetails() : "") + "]";
	}
}
