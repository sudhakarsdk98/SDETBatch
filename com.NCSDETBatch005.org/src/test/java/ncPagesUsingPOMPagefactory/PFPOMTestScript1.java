package ncPagesUsingPOMPagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class PFPOMTestScript1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		BrowserUtilitiesPF browser = new BrowserUtilitiesPF(driver);
		NC_CommonUtilitiesPF common = new NC_CommonUtilitiesPF(driver);
		NC_LoginPagePF login = new NC_LoginPagePF(driver);
		NC_DashBoardPagePF dashboard = new NC_DashBoardPagePF(driver);
		
		browser.openNCLoginPage();
		browser.browserMaximise();
		browser.addSync();
		browser.getCurrentPageURL();
		
		if (login.verifyEmailField()) {
			
			login.enterEmail("admin@yourstore.com");
			login.enterPassword("admin");
			login.GetRememberMeCheckBox().click();
			login.GetRememberMeCheckBox().click();
			login.clickLoginBtn();
			
		}
		else { 
			System.out.println("Login failed; at ncPagesUsingCustomPOM.CustomPOMTestScript1.class");
			
		}
		
		
		if (dashboard.verifyCommonStat()) {
		
			browser.getCurrentPageTitle();
			common.clickOnSales();
			common.clickOnOrders();
		}
		else {
			System.out.println("DashBoard Page error; at ncPagesUsingCustomPOM.CustomPOMTestScript1.class");
		}
		
		common.logout();
		
		browser.getCurrentPageSourceCode();
		
		browser.tearDown();
		
	
		
	}

}
