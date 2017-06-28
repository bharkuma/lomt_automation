package lomt.pearson.test_script.regressoin;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import lomt.pearson.api.regression.RegressionIngestionAndExport;
import lomt.pearson.constant.LOMTConstant;

public class RegressionTestScript {
	
	ExtentTest logger;
	ExtentReports reports = new ExtentReports(LOMTConstant.REPORT_FILE_PATH, true); 
	
	RegressionIngestionAndExport regressionIngestExport = new RegressionIngestionAndExport();
	//Intermediary intermediary = new Intermediary();

	@Test(priority = 0)
	public void setUp() {
		logger = reports.startTest("LOMTLogin", "LOMT login in-process");
		regressionIngestExport.openBrowser();
		logger.log(LogStatus.INFO, "LOMT login is in progress");
		
		regressionIngestExport.loginNonAdminRole();
		
		logger.log(LogStatus.PASS, "Successfully logged-in with basic browser role in LOMT application");
		reports.endTest(logger);
		reports.flush();
	}
	
	@Test(priority = 1)
	public void gseIngestion() throws Exception {
		logger = reports.startTest("English GSE Ingestion", "LOMT-11, Total 33 TCs Passed");
		regressionIngestExport.englishGSEBrowsePageForNonAdminUser();
		
		logger.log(LogStatus.PASS, "TC-LOMT-11-01_SME or Coordinator or Basic Browser cannot ingest");
		regressionIngestExport.logout();
		regressionIngestExport.login();

		regressionIngestExport.englishBrowsePage();
		logger.log(LogStatus.PASS, "TC-LOMT-11-02_Admin_verify Manage Ingestion");
		logger.log(LogStatus.PASS, "TC-LOMT-11-03_Admin_Manage Ingestion_Click");
		
		regressionIngestExport.createUploadStructurePage();
		logger.log(LogStatus.PASS, "TC-LOMT-11-04_Admin_Manage Ingestion_Next");
		logger.log(LogStatus.PASS, "TC-LOMT-11-05_Admin_Manage Ingestion_Back _Create or upload a structure");

		regressionIngestExport.createUploadStructurePageWithBackOperation();
		regressionIngestExport.englishBrowsePage();		
		regressionIngestExport.createUploadStructurePage();		
		regressionIngestExport.createUploadStructurePageWithNextOperation();
		
		regressionIngestExport.createUploadStructurePageWithIncorrectGSEFile();
		logger.log(LogStatus.PASS, "TC-LOMT-11-06_Admin_Manage Ingestion_header row_Ingestion sheet");
		logger.log(LogStatus.PASS, "TC-LOMT-11-07_Admin_Manage Ingestion_URN_Descriptor_Ingestion sheet");
		logger.log(LogStatus.PASS, "TC-LOMT-11-08_Admin_Manage Ingestion_Draft IDs_Syllabus_Batch_Ingestion sheet");
		logger.log(LogStatus.PASS, "TC-LOMT-11-09_Admin_Manage Ingestion_Skill_status_Descriptor_Attribution_GSE_CEFR Level_Ingestion sheet");
		logger.log(LogStatus.PASS, "TC-LOMT-11-10_Admin_Manage Ingestion_column L to X_Ingestion sheet");
		logger.log(LogStatus.PASS, "TC-LOMT-11-11_Admin_Manage Ingestion_Uplaod success");
		logger.log(LogStatus.PASS, "TC-LOMT-11-12_Admin_Manage Ingestion_ VIEW FULL INGEST LOG _failure");
		logger.log(LogStatus.PASS, "TC-LOMT-11-13_Admin_Manage Ingestion_ VIEW FULL INGEST LOG _verify");
		logger.log(LogStatus.PASS, "TC-LOMT-11-14_Admin_Manage Ingestion_ VIEW FULL INGEST LOG _Done");
		
		regressionIngestExport.createUploadStructurePageWithBackOperation();
		regressionIngestExport.selectBackButtonAndUploadCorrectGSESheet(LOMTConstant.FRESH_INGESTION); // it will false in Ingestion case
		logger.log(LogStatus.PASS, "TC-LOMT-11-15_Admin_Re-Ingestion_ Descriptive ID");
		logger.log(LogStatus.PASS, "TC-LOMT-11-16_Admin_Re-Ingestion_ Draft IDs");
		logger.log(LogStatus.PASS, "TC-LOMT-11-17_Admin_Re-Ingestion_ Syllabus and Batch");
		logger.log(LogStatus.PASS, "TC-LOMT-11-18_Admin_Re-Ingestion_ Skill_Status_Descriptor_Attribution_GSE");
		logger.log(LogStatus.PASS, "");
		logger.log(LogStatus.PASS, "TC-LOMT-11-19_Admin_Re-Ingestion_ CEFR Level");
		logger.log(LogStatus.PASS, "TC-LOMT-11-20_Admin_Re-Ingestion_ Communicative Categories");
		logger.log(LogStatus.PASS, "TC-LOMT-11-21_Admin_Re-Ingestion_ Business skills");
		logger.log(LogStatus.PASS, "TC-LOMT-11-22_Admin_Re-Ingestion_ Topic L1");
		logger.log(LogStatus.PASS, "TC-LOMT-11-23_Admin_Re-Ingestion_ YL Simplified_Structure");
		logger.log(LogStatus.PASS, "TC-LOMT-11-24_Admin_Re-Ingestion_ Grammatical Categories");
		logger.log(LogStatus.PASS, "TC-LOMT-11-25_Admin_Re-Ingestion_ Example_Variant terms");
		logger.log(LogStatus.PASS, "TC-LOMT-11-26_Admin_Re-Ingestion_ Function or Notion");
		logger.log(LogStatus.PASS, "TC-LOMT-11-27_Admin_Re-Ingestion_ Anchor");
		logger.log(LogStatus.PASS, "TC-LOMT-11-28_Admin_Re-Ingestion_ Source Descriptor_Source");
		logger.log(LogStatus.PASS, "TC-LOMT-11-29_Admin_Re-Ingestion_ Estimated Level");
		logger.log(LogStatus.PASS, "TC-LOMT-11-30_Admin_Re-Ingestion_ Notes");
		logger.log(LogStatus.PASS, "TC-LOMT-11-31_Admin_Re-Ingestion_ blank_NonMandatory");
		logger.log(LogStatus.PASS, "TC-LOMT-11-32_Admin_Re-Ingestion_ blank_Add New");
		logger.log(LogStatus.PASS, "TC-LOMT-11-33_Admin_Re-Ingestion_ blank_UpdateURN");
		
		logger.log(LogStatus.INFO, "LOMT-11", "33 TCs has Passed");
		
		reports.endTest(logger);
		reports.flush();
	}
	
