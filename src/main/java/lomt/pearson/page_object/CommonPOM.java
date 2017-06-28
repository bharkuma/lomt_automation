package lomt.pearson.page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommonPOM {

	WebDriver driver;
	
	@FindBy(xpath = "//div[@class='unit-container']/div/div[4]/div/a")
	private WebElement englishLOB;
	
	@FindBy(xpath = "//div[@class='unit-container']/div/div[3]/div/a")
	private WebElement heLOB;

	@FindBy(xpath = "//div[@class='unit-container']/div/div[2]/div/a")
	private WebElement schoolGlobalLOB;

	@FindBy(xpath = "//div[@class='unit-container']/div/div[1]/div/a")
	private WebElement nalsLOB;
	
	@FindBy(xpath = "//div[@id='browse-grids']/div[2]/span[2]/div/span[1]")
	private WebElement manageIngestion;
	
	@FindBy(xpath = "//div[@class='ingestion-header']/span")
	private WebElement backLinkFirst;
	
	@FindBy(xpath = "//div[@class='ingestion-header']/div")
	private WebElement createUploadStructureHeader;
	
	@FindBy(xpath = "//div[@class='ingestion-type-container']/span")
	private WebElement selectLOBTitle;
	
	@FindBy(xpath = "//div[@class='ingestion-type-container']/div[1]/input")
	private WebElement englishLOBRadioButton;
	
	@FindBy(xpath = "//div[@class='ingestion-type-container']/div[2]/input")
	private WebElement heLOBRadioButton;
	
	@FindBy(xpath = "//div[@class='ingestion-type-container']/div[3]/input")
	private WebElement schoolGlobalLOBRadioButton;
	
	@FindBy(xpath = "//div[@class='ingestion-type-container']/div[4]/input")
	private WebElement nalsLOBRadioButton;
	
	@FindBy(xpath = "//div[@class='ingestion']/div/div/div[2]/span")
	private WebElement selectStructureTitle;
	
	@FindBy(xpath = "//div[@class='ingestion']/div/div/div[2]/div[1]/input")
	private WebElement gseStructureRadioButton;
	
	@FindBy(xpath = "//div[@class='ingestion']/div/div/div[2]/div[2]/input")
	private WebElement  gseExternalFrameworkStructureRadioButton;
	
	@FindBy(xpath = "//div[@class='ingestion']/div/div/div[2]/div[3]/input")
	private WebElement gseProductStructureRadioButton;
	
	@FindBy(xpath = "//div[@class='ingestion']/div/div/div[2]/div[1]/input")
	private WebElement  productExternalFrameworkStructureRadioButton;
	
	@FindBy(xpath = "//div[@class='ingestion']/div/div/div[2]/div[2]/input")
	private WebElement productStructureRadioButton;
	
	@FindBy(xpath = "//div[@class='ingestion']/div/div/div[2]/div[3]/input")
	private WebElement productHERadioButton;
	
	@FindBy(xpath = "//div[@class='ingestion']/div/div/div[2]/div[1]/input")
	private WebElement curriculumStandardStructure;
	
	@FindBy(xpath = "//div[@class='ingestion']/div/div/div[2]/div[3]/input")
	private WebElement intermediaryStructure;
	
	@FindBy(xpath = "//div[@class='ingestion-footer']/button")
	private WebElement nextButtonFirst;
	
	@FindBy(xpath = "//div[@class='ingestion']/div/div/div[2]/div[1]/input")
	private WebElement curriculumStandardRadioButton;
	
	@FindBy(xpath = "//div[@class='ingestion']/div/div/div[2]/div[2]/input")
	private WebElement productRadioButton;
	
	@FindBy(xpath = "//div[@class='ingestion']/div/div/div[2]/div[3]/input")
	private WebElement intermediaryRadioButton;
	
	@FindBy(xpath = "//div[@class='ingestion']/div/div[1]/div[2]/button")
	private WebElement viewIngestFullLogButton;
	
	@FindBy(xpath = "//div[@class='ingestion-footer']/button")
	private WebElement cancelButton;
	
	@FindBy(xpath = "//div[@class='upload-file-container']/div/div/p/span[2]")
	private WebElement uploadFileLink;
	
	@FindBy(xpath = "//div[@class='ingestion']/div[2]/button[2]")
	private WebElement backButtonSt2;
	
	@FindBy(xpath = "//div[@class='ingestion']/div[2]/button[1]")
	private WebElement nextButtonSt2;
	
	@FindBy(xpath = "//div[@class='ingestion']/div/div/div/span/div/label")
	private WebElement ingestFailed;
	
	@FindBy(xpath = "//div[@class='ingestion']/div[1]/div[1]/div/div/label")
	private WebElement ingestSucessful; 
	
	@FindBy(xpath = "//div[@class='ingestion']/div[2]/button")
	private WebElement doneButton;
	
	@FindBy(xpath = "//div[@id='lomtAppId']/div/header/a/img")
	private WebElement pearsonLogo;
	
	//browse page
	@FindBy(xpath = "//div[@id='lomtAppId']/div/div/div[1]/span")
	private WebElement welcomeTitle;
		
	//right side message
	@FindBy(xpath = "//div[@class='ingestion']/div/div[2]/div/div[1]/div[1]")
	private WebElement firstTextImage;
	
	@FindBy(xpath = "//div[@class='ingestion']/div/div[2]/div/div[1]/div[2]")
	private WebElement firstTextMessage;
	
	@FindBy(xpath = "//div[@class='ingestion']/div/div[2]/div/div[3]/div[1]/img")
	private WebElement thirdTextImage;
	
	@FindBy(xpath = "//div[@class='ingestion']/div/div[2]/div/div[3]/div[2]")
	private WebElement thirdTextMessage;
	
	@FindBy(xpath = "//div[@class='ingestion']/div/div[2]/div/div[4]/div[2]")
	private WebElement fourthTextMessage;
	
	@FindBy(xpath = "//div[@class='ingestion']/div/div[2]/div/div[3]/div[1]/img")
	private WebElement fourthTextImage;
	
	//upload files page	
	@FindBy(xpath = "//div[@class='upload-file-text']/p[1]")
	private WebElement dragAndDropFilesText;
	
	@FindBy(xpath = "//div[@class='upload-file-text']/span/img")
	private WebElement plusSign;
	
	@FindBy(xpath = "//div[@id='lomtAppId']/div/div/div[2]/table/thead/tr/th[1]")
	private WebElement rowNo;
	
	@FindBy(xpath = "//div[@id='lomtAppId']/div/div/div[2]/table/thead/tr/th[2]")
	private WebElement type;
	
	@FindBy(xpath = "//div[@id='lomtAppId']/div/div/div[2]/table/thead/tr/th[3]")
	private WebElement message;
	
	@FindBy(xpath = "//div[@id='lomtAppId']/div/header/span/span")
	private WebElement logoutOption;
	
	@FindBy(xpath = "//div[@id='userInfoPopoverId']/div[2]/div/div[4]/button")
	private WebElement logout;
	
	@FindBy(xpath = "//div[@class='list-common-header']/span[1]")
	private By resultCountBy;
	
	@FindBy(xpath = "//div[@class='list-common-header']/span[1]")
	private WebElement resultCount;
	
	@FindBy(xpath = "//div[@class='filter-container']/div[5]/button")
	private WebElement updateResultButton;
	
	@FindBy(xpath = "//div[@class='list-data-container']/div/div/span/div/div/input")
	private WebElement egCheckbox;
	
	@FindBy(xpath = "//div[@class='fixed-header-container']/span/div/div/div/button[2]")
	private WebElement exportButton;
	
	@FindBy(xpath = "//div[@class='filter-container']/div[2]/input")
	private WebElement enterSearchTerm;
	
	@FindBy(xpath = "//div[@id='lomtAppId']/div/div/div[2]/div/div[2]/div[2]/div[1]")
	private WebElement egFirstDiv;
	
	@FindBy(xpath = "//div[@id='lomtAppId']/div/div/div[2]/div/div[1]/div[3]/input")
	private WebElement descriptiveIdADSearch;
	
	public WebElement getPearsonLogo() {
		return pearsonLogo;
	}

	public void setPearsonLogo(WebElement pearsonLogo) {
		this.pearsonLogo = pearsonLogo;
	}

	public CommonPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getSchoolGlobalLOB() {
		return schoolGlobalLOB;
	}

	public void setSchoolGlobalLOB(WebElement schoolGlobalLOB) {
		this.schoolGlobalLOB = schoolGlobalLOB;
	}

	public WebElement getNalsLOB() {
		return nalsLOB;
	}

	public WebElement getEnglishLOB() {
		return englishLOB;
	}

	public void setEnglishLOB(WebElement englishLOB) {
		this.englishLOB = englishLOB;
	}

	public void setNalsLOB(WebElement nalsLOB) {
		this.nalsLOB = nalsLOB;
	}

	public WebElement getManageIngestion() {
		return manageIngestion;
	}

	public void setManageIngestion(WebElement manageIngestion) {
		this.manageIngestion = manageIngestion;
	}

	public WebElement getBackLinkFirst() {
		return backLinkFirst;
	}

	public void setBackLinkFirst(WebElement backLinkFirst) {
		this.backLinkFirst = backLinkFirst;
	}

	public WebElement getCreateUploadStructureHeader() {
		return createUploadStructureHeader;
	}

	public void setCreateUploadStructureHeader(WebElement createUploadStructureHeader) {
		this.createUploadStructureHeader = createUploadStructureHeader;
	}

	public WebElement getSelectLOBTitle() {
		return selectLOBTitle;
	}

	public void setSelectLOBTitle(WebElement selectLOBTitle) {
		this.selectLOBTitle = selectLOBTitle;
	}

	public WebElement getEnglishLOBRadioButton() {
		return englishLOBRadioButton;
	}

	public void setEnglishLOBRadioButton(WebElement englishLOBRadioButton) {
		this.englishLOBRadioButton = englishLOBRadioButton;
	}

	public WebElement getHeLOBRadioButton() {
		return heLOBRadioButton;
	}

	public void setHeLOBRadioButton(WebElement heLOBRadioButton) {
		this.heLOBRadioButton = heLOBRadioButton;
	}

	public WebElement getSchoolGlobalLOBRadioButton() {
		return schoolGlobalLOBRadioButton;
	}

	public void setSchoolGlobalLOBRadioButton(WebElement schoolGlobalLOBRadioButton) {
		this.schoolGlobalLOBRadioButton = schoolGlobalLOBRadioButton;
	}

	public WebElement getNalsLOBRadioButton() {
		return nalsLOBRadioButton;
	}

	public void setNalsLOBRadioButton(WebElement nalsLOBRadioButton) {
		this.nalsLOBRadioButton = nalsLOBRadioButton;
	}

	public WebElement getSelectStructureTitle() {
		return selectStructureTitle;
	}
	
	public WebElement getDragAndDropFilesText() {
		return dragAndDropFilesText;
	}

	public void setDragAndDropFilesText(WebElement dragAndDropFilesText) {
		this.dragAndDropFilesText = dragAndDropFilesText;
	}

	public void setSelectStructureTitle(WebElement selectStructureTitle) {
		this.selectStructureTitle = selectStructureTitle;
	}

	public WebElement getWelcomeTitle() {
		return welcomeTitle;
	}

	public void setWelcomeTitle(WebElement welcomeTitle) {
		this.welcomeTitle = welcomeTitle;
	}

	public WebElement getGseStructureRadioButton() {
		return gseStructureRadioButton;
	}

	public void setGseStructureRadioButton(WebElement gseStructureRadioButton) {
		this.gseStructureRadioButton = gseStructureRadioButton;
	}

	public WebElement getNextButtonFirst() {
		return nextButtonFirst;
	}

	public void setNextButtonFirst(WebElement nextButtonFirst) {
		this.nextButtonFirst = nextButtonFirst;
	}

	public WebElement getCurriculumStandardRadioButton() {
		return curriculumStandardRadioButton;
	}

	public void setCurriculumStandardRadioButton(WebElement sgCurriculumStandardRadioButton) {
		this.curriculumStandardRadioButton = sgCurriculumStandardRadioButton;
	}

	public WebElement getProductRadioButton() {
		return productRadioButton;
	}

	public void setProductRadioButton(WebElement sgProductRadioButton) {
		this.productRadioButton = sgProductRadioButton;
	}

	public WebElement getIntermediaryRadioButton() {
		return intermediaryRadioButton;
	}

	public void setIntermediaryRadioButton(WebElement sgIntermediaryRadioButton) {
		this.intermediaryRadioButton = sgIntermediaryRadioButton;
	}

	public WebElement getViewIngestFullLogButton() {
		return viewIngestFullLogButton;
	}

	public void setViewIngestFullLogButton(WebElement viewIngestFullLogButton) {
		this.viewIngestFullLogButton = viewIngestFullLogButton;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}

	public void setCancelButton(WebElement cancelButton) {
		this.cancelButton = cancelButton;
	}

	public WebElement getUploadFileLink() {
		return uploadFileLink;
	}

	public void setUploadFileLink(WebElement uploadFileLink) {
		this.uploadFileLink = uploadFileLink;
	}
	
	public WebElement getBackButtonSt2() {
		return backButtonSt2;
	}

	public void setBackButtonSt2(WebElement backButtonSt2) {
		this.backButtonSt2 = backButtonSt2;
	}

	public WebElement getNextButtonSt2() {
		return nextButtonSt2;
	}

	public void setNextButtonSt2(WebElement nextButtonSt2) {
		this.nextButtonSt2 = nextButtonSt2;
	}

	public WebElement getIngestFailed() {
		return ingestFailed;
	}

	public void setIngestFailed(WebElement ingestFailed) {
		this.ingestFailed = ingestFailed;
	}

	public WebElement getIngestSucessful() {
		return ingestSucessful;
	}

	public void setIngestSucessful(WebElement ingestSucessful) {
		this.ingestSucessful = ingestSucessful;
	}

	public WebElement getDoneButton() {
		return doneButton;
	}

	public void setDoneButton(WebElement doneButton) {
		this.doneButton = doneButton;
	}

	public WebElement getHeLOB() {
		return heLOB;
	}

	public void setHeLOB(WebElement heLOB) {
		this.heLOB = heLOB;
	}

	public WebElement getGseExternalFrameworkStructureRadioButton() {
		return gseExternalFrameworkStructureRadioButton;
	}

	public void setGseExternalFrameworkStructureRadioButton(WebElement gseExternalFrameworkStructureRadioButton) {
		this.gseExternalFrameworkStructureRadioButton = gseExternalFrameworkStructureRadioButton;
	}

	public WebElement getGseProductStructureRadioButton() {
		return gseProductStructureRadioButton;
	}

	public void setGseProductStructureRadioButton(WebElement gseProductStructureRadioButton) {
		this.gseProductStructureRadioButton = gseProductStructureRadioButton;
	}

	public WebElement getProductExternalFrameworkStructureRadioButton() {
		return productExternalFrameworkStructureRadioButton;
	}

	public void setProductExternalFrameworkStructureRadioButton(WebElement productExternalFrameworkStructureRadioButton) {
		this.productExternalFrameworkStructureRadioButton = productExternalFrameworkStructureRadioButton;
	}

	public WebElement getProductStructureRadioButton() {
		return productStructureRadioButton;
	}

	public void setProductStructureRadioButton(WebElement productStructureRadioButton) {
		this.productStructureRadioButton = productStructureRadioButton;
	}

	public WebElement getProductHERadioButton() {
		return productHERadioButton;
	}

	public void setProductHERadioButton(WebElement productHERadioButton) {
		this.productHERadioButton = productHERadioButton;
	}

	public WebElement getCurriculumStandardStructure() {
		return curriculumStandardStructure;
	}

	public void setCurriculumStandardStructure(WebElement curriculumStandardStructure) {
		this.curriculumStandardStructure = curriculumStandardStructure;
	}

	public WebElement getIntermediaryStructure() {
		return intermediaryStructure;
	}

	public void setIntermediaryStructure(WebElement intermediaryStructure) {
		this.intermediaryStructure = intermediaryStructure;
	}

	public WebElement getFirstTextImage() {
		return firstTextImage;
	}

	public void setFirstTextImage(WebElement firstTextImage) {
		this.firstTextImage = firstTextImage;
	}

	public WebElement getFirstTextMessage() {
		return firstTextMessage;
	}

	public void setFirstTextMessage(WebElement firstTextMessage) {
		this.firstTextMessage = firstTextMessage;
	}

	public WebElement getThirdTextImage() {
		return thirdTextImage;
	}

	public void setThirdTextImage(WebElement thirdTextImage) {
		this.thirdTextImage = thirdTextImage;
	}

	public WebElement getFourthTextMessage() {
		return fourthTextMessage;
	}

	public void setFourthTextMessage(WebElement fourthTextMessage) {
		this.fourthTextMessage = fourthTextMessage;
	}

	public WebElement getFourthTextImage() {
		return fourthTextImage;
	}

	public void setFourthTextImage(WebElement fourthTextImage) {
		this.fourthTextImage = fourthTextImage;
	}

	public WebElement getThirdTextMessage() {
		return thirdTextMessage;
	}

	public void setThirdTextMessage(WebElement thirdTextMessage) {
		this.thirdTextMessage = thirdTextMessage;
	}

	public WebElement getPlusSign() {
		return plusSign;
	}

	public void setPlusSign(WebElement plusSign) {
		this.plusSign = plusSign;
	}

	public WebElement getRowNo() {
		return rowNo;
	}

	public void setRowNo(WebElement rowNo) {
		this.rowNo = rowNo;
	}

	public WebElement getType() {
		return type;
	}

	public void setType(WebElement type) {
		this.type = type;
	}

	public WebElement getMessage() {
		return message;
	}

	public void setMessage(WebElement message) {
		this.message = message;
	}

	public WebElement getLogoutOption() {
		return logoutOption;
	}

	public void setLogoutOption(WebElement logoutOption) {
		this.logoutOption = logoutOption;
	}

	public WebElement getLogout() {
		return logout;
	}

	public void setLogout(WebElement logout) {
		this.logout = logout;
	}

	public By getResultCountBy() {
		return resultCountBy;
	}

	public void setResultCountBy(By resultCountBy) {
		this.resultCountBy = resultCountBy;
	}

	public WebElement getResultCount() {
		return resultCount;
	}

	public void setResultCount(WebElement resultCount) {
		this.resultCount = resultCount;
	}

	public WebElement getUpdateResultButton() {
		return updateResultButton;
	}

	public void setUpdateResultButton(WebElement updateResultButton) {
		this.updateResultButton = updateResultButton;
	}

	public WebElement getEgCheckbox() {
		return egCheckbox;
	}

	public void setEgCheckbox(WebElement egCheckbox) {
		this.egCheckbox = egCheckbox;
	}

	public WebElement getExportButton() {
		return exportButton;
	}

	public void setExportButton(WebElement exportButton) {
		this.exportButton = exportButton;
	}

	public WebElement getEnterSearchTerm() {
		return enterSearchTerm;
	}

	public void setEnterSearchTerm(WebElement enterSearchTerm) {
		this.enterSearchTerm = enterSearchTerm;
	}

	public WebElement getEgFirstDiv() {
		return egFirstDiv;
	}

	public void setEgFirstDiv(WebElement egFirstDiv) {
		this.egFirstDiv = egFirstDiv;
	}

	public WebElement getDescriptiveIdADSearch() {
		return descriptiveIdADSearch;
	}

	public void setDescriptiveIdADSearch(WebElement descriptiveIdADSearch) {
		this.descriptiveIdADSearch = descriptiveIdADSearch;
	}

}
