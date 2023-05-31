package com.testcases;


import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.base.TestBase;
import com.pages.BankManager;
public class BankManagerModule extends TestBase 
{
BankManager bankManager;
public BankManagerModule() 
{
super();
}
@BeforeClass
public void setUp()
{
initialization();
bankManager=new BankManager();
}
@Test (priority=1)
public void customerModule() 
{
System.out.println("Page Loaded");
}
@Test (priority=2)
public void clickOnBMLogin() 
{
bankManager.clickBankManagerLogin();
}
@Test (priority=3)
public void clickOnAddCustomer() 
{
bankManager.clickAddCustomer(); 
}
@Test (priority=5)
public void enterTheDetails() 
{
bankManager.enterCustomerDetails();
}
@Test (priority=6)
public void clickOnSubmitDetails() 
{
//bankManager.clickSubmitDetails(); 
String pText=bankManager.clickSubmitDetails();
Assert.assertEquals(pText, "Customer added successfully with customer id :6"); 
}
@Test (priority=6)
public void clickonOpenAccountab() 
{
bankManager.clickOpenAccountTab(); 
}
@Test (priority=7)
public void clickOnOpenAccount() 
{
String pText=bankManager.clickOpenAccount();
Assert.assertEquals(pText, "Account created successfully with account Number :1016");
}
@Test (priority=8)
public void clickOnCustomersList() 
{
bankManager.clickOnCustomersTab();
}
}

