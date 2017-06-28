package lomt.pearson.api.nals_sg;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.log4testng.Logger;

import lomt.pearson.common.BaseClass;
import lomt.pearson.common.LoadPropertiesFile;
import lomt.pearson.constant.LOMTConstant;
import lomt.pearson.page_object.CommonPOM;
import lomt.pearson.page_object.IntermediaryPOM;
import lomt.pearson.page_object.Login;

public class Intermediary extends BaseClass {
	
	final static Logger LOGGER = Logger.getLogger(Intermediary.class);
	private String environment = LoadPropertiesFile.getPropertiesValues(LOMTConstant.LOMT_ENVIRONMENT);
	private String userName = LoadPropertiesFile.getPropertiesValues(LOMTConstant.USER_NAME);
	private String pwd = LoadPropertiesFile.getPropertiesValues(LOMTConstant.PASSWORD);
	
	private WebDriver driver;
	
	private Login login = null;
	CommonPOM commonPOM = null;
	IntermediaryPOM intermediaryPOM = null;
	
	public void getDriverInstance(WebDriver driver) {
		this.driver = initialiseChromeDriver();
		LOGGER.info("Chrome drive instance loaded : ");
	}
	
	public void openBrowser() {
		getDriverInstance(driver);
		driver.manage().window().maximize();
		driver.get(environment);
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		LOGGER.info("Chrome browser has been opened : ");
		
		commonPOM = new CommonPOM(driver);
		intermediaryPOM = new IntermediaryPOM(driver);
	}
	
	public void login() {
		login = new Login(driver);
		login.getUserName().sendKeys(userName);
		login.getPassword().sendKeys(pwd);
		login.getLoginButton().click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		LOGGER.info("Logged-in in LOMT application : ");
	}
	
