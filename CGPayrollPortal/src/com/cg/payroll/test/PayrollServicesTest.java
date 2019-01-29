/*package com.cg.payroll.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.payroll.beans.*;
import com.cg.payroll.exceptions.*;
import com.cg.payroll.services.PayrollServices;
import com.cg.payroll.services.PayrollServicesImpl;
import com.cg.payroll.util.PayrollUtil;

public class PayrollServicesTest {
    private static PayrollServices payrollServices;

    @BeforeClass
    public static void setUpTestEnv() {
        payrollServices = new PayrollServicesImpl();
    }

    @Before
    public void setUpTestData() {
        Associate associate1 = new Associate(101, 5000, "Abhishek", "Sharma", "Dev", "Sr Con", "CVEP5674G", "abhishek@gmail.com", new Salary(50000, 1000, 1000), new BankDetails(1122115, "KOTAK", "KTK00087"));
        Associate associate2 = new Associate(102, 3000, "Moreshwar", "Tendulkar", "YTP", "Trainer", "Bsckjf45f", "more@gmail.com", new Salary(20000, 500, 500), new BankDetails(56465855, "HDFC", "HDFC000FF67"));
        PayrollUtil.associates.put(associate1.getAssociateID(), associate1);
        PayrollUtil.associates.put(associate2.getAssociateID(), associate2);
        PayrollUtil.ASSOCIATE_ID_COUNTER = 103;
    }

    @Test
    public void testAcceptAssociateDetailsForValidData() {
        int expectedAssociateId=104;
        int actualAssociateId=payrollServices.acceptAssociateDetails("Abhishek", "Sharma", "Dev", "Sr Con", "CVEP4545D", "abhishek@gmail.com", 5000, 50000, 1000, 1000, 1122542, "KOTAK", "KTK00087");
        Assert.assertEquals(expectedAssociateId, actualAssociateId);
    }
    
    @Test
    public void testCalculateNetSalaryForValidData() throws AssociateDetailsNotFoundException {
        int expectedAns=86808;
        int actualAns=payrollServices.calculateNetSalary(101);
        Assert.assertEquals(expectedAns, actualAns);
    }
    

    @Test(expected=AssociateDetailsNotFoundException.class)
    public void testCalculateNetSalaryForInvalidData() throws AssociateDetailsNotFoundException {
        payrollServices.calculateNetSalary(74);
    }

    @Test
    public void testGetAssociateDetailsForValidData() throws AssociateDetailsNotFoundException {
        Associate expectedAssociate=new Associate(101, 4000, "Anvesh", "PSRJ", "Security", "Manager", "PSRJ4565F", "anvesh@gmail.com", new Salary(50000, 1000, 1000), new BankDetails(1254445, "ICICI", "ICICI00089"));
        Associate actualAssociate=payrollServices.getAssociateDetails(101);
        Assert.assertEquals(expectedAssociate, actualAssociate);
    }
    
    @Test(expected=AssociateDetailsNotFoundException.class)
    public void testGetAssociateDetailsForInvalidData() throws AssociateDetailsNotFoundException {
        payrollServices.getAssociateDetails(74);
    }
    
    @After
    public void tearDownTestData() {
        PayrollUtil.ASSOCIATE_ID_COUNTER = 100;
        PayrollUtil.associates.clear();
    }

    @AfterClass
    public static void tearDownTestEnv() {
        payrollServices = null;
    }

}
*/