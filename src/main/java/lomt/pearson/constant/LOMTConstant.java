package lomt.pearson.constant;

public class LOMTConstant {

	// LOBs constant
	public static String ENGLISH_LOB = "English";
	public static String HE_LOB = "Higher Education";
	public static String NALS_LOB = "North America Learning Services";
	public static String SG_LOB = "School Global";
	
	public static String LOMT_ENVIRONMENT = "lomt.environment";
	public static String USER_NAME = "lomt.cms.service.user";
	public static String PASSWORD = "lomt.cms.service.password";
	
	public static String USER_NAME_BASIC = "lomt.cms.service.basic.user";
	public static String PASSWORD_BASIC = "lomt.cms.service.basic.password";
	
	
	public static String CONFIGURATION_FILE_PATH = "src/main/java/lomt/pearson/resources/lomt-config.properties";
	public static String LOG4J_FILE_PATH = "src/main/java/lomt/pearson/resources/log4j.properties";
	public static String REPORT_FILE_PATH = "src/main/java/lomt/pearson/reports/lomt.html";

	public static String ENGLISH_GSE_FILE_PATH = "src/main/java/lomt/pearson/fileupload/english/gse/GSEFileUpload.exe";
	public static String ENGLISH_GSE_REINGESTION_FILE_PATH = "src/main/java/lomt/pearson/fileupload/english/gse/GSERe-ingestionFileUpload.exe";
	public static String ENGLISH_GSE_INCORRECT_FILE_PATH = "src/main/java/lomt/pearson/fileupload/english/gse/GSEFileUploadIncorrect.exe";
	public static String ENGLISH_GSE_INCORRECT_FILE_PATH_URN = "src/main/java/lomt/pearson/fileupload/english/gse/GSERe-ingestionFileUpload-URN.exe";
	
	public static String INTERMEDIARY_FILE_PATH = "src/main/java/lomt/pearson/fileupload/intermediary/IntermediaryFileUpload.exe";
	public static String INTERMEDIARY_INCORRECT_FILE_PATH = "src/main/java/lomt/pearson/fileupload/intermediary/IntermediaryIncorrectFileUpload.exe";
	
	public static String PRODUCT_INCORRECT_FILE_PATH_ENGLISH = "src/main/java/lomt/pearson/fileupload/english/product_toc/TOC_GSE_IncorrectFileUpload.exe";
	public static String PRODUCT_FILE_PATH_ENGLISH = "src/main/java/lomt/pearson/fileupload/english/product_toc/TOC_GSE_FileUpload.exe";
	
	public static String PRODUCT_INCORRECT_FILE_PATH_HE = "src/main/java/lomt/pearson/fileupload/highereducation/producttoc/TOC_HE_Incorrect_FileUpload.exe";
	public static String PRODUCT_CORRECT_FILE_PATH_HE = "src/main/java/lomt/pearson/fileupload/highereducation/producttoc/TOC_HE_FileUpload.exe";
	
	public static String PRODUCT_INCORRECT_FILE_PATH_SCHOOL = "src/main/java/lomt/pearson/fileupload/nals_school_global/producttoc/TOC_School_Incorrect_FileUpload.exe";
	public static String PRODUCT_CORRECT_FILE_PATH_SCHOOL = "src/main/java/lomt/pearson/fileupload/nals_school_global/producttoc/TOC_School_FileUpload.exe";

