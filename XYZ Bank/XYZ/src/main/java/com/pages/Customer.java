package com.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.FindBy;
import com.base.TestBase;
import com.wrapper.Wrapper;

public class Customer extends TestBase
{
	
	  
		Wrapper wrpobj=new Wrapper();
		
	    @FindBy(xpath="//*[text()=\"Customer Login\"]")
		WebElement pCustomerLogin;
	    
	    @FindBy(xpath="//*[@id=\"userSelect\"]")
	   	WebElement pCustomerNameList;
	   
		@FindBy(xpath="//*[@type=\"submit\"]")
		WebElement pCustomerNameLogin;
		 
	   @FindBy(xpath="//*[@id=\"accountSelect\"]")
		WebElement pSelectAccount;
	   
	   @FindBy(xpath="//*[text()=\"Account Number : \"]")
		WebElement pAccountNumber;
	   
	   @FindBy(xpath="//button[@ng-click=\"transactions()\"]")
	  	WebElement pTransctions;
	   
	   @FindBy(xpath="//table[@class=\"table table-bordered table-striped\"]")
	 	WebElement pTransctionTable;
	  
	   @FindBy(xpath="//button[@ng-click=\"deposit()\"]")
	  	WebElement pDeposit;
	   
	   @FindBy(xpath="//button[@ng-click=\"withdrawl()\"]")
	  	WebElement pWithdrawl;
	   
	   @FindBy(xpath="//input[@ng-model=\"amount\"]")
	  	WebElement pDepositAmount;
	   
	   @FindBy(xpath="//button[@ng-click=\"back()\"]")
	  	WebElement pBackButton;
	   
	   
	   
	   @FindBy(xpath="//html/body/div/div/div[2]/div/div[4]/div/form/button")
	  	WebElement pSubmitDeposit;
	   
	   @FindBy(xpath="//*[text()=\"Deposit Successful\"]")
		WebElement pDepsitMessage;
	   
	   @FindBy(xpath="//input[@type=\"number\"]")
	  	WebElement pWithdrawalAmount; 
	   
	   @FindBy(xpath="//*[text()=\"Transaction successful\"]")
		WebElement pWithdrawalMessage;
	 
	   
	   @FindBy(xpath="//html/body/div/div/div[2]/div/div[4]/div/form/button")
	  	WebElement pSubmitWithdrawal;
	 
	 	public Customer()
		{
		  PageFactory.initElements(driver, this);
		}
		
		
		public void clickCustomer()
		{
			wrpobj.waitForElement(pCustomerLogin);
			pCustomerLogin.click();
			wrpobj.waitForElement(pCustomerNameList);
		    wrpobj.selectByIndex(pCustomerNameList,1);
		    wrpobj.waitForElement(pCustomerNameLogin);
		   
		}
	
		public void customerNameLogin()
		{
			wrpobj.waitForElement(pCustomerNameLogin);
			pCustomerNameLogin.click();
			wrpobj.waitForElement(pSelectAccount);
			
		}
		
		public void clickTransctions()
		{
			wrpobj.waitForElement(pTransctions);
			pTransctions.click();
			wrpobj.waitForElement(pTransctionTable);
			
			wrpobj.waitForElement(pBackButton);
			pBackButton.click();
			wrpobj.waitForElement(pTransctions);
						
		}
	
		
		public void clickDepositTab()
		{
			wrpobj.waitForElement(pDeposit);
			pDeposit.click();
			wrpobj.waitForElement(pDepositAmount);
		
		}
		
		public String clickSubmitDeposit()
		{
			wrpobj.waitForElement(pDepositAmount);
			pDepositAmount.sendKeys("5500");
			wrpobj.waitForElement(pSubmitDeposit);
			pSubmitDeposit.click();
			wrpobj.waitForElement(pDepsitMessage);
			//wrpobj.waitForAlert();
			String pText= pDepsitMessage.getText();
		   // wrpobj.alertAccept();
			wrpobj.waitForElement(pWithdrawl);
		    return pText;
	   		   		
		}
		
		public void clickWithdrawalTab()
		{
			wrpobj.waitForElement(pWithdrawl);
			pWithdrawl.click();
			wrpobj.waitForElement(pWithdrawalAmount);
		
		}
		
		public String clickSubmitWithdrawal()
		{
			//wrpobj.waitForElement(pWithdrawalAmount); 
			pWithdrawalAmount.sendKeys("500");
			wrpobj.waitForElement(pSubmitWithdrawal);
			pSubmitWithdrawal.click();
			wrpobj.waitForElement(pWithdrawalMessage);
			//wrpobj.waitForAlert();
			String pText=pWithdrawalMessage.getText();
		   // wrpobj.alertAccept();
			
		   	return pText;
		   	   		
		}
}

