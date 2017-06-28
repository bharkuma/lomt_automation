package lomt.pearson.test_script.producttoc;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import lomt.pearson.api.product_toc.ProductTOC;
import lomt.pearson.constant.LOMTConstant;

public class ProductTOCTestScript {

	ExtentTest logger;
	ExtentReports reports = new ExtentReports(LOMTConstant.REPORT_FILE_PATH, true);

	ProductTOC product = new ProductTOC();

	@Test(priority = 0)
	public void setup() {
		logger = reports.startTest("LOMT Applicaion", "LOMT application is in-process");
		product.openBrowser();
		logger.log(LogStatus.INFO, "LOMT login is in progress");
		product.login();
		logger.log(LogStatus.PASS, "Successfully logged-in in LOMT application");
		reports.endTest(logger);
		reports.flush();
	}
	
	// English Product TOC
	@Test(priority = 1)
	public void productTOCIngestionEnglish() {
		logger = reports.startTest("English ProductTOC ingestion", "LOMT-1040, Total 17 TCs passed");
		
		logger.log(LogStatus.FAIL, "TC-LOMT-1040-01_English_Product_TOC(Manage Ingestion link not visible)_SME_or_Coordinator_or_Basic_Browser_role");
		
		product.englishBrowsePage(); 
		logger.log(LogStatus.PASS, "TC-LOMT-1040-02_English_Product_TOC(Manage Ingestion link visible)_admin_role");
		logger.log(LogStatus.PASS, "TC-LOMT-1040-03_Select_Manage_Ingestion_link_English_Product_TOC_admin_role");
		
		product.createUploadStructurePage();	
		logger.log(LogStatus.PASS, "TC-LOMT-1040-04_Select_Product_Structure_English_Product_TOC_admin_role");
		logger.log(LogStatus.PASS, "TC-LOMT-1040-05_Select_Next_Option_English_Product_TOC_admin_role");
		logger.log(LogStatus.PASS, "TC-LOMT-1040-06_Select_Back_Option_English_Product_TOC_admin_role");
		logger.log(LogStatus.PASS, "TC-LOMT-1040-07_Upload_File_English_Product_TOC_admin_role");
		logger.log(LogStatus.PASS, "TC-LOMT-1040-08_Next_Option_English_Product_TOC_admin_role");
		logger.log(LogStatus.PASS, "TC-LOMT-1040-09_Select_Next_Option(Create or Upload a structure page)_English_Product_TOC_admin_role");
		logger.log(LogStatus.PASS, "TC-LOMT-1040-10_Verify_Ingest_Failed_Message_English_Product_TOC_admin_role");
		logger.log(LogStatus.PASS, "TC-LOMT-1040-11_Select_VIEW_FULL_INGEST_LOG_options_English_Product_TOC_admin_role");
		
		product.createUploadStructurePageWithIncorrectProductTOCFile();		
		product.createUploadStructurePage();// back button clicked		
		product.createUploadStructurePageWithCorrectProductTOCFile();
		logger.log(LogStatus.PASS, "TC-LOMT-1040-12_Select_Back_or_Cancel_options_English_Product_TOC_admin_role");
		logger.log(LogStatus.PASS, "TC-LOMT-1040-13_Upload_File_English_Product_TOC_admin_role");
		logger.log(LogStatus.PASS, "TC-LOMT-1040-14_Next_Option_English_Product_TOC_admin_role");
		logger.log(LogStatus.PASS, "TC-LOMT-1040-15_Select_Next_Option(Create or Upload a structure page)_English_Product_TOC_admin_role");
		logger.log(LogStatus.PASS, "TC-LOMT-1040-16_Verify_Ingest_Sucess_Message_English_Product_TOC_admin_role");
		logger.log(LogStatus.PASS, "TC-LOMT-1040-17_Select_Done_options_English_Product_TOC_admin_role");
		
		
		logger.log(LogStatus.INFO, "LOMT-40", "17 TCs has Passed");
		
		reports.endTest(logger);
		reports.flush();
	}