	public static String CREATE_STRUCTURE_TILE = "Create or upload a structure";
	public static String SELECT_LOB = "Select line of business:";
	public static String SELECT_STRUCTURE_TYPE = "Select type of structure:";
	public static String CHOOSE_STRUCTURE_TYPE = "Choose the type of structure you want to create or upload";
	public static String STRUCTURE_PAGE_IMAGE_2_TEXT = "Provide metadata for English GSE (Global Scale of English) Standard";
	public static String STRUCTURE_PAGE_IMAGE_2_TEXT_SG = "Provide metadata for School Global Intermediary";
	public static String STRUCTURE_PAGE_IMAGE_2_TEXT_NALS = "Provide metadata for North America Learning Services Intermediary";
	public static String STRUCTURE_PAGE_IMAGE_3_TEXT = "Upload your .xls or .xlsx file";
	public static String STRUCTURE_PAGE_IMAGE_4_TEXT = "Review outcome";
	public static String INGESTION_SUCESSFULL_MESSAGE = "Ingest Successful";
	public static String INGESTION_FAILED_MESSAGE = "Ingest failed";
	public static String VIEW_FULL_INGESTION_LOG = "VIEW FULL INGEST LOG";
	public static String DESCRIPTIVE_ID = "ALLA0375"; // WILL CHANGE ACCORDING TO GSE SHEET DATA
	public static String FRESH_INGESTION = "Fresh Ingestinon";
	public static String RE_INGESTION_WITHOUT_URN = "re-ingesion_urn";
	public static String RE_INGESTION_URN = "re-ingesion_no_urn";
	
	public static String WELCOME_TITLE = "Welcome back to LOMT, learn";
	public static String MANAGE_INGESTION_TEMP_MESSAGE = "Temporary link to ingestion screen";
	public static String PROVIDE_METADATA_HE = "Provide metadata for Higher Education Product";
	public static String PROVIDE_METADATA_NALS = "Provide metadata for North America Learning Services Product";
	public static String PROVIDE_METADATA_SG = "Provide metadata for School Global Product";
	public static String DRAG_DROP_TEXT = "Drag and drop files here";
	public static String PROVIDE_ENGLISH_PRODUCT_METADASTA = "Provide metadata for English Product";
	public static String NO_RESULT_FOUND = "No results found";

	public static String ROW_NO = "Row No";
	public static String TYPE = "Type";
	public static String MESSAGE = "Message";
	public static String ROW_NO_ERROR_DATA = "1";
	public static String TYPE_ERROR = "Error";
	public static String MESSAGE_ERROR = "Descriptive ID column is mandatory in Row : 1";

	//public static String EXPORTED_FILE_PATH = System.getProperty("user.dir")+ "\\src\\main\\java\\lomt\\pearson\\downloads\\";
	public static String EXPORTED_FILE_PATH = "D:\\Users\\ram.sin\\Downloads\\";
	public static String ACTUAL_FILE_PATH = System.getProperty("user.dir")+ "\\src\\main\\java\\lomt\\pearson\\fileupload\\english\\gse\\";
	public static String EMPTY_STRING = "";
	public static String EXPORTED_FILE_NAME = "Gse_Template_Level1";
	public static String ACTUAL_FILE_NAME = "Gse_Template";
	public static String XLS_EXTENSION = ".xlsx";
	
	public static String INSTRUCTIONS = "instructions";
	public static String DATA = "data";
	// GSE Headers Name
	public static String HEADER_URN = "URN";
	public static String HEADER_DESCRIPTIVE_ID = "Descriptive ID";
	public static String HEADER_DRAFT_IDS = "Draft IDs";
	public static String HEADER_SYLLABUS = "Syllabus";
	public static String HEADER_BATCH = "Batch";
	public static String HEADER_SKILL = "Skill";
	public static String HEADER_STATUS = "Status";
	public static String HEADER_DESCRIPTOR = "Descriptor";
	public static String HEADER_ATTRIBUTION = "Attribution";
	public static String HEADER_GSE = "GSE";
	public static String HEADER_CERF_LEVEL = "CEFR Level";
	public static String HEADER_COMMUNICATIVE_CATEGGORIES = "Communicative Categories";
	public static String HEADER_BUSINESS_SKILLS = "Business Skills";
	public static String HEADER_TOPIC_L1 = "Topic L1";
	public static String HEADER_YL_SIMPLIFIED = "YL Simplified";
	public static String HEADER_STRUCTURE = "Structure";
	public static String HEADER_GRAMMATICAL_CATEGORIES = "Grammatical Categories";
	public static String HEADER_EXAMPLE = "Example";
	public static String HEADER_VARIANT_TERMS = "Variant Terms";
	public static String HEADER_FUNCTION_NOTION = "Function/Notion";
	public static String HEADER_ANCHOR = "Anchor";
	public static String HEADER_SOURCE_DESCRIPTOR = "Source Descriptor";
	public static String HEADER_SOURCE = "Source";
	public static String HEADER_ESTIMATED_LEVEL = "Estimated Level";
	public static String HEADER_NOTES = "Notes";

