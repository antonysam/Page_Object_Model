package Orange_HRM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.templates.Golden_template;

public class Login_POM {
	/*
	 * @FindBy(id="txtUsername") WebElement username;
	 */

	WebDriver driver;

	public Login_POM(WebDriver driver) {
		this.driver = driver;
	}

// To pass Dynamic locator using-.string variable
	@FindBy(how = How.ID, using = "txtUsername")
	WebElement username;

	@FindBy(how = How.ID, using = "txtPassword")
	WebElement password;

	@FindBy(how = How.ID, using = "btnLogin")
	WebElement login;

	public void login(String uid, String pwd) {
		Golden_template.navigate("refresh");
		username.sendKeys(uid);
		password.sendKeys(pwd);
		login.click();
	}
}
