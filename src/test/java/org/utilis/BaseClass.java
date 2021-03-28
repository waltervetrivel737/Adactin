package org.utilis;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
public static WebDriver dri;
	
	public static void tolaunch() {
		WebDriverManager.chromedriver().setup();
		dri=new ChromeDriver();
	}
	public static void loadurl(String url) {
		dri.get(url);
	}
	public static void tomax() {
		dri.manage().window().maximize();
	}
	public static void totype(WebElement ele,String txt) {
		ele.sendKeys(txt);
	}
	public static String togettxt(WebElement ele) {
		String txt = ele.getText();
		return txt;
	}
	public static String togeturl() {
		String crrUrl = dri.getCurrentUrl();
		return crrUrl;
	}
	public static String togetvalue(WebElement ele) {
		String value = ele.getAttribute("value");
		return value;
	}
	public static void toclick(WebElement ele) {
		ele.click();
	}
	public static void toclose() {
		dri.close();
	}
	public static void todropdown(WebElement ele, int Sindex) {
		Select s=new Select(ele);
		s.selectByIndex(Sindex);
	}
	public static void toclear(WebElement ele) {
		ele.clear();
	}
	public static void towait() {
		dri.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	public static void moveto(WebElement element) {
		Actions a=new Actions(dri);
		a.moveToElement(element).perform();
	}
	
	public static void intoframe(int sindex) {
		dri.switchTo().frame(sindex);
	}
	public static void totakescreenshort(String fpath) throws IOException {
		TakesScreenshot tk=(TakesScreenshot)dri;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File des=new File(fpath);
		FileUtils.copyFile(src, des);
	}
	
	public static String toDataBase(String seletTable, int listindex) throws ClassNotFoundException, SQLException {

		Class.forName("oracle.jdbc.driver.OracleDriver");

		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "4609");

		String s = seletTable;
		PreparedStatement p = con.prepareStatement(s);
		ResultSet rs = p.executeQuery();
		ResultSetMetaData md = rs.getMetaData();
		int cc = md.getColumnCount();
		List<String> li = new ArrayList<String>();
		while (rs.next()) {
			for (int i = 1; i < cc; i++) {
				String value = rs.getString(i);
				li.add(value);
			}
		}
		String v1 = li.get(listindex);
		System.out.println(v1);
		return v1;
	}
	
	public static String value;

	public static String fetchAllExcell(String fpath, String Sname) throws IOException {
		File f = new File(fpath);
		FileInputStream ip = new FileInputStream(f);
		Workbook bk = new XSSFWorkbook(ip);
		Sheet sh = bk.getSheet(Sname);
		for (int i = 0; i < sh.getPhysicalNumberOfRows(); i++) {
			Row r = sh.getRow(i);
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(j);
				int ct = c.getCellType();
				if (ct == 1) {
					value = c.getStringCellValue();
				} else if (DateUtil.isCellDateFormatted(c)) {
					Date date = c.getDateCellValue();
					SimpleDateFormat sim = new SimpleDateFormat("dd/MM/yy");
					value = sim.format(date);
				} else {
					double d = c.getNumericCellValue();
					long l = (long) d;
					value = String.valueOf(l);

				}

			}

		}
		return value;
	}
	public static String fetchSingleExcell(String fpath,String Sname,int rindex,int cindex) throws IOException {
		File f = new File(fpath);
		FileInputStream ip = new FileInputStream(f);
		Workbook bk = new XSSFWorkbook(ip);
		Sheet sh = bk.getSheet(Sname);
		Row r = sh.getRow(rindex);
		Cell cell = r.getCell(cindex);
		int cc = cell.getCellType();
		if (cc == 1) {
			value = cell.getStringCellValue();
		} else if (DateUtil.isCellDateFormatted(cell)) {
			Date date = cell.getDateCellValue();
			SimpleDateFormat sim = new SimpleDateFormat("dd/MM/yy");
			value = sim.format(date);
		} else {
			double d = cell.getNumericCellValue();
			long l = (long) d;
			value = String.valueOf(l);
		}
		return value;
	}


}