	public static Integer ZERO_INDEX = 0;
	public static Integer ONE_INDEX = 1;
	public static Integer TWO_INDEX = 2;
	public static Integer THREE_INDEX = 3;
	public static Integer FOUR_INDEX = 4;
	public static Integer FIVE_INDEX = 5;
	public static Integer SIX_INDEX = 6;
	public static Integer SEVEN_INDEX = 7;
	public static Integer EIGHT_INDEX = 8;
	public static Integer NINE_INDEX = 9;
	public static Integer TEN_INDEX = 10;
	public static Integer ELEVENTH_INDEX = 11;
	public static Integer TWELEVE_INDEX = 12;
	public static Integer THIRTEEN_INDEX = 13;
	public static Integer FOURTEEN_INDEX = 14;
	public static Integer FIFTEEN_INDEX = 15;
	public static Integer SIXTEEN_INDEX = 16;
	public static Integer SEVENTEEN_INDEX = 17;
	public static Integer EIGHTEEN_INDEX = 18;
	public static Integer NINETEEN_INDEX = 19;
	public static Integer TWENTY_INDEX = 20;
	public static Integer TWENTY_ONE_INDEX = 21;
	public static Integer TWENTY_TWO_INDEX = 22;
	public static Integer TWENTY_THREE_INDEX = 23;
	public static Integer TWENTY_FOUR_INDEX = 24;
	public static String COMMA = ",";

	public static String NOT_NULL = "should not be null";
	public static String IS_EMPTY = "is empty";
	public static String GL = "GL";
	public static String PL = "PL";
	public static String YL = "YL";
	public static String GR = "GR";
	public static String VC = "VC";

	// Login page XPATH
	public static String USER_NAME_XPATH = "//input[@placeholder='username']";
	public static String PASSWORD_XPATH = "//input[@placeholder='password']";
	public static String LOGIN_BUTTON_XPATH = "//*[@class='login-btn-panel']/button";

	// Higher Education XPATH
	public static String HE_LOB_XPATH = "//*[@class='unit-container']/div/div[3]/div/a";
	public static String HE_STRUCTURE_XPATH = "//*[@class='structures-container']/div[3]/span[3]/a";
	public static String HE_EDUCATIONAL_GOAL_XPATH = "//*[@class='list-data-container']/div[1]/div/div[1]/div/div/a";
	public static String HE_LO_XPATH = "//*[@id='curriculum-tree']/ul/li[4]/a/span/span/span[2]";

	public static String SCROLL_WINDOW_PIXEL = "window.scrollBy(0,500)";

