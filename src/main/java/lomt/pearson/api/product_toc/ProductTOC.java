package lomt.pearson.api.product_toc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import lomt.pearson.common.BaseClass;
import lomt.pearson.common.LoadPropertiesFile;
import lomt.pearson.constant.LOMTConstant;
import lomt.pearson.page_object.CommonPOM;
import lomt.pearson.page_object.EnglishPOM;
import lomt.pearson.page_object.HEPom;
import lomt.pearson.page_object.Login;
import lomt.pearson.page_object.NALSPom;
import lomt.pearson.page_object.SGPom;

/**
 * Product TOc Ingestion/Export for English/HE/NALS/SG LOB
 * 
 * @author ram.sin
 *
 */
public class ProductTOC extends BaseClass {

	private String environment = LoadPropertiesFile.getPropertiesValues(LOMTConstant.LOMT_ENVIRONMENT);
	private String userName = LoadPropertiesFile.getPropertiesValues(LOMTConstant.USER_NAME);
	private String pwd = LoadPropertiesFile.getPropertiesValues(LOMTConstant.PASSWORD);

	String currentLOB = null;

	private WebDriver driver;

	private Login login = null;
	private CommonPOM commonPOM = null;
	private EnglishPOM englishPOM = null;
	private HEPom hePom = null;
	private NALSPom nalsPom  = null;
	private SGPom sgPom = null;
	
	public void getDriverInstance(WebDriver driver) {
		this.driver = initialiseChromeDriver();
	}

	public void openBrowser() {
		getDriverInstance(driver);
		driver.manage().window().maximize();
		driver.get(environment);
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);

