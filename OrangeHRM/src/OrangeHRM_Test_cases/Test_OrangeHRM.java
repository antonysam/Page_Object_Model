package OrangeHRM_Test_cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.templates.Golden_template;

import Orange_HRM_Pages.Dashboard_POM;
import Orange_HRM_Pages.Leave_POM;
import Orange_HRM_Pages.Login_POM;

public class Test_OrangeHRM {
	WebDriver driver;

	@Test
	public void Test_login() {
		WebDriver driver = Golden_template.openbrowser("chrome");
		Golden_template.getURL("https://opensource-demo.orangehrmlive.com/", 10, 10);
		
		//Login_POM.class will return the bytecode of the class
		Login_POM login_page = PageFactory.initElements(driver, Login_POM.class);
		login_page.login("Admin", "admin123");
		
		Dashboard_POM dashboard = PageFactory.initElements(driver, Dashboard_POM.class);
	    dashboard.click();
	    
	}
} 