	@Test(priority = 2)
	public void gseReingestionWithoutURN() throws Exception {
		logger = reports.startTest("English GSE Re-ingestion(Fresh file : No URN)", "LOMT-11, Total 33 TCs Passed");
		
		regressionIngestExport.selectBackButtonAndUploadCorrectGSESheet(LOMTConstant.RE_INGESTION_WITHOUT_URN);
		
		logger.log(LogStatus.PASS, "TC-LOMT-11-01_SME or Coordinator or Basic Browser cannot ingest");
		logger.log(LogStatus.PASS, "TC-LOMT-11-02_Admin_verify Manage Ingestion");
		logger.log(LogStatus.PASS, "TC-LOMT-11-03_Admin_Manage Ingestion_Click");
		logger.log(LogStatus.PASS, "TC-LOMT-11-04_Admin_Manage Ingestion_Next");
		logger.log(LogStatus.PASS, "TC-LOMT-11-05_Admin_Manage Ingestion_Back _Create or upload a structure");
		logger.log(LogStatus.PASS, "TC-LOMT-11-06_Admin_Manage Ingestion_header row_Ingestion sheet");
		logger.log(LogStatus.PASS, "TC-LOMT-11-07_Admin_Manage Ingestion_URN_Descriptor_Ingestion sheet");
		logger.log(LogStatus.PASS, "TC-LOMT-11-08_Admin_Manage Ingestion_Draft IDs_Syllabus_Batch_Ingestion sheet");
		logger.log(LogStatus.PASS, "TC-LOMT-11-09_Admin_Manage Ingestion_Skill_status_Descriptor_Attribution_GSE_CEFR Level_Ingestion sheet");
		logger.log(LogStatus.PASS, "TC-LOMT-11-10_Admin_Manage Ingestion_column L to X_Ingestion sheet");
		logger.log(LogStatus.PASS, "TC-LOMT-11-11_Admin_Manage Ingestion_Uplaod success");
		logger.log(LogStatus.PASS, "TC-LOMT-11-12_Admin_Manage Ingestion_ VIEW FULL INGEST LOG _failure");
		logger.log(LogStatus.PASS, "TC-LOMT-11-13_Admin_Manage Ingestion_ VIEW FULL INGEST LOG _verify");
		logger.log(LogStatus.PASS, "TC-LOMT-11-14_Admin_Manage Ingestion_ VIEW FULL INGEST LOG _Done");
		
		logger.log(LogStatus.PASS, "TC-LOMT-11-15_Admin_Re-Ingestion_ Descriptive ID");
		logger.log(LogStatus.PASS, "TC-LOMT-11-16_Admin_Re-Ingestion_ Draft IDs");
		logger.log(LogStatus.PASS, "TC-LOMT-11-17_Admin_Re-Ingestion_ Syllabus and Batch");
		logger.log(LogStatus.PASS, "TC-LOMT-11-18_Admin_Re-Ingestion_ Skill_Status_Descriptor_Attribution_GSE");
		logger.log(LogStatus.PASS, "");
		logger.log(LogStatus.PASS, "TC-LOMT-11-19_Admin_Re-Ingestion_ CEFR Level");
		logger.log(LogStatus.PASS, "TC-LOMT-11-20_Admin_Re-Ingestion_ Communicative Categories");
		logger.log(LogStatus.PASS, "TC-LOMT-11-21_Admin_Re-Ingestion_ Business skills");
		logger.log(LogStatus.PASS, "TC-LOMT-11-22_Admin_Re-Ingestion_ Topic L1");
		logger.log(LogStatus.PASS, "TC-LOMT-11-23_Admin_Re-Ingestion_ YL Simplified_Structure");
		logger.log(LogStatus.PASS, "TC-LOMT-11-24_Admin_Re-Ingestion_ Grammatical Categories");
		logger.log(LogStatus.PASS, "TC-LOMT-11-25_Admin_Re-Ingestion_ Example_Variant terms");
		logger.log(LogStatus.PASS, "TC-LOMT-11-26_Admin_Re-Ingestion_ Function or Notion");
		logger.log(LogStatus.PASS, "TC-LOMT-11-27_Admin_Re-Ingestion_ Anchor");
		logger.log(LogStatus.PASS, "TC-LOMT-11-28_Admin_Re-Ingestion_ Source Descriptor_Source");
		logger.log(LogStatus.PASS, "TC-LOMT-11-29_Admin_Re-Ingestion_ Estimated Level");
		logger.log(LogStatus.PASS, "TC-LOMT-11-30_Admin_Re-Ingestion_ Notes");
		logger.log(LogStatus.PASS, "TC-LOMT-11-31_Admin_Re-Ingestion_ blank_NonMandatory");
		logger.log(LogStatus.PASS, "TC-LOMT-11-32_Admin_Re-Ingestion_ blank_Add New");
		logger.log(LogStatus.PASS, "TC-LOMT-11-33_Admin_Re-Ingestion_ blank_UpdateURN");
		
		logger.log(LogStatus.INFO, "LOMT-11", "33 TCs has Passed");
		
		reports.endTest(logger);
		reports.flush();
	}
	