	// English LOB XPATH
	public static String ENGLISH_LOB_XPATH = "//div[@class='unit-container']/div/div[4]/div/a";
	public static String MANAGE_INGESTION_LINK_XPATH = "//div[@id='browse-grids']/div[2]/span[2]/div/span[1]";
	public static String BACK_BUTTON_XPATH = "//div[@class='ingestion-header']/span";
	public static String NEXT_BUTTON_XPATH = "//div[@class='ingestion-footer']/button/span[1]";
	public static String SELECT_LOB_XPATH = "//div[@class='ingestion-options col-lg-8 col-md-8 col-sm-8 col-xs-8']/div[1]/span";
	public static String LOB_ENGLISH_RADIO_BUTTON_XPATH = "//div[@class='ingestion-options col-lg-8 col-md-8 col-sm-8 col-xs-8']/div[1]/div[1]/input";
	public static String LOB_HE_RADIO_BUTTON_XPATH = "//div[@class='ingestion-options col-lg-8 col-md-8 col-sm-8 col-xs-8']/div[1]/div[2]/input";
	public static String LOB_SG_RADIO_BUTTON_XPATH = "//div[@class='ingestion-options col-lg-8 col-md-8 col-sm-8 col-xs-8']/div[1]/div[3]/input";
	public static String LOB_NALS_RADIO_BUTTON_XPATH = "//div[@class='ingestion-options col-lg-8 col-md-8 col-sm-8 col-xs-8']/div[1]/div[4]/input";
	public static String HEARDER_TILE = "//div[@class='ingestion-header']/div";

	public static String STRUCTURE_TYPE_XPATH = "//div[@class='ingestion-options col-lg-8 col-md-8 col-sm-8 col-xs-8']/div[2]/span";
	public static String STRUCTURE_GSE_RADIO_BUTTON_XPATH = "//div[@class='ingestion-options col-lg-8 col-md-8 col-sm-8 col-xs-8']/div[2]/div[1]/input";
	public static String STRUCTURE_EXTERNAL_FRAMEWORK_RADIO_BUTTON_XPATH = "//div[@class='ingestion-options col-lg-8 col-md-8 col-sm-8 col-xs-8']/div[2]/div[2]/input";
	public static String STRUCTURE_PRODUCT_RADIO_BUTTON = "//div[@class='ingestion-options col-lg-8 col-md-8 col-sm-8 col-xs-8']/div[2]/div[3]/input";

	public static String STRUCTURE_PAGE_ARROW_IMAGE_XPATH = "//div[@class='ingestion-steps-box col-lg-4 col-md-4 col-sm-4 col-xs-4']/div/div[1]/div[1]/img";
	public static String STRUCTURE_PAGE_ARROW_IMAGE_TEXT_CHOOSE_TYPE_XPATH = "//div[@class='ingestion-steps-box col-lg-4 col-md-4 col-sm-4 col-xs-4']/div/div[1]/div[2]";

	public static String STRUCTURE_PAGE_IMAGE_2_XPATH = "//div[@class='ingestion-steps-box col-lg-4 col-md-4 col-sm-4 col-xs-4']/div/div[2]/div[1]/img";
	public static String STRUCTURE_PAGE_IMAGE_2_TEXT_XPATH = "//div[@class='ingestion-steps-box col-lg-4 col-md-4 col-sm-4 col-xs-4']/div/div[2]/div[2]";

	public static String STRUCTURE_PAGE_IMAGE_3_XPATH = "//div[@class='ingestion-steps-box col-lg-4 col-md-4 col-sm-4 col-xs-4']/div/div[3]/div[1]/img";
	public static String STRUCTURE_PAGE_IMAGE_3_TEXT_XPATH = "//div[@class='ingestion-steps-box col-lg-4 col-md-4 col-sm-4 col-xs-4']/div/div[3]/div[2]";

	public static String STRUCTURE_PAGE_IMAGE_4_XPATH = "//div[@class='ingestion-steps-box col-lg-4 col-md-4 col-sm-4 col-xs-4']/div/div[4]/div[1]/img";
	public static String STRUCTURE_PAGE_IMAGE_4_TEXT_XPATH = "//div[@class='ingestion-steps-box col-lg-4 col-md-4 col-sm-4 col-xs-4']/div/div[4]/div[2]";

	public static String STRUCTURE_PAGE_NEXT_BUTTON_XPATH = "//div[@class='ingestion-footer']/button[1]";
	public static String STRUCTURE_PAGE_BACK_BUTTON_XPATH = "//div[@class='ingestion-footer']/button[2]";

