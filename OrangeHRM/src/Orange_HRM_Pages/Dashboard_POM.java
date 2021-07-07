package Orange_HRM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Dashboard_POM {

		WebDriver driver;

		public  Dashboard_POM(WebDriver driver) {
			this.driver = driver;
		}

		@FindBy(how = How.XPATH, using = "//span[text()='Assign Leave']")
		WebElement Assignleave;

		public void click() {
			Assignleave.click();
		}

	

}