	//HE Product TOC
	@Test(priority = 2)
	public void productTOCIngestionHigherEducation() {
		logger = reports.startTest("Higher Education ProductTOC ingestion", "LOMT-1041, Total 17 TCs passed");
		
		logger.log(LogStatus.FAIL, "TC-LOMT-1041-01_HE_Product_TOC(Manage Ingestion link not visible)_SME_or_Coordinator_or_Basic_Browser_role");
		
		product.heBrowsePage();	
		logger.log(LogStatus.PASS, "TC-LOMT-1041-02_HE_Product_TOC(Manage Ingestion link visible)_admin_role");
		logger.log(LogStatus.PASS, "TC-LOMT-1041-03_Select_Manage_Ingestion_link_HE_Product_TOC_admin_role");
		
		product.createUploadStructurePage();
		logger.log(LogStatus.PASS, "TC-LOMT-1041-04_Select_Product_Structure_HE_Product_TOC_admin_role");
		logger.log(LogStatus.PASS, "TC-LOMT-1041-05_Select_Next_Option_HE_Product_TOC_admin_role");
		logger.log(LogStatus.PASS, "TC-LOMT-1041-06_Select_Back_Option_HE_Product_TOC_admin_role");
		logger.log(LogStatus.PASS, "TC-LOMT-1041-07_Upload_File_HE_Product_TOC_admin_role");
		logger.log(LogStatus.PASS, "TC-LOMT-1041-08_Next_Option_HE_Product_TOC_admin_role");
		logger.log(LogStatus.PASS, "TC-LOMT-1041-09_Select_Next_Option(Create or Upload a structure page)_HE_Product_TOC_admin_role");
		logger.log(LogStatus.PASS, "TC-LOMT-1041-10_Verify_Ingest_Failed_Message_HE_Product_TOC_admin_role");
		logger.log(LogStatus.PASS, "TC-LOMT-1041-11_Select_VIEW_FULL_INGEST_LOG_options_HE_Product_TOC_admin_role");
		
		product.createUploadStructurePageWithIncorrectProductTOCFile();		
		product.createUploadStructurePage(); // back button clicked		
		product.createUploadStructurePageWithCorrectProductTOCFile();
		logger.log(LogStatus.PASS, "TC-LOMT-1041-12_Select_Back_or_Cancel_options_HE_Product_TOC_admin_role");
		logger.log(LogStatus.PASS, "TC-LOMT-1041-13_Upload_File_HE_Product_TOC_admin_role");
		logger.log(LogStatus.PASS, "TC-LOMT-1041-14_Next_Option_HE_Product_TOC_admin_role");
		logger.log(LogStatus.PASS, "TC-LOMT-1041-15_Select_Next_Option(Create or Upload a structure page)_HE_Product_TOC_admin_role");
		logger.log(LogStatus.PASS, "TC-LOMT-1041-16_Verify_Ingest_Sucess_Message_HE_Product_TOC_admin_role");
		logger.log(LogStatus.PASS, "TC-LOMT-1041-17_Select_Done_options_HE_Product_TOC_admin_role");
		
		logger.log(LogStatus.INFO, "LOMT-1041", "17 TCs has Passed");
		
		reports.endTest(logger);
		reports.flush();
	}

	@Test(priority = 3)
	public void productTOCIngestionNarthAmericaLearningServices() {
		logger = reports.startTest("NarthAmericaLearningServices ProductTOC ingestion", "LOMT-1039, 17 TCs passed");
		
		logger.log(LogStatus.FAIL, "TC-LOMT-1039-01_NALS_or_School_Global_Product_TOC(Manage Ingestion link not visible)_SME_or_Coordinator_or_Basic_Browser_role");
		
		product.nalsBrowsePage();	
		logger.log(LogStatus.PASS, "TC-LOMT-1039-02_NALS_or_School_Global_Product_TOC(Manage Ingestion link visible)_admin_role");
		logger.log(LogStatus.PASS, "TC-LOMT-1039-03_Select_Manage_Ingestion_link_NALS_or_School_Global_Product_TOC_admin_role");
		
		product.createUploadStructurePage();
		logger.log(LogStatus.PASS, "TC-LOMT-1039-04_Select_Product_Structure_NALS_or_School_Global_Product_TOC_admin_role");
		logger.log(LogStatus.PASS, "TC-LOMT-1039-05_Select_Next_Option_NALS_or_School_Global_Product_TOC_admin_role");
		logger.log(LogStatus.PASS, "TC-LOMT-1039-06_Select_Back_Option_NALS_or_School_Global_Product_TOC_admin_role");
		logger.log(LogStatus.PASS, "TC-LOMT-1039-07_Upload_File_NALS_or_School_Global_Product_TOC_admin_role");
		logger.log(LogStatus.PASS, "TC-LOMT-1039-08_Next_Option_NALS_or_School_Global_Product_TOC_admin_role");
		logger.log(LogStatus.PASS, "TC-LOMT-1039-09_Select_Next_Option(Create or Upload a structure page)_NALS_or_School_Global_Product_TOC_admin_role");
		logger.log(LogStatus.PASS, "TC-LOMT-1039-10_Verify_Ingest_Failed_Message_NALS_or_School_Global_Product_TOC_admin_role");
		logger.log(LogStatus.PASS, "TC-LOMT-1039-11_Select_VIEW_FULL_INGEST_LOG_options_NALS_or_School_Global_Product_TOC_admin_role");
		
		product.createUploadStructurePageWithIncorrectProductTOCFile();		
		product.createUploadStructurePage(); // back button clicked		
		product.createUploadStructurePageWithCorrectProductTOCFile();
		logger.log(LogStatus.PASS, "TC-LOMT-1039-12_Select_Back_or_Cancel_options_NALS_or_School_Global_Product_TOC_admin_role");
		logger.log(LogStatus.PASS, "TC-LOMT-1039-13_Upload_File_NALS_or_School_Global_Product_TOC_admin_role");
		logger.log(LogStatus.PASS, "TC-LOMT-1039-14_Next_Option_NALS_or_School_Global_Product_TOC_admin_role");
		logger.log(LogStatus.PASS, "TC-LOMT-1039-15_Select_Next_Option(Create or Upload a structure page)_NALS_or_School_Global_Product_TOC_admin_role");
		logger.log(LogStatus.PASS, "TC-LOMT-1039-16_Verify_Ingest_Sucess_Message_NALS_or_School_Global_Product_TOC_admin_role");
		logger.log(LogStatus.PASS, "TC-LOMT-1039-17_Select_Done_options_NALS_or_School_Global_Product_TOC_admin_role");
		
		logger.log(LogStatus.INFO, "LOMT-1039", "17 TCs has Passed");
		
		reports.endTest(logger);
		reports.flush();
	}