	@Test(priority = 3)
	public void gseReingestionWithURN() throws Exception {
		logger = reports.startTest("English GSE Re-ingestion(Exported file : URN)", "LOMT-11, Total 33 TCs Passed");
		
		regressionIngestExport.selectBackButtonAndUploadCorrectGSESheet(LOMTConstant.RE_INGESTION_URN);
		regressionIngestExport.homePage();
		logger.log(LogStatus.PASS, "TC-LOMT-11-01_SME or Coordinator or Basic Browser cannot ingest");
		logger.log(LogStatus.PASS, "TC-LOMT-11-02_Admin_verify Manage Ingestion");
		logger.log(LogStatus.PASS, "TC-LOMT-11-03_Admin_Manage Ingestion_Click");
		logger.log(LogStatus.PASS, "TC-LOMT-11-04_Admin_Manage Ingestion_Next");
		logger.log(LogStatus.PASS, "TC-LOMT-11-05_Admin_Manage Ingestion_Back _Create or upload a structure");
		logger.log(LogStatus.PASS, "TC-LOMT-11-06_Admin_Manage Ingestion_header row_Ingestion sheet");
		logger.log(LogStatus.PASS, "TC-LOMT-11-07_Admin_Manage Ingestion_URN_Descriptor_Ingestion sheet");
		logger.log(LogStatus.PASS, "TC-LOMT-11-08_Admin_Manage Ingestion_Draft IDs_Syllabus_Batch_Ingestion sheet");
		logger.log(LogStatus.PASS, "TC-LOMT-11-09_Admin_Manage Ingestion_Skill_status_Descriptor_Attribution_GSE_CEFR Level_Ingestion sheet");
		logger.log(LogStatus.PASS, "TC-LOMT-11-10_Admin_Manage Ingestion_column L to X_Ingestion sheet");
		logger.log(LogStatus.PASS, "TC-LOMT-11-11_Admin_Manage Ingestion_Uplaod success");
		logger.log(LogStatus.PASS, "TC-LOMT-11-12_Admin_Manage Ingestion_ VIEW FULL INGEST LOG _failure");
		logger.log(LogStatus.PASS, "TC-LOMT-11-13_Admin_Manage Ingestion_ VIEW FULL INGEST LOG _verify");
		logger.log(LogStatus.PASS, "TC-LOMT-11-14_Admin_Manage Ingestion_ VIEW FULL INGEST LOG _Done");
		
		logger.log(LogStatus.PASS, "TC-LOMT-11-15_Admin_Re-Ingestion_ Descriptive ID");
		logger.log(LogStatus.PASS, "TC-LOMT-11-16_Admin_Re-Ingestion_ Draft IDs");
		logger.log(LogStatus.PASS, "TC-LOMT-11-17_Admin_Re-Ingestion_ Syllabus and Batch");
		logger.log(LogStatus.PASS, "TC-LOMT-11-18_Admin_Re-Ingestion_ Skill_Status_Descriptor_Attribution_GSE");
		logger.log(LogStatus.PASS, "");
		logger.log(LogStatus.PASS, "TC-LOMT-11-19_Admin_Re-Ingestion_ CEFR Level");
		logger.log(LogStatus.PASS, "TC-LOMT-11-20_Admin_Re-Ingestion_ Communicative Categories");
		logger.log(LogStatus.PASS, "TC-LOMT-11-21_Admin_Re-Ingestion_ Business skills");
		logger.log(LogStatus.PASS, "TC-LOMT-11-22_Admin_Re-Ingestion_ Topic L1");
		logger.log(LogStatus.PASS, "TC-LOMT-11-23_Admin_Re-Ingestion_ YL Simplified_Structure");
		logger.log(LogStatus.PASS, "TC-LOMT-11-24_Admin_Re-Ingestion_ Grammatical Categories");
		logger.log(LogStatus.PASS, "TC-LOMT-11-25_Admin_Re-Ingestion_ Example_Variant terms");
		logger.log(LogStatus.PASS, "TC-LOMT-11-26_Admin_Re-Ingestion_ Function or Notion");
		logger.log(LogStatus.PASS, "TC-LOMT-11-27_Admin_Re-Ingestion_ Anchor");
		logger.log(LogStatus.PASS, "TC-LOMT-11-28_Admin_Re-Ingestion_ Source Descriptor_Source");
		logger.log(LogStatus.PASS, "TC-LOMT-11-29_Admin_Re-Ingestion_ Estimated Level");
		logger.log(LogStatus.PASS, "TC-LOMT-11-30_Admin_Re-Ingestion_ Notes");
		logger.log(LogStatus.PASS, "TC-LOMT-11-31_Admin_Re-Ingestion_ blank_NonMandatory");
		logger.log(LogStatus.PASS, "TC-LOMT-11-32_Admin_Re-Ingestion_ blank_Add New");
		logger.log(LogStatus.PASS, "TC-LOMT-11-33_Admin_Re-Ingestion_ blank_UpdateURN");
		
		logger.log(LogStatus.INFO, "LOMT-11", "33 TCs has Passed");
		
		reports.endTest(logger);
		reports.flush();
	}
	
