package api.utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {

	@DataProvider(name = "data")
	public String[][] getAllData() throws IOException {

		String path = System.getProperty("user.dir") + "//testData//Userdata.xlsx";
		ExcelUtils excelUtils = new ExcelUtils(path);

		int rownum = excelUtils.getRowCount(path, "Sheet1");
		int columnnum = excelUtils.getCellCount(path, "Sheet1", 1);

		String[][] apiData = new String[rownum][columnnum];

		for (int i = 1; i <= rownum; i++) {
			for (int j = 0; j < columnnum; j++) {
				apiData[i - 1][j] = excelUtils.getCellData(path, "Sheet1", i, j);
			}

		}
		return apiData;

	}

	@DataProvider(name = "userNames")
	public String[] getUserNames() throws IOException {
		String path = System.getProperty("user.dir") + "//testData//userdata.xlsx";
		ExcelUtils excelUtils = new ExcelUtils(path);

		int rownum = excelUtils.getRowCount(path, "Sheet1");

		String[] apiData_userNames = new String[rownum];

		for (int i = 1; i <= rownum; i++) {

			apiData_userNames[i - 1] = excelUtils.getCellData(path, "Sheet1", i, 1);

		}

		return apiData_userNames;

	}

}
