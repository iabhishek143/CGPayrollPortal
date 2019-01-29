package com.cg.payroll.test;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import org.easymock.EasyMock;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import com.cg.payroll.beans.Associate;
import com.cg.payroll.beans.BankDetails;
import com.cg.payroll.beans.Salary;
import com.cg.payroll.daoservices.AssociateDAO;
import com.cg.payroll.exceptions.AssociateDetailsNotFoundException;
import com.cg.payroll.services.PayrollServices;
import com.cg.payroll.services.PayrollServicesImpl;

public class PayrollServicesTestEasyMock {
	private static PayrollServices payrollServices;
	private static AssociateDAO mockAssociateDao;

	@BeforeClass
	public static void setUpTestEnv()	{
		mockAssociateDao= EasyMock.mock(AssociateDAO.class);
		payrollServices= new PayrollServicesImpl(mockAssociateDao);		
	}

	@Before
	public void setUpTestMockData()	{
		Associate associate1 = new Associate(101, 5000, "Abhishek", "Sharma", "Dev", "Sr Con", "CVEP5674G", "abhishek@gmail.com", new Salary(50000, 1000, 1000), new BankDetails(1122115, "KOTAK", "KTK00087"));
		Associate associate2 = new Associate(102, 3000, "Moreshwar", "Tendulkar", "YTP", "Trainer", "Bsckjf45f", "more@gmail.com", new Salary(20000, 500, 500), new BankDetails(56465855, "HDFC", "HDFC000FF67"));
		Associate associate3= new Associate(103, 2000, "Anvesh", "PSRJ", "Security", "Manager", "KJDFKD45K", "anvesh@gmail.com", new Salary(30000, 2000, 2000), new BankDetails(52244661, "CITYBANK", "CITY000034"));

		ArrayList<Associate> associateList= new ArrayList<>();
		associateList.add(associate1);
		associateList.add(associate2);
		
		EasyMock.expect(mockAssociateDao.save(associate3)).andReturn(associate3);
		EasyMock.expect(mockAssociateDao.findOne(101)).andReturn(associate1);
		EasyMock.expect(mockAssociateDao.findOne(102)).andReturn(associate2);
		EasyMock.expect(mockAssociateDao.findOne(1234)).andReturn(null);
		EasyMock.expect(mockAssociateDao.findAll()).andReturn(associateList);

	}


	@Test
	public void testGetAssociateDataForInvalidAssociateId() throws AssociateDetailsNotFoundException	{
		payrollServices.getAssociateDetails(1234);
		EasyMock.verify(mockAssociateDao.findOne(1234));
	}


	@Test(expected= AssociateDetailsNotFoundException.class)
	public void testGetAssociateDataForValidAssociateId() throws AssociateDetailsNotFoundException	{
		Associate expectedAssociate= new Associate(101, 5000, "Abhishek", "Sharma", "Dev", "Sr Con", "CVEP5674G", "abhishek@gmail.com", new Salary(50000, 1000, 1000), new BankDetails(1122115, "KOTAK", "KTK00087"));
		Associate actualAssociate= payrollServices.getAssociateDetails(101); 
		assertEquals(expectedAssociate, actualAssociate);
		EasyMock.verify(mockAssociateDao.findOne(101));
	}

	/*@Test(expected= AssociateDetailsNotFoundException.class)
	public void testAcceptAssociateDataForValidData() throws AssociateDetailsNotFoundException	{	
	}*/

	@After
	public void tearDownTesData() {
		EasyMock.resetToDefault(mockAssociateDao);
	}
	@AfterClass
	public static void tearDownTestEnv()	{
		mockAssociateDao= null;
		payrollServices= null;		
	}

}