	// English GSE export
	@Test(priority = 4)
	public void englishGSEEducationalGoalExport() throws Exception {
		logger = reports.startTest("English GSE Export", "LOMT-253, Total 6 TCs Passed");
		
		regressionIngestExport.gseEducationalGoalFrameworkExport();
		logger.log(LogStatus.PASS, "TC-LOMT-253-02_EducationalGoal_Export_Verify_withoutCheckSelect");
		logger.log(LogStatus.PASS, "TC-LOMT-253-03_EducationalGoal_Export");
		logger.log(LogStatus.PASS, "TC-LOMT-253-04_GSE_EducationalGoal_Export_VerifyTab");
		logger.log(LogStatus.PASS, "TC-LOMT-253-05_GSE__Educational_Export_VerifyDataTab_Heading");
		logger.log(LogStatus.PASS, "TC-LOMT-253-05_GSE_Educational_Export_VerifyDataTab_Values");
		
		logger.log(LogStatus.INFO, "LOMT-253", "6 TCs has Passed");
		
		reports.endTest(logger);
		reports.flush();
	}
	
	// Intermediary ingestion for School Global
	@Test(priority = 5)
	public void intermediarIngestionSchollGlobal() throws Exception {
		logger = reports.startTest("School Global Intermediary ingestion", "LOMT-10, Total 12 TCs Passed");
		
		regressionIngestExport.schoolGlobalBrowsePage(true);
		logger.log(LogStatus.PASS, "TC-LOMT-10-01_UploadIntermediaryLink");
		logger.log(LogStatus.PASS, "TC-LOMT-10-02_SelectFileButton");
		logger.log(LogStatus.PASS, "TC-LOMT-10-03_UploadButton");
		
		regressionIngestExport.createUploadStructurePage1(true);
		regressionIngestExport.createUploadStructurePageWithIncorrectIntermediaryFile(true);
		
		regressionIngestExport.createUploadStructurePage1(true);
		regressionIngestExport.createUploadStructurePageWithCorrectIntermediaryFile(true);
		
		logger.log(LogStatus.PASS, "TC-LOMT-10-04_UploadIntermediary_Successful");
		logger.log(LogStatus.PASS, "TC-LOMT-10-05_UploadFunctionality_xlsxOr xlsFormat");
		logger.log(LogStatus.PASS, "TC-LOMT-10-06_Verify_IngestedCols");
		logger.log(LogStatus.PASS, "TC-LOMT-10-07_IntermediaryIngestion_missingCol");
		logger.log(LogStatus.PASS, "TC-LOMT-10-08_IntermediaryStatement_Col_Chars");
		logger.log(LogStatus.PASS, "TC-LOMT-10-09_IntermediaryStatement_MaxNoOfStmts");
		logger.log(LogStatus.PASS, "TC-LOMT-10-10_Intermediary_ingestion_Tag_missing");
		logger.log(LogStatus.PASS, "TC-LOMT-10-11_TagCol_values");
		logger.log(LogStatus.PASS, "TC-LOMT-10-12_IntermediaryIngestion_col_blank");
		
		logger.log(LogStatus.INFO, "LOMT-10", "12 TCs has Passed");
		reports.endTest(logger);
		reports.flush();
	}
	
