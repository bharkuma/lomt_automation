package lomt.pearson.common;

import java.util.HashMap;

import lomt.pearson.constant.LOMTConstant;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BaseClass {
	
	private WebDriver driver;

	public WebDriver initiliseDriver() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		/*System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		FirefoxProfile fxProfile = new FirefoxProfile();
		fxProfile.setPreference("browser.download.folderList",2);
	    fxProfile.setPreference("browser.download.manager.showWhenStarting",true);
	    fxProfile.setPreference("browser.download.dir",LOMTConstant.EXPORTED_FILE_PATH);
	    fxProfile.setPreference("browser.helperApps.neverAsk.saveToDisk","application/vnd.openxmlformats-officedocument.spreadsheetml.sheet, application/x-excel, application/x-msexcel, application/excel, application/vnd.ms-excel");
	    driver = new FirefoxDriver(fxProfile);*/
		return driver;
	}
	
	public WebDriver initialiseChromeDriver() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//driver = new ChromeDriver();
		
		//#####################
		String downloadFilepath = "src\\main\\java\\lomt\\pearson\\downloads";
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", LOMTConstant.EXPORTED_FILE_PATH);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		
		driver = new ChromeDriver();
		
		//####################
		
		
		
		return driver;
	}
	
	public WebDriver initialiseFirefoxDriver() {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		driver = new FirefoxDriver();
				
		return driver;
	}
	
	public WebDriver initialiseInternetExplorerDriver() {
		//TODO
				
		return null;
	}
}