		commonPOM = new CommonPOM(driver);
		englishPOM = new EnglishPOM(driver);
		hePom = new HEPom(driver);
		nalsPom = new NALSPom(driver);
		sgPom = new SGPom(driver);
	}

	public void login() {
		try {
			login = new Login(driver);
			login.getUserName().sendKeys(userName);
			login.getPassword().sendKeys(pwd);
			login.getLoginButton().click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
			// add logger
		}
	}
	
	public void englishBrowsePage() {
		try {
			Assert.assertTrue(commonPOM.getEnglishLOB().isDisplayed());
			currentLOB = commonPOM.getEnglishLOB().getText();
			commonPOM.getEnglishLOB().click();
			
			Assert.assertTrue(commonPOM.getManageIngestion().isDisplayed());
			
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,500)");
			
			commonPOM.getManageIngestion().click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
			// add logger
		}
	}
	
	public void heBrowsePage() {
		try {
			Assert.assertTrue(commonPOM.getHeLOB().isDisplayed());
			currentLOB = commonPOM.getHeLOB().getText();
			commonPOM.getHeLOB().click();

			Assert.assertTrue(commonPOM.getWelcomeTitle().isDisplayed());
			Assert.assertEquals(commonPOM.getWelcomeTitle().getText(), LOMTConstant.WELCOME_TITLE);
			Assert.assertTrue(hePom.getHeBanner().isDisplayed());
			Assert.assertTrue(hePom.getExternalFrameworkLink().isDisplayed());
			Assert.assertTrue(hePom.getProductLink().isDisplayed());
			Assert.assertTrue(hePom.getEoLink().isDisplayed());
			Assert.assertTrue(commonPOM.getManageIngestion().isDisplayed());
			
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,500)");
			
			commonPOM.getManageIngestion().click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void nalsBrowsePage() {
		try {
			Assert.assertTrue(commonPOM.getNalsLOB().isDisplayed());
			currentLOB = commonPOM.getNalsLOB().getText();
			commonPOM.getNalsLOB().click();
			
			Assert.assertEquals(commonPOM.getWelcomeTitle().getText(), LOMTConstant.WELCOME_TITLE);
			Assert.assertTrue(nalsPom.getCurriculumStandardLink().isDisplayed());
			Assert.assertTrue(nalsPom.getProductLink().isDisplayed());
			Assert.assertTrue(nalsPom.getIntermediariesLink().isDisplayed());			
			Assert.assertTrue(commonPOM.getManageIngestion().isDisplayed());
			
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,500)");
			
			commonPOM.getManageIngestion().click();
		} catch (Exception e) {
			e.printStackTrace();
			// add logger
		}
	}
	
	public void sgBrowsePage() {
		try {
			Assert.assertTrue(commonPOM.getSchoolGlobalLOB().isDisplayed());
			currentLOB = commonPOM.getSchoolGlobalLOB().getText();
			commonPOM.getSchoolGlobalLOB().click();
			
			Assert.assertEquals(commonPOM.getWelcomeTitle().getText(), LOMTConstant.WELCOME_TITLE);
			Assert.assertTrue(sgPom.getSgBanner().isDisplayed());
			Assert.assertTrue(nalsPom.getCurriculumStandardLink().isDisplayed());
			Assert.assertTrue(nalsPom.getProductLink().isDisplayed());
			Assert.assertTrue(nalsPom.getIntermediariesLink().isDisplayed());
			Assert.assertTrue(commonPOM.getManageIngestion().isDisplayed());
			
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,500)");
			
			commonPOM.getManageIngestion().click();
		} catch (Exception e) {
			e.printStackTrace();
			// add logger
		}
	}

	public void createUploadStructurePage() {
		try {
			if (currentLOB.equalsIgnoreCase(LOMTConstant.ENGLISH_LOB)) {
				//Header, Footer 
				Assert.assertTrue(commonPOM.getBackLinkFirst().isDisplayed());
				Assert.assertEquals(commonPOM.getCreateUploadStructureHeader().getText(), LOMTConstant.CREATE_STRUCTURE_TILE);
				Assert.assertFalse(commonPOM.getNextButtonFirst().isEnabled());  
				
				//LOB
				Assert.assertTrue(commonPOM.getSelectLOBTitle().isDisplayed());
				Assert.assertTrue(commonPOM.getEnglishLOBRadioButton().isDisplayed());
				Assert.assertTrue(commonPOM.getHeLOBRadioButton().isDisplayed());
				Assert.assertTrue(commonPOM.getSchoolGlobalLOBRadioButton().isDisplayed());
				Assert.assertTrue(commonPOM.getNalsLOBRadioButton().isDisplayed());
				
				//Structure
				Assert.assertTrue(commonPOM.getSelectStructureTitle().isDisplayed());
				Assert.assertTrue(commonPOM.getGseStructureRadioButton().isDisplayed());
				Assert.assertTrue(commonPOM.getProductExternalFrameworkStructureRadioButton().isDisplayed());
				Assert.assertTrue(commonPOM.getGseProductStructureRadioButton().isDisplayed());
				Assert.assertTrue(commonPOM.getNextButtonFirst().isDisplayed());
				
				Thread.sleep(1000);
				commonPOM.getGseProductStructureRadioButton().click();
				
				//right side message validation
				Assert.assertTrue(commonPOM.getFirstTextImage().isDisplayed());
				Assert.assertEquals(commonPOM.getFirstTextMessage().getText(), LOMTConstant.CHOOSE_STRUCTURE_TYPE);
				Assert.assertTrue(englishPOM.getSecondTextImage().isDisplayed());
				Assert.assertEquals(englishPOM.getSecondTextEnglish().getText(), LOMTConstant.PROVIDE_ENGLISH_PRODUCT_METADASTA);
				Assert.assertTrue(commonPOM.getThirdTextImage().isDisplayed());
				Assert.assertEquals(commonPOM.getThirdTextMessage().getText(), LOMTConstant.STRUCTURE_PAGE_IMAGE_3_TEXT);
				Assert.assertTrue(commonPOM.getFourthTextImage().isDisplayed());
				Assert.assertEquals(commonPOM.getFourthTextMessage().getText(), LOMTConstant.STRUCTURE_PAGE_IMAGE_4_TEXT);
				
				Thread.sleep(1000);
				commonPOM.getNextButtonFirst().click();
			} else if (currentLOB.equalsIgnoreCase(LOMTConstant.HE_LOB)) {
				//Header, Footer 
				Assert.assertTrue(commonPOM.getBackLinkFirst().isDisplayed());
				Assert.assertEquals(commonPOM.getCreateUploadStructureHeader().getText(), LOMTConstant.CREATE_STRUCTURE_TILE);
				Assert.assertFalse(commonPOM.getNextButtonFirst().isEnabled());  
				
				//LOB
				Assert.assertTrue(commonPOM.getSelectLOBTitle().isDisplayed());
				Assert.assertTrue(commonPOM.getEnglishLOBRadioButton().isDisplayed());
				Assert.assertTrue(commonPOM.getHeLOBRadioButton().isDisplayed());
				Assert.assertTrue(commonPOM.getSchoolGlobalLOBRadioButton().isDisplayed());
				Assert.assertTrue(commonPOM.getNalsLOBRadioButton().isDisplayed());
				
				Thread.sleep(1000);
				commonPOM.getHeLOBRadioButton().click();
				
				//Structure
				Assert.assertTrue(commonPOM.getSelectStructureTitle().isDisplayed());
				Assert.assertTrue(commonPOM.getProductExternalFrameworkStructureRadioButton().isDisplayed());
				Assert.assertTrue(commonPOM.getProductStructureRadioButton().isDisplayed());
				Assert.assertTrue(commonPOM.getProductHERadioButton().isDisplayed());
				
				Thread.sleep(1000);
				commonPOM.getProductRadioButton().click();
				
				//right side message validation
				Assert.assertTrue(commonPOM.getFirstTextImage().isDisplayed());
				Assert.assertEquals(commonPOM.getFirstTextMessage().getText(), LOMTConstant.CHOOSE_STRUCTURE_TYPE);
				Assert.assertTrue(hePom.getSecondTextImage().isDisplayed());
				Assert.assertEquals(hePom.getSecondTextHE().getText(), LOMTConstant.PROVIDE_METADATA_HE);
				Assert.assertTrue(commonPOM.getThirdTextImage().isDisplayed());
				Assert.assertEquals(commonPOM.getThirdTextMessage().getText(), LOMTConstant.STRUCTURE_PAGE_IMAGE_3_TEXT);
				Assert.assertTrue(commonPOM.getFourthTextImage().isDisplayed());
				Assert.assertEquals(commonPOM.getFourthTextMessage().getText(), LOMTConstant.STRUCTURE_PAGE_IMAGE_4_TEXT);
				
				Thread.sleep(2000);
				commonPOM.getNextButtonFirst().click();
			} else if (currentLOB.equalsIgnoreCase(LOMTConstant.NALS_LOB)) {
				//Header, Footer 
				Assert.assertTrue(commonPOM.getBackLinkFirst().isDisplayed());
				Assert.assertEquals(commonPOM.getCreateUploadStructureHeader().getText(), LOMTConstant.CREATE_STRUCTURE_TILE);
				Assert.assertFalse(commonPOM.getNextButtonFirst().isEnabled());  
				
				//LOB
				Assert.assertTrue(commonPOM.getSelectLOBTitle().isDisplayed());
				Assert.assertTrue(commonPOM.getEnglishLOBRadioButton().isDisplayed());
				Assert.assertTrue(commonPOM.getHeLOBRadioButton().isDisplayed());
				Assert.assertTrue(commonPOM.getSchoolGlobalLOBRadioButton().isDisplayed());
				Assert.assertTrue(commonPOM.getNalsLOBRadioButton().isDisplayed());
				
				Thread.sleep(1000);
				commonPOM.getNalsLOBRadioButton().click();
				
				//Structure
				Assert.assertTrue(commonPOM.getSelectStructureTitle().isDisplayed());
				Assert.assertTrue(commonPOM.getCurriculumStandardRadioButton().isDisplayed());
				Assert.assertTrue(commonPOM.getProductStructureRadioButton().isDisplayed());
				Assert.assertTrue(commonPOM.getIntermediaryStructure().isDisplayed());
				
				Thread.sleep(1000);
				commonPOM.getProductStructureRadioButton().click();
				
				//right side message validation
				Assert.assertTrue(commonPOM.getFirstTextImage().isDisplayed());
				Assert.assertEquals(commonPOM.getFirstTextMessage().getText(), LOMTConstant.CHOOSE_STRUCTURE_TYPE);
				Assert.assertTrue(nalsPom.getSecondTextImage().isDisplayed());
				Assert.assertEquals(nalsPom.getSecondTextNALS().getText(), LOMTConstant.PROVIDE_METADATA_NALS);
				Assert.assertTrue(commonPOM.getThirdTextImage().isDisplayed());
				Assert.assertEquals(commonPOM.getThirdTextMessage().getText(), LOMTConstant.STRUCTURE_PAGE_IMAGE_3_TEXT);
				Assert.assertTrue(commonPOM.getFourthTextImage().isDisplayed());
				Assert.assertEquals(commonPOM.getFourthTextMessage().getText(), LOMTConstant.STRUCTURE_PAGE_IMAGE_4_TEXT);
				
				Thread.sleep(2000);
				commonPOM.getNextButtonFirst().click();
			} else {
				//School Global, Header, Footer 
				Assert.assertTrue(commonPOM.getBackLinkFirst().isDisplayed());
				Assert.assertEquals(commonPOM.getCreateUploadStructureHeader().getText(), LOMTConstant.CREATE_STRUCTURE_TILE);
				Assert.assertFalse(commonPOM.getNextButtonFirst().isEnabled());  
				
				//LOB
				Assert.assertTrue(commonPOM.getSelectLOBTitle().isDisplayed());
				Assert.assertTrue(commonPOM.getEnglishLOBRadioButton().isDisplayed());
				Assert.assertTrue(commonPOM.getHeLOBRadioButton().isDisplayed());
				Assert.assertTrue(commonPOM.getSchoolGlobalLOBRadioButton().isDisplayed());
				Assert.assertTrue(commonPOM.getNalsLOBRadioButton().isDisplayed());
				
				Thread.sleep(1000);
				commonPOM.getSchoolGlobalLOBRadioButton().click();
				
				Assert.assertTrue(commonPOM.getSelectStructureTitle().isDisplayed());
				Assert.assertTrue(commonPOM.getCurriculumStandardRadioButton().isDisplayed());
				Assert.assertTrue(commonPOM.getProductStructureRadioButton().isDisplayed());
				Assert.assertTrue(commonPOM.getIntermediaryStructure().isDisplayed());
				
				Thread.sleep(1000);
				commonPOM.getProductStructureRadioButton().click();
				
				//right side message validation
				Assert.assertTrue(commonPOM.getFirstTextImage().isDisplayed());
				Assert.assertEquals(commonPOM.getFirstTextMessage().getText(), LOMTConstant.CHOOSE_STRUCTURE_TYPE);
				Assert.assertTrue(sgPom.getSecondTextImage().isDisplayed());
				Assert.assertEquals(sgPom.getSecondTextSG().getText(), LOMTConstant.PROVIDE_METADATA_SG);
				Assert.assertTrue(commonPOM.getThirdTextImage().isDisplayed());
				Assert.assertEquals(commonPOM.getThirdTextMessage().getText(), LOMTConstant.STRUCTURE_PAGE_IMAGE_3_TEXT);
				Assert.assertTrue(commonPOM.getFourthTextImage().isDisplayed());
				Assert.assertEquals(commonPOM.getFourthTextMessage().getText(), LOMTConstant.STRUCTURE_PAGE_IMAGE_4_TEXT);
				
				Thread.sleep(2000);
				commonPOM.getNextButtonFirst().click();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void createUploadStructurePageWithIncorrectProductTOCFile() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 600);
			
			//Header
			Assert.assertTrue(commonPOM.getBackLinkFirst().isDisplayed());
			Assert.assertTrue(commonPOM.getCreateUploadStructureHeader().isDisplayed());
			Assert.assertEquals(commonPOM.getCreateUploadStructureHeader().getText(), LOMTConstant.CREATE_STRUCTURE_TILE);
			
			//Center
			//Assert.assertTrue(commonPOM.getPlusSign().isDisplayed());
			Assert.assertEquals(commonPOM.getDragAndDropFilesText().getText(),LOMTConstant.DRAG_DROP_TEXT);
			Assert.assertTrue(commonPOM.getUploadFileLink().isDisplayed());
			
			 //File upload logic 
			commonPOM.getUploadFileLink().click();
			
			if (currentLOB.equalsIgnoreCase(LOMTConstant.ENGLISH_LOB)) {
				Runtime.getRuntime().exec(LOMTConstant.PRODUCT_INCORRECT_FILE_PATH_ENGLISH);
				Thread.sleep(3000);
			} else if (currentLOB.equalsIgnoreCase(LOMTConstant.HE_LOB)) {
				Runtime.getRuntime().exec(LOMTConstant.PRODUCT_INCORRECT_FILE_PATH_HE);	
				Thread.sleep(3000);
			} else if (currentLOB.equalsIgnoreCase(LOMTConstant.NALS_LOB)) {
				Runtime.getRuntime().exec(LOMTConstant.PRODUCT_INCORRECT_FILE_PATH_SCHOOL);	
				Thread.sleep(3000);
			} else {
				//School Global
				Runtime.getRuntime().exec(LOMTConstant.PRODUCT_INCORRECT_FILE_PATH_SCHOOL);				
			}
			Thread.sleep(3000);
			commonPOM.getNextButtonSt2().click();

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOMTConstant.INGEST_FAILED_MESSAGE_XPATH)));
			Thread.sleep(2000);
			
			Assert.assertTrue(commonPOM.getViewIngestFullLogButton().isDisplayed());
			commonPOM.getViewIngestFullLogButton().click();
			//add assertion for exact error like Row, type - not implemented this features bcz there is no ACs in JIRA 
			Assert.assertTrue(commonPOM.getBackLinkFirst().isDisplayed());
			Assert.assertTrue(commonPOM.getCancelButton().isDisplayed());
			commonPOM.getCancelButton().click();
			commonPOM.getBackLinkFirst().click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void createUploadStructurePageWithCorrectProductTOCFile() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 600);
			Assert.assertTrue(commonPOM.getBackLinkFirst().isDisplayed());
			Assert.assertEquals(commonPOM.getCreateUploadStructureHeader().getText(), LOMTConstant.CREATE_STRUCTURE_TILE);
			Assert.assertEquals(commonPOM.getDragAndDropFilesText().getText(),LOMTConstant.DRAG_DROP_TEXT);
			Assert.assertTrue(commonPOM.getUploadFileLink().isDisplayed());
			
			commonPOM.getUploadFileLink().click();
			
			if (currentLOB.equalsIgnoreCase(LOMTConstant.ENGLISH_LOB)) {
				Runtime.getRuntime().exec(LOMTConstant.PRODUCT_FILE_PATH_ENGLISH);
				Thread.sleep(3000);
				/*Assert.assertTrue(commonPOM.getFirstTextImage().isDisplayed());
				Assert.assertEquals(commonPOM.getFirstTextMessage().getText(), LOMTConstant.CHOOSE_STRUCTURE_TYPE);
				Assert.assertTrue(englishPOM.getSecondTextImage().isDisplayed());
				Assert.assertEquals(englishPOM.getSecondTextEnglish().getText(), LOMTConstant.PROVIDE_ENGLISH_PRODUCT_METADASTA);
				Assert.assertTrue(commonPOM.getThirdTextImage().isDisplayed());
				Assert.assertEquals(commonPOM.getThirdTextMessage().getText(), LOMTConstant.STRUCTURE_PAGE_IMAGE_3_TEXT);
				Assert.assertTrue(commonPOM.getFourthTextImage().isDisplayed());
				Assert.assertEquals(commonPOM.getFourthTextMessage().getText(), LOMTConstant.STRUCTURE_PAGE_IMAGE_4_TEXT);
				Thread.sleep(3000);*/
			} else if (currentLOB.equalsIgnoreCase(LOMTConstant.HE_LOB)) {
				Runtime.getRuntime().exec(LOMTConstant.PRODUCT_CORRECT_FILE_PATH_HE);
				Thread.sleep(3000);
			} else if (currentLOB.equalsIgnoreCase(LOMTConstant.NALS_LOB)) {
				Runtime.getRuntime().exec(LOMTConstant.PRODUCT_CORRECT_FILE_PATH_SCHOOL);
				Thread.sleep(3000);
			} else {
				//School Global
				Runtime.getRuntime().exec(LOMTConstant.PRODUCT_CORRECT_FILE_PATH_SCHOOL);
				Thread.sleep(3000);
			}
			//Thread.sleep(2000);
			commonPOM.getNextButtonSt2().click();

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOMTConstant.INGEST_SUCESS_MESSAGE_XPATH)));
			Thread.sleep(3000);
			
			Assert.assertTrue(commonPOM.getBackLinkFirst().isDisplayed());
			Assert.assertTrue(commonPOM.getIngestSucessful().isDisplayed());
			Assert.assertTrue(commonPOM.getDoneButton().isDisplayed());
			Assert.assertTrue(commonPOM.getPearsonLogo().isDisplayed());
			Assert.assertTrue(commonPOM.getFourthTextImage().isDisplayed());
			Assert.assertEquals(commonPOM.getFourthTextMessage().getText(), LOMTConstant.STRUCTURE_PAGE_IMAGE_4_TEXT);
			
			commonPOM.getDoneButton().click();
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
