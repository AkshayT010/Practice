package genericUtilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileUtility {

	/**
	 * This method is used to read the data from property file
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String readDataFromPropertyFile(String key) throws IOException
	{
		FileInputStream fis = new FileInputStream("D:\\eclipse\\Demo\\src\\test\\resources\\CommonDatas.properties");
		Properties p = new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value;
	}
	
	/**
	 * 
	 * @param sheetname
	 * @param RowNo
	 * @param CellNo
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String readDataFromExcelFile(String sheetname, int RowNo, int CellNo) throws EncryptedDocumentException, IOException
	{
		FileInputStream fise = new FileInputStream("D:\\eclipse\\Demo\\src\\test\\resources\\AssignData.xlsx");
		Workbook wb = WorkbookFactory.create(fise);
		Sheet sh = wb.getSheet(sheetname);
		Row rw = sh.getRow(RowNo);
		Cell cl = rw.getCell(CellNo);
		String value = cl.getStringCellValue();
		return value;

	}
	
}
