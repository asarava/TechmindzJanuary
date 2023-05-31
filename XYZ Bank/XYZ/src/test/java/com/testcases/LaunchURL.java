package com.testcases;
//import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.base.TestBase;
import com.pages.Home;
public class LaunchURL extends TestBase 
{
Home home;
public LaunchURL() 
{
super();
}
@BeforeClass
public void setUp()
{
initialization();
home=new Home();
}
@Test (priority=1)
public void launchURL() 
{
System.out.println("URL Launched");
}
@Test (priority=2)
public void clickOnCustomer()
{
home.clickCustomer();
}
/* 
@Test (priority=3)
public void clickOnCustomerNameLogin()
{
homePage.customerNameLogin();
}
@Test (priority=4)
public void clickOnTransctions()
{
homePage.clickTransctions();
}
/* 
@Test (priority=4)
public void clickOnAccountNumber()
{
homePage.selectAccount();
}
/*@Test 
public void clickOnBM() 
{
homePage.clickBm();
}*/
}





	
	



