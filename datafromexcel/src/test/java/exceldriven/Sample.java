package exceldriven;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Sample {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
DataDriven d=new DataDriven();
ArrayList<String> data= d.ExtractData("SIP");
	}

}
