package lomt.pearson.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;

import lomt.pearson.constant.LOMTConstant;

public class ReadGSEXLSFile {
	
	/**
	 * Export at GSE goalframework level
	 * @param actualFile
	 * @param exportedFile
	 * @throws IOException
	 */
	public void readGSEExportedFile(File actualFile, File exportedFile) throws IOException {
		InputStream exportedGSEExcelFileIS = null;
		XSSFWorkbook workbookForExportedGSEFile = null;
			exportedGSEExcelFileIS = new FileInputStream(exportedFile);
			workbookForExportedGSEFile = new XSSFWorkbook(exportedGSEExcelFileIS);
			XSSFSheet instructionsSheet = workbookForExportedGSEFile.getSheetAt(0);
			XSSFSheet dataSheet = workbookForExportedGSEFile.getSheetAt(1);

			Assert.assertEquals(LOMTConstant.INSTRUCTIONS, instructionsSheet.getSheetName());
			System.out.println(LOMTConstant.INSTRUCTIONS.equalsIgnoreCase(instructionsSheet.getSheetName()));

			Assert.assertEquals(LOMTConstant.DATA, dataSheet.getSheetName());
			System.out.println(LOMTConstant.DATA.equalsIgnoreCase(dataSheet.getSheetName()));
			
			Assert.assertNotNull(String.valueOf(dataSheet.getPhysicalNumberOfRows()));
			System.out.println("Total rows : " +String.valueOf(dataSheet.getPhysicalNumberOfRows()));

			Iterator<Row> rowIteratoreForExport = dataSheet.iterator();
			while (rowIteratoreForExport.hasNext()) {
				Row row = rowIteratoreForExport.next();
				if (row.getRowNum() == 0) {
					Assert.assertEquals(LOMTConstant.HEADER_URN, String.valueOf(row.getCell(LOMTConstant.ZERO_INDEX)));
					System.out.println(LOMTConstant.HEADER_URN.equalsIgnoreCase(String.valueOf(row.getCell(0))));

					Assert.assertEquals(LOMTConstant.HEADER_DESCRIPTIVE_ID, String.valueOf(row.getCell(LOMTConstant.ONE_INDEX)));
					System.out.println(LOMTConstant.HEADER_DESCRIPTIVE_ID.equalsIgnoreCase(String.valueOf(row.getCell(1))));

					Assert.assertEquals(LOMTConstant.HEADER_DRAFT_IDS, String.valueOf(row.getCell(LOMTConstant.TWO_INDEX)));
					System.out.println(LOMTConstant.HEADER_DRAFT_IDS.equalsIgnoreCase(String.valueOf(row.getCell(2))));

					Assert.assertEquals(LOMTConstant.HEADER_SYLLABUS, String.valueOf(row.getCell(LOMTConstant.THREE_INDEX)));
					System.out.println(LOMTConstant.HEADER_SYLLABUS.equalsIgnoreCase(String.valueOf(row.getCell(3))));

					Assert.assertEquals(LOMTConstant.HEADER_BATCH, String.valueOf(row.getCell(LOMTConstant.FOUR_INDEX)));
					System.out.println(LOMTConstant.HEADER_BATCH.equalsIgnoreCase(String.valueOf(row.getCell(4))));

					Assert.assertEquals(LOMTConstant.HEADER_SKILL, String.valueOf(row.getCell(LOMTConstant.FIVE_INDEX)));
					System.out.println(LOMTConstant.HEADER_SKILL.equalsIgnoreCase(String.valueOf(row.getCell(5))));

					Assert.assertEquals(LOMTConstant.HEADER_STATUS, String.valueOf(row.getCell(LOMTConstant.SIX_INDEX)));
					System.out.println(LOMTConstant.HEADER_STATUS.equalsIgnoreCase(String.valueOf(row.getCell(6))));

					Assert.assertEquals(LOMTConstant.HEADER_DESCRIPTOR, String.valueOf(row.getCell(LOMTConstant.SEVEN_INDEX)));
					System.out.println(LOMTConstant.HEADER_DESCRIPTOR.equalsIgnoreCase(String.valueOf(row.getCell(7))));

					Assert.assertEquals(LOMTConstant.HEADER_ATTRIBUTION, String.valueOf(row.getCell(LOMTConstant.EIGHT_INDEX)));
					System.out.println(LOMTConstant.HEADER_ATTRIBUTION.equalsIgnoreCase(String.valueOf(row.getCell(8))));

					Assert.assertEquals(LOMTConstant.HEADER_GSE, String.valueOf(row.getCell(LOMTConstant.NINE_INDEX)));
					System.out.println(LOMTConstant.HEADER_GSE.equalsIgnoreCase(String.valueOf(row.getCell(9))));

					Assert.assertEquals(LOMTConstant.HEADER_CERF_LEVEL, String.valueOf(row.getCell(LOMTConstant.TEN_INDEX)));
					System.out.println(LOMTConstant.HEADER_CERF_LEVEL.equalsIgnoreCase(String.valueOf(row.getCell(10))));

					Assert.assertEquals(LOMTConstant.HEADER_COMMUNICATIVE_CATEGGORIES, String.valueOf(row.getCell(LOMTConstant.ELEVENTH_INDEX)));
					System.out.println(LOMTConstant.HEADER_COMMUNICATIVE_CATEGGORIES.equalsIgnoreCase(String.valueOf(row.getCell(11))));

					Assert.assertEquals(LOMTConstant.HEADER_BUSINESS_SKILLS, String.valueOf(row.getCell(LOMTConstant.TWELEVE_INDEX)));
					System.out.println(LOMTConstant.HEADER_BUSINESS_SKILLS.equalsIgnoreCase(String.valueOf(row.getCell(12))));

					Assert.assertEquals(LOMTConstant.HEADER_TOPIC_L1, String.valueOf(row.getCell(LOMTConstant.THIRTEEN_INDEX)));
					System.out.println(LOMTConstant.HEADER_TOPIC_L1.equalsIgnoreCase(String.valueOf(row.getCell(13))));

					Assert.assertEquals(LOMTConstant.HEADER_YL_SIMPLIFIED, String.valueOf(row.getCell(LOMTConstant.FOURTEEN_INDEX)));
					System.out.println(LOMTConstant.HEADER_YL_SIMPLIFIED.equalsIgnoreCase(String.valueOf(row.getCell(14))));

					Assert.assertEquals(LOMTConstant.HEADER_STRUCTURE, String.valueOf(row.getCell(LOMTConstant.FIFTEEN_INDEX)));
					System.out.println(LOMTConstant.HEADER_STRUCTURE.equalsIgnoreCase(String.valueOf(row.getCell(15))));

					Assert.assertEquals(LOMTConstant.HEADER_GRAMMATICAL_CATEGORIES, String.valueOf(row.getCell(LOMTConstant.SIXTEEN_INDEX)));
					System.out.println(LOMTConstant.HEADER_GRAMMATICAL_CATEGORIES.equalsIgnoreCase(String.valueOf(row.getCell(16))));

					Assert.assertEquals(LOMTConstant.HEADER_EXAMPLE, String.valueOf(row.getCell(LOMTConstant.SEVENTEEN_INDEX)));
					System.out.println(LOMTConstant.HEADER_EXAMPLE.equalsIgnoreCase(String.valueOf(row.getCell(17))));

					Assert.assertEquals(LOMTConstant.HEADER_VARIANT_TERMS, String.valueOf(row.getCell(LOMTConstant.EIGHTEEN_INDEX)));
					System.out.println(LOMTConstant.HEADER_VARIANT_TERMS.equalsIgnoreCase(String.valueOf(row.getCell(18))));

					Assert.assertEquals(LOMTConstant.HEADER_FUNCTION_NOTION, String.valueOf(row.getCell(LOMTConstant.NINETEEN_INDEX)));
					System.out.println(LOMTConstant.HEADER_FUNCTION_NOTION.equalsIgnoreCase(String.valueOf(row.getCell(19))));

					Assert.assertEquals(LOMTConstant.HEADER_ANCHOR, String.valueOf(row.getCell(LOMTConstant.TWENTY_INDEX)));
					System.out.println(LOMTConstant.HEADER_ANCHOR.equalsIgnoreCase(String.valueOf(row.getCell(20))));

					Assert.assertEquals(LOMTConstant.HEADER_SOURCE_DESCRIPTOR, String.valueOf(row.getCell(LOMTConstant.TWENTY_ONE_INDEX)));
					System.out.println(LOMTConstant.HEADER_SOURCE_DESCRIPTOR.equalsIgnoreCase(String.valueOf(row.getCell(21))));

					Assert.assertEquals(LOMTConstant.HEADER_SOURCE, String.valueOf(row.getCell(LOMTConstant.TWENTY_TWO_INDEX)));
					System.out.println(LOMTConstant.HEADER_SOURCE.equalsIgnoreCase(String.valueOf(row.getCell(22))));

					Assert.assertEquals(LOMTConstant.HEADER_ESTIMATED_LEVEL, String.valueOf(row.getCell(LOMTConstant.TWENTY_THREE_INDEX)));
					System.out.println(LOMTConstant.HEADER_ESTIMATED_LEVEL.equalsIgnoreCase(String.valueOf(row.getCell(23))));

					Assert.assertEquals(LOMTConstant.HEADER_NOTES, String.valueOf(row.getCell(LOMTConstant.TWENTY_FOUR_INDEX)));
					System.out.println(LOMTConstant.HEADER_NOTES.equalsIgnoreCase(String.valueOf(row.getCell(24))));
				} else {
					// Mandatory GSE fields start 
					if (!(row.getCell(0) == null) && !(row.getCell(0).getStringCellValue().equalsIgnoreCase(""))) {
						Assert.assertNotNull(LOMTConstant.HEADER_URN+LOMTConstant.NOT_NULL,row.getCell(0).getStringCellValue());
						System.out.println("Urn values : "+ String.valueOf(row.getCell(0).getStringCellValue()));
					}
					if (!(row.getCell(1) == null)) {
						Assert.assertNotNull(LOMTConstant.HEADER_DESCRIPTIVE_ID+LOMTConstant.NOT_NULL, row.getCell(1).getStringCellValue());
						System.out.println("Descriptive id : "+ String.valueOf(row.getCell(1).getStringCellValue()));
					}
					if (!(row.getCell(3) == null)) {
						Assert.assertNotNull(LOMTConstant.HEADER_SYLLABUS+LOMTConstant.NOT_NULL, row.getCell(3).getStringCellValue());
						System.out.println("Syllabus : "+ String.valueOf(row.getCell(3).getStringCellValue()));
					}
					if (!(row.getCell(6) == null)) {
						Assert.assertNotNull(LOMTConstant.HEADER_STATUS+LOMTConstant.NOT_NULL, row.getCell(6).getStringCellValue());
						System.out.println("Status : "+ String.valueOf(row.getCell(6).getStringCellValue()));
					}
					if (!(row.getCell(7) == null)) {
						Assert.assertNotNull(LOMTConstant.HEADER_DESCRIPTOR+LOMTConstant.NOT_NULL, row.getCell(7).getStringCellValue());
						System.out.println("Descriptor : "+ String.valueOf(row.getCell(7).getStringCellValue()));
					}
					// Mandatory GSE fields end
					
					// Non-mandatory gse fields start
					if (!(row.getCell(LOMTConstant.TWO_INDEX) == null)) {
						Assert.assertNotNull(row.getCell(LOMTConstant.TWO_INDEX).getStringCellValue());
						System.out.println(LOMTConstant.HEADER_DRAFT_IDS + LOMTConstant.NOT_NULL + String.valueOf(row.getCell(LOMTConstant.TWO_INDEX).getStringCellValue()));
					} else {
						Assert.assertNull(row.getCell(LOMTConstant.TWO_INDEX));
						System.out.println(LOMTConstant.HEADER_DRAFT_IDS + LOMTConstant.IS_EMPTY);
					}
					if (!(row.getCell(LOMTConstant.FOUR_INDEX) == null)) {
						Assert.assertNotNull(row.getCell(LOMTConstant.FOUR_INDEX).getStringCellValue());
						System.out.println(LOMTConstant.HEADER_BATCH + LOMTConstant.NOT_NULL + String.valueOf(row.getCell(LOMTConstant.FOUR_INDEX).getStringCellValue()));
					} else {
						Assert.assertNull(row.getCell(LOMTConstant.FOUR_INDEX));
						System.out.println(LOMTConstant.HEADER_DESCRIPTOR + LOMTConstant.IS_EMPTY);
					}
					if (!(row.getCell(LOMTConstant.FIVE_INDEX) == null)) {
						Assert.assertNotNull(row.getCell(LOMTConstant.FIVE_INDEX).getStringCellValue());
						System.out.println(LOMTConstant.HEADER_SKILL + LOMTConstant.NOT_NULL + String.valueOf(row.getCell(LOMTConstant.FIVE_INDEX).getStringCellValue()));
					} else {
						Assert.assertNull(row.getCell(LOMTConstant.FIVE_INDEX));
						System.out.println(LOMTConstant.HEADER_SKILL + LOMTConstant.IS_EMPTY);
					}
					if (!(row.getCell(LOMTConstant.EIGHT_INDEX) == null)) {
						Assert.assertNotNull(row.getCell(LOMTConstant.EIGHT_INDEX).getStringCellValue());
						System.out.println(LOMTConstant.HEADER_ATTRIBUTION + LOMTConstant.NOT_NULL + String.valueOf(row.getCell(LOMTConstant.EIGHT_INDEX).getStringCellValue()));
					} else {
						Assert.assertNull(row.getCell(LOMTConstant.EIGHT_INDEX));
						System.out.println(LOMTConstant.HEADER_ATTRIBUTION + LOMTConstant.IS_EMPTY);
					}
					if (!(row.getCell(LOMTConstant.NINE_INDEX) == null)) {
						Assert.assertNotNull(row.getCell(LOMTConstant.NINE_INDEX).getStringCellValue());
						System.out.println(LOMTConstant.HEADER_GSE + LOMTConstant.NOT_NULL + String.valueOf(row.getCell(LOMTConstant.NINE_INDEX).getStringCellValue()));
					} else {
						Assert.assertNull(row.getCell(LOMTConstant.NINE_INDEX));
						System.out.println(LOMTConstant.HEADER_GSE + LOMTConstant.IS_EMPTY);
					}
					if (!(row.getCell(LOMTConstant.TEN_INDEX) == null)) {
						Assert.assertNotNull(row.getCell(LOMTConstant.TEN_INDEX).getStringCellValue());
						System.out.println(LOMTConstant.HEADER_CERF_LEVEL + LOMTConstant.NOT_NULL + String.valueOf(row.getCell(LOMTConstant.TEN_INDEX).getStringCellValue()));
					} else {
						Assert.assertNull(row.getCell(LOMTConstant.TEN_INDEX));
						System.out.println(LOMTConstant.HEADER_CERF_LEVEL + LOMTConstant.IS_EMPTY);
					}
					if (!(row.getCell(LOMTConstant.ELEVENTH_INDEX) == null)) {
						Assert.assertNotNull(row.getCell(LOMTConstant.ELEVENTH_INDEX).getStringCellValue());
						System.out.println(LOMTConstant.HEADER_COMMUNICATIVE_CATEGGORIES + LOMTConstant.NOT_NULL + String.valueOf(row.getCell(LOMTConstant.ELEVENTH_INDEX).getStringCellValue()));
					} else {
						Assert.assertNull(row.getCell(LOMTConstant.ELEVENTH_INDEX));
						System.out.println(LOMTConstant.HEADER_COMMUNICATIVE_CATEGGORIES + LOMTConstant.IS_EMPTY);
					}
					if (!(row.getCell(LOMTConstant.TWELEVE_INDEX) == null)) {
						Assert.assertNotNull(row.getCell(LOMTConstant.TWELEVE_INDEX).getStringCellValue());
						System.out.println(LOMTConstant.HEADER_BUSINESS_SKILLS + LOMTConstant.NOT_NULL + String.valueOf(row.getCell(LOMTConstant.TWELEVE_INDEX).getStringCellValue()));
					} else {
						Assert.assertNull(row.getCell(LOMTConstant.TWELEVE_INDEX));
						System.out.println(LOMTConstant.HEADER_BUSINESS_SKILLS + LOMTConstant.IS_EMPTY);
					}
					if (!(row.getCell(LOMTConstant.THIRTEEN_INDEX) == null)) {
						Assert.assertNotNull(row.getCell(LOMTConstant.THIRTEEN_INDEX).getStringCellValue());
						System.out.println(LOMTConstant.HEADER_TOPIC_L1 + LOMTConstant.NOT_NULL + String.valueOf(row.getCell(LOMTConstant.THIRTEEN_INDEX).getStringCellValue()));
					} else {
						Assert.assertNull(row.getCell(LOMTConstant.THIRTEEN_INDEX));
						System.out.println(LOMTConstant.HEADER_TOPIC_L1 + LOMTConstant.IS_EMPTY);
					}
					if (!(row.getCell(LOMTConstant.FOURTEEN_INDEX) == null)) {
						Assert.assertNotNull(row.getCell(LOMTConstant.FOURTEEN_INDEX).getStringCellValue());
						System.out.println(LOMTConstant.HEADER_YL_SIMPLIFIED + LOMTConstant.NOT_NULL + String.valueOf(row.getCell(LOMTConstant.FOURTEEN_INDEX).getStringCellValue()));
					} else {
						Assert.assertNull(row.getCell(LOMTConstant.FOURTEEN_INDEX));
						System.out.println(LOMTConstant.HEADER_YL_SIMPLIFIED + LOMTConstant.IS_EMPTY);
					}
					if (!(row.getCell(LOMTConstant.FIFTEEN_INDEX) == null)) {
						Assert.assertNotNull(row.getCell(LOMTConstant.FIFTEEN_INDEX).getStringCellValue());
						System.out.println(LOMTConstant.HEADER_STRUCTURE +LOMTConstant.NOT_NULL + String.valueOf(row.getCell(LOMTConstant.FIFTEEN_INDEX).getStringCellValue()));
					} else {
						Assert.assertNull(row.getCell(LOMTConstant.FIFTEEN_INDEX));
						System.out.println(LOMTConstant.HEADER_STRUCTURE + LOMTConstant.IS_EMPTY);
					}
					if (!(row.getCell(LOMTConstant.SIXTEEN_INDEX) == null)) {
						Assert.assertNotNull(row.getCell(LOMTConstant.SIXTEEN_INDEX).getStringCellValue());
						System.out.println(LOMTConstant.HEADER_GRAMMATICAL_CATEGORIES + LOMTConstant.NOT_NULL + String.valueOf(row.getCell(LOMTConstant.SIXTEEN_INDEX).getStringCellValue()));
					} else {
						Assert.assertNull(row.getCell(LOMTConstant.SIXTEEN_INDEX));
						System.out.println(LOMTConstant.HEADER_GRAMMATICAL_CATEGORIES + LOMTConstant.IS_EMPTY);
					}
					if (!(row.getCell(LOMTConstant.SEVENTEEN_INDEX) == null)) {
						Assert.assertNotNull(row.getCell(LOMTConstant.SEVENTEEN_INDEX).getStringCellValue());
						System.out.println(LOMTConstant.HEADER_EXAMPLE + LOMTConstant.NOT_NULL + String.valueOf(row.getCell(LOMTConstant.SEVENTEEN_INDEX).getStringCellValue()));
					} else {
						Assert.assertNull(row.getCell(LOMTConstant.SEVENTEEN_INDEX));
						System.out.println(LOMTConstant.HEADER_EXAMPLE + LOMTConstant.IS_EMPTY);
					}
					if (!(row.getCell(LOMTConstant.EIGHTEEN_INDEX) == null)) {
						Assert.assertNotNull(row.getCell(LOMTConstant.EIGHTEEN_INDEX).getStringCellValue());
						System.out.println(LOMTConstant.HEADER_VARIANT_TERMS + LOMTConstant.NOT_NULL + String.valueOf(row.getCell(LOMTConstant.EIGHTEEN_INDEX).getStringCellValue()));
					} else {
						Assert.assertNull(row.getCell(LOMTConstant.EIGHTEEN_INDEX));
						System.out.println(LOMTConstant.HEADER_VARIANT_TERMS + LOMTConstant.IS_EMPTY);
					}
					if (!(row.getCell(LOMTConstant.NINETEEN_INDEX) == null)) {
						Assert.assertNotNull(row.getCell(LOMTConstant.NINETEEN_INDEX).getStringCellValue());
						System.out.println(LOMTConstant.HEADER_FUNCTION_NOTION + LOMTConstant.NOT_NULL + String.valueOf(row.getCell(LOMTConstant.NINETEEN_INDEX).getStringCellValue()));
					} else {
						Assert.assertNull(row.getCell(LOMTConstant.NINETEEN_INDEX));
						System.out.println(LOMTConstant.HEADER_FUNCTION_NOTION + LOMTConstant.IS_EMPTY);
					}
					if (!(row.getCell(LOMTConstant.TWENTY_INDEX) == null)) {
						Assert.assertNotNull(row.getCell(LOMTConstant.TWENTY_INDEX).getStringCellValue());
						System.out.println(LOMTConstant.HEADER_ANCHOR + LOMTConstant.NOT_NULL + String.valueOf(row.getCell(LOMTConstant.TWENTY_INDEX).getStringCellValue()));
					} else {
						Assert.assertNull(row.getCell(LOMTConstant.TWENTY_INDEX));
						System.out.println(LOMTConstant.HEADER_ANCHOR + LOMTConstant.IS_EMPTY);
					}
					if (!(row.getCell(LOMTConstant.TWENTY_ONE_INDEX) == null)) {
						Assert.assertNotNull(row.getCell(LOMTConstant.TWENTY_ONE_INDEX).getStringCellValue());
						System.out.println(LOMTConstant.HEADER_SOURCE_DESCRIPTOR + LOMTConstant.NOT_NULL + String.valueOf(row.getCell(LOMTConstant.TWENTY_ONE_INDEX).getStringCellValue()));
					} else {
						Assert.assertNull(row.getCell(LOMTConstant.TWENTY_ONE_INDEX));
						System.out.println(LOMTConstant.HEADER_SOURCE_DESCRIPTOR + LOMTConstant.IS_EMPTY);
					}
					if (!(row.getCell(LOMTConstant.TWENTY_TWO_INDEX) == null)) {
						Assert.assertNotNull(row.getCell(LOMTConstant.TWENTY_TWO_INDEX).getStringCellValue());
						System.out.println(LOMTConstant.HEADER_SOURCE + LOMTConstant.NOT_NULL + String.valueOf(row.getCell(LOMTConstant.TWENTY_TWO_INDEX).getStringCellValue()));
					} else {
						Assert.assertNull(row.getCell(LOMTConstant.TWENTY_TWO_INDEX));
						System.out.println(LOMTConstant.HEADER_SOURCE + LOMTConstant.IS_EMPTY);
					}
					if (!(row.getCell(LOMTConstant.TWENTY_THREE_INDEX) == null)) {
						Assert.assertNotNull(row.getCell(LOMTConstant.TWENTY_THREE_INDEX).getStringCellValue());
						System.out.println(LOMTConstant.HEADER_ESTIMATED_LEVEL + LOMTConstant.NOT_NULL + String.valueOf(row.getCell(LOMTConstant.TWENTY_THREE_INDEX).getStringCellValue()));
					} else {
						Assert.assertNull(row.getCell(LOMTConstant.TWENTY_THREE_INDEX));
						System.out.println(LOMTConstant.HEADER_ESTIMATED_LEVEL + LOMTConstant.IS_EMPTY);
					}
					if (!(row.getCell(LOMTConstant.TWENTY_FOUR_INDEX) == null)) {
						Assert.assertNotNull(row.getCell(LOMTConstant.TWENTY_FOUR_INDEX).getStringCellValue());
						System.out.println(LOMTConstant.HEADER_NOTES + LOMTConstant.NOT_NULL + String.valueOf(row.getCell(LOMTConstant.TWENTY_FOUR_INDEX).getStringCellValue()));
					} else {
						Assert.assertNull(row.getCell(LOMTConstant.TWENTY_FOUR_INDEX));
						System.out.println(LOMTConstant.HEADER_NOTES + LOMTConstant.IS_EMPTY);
					}
					// Non-mandatory GSE fields end
					
					
					//Negative Scenario start
					/*if (row.getCell(3).getStringCellValue().equalsIgnoreCase(GL)) { 
						Assert.assertNotNull(HEADER_COMMUNICATIVE_CATEGGORIES+NOT_NULL, row.getCell(11).getStringCellValue());
						System.out.println("Communicative Category : "+ String.valueOf(row.getCell(11).getStringCellValue()));
					}
					if (row.getCell(3).getStringCellValue().equalsIgnoreCase(PL)) { 
						Assert.assertNotNull(HEADER_BUSINESS_SKILLS+NOT_NULL, row.getCell(12).getStringCellValue());
						System.out.println("Business Skills : "+ String.valueOf(row.getCell(12).getStringCellValue()));
					}
					if (row.getCell(3).getStringCellValue().equalsIgnoreCase(GL+COMMA+PL)) {  // need to apply OR condition bcz it can be like PL,GL
						Assert.assertNotNull(HEADER_BUSINESS_SKILLS+NOT_NULL, row.getCell(12).getStringCellValue());
						System.out.println("Business Skills : "+ String.valueOf(row.getCell(12).getStringCellValue()));
						
						Assert.assertNotNull(HEADER_YL_SIMPLIFIED+NOT_NULL, row.getCell(14).getStringCellValue());
						System.out.println("YL Simplified : "+ String.valueOf(row.getCell(14).getStringCellValue()));
					}
					if (row.getCell(3).getStringCellValue().equalsIgnoreCase(YL)) { 
						Assert.assertNotNull(HEADER_YL_SIMPLIFIED+NOT_NULL, row.getCell(14).getStringCellValue());
						System.out.println("YL Simplified : "+ String.valueOf(row.getCell(14).getStringCellValue()));
					}
					if (row.getCell(3).getStringCellValue().equalsIgnoreCase(GR+COMMA+GL)) { 
						Assert.assertNotNull(HEADER_COMMUNICATIVE_CATEGGORIES+NOT_NULL, row.getCell(11).getStringCellValue());
						System.out.println("Communicative Category : "+ String.valueOf(row.getCell(11).getStringCellValue()));
						
						Assert.assertNotNull(HEADER_GRAMMATICAL_CATEGORIES+NOT_NULL, row.getCell(16).getStringCellValue());
						System.out.println("Grammatical Categories : "+ String.valueOf(row.getCell(16).getStringCellValue()));
					}
					if (row.getCell(3).getStringCellValue().equalsIgnoreCase(VC+COMMA+GL)) { 
						Assert.assertNotNull(HEADER_COMMUNICATIVE_CATEGGORIES+NOT_NULL, row.getCell(11).getStringCellValue());
						System.out.println("Communicative Category : "+ String.valueOf(row.getCell(11).getStringCellValue()));
						
						Assert.assertNotNull(HEADER_TOPIC_L1+NOT_NULL, row.getCell(13).getStringCellValue());
						System.out.println("Topic L1 : "+ String.valueOf(row.getCell(13).getStringCellValue()));
					}*/
					//Negative Scenario end
			}
		}
	}
	