	public static String INGESTION_SUCCESSFUL_MESSAGE_XPATH = "//div[@class='ingestion']/div[1]/div[1]/div[1]/div/label";
	public static String INGESTION_FAILED_MESSAGE_XPATH = "//div[@class='ingestion']/div[1]/div[1]/div[1]/span/div/label";
	public static String DONE_BUTTON_XPATH = "//div[@class='ingestion']/div[2]/button";
	public static String VIEW_FULL_INGEST_LOG_BUTTON_XPATH = "//div[@class='ingestion']/div[1]/div[1]/div[2]/button";
	public static String VIEW_FULL_INGEST_LOG_BUTTON_TEXT_XPATH = "//div[@class='ingestion']/div[1]/div[1]/div[2]/button/span[2]";
	public static String CANCEL_BUTTON_XPATH = "//div[@class='ingestion-footer']/button";

	public static String ROW_NO_XPATH = "//div[@class='log-data-block-container']/table/thead/tr/th[1]";
	public static String TYPE_XPATH = "//div[@class='log-data-block-container']/table/thead/tr/th[2]";
	public static String MESSAGE_XPATH = "//div[@class='log-data-block-container']/table/thead/tr/th[3]";

	public static String ROW_NO_ERROR_DATA_XPATH = "//div[@class='log-data-block-container']/table/tbody/tr[2]/td[1]";
	public static String TYPE_ERROR_DATA__XPATH = "//div[@class='log-data-block-container']/table/tbody/tr[2]/td[2]";
	public static String MESSAGE_ERROR_DATA__XPATH = "//div[@class='log-data-block-container']/table/tbody/tr[2]/td[3]";

	public static String UPLOAD_FILE_XPATH = "//div[@class='upload-file-container']/div/div/p/span[2]";
	public static String PEARSON_HEADER_XPATH = "//div[@id='lomtAppId']/div/header/a/img";

	public static String GSE_LINK = "//div[@id='lomtAppId']/div/div/div[2]/div[3]/span[1]/a";
	public static String GSE_ACTION_LINK = "//div[@class='list-row row']/div[2]/div/span";
	public static String COUNT_RESULT = "//div[@class='list-common-header']/span[1]";
	public static String EG_FIRST_DIV = "//div[@id='lomtAppId']/div/div/div[2]/div/div[2]/div[2]/div[1]/div";
	public static String EXPORT_BUTTON = "//div[@id='browse-action-container']/div[2]/div[2]";
	
	public static String GSE_STRUCTURE_XPATH = "//div[@id='lomtAppId']/div/div/div[2]/div/div[2]/div/div/div[1]/div/div/a";
	public static String ENTER_SEARCH_TERMS = "//div[@class='filter-container']/div[2]/input";
	public static String UPDATE_RESULT_BUTTON = "//div[@id='lomtAppId']/div/div/div[2]/div/div[1]/div[4]/button";
	public static String GSE_CHECKBOX_SELECTED = "//div[@class='list-data-container']/div/div/span/div/div/input";
	public static String GSE_EXPORT_BUTTON = "//div[@class='fixed-header-container']/span/div/div/div/button[2]";   // Parallel with checkbox
	public static String LOMT_HEADER =  "//div[@id='lomtAppId']/div/header[@id='app-header']";
	public static String GSE_META_DATA = "//div[@class='framework-metadata-container']/div/span";
	
	public static String BUSINESS_XPATH = "//div[@class='ingestion']/div/div/div/div[1]/span/span";
	public static String DRAG_AND_DROP_TEXT_XPATH = "//div[@class='upload-file-container']/div/div/p[1]";
	public static String INGEST_SUCESS_MESSAGE_XPATH = "//div[@class='ingestion']/div[1]/div[1]/div/div/label";
	public static String INGEST_FAILED_MESSAGE_XPATH = "//div[@class='ingestion']/div/div/div/span/div/label"; 
	
}
