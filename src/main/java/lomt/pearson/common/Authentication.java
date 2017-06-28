package lomt.pearson.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import lomt.pearson.constant.LOMTConstant;

public class Authentication extends BaseClass {

	private WebDriver driver;
	private String environment = LoadPropertiesFile.getPropertiesValues(LOMTConstant.LOMT_ENVIRONMENT);
	private String userName = LoadPropertiesFile.getPropertiesValues(LOMTConstant.USER_NAME);
	private String pwd = LoadPropertiesFile.getPropertiesValues(LOMTConstant.PASSWORD);

	public void getDriverInstance(WebDriver driver) {
		this.driver = initiliseDriver();
	}

	public void openBrowser() {
		getDriverInstance(driver);
		driver.manage().window().maximize();
		driver.get(environment);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
	}

	public void login() {
		WebElement username = driver.findElement(By.xpath(LOMTConstant.USER_NAME_XPATH));
		username.sendKeys(userName);
		WebElement password = driver.findElement(By.xpath(LOMTConstant.PASSWORD_XPATH));
		password.sendKeys(pwd);

		WebElement login = driver.findElement(By.xpath(LOMTConstant.LOGIN_BUTTON_XPATH));
		login.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void closeDriverInstance() {
		driver.close();
	}

	public WebDriver getDriver() {
		return driver;
	}

}