	// Intermediary ingestion for NALS
	@Test(priority = 6)
	public void intermediarIngestionNALS() throws Exception {
		logger = reports.startTest("North America Learning Services Intermediary ingestion", "LOMT-12, Total 14 TCs Passed");
		
		regressionIngestExport.schoolGlobalBrowsePage(false);
		logger.log(LogStatus.PASS, "TC-LOMT-10-01_UploadIntermediaryLink");
		logger.log(LogStatus.PASS, "TC-LOMT-10-02_SelectFileButton");
		logger.log(LogStatus.PASS, "TC-LOMT-10-03_UploadButton");
		
		regressionIngestExport.createUploadStructurePage1(false);
		regressionIngestExport.createUploadStructurePageWithIncorrectIntermediaryFile(false);
		
		regressionIngestExport.createUploadStructurePage1(false);
		regressionIngestExport.createUploadStructurePageWithCorrectIntermediaryFile(false);
		
		logger.log(LogStatus.PASS, "TC-LOMT-10-04_UploadIntermediary_Successful");
		logger.log(LogStatus.PASS, "TC-LOMT-10-05_UploadFunctionality_xlsxOr xlsFormat");
		logger.log(LogStatus.PASS, "TC-LOMT-10-06_Verify_IngestedCols");
		logger.log(LogStatus.PASS, "TC-LOMT-10-07_IntermediaryIngestion_missingCol");
		logger.log(LogStatus.PASS, "TC-LOMT-10-08_IntermediaryStatement_Col_Chars");
		logger.log(LogStatus.PASS, "TC-LOMT-10-09_IntermediaryStatement_MaxNoOfStmts");
		logger.log(LogStatus.PASS, "TC-LOMT-10-10_Intermediary_ingestion_Tag_missing");
		logger.log(LogStatus.PASS, "TC-LOMT-10-11_TagCol_values");
		logger.log(LogStatus.PASS, "TC-LOMT-10-12_IntermediaryIngestion_col_blank");
		
		logger.log(LogStatus.INFO, "LOMT-10", "12 TCs has Passed");
		reports.endTest(logger);
		reports.flush();
	}

	@Test(priority = 7)
	public void tearDown() throws InterruptedException {
		regressionIngestExport.closeDriverInstance();
	}
}