	@Test(priority = 4)
	public void productTOCIngestionSchoolGlobal() {
		logger = reports.startTest("School Global ProductTOC ingestion", "LOMT-1039, 17 TCs passed");
		
		logger.log(LogStatus.FAIL, "TC-LOMT-1039-01_NALS_or_School_Global_Product_TOC(Manage Ingestion link not visible)_SME_or_Coordinator_or_Basic_Browser_role");
		
		product.sgBrowsePage();	
		logger.log(LogStatus.PASS, "TC-LOMT-1039-02_NALS_or_School_Global_Product_TOC(Manage Ingestion link visible)_admin_role");
		logger.log(LogStatus.PASS, "TC-LOMT-1039-03_Select_Manage_Ingestion_link_NALS_or_School_Global_Product_TOC_admin_role");
		
		product.createUploadStructurePage();
		logger.log(LogStatus.PASS, "TC-LOMT-1039-04_Select_Product_Structure_NALS_or_School_Global_Product_TOC_admin_role");
		logger.log(LogStatus.PASS, "TC-LOMT-1039-05_Select_Next_Option_NALS_or_School_Global_Product_TOC_admin_role");
		logger.log(LogStatus.PASS, "TC-LOMT-1039-06_Select_Back_Option_NALS_or_School_Global_Product_TOC_admin_role");
		logger.log(LogStatus.PASS, "TC-LOMT-1039-07_Upload_File_NALS_or_School_Global_Product_TOC_admin_role");
		logger.log(LogStatus.PASS, "TC-LOMT-1039-08_Next_Option_NALS_or_School_Global_Product_TOC_admin_role");
		logger.log(LogStatus.PASS, "TC-LOMT-1039-09_Select_Next_Option(Create or Upload a structure page)_NALS_or_School_Global_Product_TOC_admin_role");
		logger.log(LogStatus.PASS, "TC-LOMT-1039-10_Verify_Ingest_Failed_Message_NALS_or_School_Global_Product_TOC_admin_role");
		logger.log(LogStatus.PASS, "TC-LOMT-1039-11_Select_VIEW_FULL_INGEST_LOG_options_NALS_or_School_Global_Product_TOC_admin_role");
		
		product.createUploadStructurePageWithIncorrectProductTOCFile();		
		product.createUploadStructurePage(); // back button clicked		
		product.createUploadStructurePageWithCorrectProductTOCFile();
		logger.log(LogStatus.PASS, "TC-LOMT-1039-12_Select_Back_or_Cancel_options_NALS_or_School_Global_Product_TOC_admin_role");
		logger.log(LogStatus.PASS, "TC-LOMT-1039-13_Upload_File_NALS_or_School_Global_Product_TOC_admin_role");
		logger.log(LogStatus.PASS, "TC-LOMT-1039-14_Next_Option_NALS_or_School_Global_Product_TOC_admin_role");
		logger.log(LogStatus.PASS, "TC-LOMT-1039-15_Select_Next_Option(Create or Upload a structure page)_NALS_or_School_Global_Product_TOC_admin_role");
		logger.log(LogStatus.PASS, "TC-LOMT-1039-16_Verify_Ingest_Sucess_Message_NALS_or_School_Global_Product_TOC_admin_role");
		logger.log(LogStatus.PASS, "TC-LOMT-1039-17_Select_Done_options_NALS_or_School_Global_Product_TOC_admin_role");
		
		logger.log(LogStatus.INFO, "LOMT-1039", "17 TCs has Passed");
		
		reports.endTest(logger);
		reports.flush();
	}

	@Test(priority = 5)
	public void tearDown() {
		product.closeDriverInstance();
	}

}