	/**
	 * GSE export at Educational goal framework level
	 * @param actualFile
	 * @param exportedFile
	 * @throws IOException
	 */
	public void readGSEExportedFileEducationGoalFramework(File actualFile, File exportedFile) throws IOException {
		InputStream exportedGSEExcelFileIS = null;
		XSSFWorkbook workbookForExportedGSEFile = null;
		
		InputStream actualGSEExcelFileIS = null;
		XSSFWorkbook actualGSEFile = null;
		
		actualGSEExcelFileIS = new FileInputStream(actualFile);
		actualGSEFile = new XSSFWorkbook(actualGSEExcelFileIS);
		XSSFSheet actualDataSheet = actualGSEFile.getSheetAt(1);
		
		exportedGSEExcelFileIS = new FileInputStream(exportedFile);
		workbookForExportedGSEFile = new XSSFWorkbook(exportedGSEExcelFileIS);
		XSSFSheet instructionsSheet = workbookForExportedGSEFile.getSheetAt(0);
		XSSFSheet dataSheet = workbookForExportedGSEFile.getSheetAt(1);

		Assert.assertEquals(LOMTConstant.INSTRUCTIONS, instructionsSheet.getSheetName());
		System.out.println(LOMTConstant.INSTRUCTIONS.equalsIgnoreCase(instructionsSheet.getSheetName()));

		Assert.assertEquals(LOMTConstant.DATA, dataSheet.getSheetName());
		System.out.println(LOMTConstant.DATA.equalsIgnoreCase(dataSheet.getSheetName()));
		
		Assert.assertNotNull(String.valueOf(dataSheet.getPhysicalNumberOfRows()));
		System.out.println("Total rows : " +String.valueOf(dataSheet.getPhysicalNumberOfRows()));
		
		String descriptiveId = null;
		String draftId = null;
		String syllabus = null;
		String batch = null;
		String skill = null;
		String status = null;
		String descriptor = null;
		String attribution = null;
		String gse = null;
		String crefLevel = null;
		String communicativeCategories = null;
		String businessSkills = null;
		String sourceDescriptor = null;
		String source = null;
		String notes = null;
		
		Iterator<Row> rowIteratoreForActual = actualDataSheet.iterator();
		while (rowIteratoreForActual.hasNext()) {
			Row row = rowIteratoreForActual.next();
			if (!(row.getRowNum() == 0)) {
				if (String.valueOf(row.getCell(LOMTConstant.ONE_INDEX)).equalsIgnoreCase(LOMTConstant.DESCRIPTIVE_ID)) {
					descriptiveId = String.valueOf(row.getCell(LOMTConstant.ONE_INDEX));
					draftId = String.valueOf(row.getCell(LOMTConstant.TWO_INDEX));
					syllabus = String.valueOf(row.getCell(LOMTConstant.THREE_INDEX));
					batch = String.valueOf(row.getCell(LOMTConstant.FOUR_INDEX));
					skill = String.valueOf(row.getCell(LOMTConstant.FIVE_INDEX));
					status = String.valueOf(row.getCell(LOMTConstant.SIX_INDEX));
					descriptor = String.valueOf(row.getCell(LOMTConstant.SEVEN_INDEX));
					attribution = String.valueOf(row.getCell(LOMTConstant.EIGHT_INDEX));
					gse = String.valueOf(row.getCell(LOMTConstant.NINE_INDEX));
					crefLevel = String.valueOf(row.getCell(LOMTConstant.TEN_INDEX));
					communicativeCategories = String.valueOf(row.getCell(LOMTConstant.ELEVENTH_INDEX));
					businessSkills = String.valueOf(row.getCell(LOMTConstant.TWELEVE_INDEX));
					sourceDescriptor = String.valueOf(row.getCell(LOMTConstant.TWENTY_ONE_INDEX));
					source  = String.valueOf(row.getCell(LOMTConstant.TWENTY_TWO_INDEX));
					notes = String.valueOf(row.getCell(LOMTConstant.TWENTY_FOUR_INDEX));
					break;
				}
			}
		}
		
		Iterator<Row> rowIteratoreForExport = dataSheet.iterator();
		while (rowIteratoreForExport.hasNext()) {
			Row row = rowIteratoreForExport.next();
			if (row.getRowNum() == 0) {
				Assert.assertEquals(LOMTConstant.HEADER_URN, String.valueOf(row.getCell(LOMTConstant.ZERO_INDEX)));
				System.out.println(LOMTConstant.HEADER_URN.equalsIgnoreCase(String.valueOf(row.getCell(0))));

				Assert.assertEquals(LOMTConstant.HEADER_DESCRIPTIVE_ID, String.valueOf(row.getCell(LOMTConstant.ONE_INDEX)));
				System.out.println(LOMTConstant.HEADER_DESCRIPTIVE_ID.equalsIgnoreCase(String.valueOf(row.getCell(1))));

				Assert.assertEquals(LOMTConstant.HEADER_DRAFT_IDS, String.valueOf(row.getCell(LOMTConstant.TWO_INDEX)));
				System.out.println(LOMTConstant.HEADER_DRAFT_IDS.equalsIgnoreCase(String.valueOf(row.getCell(2))));

				Assert.assertEquals(LOMTConstant.HEADER_SYLLABUS, String.valueOf(row.getCell(LOMTConstant.THREE_INDEX)));
				System.out.println(LOMTConstant.HEADER_SYLLABUS.equalsIgnoreCase(String.valueOf(row.getCell(3))));

				Assert.assertEquals(LOMTConstant.HEADER_BATCH, String.valueOf(row.getCell(LOMTConstant.FOUR_INDEX)));
				System.out.println(LOMTConstant.HEADER_BATCH.equalsIgnoreCase(String.valueOf(row.getCell(4))));

				Assert.assertEquals(LOMTConstant.HEADER_SKILL, String.valueOf(row.getCell(LOMTConstant.FIVE_INDEX)));
				System.out.println(LOMTConstant.HEADER_SKILL.equalsIgnoreCase(String.valueOf(row.getCell(5))));

				Assert.assertEquals(LOMTConstant.HEADER_STATUS, String.valueOf(row.getCell(LOMTConstant.SIX_INDEX)));
				System.out.println(LOMTConstant.HEADER_STATUS.equalsIgnoreCase(String.valueOf(row.getCell(6))));

				Assert.assertEquals(LOMTConstant.HEADER_DESCRIPTOR, String.valueOf(row.getCell(LOMTConstant.SEVEN_INDEX)));
				System.out.println(LOMTConstant.HEADER_DESCRIPTOR.equalsIgnoreCase(String.valueOf(row.getCell(7))));

				Assert.assertEquals(LOMTConstant.HEADER_ATTRIBUTION, String.valueOf(row.getCell(LOMTConstant.EIGHT_INDEX)));
				System.out.println(LOMTConstant.HEADER_ATTRIBUTION.equalsIgnoreCase(String.valueOf(row.getCell(8))));

				Assert.assertEquals(LOMTConstant.HEADER_GSE, String.valueOf(row.getCell(LOMTConstant.NINE_INDEX)));
				System.out.println(LOMTConstant.HEADER_GSE.equalsIgnoreCase(String.valueOf(row.getCell(9))));

				Assert.assertEquals(LOMTConstant.HEADER_CERF_LEVEL, String.valueOf(row.getCell(LOMTConstant.TEN_INDEX)));
				System.out.println(LOMTConstant.HEADER_CERF_LEVEL.equalsIgnoreCase(String.valueOf(row.getCell(10))));

				Assert.assertEquals(LOMTConstant.HEADER_COMMUNICATIVE_CATEGGORIES, String.valueOf(row.getCell(LOMTConstant.ELEVENTH_INDEX)));
				System.out.println(LOMTConstant.HEADER_COMMUNICATIVE_CATEGGORIES.equalsIgnoreCase(String.valueOf(row.getCell(11))));

				Assert.assertEquals(LOMTConstant.HEADER_BUSINESS_SKILLS, String.valueOf(row.getCell(LOMTConstant.TWELEVE_INDEX)));
				System.out.println(LOMTConstant.HEADER_BUSINESS_SKILLS.equalsIgnoreCase(String.valueOf(row.getCell(12))));

				Assert.assertEquals(LOMTConstant.HEADER_TOPIC_L1, String.valueOf(row.getCell(LOMTConstant.THIRTEEN_INDEX)));
				System.out.println(LOMTConstant.HEADER_TOPIC_L1.equalsIgnoreCase(String.valueOf(row.getCell(13))));

				Assert.assertEquals(LOMTConstant.HEADER_YL_SIMPLIFIED, String.valueOf(row.getCell(LOMTConstant.FOURTEEN_INDEX)));
				System.out.println(LOMTConstant.HEADER_YL_SIMPLIFIED.equalsIgnoreCase(String.valueOf(row.getCell(14))));

				Assert.assertEquals(LOMTConstant.HEADER_STRUCTURE, String.valueOf(row.getCell(LOMTConstant.FIFTEEN_INDEX)));
				System.out.println(LOMTConstant.HEADER_STRUCTURE.equalsIgnoreCase(String.valueOf(row.getCell(15))));

				Assert.assertEquals(LOMTConstant.HEADER_GRAMMATICAL_CATEGORIES, String.valueOf(row.getCell(LOMTConstant.SIXTEEN_INDEX)));
				System.out.println(LOMTConstant.HEADER_GRAMMATICAL_CATEGORIES.equalsIgnoreCase(String.valueOf(row.getCell(16))));

				Assert.assertEquals(LOMTConstant.HEADER_EXAMPLE, String.valueOf(row.getCell(LOMTConstant.SEVENTEEN_INDEX)));
				System.out.println(LOMTConstant.HEADER_EXAMPLE.equalsIgnoreCase(String.valueOf(row.getCell(17))));

				Assert.assertEquals(LOMTConstant.HEADER_VARIANT_TERMS, String.valueOf(row.getCell(LOMTConstant.EIGHTEEN_INDEX)));
				System.out.println(LOMTConstant.HEADER_VARIANT_TERMS.equalsIgnoreCase(String.valueOf(row.getCell(18))));

				Assert.assertEquals(LOMTConstant.HEADER_FUNCTION_NOTION, String.valueOf(row.getCell(LOMTConstant.NINETEEN_INDEX)));
				System.out.println(LOMTConstant.HEADER_FUNCTION_NOTION.equalsIgnoreCase(String.valueOf(row.getCell(19))));

				Assert.assertEquals(LOMTConstant.HEADER_ANCHOR, String.valueOf(row.getCell(LOMTConstant.TWENTY_INDEX)));
				System.out.println(LOMTConstant.HEADER_ANCHOR.equalsIgnoreCase(String.valueOf(row.getCell(20))));

				Assert.assertEquals(LOMTConstant.HEADER_SOURCE_DESCRIPTOR, String.valueOf(row.getCell(LOMTConstant.TWENTY_ONE_INDEX)));
				System.out.println(LOMTConstant.HEADER_SOURCE_DESCRIPTOR.equalsIgnoreCase(String.valueOf(row.getCell(21))));

				Assert.assertEquals(LOMTConstant.HEADER_SOURCE, String.valueOf(row.getCell(LOMTConstant.TWENTY_TWO_INDEX)));
				System.out.println(LOMTConstant.HEADER_SOURCE.equalsIgnoreCase(String.valueOf(row.getCell(22))));

				Assert.assertEquals(LOMTConstant.HEADER_ESTIMATED_LEVEL, String.valueOf(row.getCell(LOMTConstant.TWENTY_THREE_INDEX)));
				System.out.println(LOMTConstant.HEADER_ESTIMATED_LEVEL.equalsIgnoreCase(String.valueOf(row.getCell(23))));

				Assert.assertEquals(LOMTConstant.HEADER_NOTES, String.valueOf(row.getCell(LOMTConstant.TWENTY_FOUR_INDEX)));
				System.out.println(LOMTConstant.HEADER_NOTES.equalsIgnoreCase(String.valueOf(row.getCell(24))));
			} else {
				// Mandatory GSE fields start 
				if (!(row.getCell(0) == null) && !(row.getCell(0).getStringCellValue().equalsIgnoreCase(""))) {
					Assert.assertNotNull(LOMTConstant.HEADER_URN+LOMTConstant.NOT_NULL,row.getCell(0).getStringCellValue());
					System.out.println("Urn values : "+ String.valueOf(row.getCell(0).getStringCellValue()));
				}
				if (!(row.getCell(1) == null)) {
					Assert.assertNotNull(LOMTConstant.HEADER_DESCRIPTIVE_ID+LOMTConstant.NOT_NULL, row.getCell(1).getStringCellValue());
					System.out.println("Descriptive id : "+ String.valueOf(row.getCell(1).getStringCellValue()));
				}
				if (!(row.getCell(3) == null)) {
					Assert.assertNotNull(LOMTConstant.HEADER_SYLLABUS+LOMTConstant.NOT_NULL, row.getCell(3).getStringCellValue());
					System.out.println("Syllabus : "+ String.valueOf(row.getCell(3).getStringCellValue()));
				}
				if (!(row.getCell(6) == null)) {
					Assert.assertNotNull(LOMTConstant.HEADER_STATUS+LOMTConstant.NOT_NULL, row.getCell(6).getStringCellValue());
					System.out.println("Status : "+ String.valueOf(row.getCell(6).getStringCellValue()));
				}
				if (!(row.getCell(7) == null)) {
					Assert.assertNotNull(LOMTConstant.HEADER_DESCRIPTOR+LOMTConstant.NOT_NULL, row.getCell(7).getStringCellValue());
					System.out.println("Descriptor : "+ String.valueOf(row.getCell(7).getStringCellValue()));
				}
				// Mandatory GSE fields end
				
				// Data comparison between actual and export file
				/*if (!(row.getCell(1) == null)) {
					Assert.assertEquals(descriptiveId, row.getCell(1).getStringCellValue());
				}
				if (!(row.getCell(2) == null)) {
					Assert.assertEquals(draftId, row.getCell(2).getStringCellValue());
				}
				if (!(row.getCell(3) == null)) {
					Assert.assertEquals(syllabus, row.getCell(3).getStringCellValue());
				}
				if (!(row.getCell(4) == null)) {
					Assert.assertEquals(batch, row.getCell(4).getStringCellValue());
				}
				if (!(row.getCell(5) == null)) {
					Assert.assertEquals(skill, row.getCell(5).getStringCellValue());
				}
				if (!(row.getCell(6) == null)) {
					Assert.assertEquals(status, row.getCell(6).getStringCellValue());
				}
				if (!(row.getCell(7) == null)) {
					Assert.assertEquals(descriptor, row.getCell(7).getStringCellValue());
				}
				if (!(row.getCell(8) == null)) {
					Assert.assertEquals(attribution, row.getCell(8).getStringCellValue());
				}
				if (!(row.getCell(9) == null)) {
					//Assert.assertEquals(gse, row.getCell(9).getStringCellValue());
				}
				if (!(row.getCell(10) == null)) {
					Assert.assertEquals(crefLevel, row.getCell(10).getStringCellValue());
				}
				if (!(row.getCell(11) == null)) {
					Assert.assertEquals(communicativeCategories, row.getCell(11).getStringCellValue());
				}
				if (!(row.getCell(12) == null)) {
					Assert.assertEquals(businessSkills, row.getCell(12).getStringCellValue());
				}
				if (!(row.getCell(21) == null)) {
					Assert.assertEquals(sourceDescriptor, row.getCell(21).getStringCellValue());
				}
				if (!(row.getCell(22) == null)) {
					Assert.assertEquals(source, row.getCell(22).getStringCellValue());
				}
				if (!(row.getCell(23) == null)) {
					Assert.assertEquals(notes, row.getCell(24).getStringCellValue());
				}*/
				//System.out.println("********comparisin is done ******");
			}
		}
	}
}