	public void schoolGlobalBrowsePage(boolean flag) {
		try {
			if (flag) {
				Assert.assertTrue(commonPOM.getSchoolGlobalLOB().isDisplayed());		
				commonPOM.getSchoolGlobalLOB().click();
			} else {
				Assert.assertTrue(commonPOM.getNalsLOB().isDisplayed());		
				commonPOM.getNalsLOB().click();
			}
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			Thread.sleep(2000);
			jse.executeScript("window.scrollBy(0,400)");
			commonPOM.getManageIngestion().click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void createUploadStructurePage1(boolean flag) {
		try {
			// Header, Title and Footer
			Assert.assertTrue(commonPOM.getBackLinkFirst().isDisplayed());
			Assert.assertEquals(commonPOM.getCreateUploadStructureHeader().getText(), LOMTConstant.CREATE_STRUCTURE_TILE);
			Assert.assertFalse(commonPOM.getNextButtonFirst().isEnabled());  
			
			//LOB
			Assert.assertTrue(commonPOM.getSelectLOBTitle().isDisplayed());
			Assert.assertTrue(commonPOM.getEnglishLOBRadioButton().isDisplayed());
			Assert.assertTrue(commonPOM.getHeLOBRadioButton().isDisplayed());		
			Assert.assertTrue(commonPOM.getSchoolGlobalLOBRadioButton().isDisplayed());
			Assert.assertTrue(commonPOM.getNalsLOBRadioButton().isDisplayed());
			
			Assert.assertTrue(commonPOM.getSelectStructureTitle().isDisplayed());
			Assert.assertTrue(commonPOM.getGseStructureRadioButton().isDisplayed());
			Assert.assertTrue(commonPOM.getGseExternalFrameworkStructureRadioButton().isDisplayed());
			Assert.assertTrue(commonPOM.getProductStructureRadioButton().isDisplayed());
			
			if(flag) {
				// select School Global LOB and Intermediary structure
				commonPOM.getSchoolGlobalLOBRadioButton().click();
				Thread.sleep(1000);
			} else {
				// select School Global LOB and Intermediary structure
				commonPOM.getNalsLOBRadioButton().click();
				Thread.sleep(1000);
			}
			Assert.assertTrue(commonPOM.getCurriculumStandardRadioButton().isDisplayed());
			Assert.assertTrue(commonPOM.getProductRadioButton().isDisplayed());
			Assert.assertTrue(commonPOM.getIntermediaryRadioButton().isDisplayed());
			
			Thread.sleep(1000);
			commonPOM.getIntermediaryRadioButton().click();
			
			Thread.sleep(2000);
			Assert.assertTrue(commonPOM.getFirstTextImage().isDisplayed());
			Assert.assertEquals(commonPOM.getFirstTextMessage().getText(), LOMTConstant.CHOOSE_STRUCTURE_TYPE);			
			Assert.assertTrue(intermediaryPOM.getSecondTextImage().isDisplayed());
			//Assert.assertEquals(intermediaryPOM.getIntermediaryProvideMessage().getText(), LOMTConstant.STRUCTURE_PAGE_IMAGE_2_TEXT_SG);			
			Assert.assertTrue(commonPOM.getThirdTextImage().isDisplayed());
			Assert.assertEquals(commonPOM.getThirdTextMessage().getText(), LOMTConstant.STRUCTURE_PAGE_IMAGE_3_TEXT);			
			Assert.assertTrue(commonPOM.getFourthTextImage().isDisplayed());
			Assert.assertEquals(commonPOM.getFourthTextMessage().getText(), LOMTConstant.STRUCTURE_PAGE_IMAGE_4_TEXT);
			
			Thread.sleep(2000);
			commonPOM.getNextButtonFirst().click();
			
			WebDriverWait wait1 = new WebDriverWait(driver, 120);
			wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOMTConstant.BUSINESS_XPATH)));
			
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void createUploadStructurePageWithIncorrectIntermediaryFile(boolean flag) throws InterruptedException, IOException {
		try {
			Assert.assertTrue(intermediaryPOM.getStructure2Tile().isDisplayed());
			Assert.assertTrue(intermediaryPOM.getBusinessRadioButton().isDisplayed());
			Assert.assertTrue(intermediaryPOM.getEconomicsRadioButton().isDisplayed());
			Assert.assertTrue(intermediaryPOM.getFrenchRadioButton().isDisplayed());
			Assert.assertTrue(intermediaryPOM.getGeographyRadioButton().isDisplayed());
			Assert.assertTrue(intermediaryPOM.getHistoryRadioButton().isDisplayed());
			Assert.assertTrue(intermediaryPOM.getLiteracyRadioButton().isDisplayed());
			Assert.assertTrue(intermediaryPOM.getMathematicsRadioButton().isDisplayed());
			Assert.assertTrue(intermediaryPOM.getScienceRadioButton().isDisplayed());
			Assert.assertTrue(intermediaryPOM.getSocialStudiesRadioButton().isDisplayed());
			Assert.assertTrue(commonPOM.getBackButtonSt2().isDisplayed());
			
			WebDriverWait wait1 = new WebDriverWait(driver, 600);
			if (flag) {
				intermediaryPOM.getHistoryRadioButton().click();
				commonPOM.getNextButtonSt2().click();
				Thread.sleep(1000);
				//wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOMTConstant.DRAG_AND_DROP_TEXT_XPATH)));
				commonPOM.getUploadFileLink().click();
				// upload SG incorrect intermediary xls file
				Runtime.getRuntime().exec(LOMTConstant.INTERMEDIARY_INCORRECT_FILE_PATH);	
				Thread.sleep(4000);
			} else {
				intermediaryPOM.getLiteracyRadioButton().click();
				commonPOM.getNextButtonSt2().click();
				Thread.sleep(1000);
				//wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOMTConstant.DRAG_AND_DROP_TEXT_XPATH)));
				commonPOM.getUploadFileLink().click();
				// upload NALS incorrect intermediary xls file
				Runtime.getRuntime().exec(LOMTConstant.INTERMEDIARY_INCORRECT_FILE_PATH);	
				Thread.sleep(4000);
			}
			commonPOM.getNextButtonSt2().click();
			
			wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOMTConstant.INGEST_FAILED_MESSAGE_XPATH)));
			Thread.sleep(2000);
			
