package lomt.pearson.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SGPom {
	
	WebDriver driver;
	
	@FindBy(xpath = "//div[@id='lomtAppId']/div/div/div[2]/div[2]")
	private WebElement sgBanner;
	
	@FindBy(xpath = "//div[@class='ingestion']/div/div[2]/div/div[2]/div[1]")
	private WebElement secondTextImage;
	
	@FindBy(xpath = "//div[@class='ingestion']/div/div[2]/div/div[2]/div[2]")
	private WebElement secondTextSG;
	
	public SGPom(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getSgBanner() {
		return sgBanner;
	}

	public void setSgBanner(WebElement sgBanner) {
		this.sgBanner = sgBanner;
	}

	public WebElement getSecondTextImage() {
		return secondTextImage;
	}

	public void setSecondTextImage(WebElement secondTextImage) {
		this.secondTextImage = secondTextImage;
	}

	public WebElement getSecondTextSG() {
		return secondTextSG;
	}

	public void setSecondTextSG(WebElement secondTextSG) {
		this.secondTextSG = secondTextSG;
	}

}
