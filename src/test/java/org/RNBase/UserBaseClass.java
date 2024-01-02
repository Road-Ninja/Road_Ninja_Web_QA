package org.RNBase;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UserBaseClass {

	static String attribute;
	static String value;
	protected static WebDriver driver;
	static WebElement element;

	public static void urlLaunch(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);

	}

	public static void maximize() {
		driver.manage().window().maximize();

	}

	public void ParentWindow() {
		String originalWindow = driver.getWindowHandle();
		driver.switchTo().window(originalWindow);

	}

	public void newWindow() {
		Set<String> newWindow = driver.getWindowHandles();
		List<String> li = new ArrayList(newWindow);
		String newWindow1 = li.get(1);
		driver.switchTo().window(newWindow1);
	}

	public void refresh() {
		driver.navigate().refresh();
	}
	
	public void back() {
		driver.navigate().back();
	}
	
	public void forward() {
		driver.navigate().forward();
	}
	
	public static void sendKeys(WebElement element1, String text) {
		element1.sendKeys(text);

	}
	
	public void acceptAlert() {
		Alert a = driver.switchTo().alert();
		a.accept();
	}
	
	public void dismissAlert() {
		Alert a = driver.switchTo().alert();
		a.dismiss();
	}

	public static void clicks(WebElement element2) {
		element2.click();
	}
	
	public static void clear(WebElement element6) {
		element6.clear();
	}
	
	public static void contextClick(WebElement element9) {
		Actions act = new Actions(driver);
		act.contextClick(element9).perform();
	}
	
	public static void doubleClick(WebElement element8) {
		Actions act = new Actions(driver);
		act.doubleClick(element8).perform();

	}
	
	public static void moveToElement(WebElement element7) {
		Actions act = new Actions(driver);
		act.moveToElement(element7).perform();

	}
	
	public void close() {
		driver.close();
	}
	
	public void Quit() {
		driver.quit();

	}
	
	public void escape() throws Exception {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
	}

	public static void selectByVisibilText(WebElement element5, String text) {
		Select s = new Select(element5);
		s.selectByVisibleText(text);
		System.out.println(text);

	}

	public static void selectByvalue(WebElement element3, String text) {
		Select s = new Select(element3);
		s.selectByValue(text);
		System.out.println(text);

	}

	public static void selectByIndex(WebElement element4, String text) {
		Select s = new Select(element4);
		s.selectByIndex(0);

	}

	public static void takesScreenShot() throws IOException {

		TakesScreenshot src = (TakesScreenshot) driver;
		File f = src.getScreenshotAs(OutputType.FILE);
		File d = new File("C:\\Users\\susan\\OneDrive\\Pictures\\Saved Pictures\\book01.jpg");
		FileUtils.copyFile(f, d);

	}

	public static String getAttributes() {
		attribute = element.getAttribute("value");
		System.out.println(attribute);
		return attribute;
	}

	public static void quit() {
		driver.quit();
	}

	public static String excelRead(int rowNo, int cellNo) throws IOException {

		File f = new File("C:\\Users\\susan\\eclipse-RoadNinja\\CucumberFramework\\data\\TestData.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fi);
		Sheet sh = wb.getSheet("Sheet1");
		Row r = sh.getRow(rowNo);
		Cell c = r.getCell(cellNo);

		int cellType = c.getCellType(); // Type ==1 - String // Type ==0 - Integer if
		if (cellType == 1) {

			value = c.getStringCellValue();
		}

		if (cellType == 0) {

			if (DateUtil.isCellDateFormatted(c)) {
				Date date = c.getDateCellValue();
				SimpleDateFormat dateformate = new SimpleDateFormat("dd/MM/yy");
				value = dateformate.format(date);

			}

			else {
				double d = c.getNumericCellValue();
				long l = (long) d;
				value = String.valueOf(l);
			}

		}

		return value;

	}

	public static void writeExcel(int rowNo, int cellNo1) throws IOException {
		File f = new File("C:\\Users\\susan\\eclipse-RoadNinja\\CucumberFramework\\data\\TestData.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fi);
		Sheet s = wb.getSheet("Sheet2");
//		Row r = s.createRow(rowNo);
		Row r = s.getRow(rowNo);
		Cell c1 = r.createCell(cellNo1);
		c1.setCellValue(attribute);
//		Cell c2 = r.createCell(cellNo2);
//		c2.setCellValue(value2);
//		Cell c3 = r.createCell(cellNo3);
//		c3.setCellValue(value3);
		FileOutputStream fo = new FileOutputStream(f);
		wb.write(fo);
	}
}