			//Header
			Assert.assertTrue(commonPOM.getBackLinkFirst().isDisplayed());
			Assert.assertEquals(commonPOM.getCreateUploadStructureHeader().getText(), LOMTConstant.CREATE_STRUCTURE_TILE);
			
			//Center
			Assert.assertEquals(commonPOM.getIngestFailed().getText(), LOMTConstant.INGESTION_FAILED_MESSAGE);
			Assert.assertTrue(commonPOM.getViewIngestFullLogButton().isDisplayed());
			
			commonPOM.getViewIngestFullLogButton().click();
			Thread.sleep(2000);
					
			Assert.assertEquals(commonPOM.getRowNo().getText(), LOMTConstant.ROW_NO);
			Assert.assertEquals(commonPOM.getType().getText(), LOMTConstant.TYPE);
			Assert.assertEquals(commonPOM.getMessage().getText() ,LOMTConstant.MESSAGE);
			Assert.assertTrue(commonPOM.getCancelButton().isEnabled());
			
			commonPOM.getCancelButton().click();
			commonPOM.getViewIngestFullLogButton().click();
			
			commonPOM.getBackLinkFirst().click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void createUploadStructurePageWithCorrectIntermediaryFile(boolean flag) throws InterruptedException, IOException {
		try {
			Assert.assertTrue(intermediaryPOM.getStructure2Tile().isDisplayed());
			Assert.assertTrue(intermediaryPOM.getBusinessRadioButton().isDisplayed());
			Assert.assertTrue(intermediaryPOM.getEconomicsRadioButton().isDisplayed());
			Assert.assertTrue(intermediaryPOM.getFrenchRadioButton().isDisplayed());
			Assert.assertTrue(intermediaryPOM.getGeographyRadioButton().isDisplayed());
			Assert.assertTrue(intermediaryPOM.getHistoryRadioButton().isDisplayed());
			Assert.assertTrue(intermediaryPOM.getLiteracyRadioButton().isDisplayed());
			Assert.assertTrue(intermediaryPOM.getMathematicsRadioButton().isDisplayed());
			Assert.assertTrue(intermediaryPOM.getScienceRadioButton().isDisplayed());
			Assert.assertTrue(intermediaryPOM.getSocialStudiesRadioButton().isDisplayed());
			Assert.assertTrue(commonPOM.getBackButtonSt2().isDisplayed());
			
			WebDriverWait wait1 = new WebDriverWait(driver, 600);
			
			if (flag) {
				intermediaryPOM.getHistoryRadioButton().click();
				commonPOM.getNextButtonSt2().click();
				Thread.sleep(1000);
				//wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOMTConstant.DRAG_AND_DROP_TEXT_XPATH)));
				commonPOM.getUploadFileLink().click();
				
				// upload incorrect intermediary xls file
				Runtime.getRuntime().exec(LOMTConstant.INTERMEDIARY_FILE_PATH);	
				Thread.sleep(4000);
			} else {
				intermediaryPOM.getLiteracyRadioButton().click();
				commonPOM.getNextButtonSt2().click();
				Thread.sleep(1000);
				//wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOMTConstant.DRAG_AND_DROP_TEXT_XPATH)));
				commonPOM.getUploadFileLink().click();
				// upload NALS incorrect intermediary xls file
				Runtime.getRuntime().exec(LOMTConstant.INTERMEDIARY_FILE_PATH);	
				Thread.sleep(4000);
			}
			commonPOM.getNextButtonSt2().click();
			
			wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOMTConstant.INGEST_SUCESS_MESSAGE_XPATH)));
			Thread.sleep(2000);
			
			//Header
			Assert.assertTrue(commonPOM.getBackLinkFirst().isDisplayed());
			Assert.assertEquals(commonPOM.getCreateUploadStructureHeader().getText(), LOMTConstant.CREATE_STRUCTURE_TILE);
			
			Assert.assertTrue(commonPOM.getDoneButton().isEnabled()); 
			commonPOM.getDoneButton().click();
			Thread.sleep(1000);
			commonPOM.getPearsonLogo().click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public void closeDriverInstance() {
		driver.close();
	}
	
}
