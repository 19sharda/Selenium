package exceldriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {

	public static void main(String[] args) throws IOException {
		//ExtractData();
	
	
	}

	public static ArrayList<String> ExtractData(String tc) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		ArrayList<String> a= new ArrayList<String>();
		String path=System.getProperty("user.dir")+"\\DataInput.xlsx";
		System.out.println(path);
		FileInputStream fis=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		int sheetcount=wb.getNumberOfSheets();
		for(int i=0;i<sheetcount;i++) {
			System.out.println(wb.getSheetAt(i).getSheetName());
			if (wb.getSheetAt(i).getSheetName().equalsIgnoreCase("DATA")){
				XSSFSheet sheet=wb.getSheetAt(i);
				Iterator<Row> rows= sheet.iterator();
				Row fr=rows.next(); //first row found
				Iterator<Cell> ce=fr.cellIterator();
				int k=0;
				int col=0;
				
				while(ce.hasNext()) {
					Cell value=ce.next();
					if(value.getStringCellValue().equalsIgnoreCase("TC")) {
						col=k;
						
					}
					
					k++;
				}
			System.out.println(col);
			
			
			//scan rows
			while(rows.hasNext()) {
				Row r=rows.next();
				if(r.getCell(col).getStringCellValue().equalsIgnoreCase(tc))
				{
					//scan all column for that row
					Iterator<Cell> cv=r.cellIterator();
					while(cv.hasNext()) {
						Cell c=cv.next();
						if(c.getCellType()==CellType.STRING) {
							System.out.println(c.getCellType());
						a.add(cv.next().getStringCellValue());}
						else {
							a.add(NumberToTextConverter.toText(cv.next().getNumericCellValue()));
							
						}
						System.out.println(a);
						
					}
				}
				
			}
			
			}
			
			
			
			
		}
		return a;
	}

}
