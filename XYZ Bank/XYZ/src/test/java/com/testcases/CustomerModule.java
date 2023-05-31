package com.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.base.TestBase;
import com.pages.Customer;
//import com.pages.HomePage;
public class CustomerModule extends TestBase
{
Customer customer;
public CustomerModule() 
{
super();
}
@BeforeClass
public void setUp()
{
initialization();
customer=new Customer();
}
@Test (priority=1)
public void customerModule() 
{
System.out.println("Page Loaded");
}
@Test (priority=2)
public void clickOnCustomer()
{
customer.clickCustomer();
}
@Test (priority=3)
public void clickOnCustomerNameLogin()
{
customer.customerNameLogin();
}
@Test (priority=4)
public void clickOnTransctions()
{
customer.clickTransctions();
}
@Test (priority=5)
public void clickOnDeposittab()
{
customer.clickDepositTab();
}
@Test (priority=6)
public void clickOnDepositSubmit()
{
String pText=customer.clickSubmitDeposit();
Assert.assertEquals(pText, "Deposit Successful");
}
@Test (priority=7)
public void clickOnWithdrawaltab()
{
customer.clickWithdrawalTab();;
}
@Test (priority=8)
public void clickOnWithdrawalSubmit()
{
String pText=customer.clickSubmitWithdrawal();
Assert.assertEquals(pText,"Transaction successful");
}
}
