package lomt.pearson.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HEPom {
	
	WebDriver driver;
	
	@FindBy(xpath = "//div[@id='lomtAppId']/div/div/div[2]/div[2]")
	private WebElement heBanner;
	
	@FindBy(xpath = "//div[@id='lomtAppId']/div/div/div[2]/div[3]/span[1]/a")
	private WebElement externalFrameworkLink;
	
	@FindBy(xpath = "//div[@id='lomtAppId']/div/div/div[2]/div[3]/span[2]/a")
	private WebElement productLink;
	
	@FindBy(xpath = "//div[@id='lomtAppId']/div/div/div[2]/div[3]/span[3]/a")
	private WebElement eoLink;
	
	@FindBy(xpath = "//div[@class='ingestion']/div/div[2]/div/div[2]/div[1]")
	private WebElement secondTextImage;
	
	@FindBy(xpath = "//div[@class='ingestion']/div/div[2]/div/div[2]/div[2]")
	private WebElement secondTextHE;
	
	public HEPom(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getHeBanner() {
		return heBanner;
	}

	public void setHeBanner(WebElement heBanner) {
		this.heBanner = heBanner;
	}

	public WebElement getExternalFrameworkLink() {
		return externalFrameworkLink;
	}

	public void setExternalFrameworkLink(WebElement externalFrameworkLink) {
		this.externalFrameworkLink = externalFrameworkLink;
	}

	public WebElement getProductLink() {
		return productLink;
	}

	public void setProductLink(WebElement productLink) {
		this.productLink = productLink;
	}

	public WebElement getEoLink() {
		return eoLink;
	}

	public void setEoLink(WebElement eoLink) {
		this.eoLink = eoLink;
	}

	public WebElement getSecondTextImage() {
		return secondTextImage;
	}

	public void setSecondTextImage(WebElement secondTextImage) {
		this.secondTextImage = secondTextImage;
	}

	public WebElement getSecondTextHE() {
		return secondTextHE;
	}

	public void setSecondTextHE(WebElement secondTextHE) {
		this.secondTextHE = secondTextHE;
	}

}
