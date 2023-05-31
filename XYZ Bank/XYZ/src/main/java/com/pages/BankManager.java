package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.base.TestBase;
import com.wrapper.Wrapper;
public class BankManager extends TestBase
{
Wrapper wrpobj=new Wrapper();
@FindBy(xpath="//*[text()=\"Bank Manager Login\"]")
WebElement pBankManagerLogin;
@FindBy(xpath="//button[@ng-click='addCust()']")
WebElement pAddCustomer;
@FindBy(xpath="//input[@ng-model='fName']")
WebElement pFirstName;
@FindBy(xpath="//input[@ng-model='lName']")
WebElement pLastName;
@FindBy(xpath="//input[@ng-model='postCd']")
WebElement pPostCode;
@FindBy(xpath="//button[@type=\"submit\"]")
WebElement pAddSubmit;
@FindBy(xpath="//button[@ng-click='openAccount()']")
WebElement pOpenAccount;
@FindBy(xpath="//*[@id=\"userSelect\"]")
WebElement pSelectCName;
@FindBy(xpath="//*[@id=\"currency\"]")
WebElement pCurrency;
@FindBy(xpath="//*[text()=\"Process\"]")
WebElement pProcess;
@FindBy(xpath="//button[@ng-click=\"showCust()\"]")
WebElement pCustomersList;
@FindBy(xpath=" //input[@ng-model=\"searchCustomer\"]")
WebElement pSearchCustomers;
@FindBy(xpath="//button[@ng-click=\"deleteCust(cust)\"]")
WebElement pDeleteCustomer;
public BankManager()
{
PageFactory.initElements(driver, this);
}
public void clickBankManagerLogin()
{
wrpobj.waitForElement(pBankManagerLogin);
pBankManagerLogin.click();
wrpobj.waitForElement(pAddCustomer);
}
public void clickAddCustomer()
{
wrpobj.waitForElement(pAddCustomer);
pAddCustomer.click();
wrpobj.waitForElement(pFirstName); 
}
public void enterCustomerDetails()
{
pFirstName.sendKeys("Johny");
pLastName.sendKeys("Joseph");
pPostCode.sendKeys("589");
}
public String clickSubmitDetails()
{
wrpobj.waitForElement(pAddSubmit);
pAddSubmit.click(); 
//wrpobj.waitForElement(pDepsitMessage);
wrpobj.waitForAlert();
String pText=wrpobj.getAlertText();
wrpobj.alertAccept();
wrpobj.waitForElement(pOpenAccount);
return pText;
}
public void clickOpenAccountTab()
{
wrpobj.waitForElement(pOpenAccount);
pOpenAccount.click();
wrpobj.waitForElement(pSelectCName); 
}
public String clickOpenAccount()
{
wrpobj.waitForElement(pSelectCName);
wrpobj.selectByIndex(pSelectCName, 1); 
wrpobj.selectByIndex(pCurrency, 1);
pProcess.click();
wrpobj.waitForAlert();
String pText=wrpobj.getAlertText();
wrpobj.alertAccept();
wrpobj.waitForElement(pCustomersList);
return pText;
}
public void clickOnCustomersTab()
{
wrpobj.waitForElement(pCustomersList);
pCustomersList.click();
wrpobj.waitForElement(pSearchCustomers); 
}
}
