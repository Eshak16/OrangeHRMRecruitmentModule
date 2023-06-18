package com_OrnageHRM_Recruitment;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;

public class DeleteCandidates {
	WebDriver driver;
	FileReader reader;
	Properties props;
	@Test
	  public void yesDeleteSingleCandidateRecord()  {
	        String selectAllVacancy=props.getProperty("selectAllVacancy_loc");
	        String select2ndVacancy=props.getProperty("select2ndVacancy_loc");
	        String delete=props.getProperty("delete_loc");
	        String Yesdelete=props.getProperty("YesDelete_loc");
	        String Nocancel=props.getProperty("Nocancel_loc");
	       
	     WebElement ele=driver.findElement(By.xpath(select2ndVacancy));
	     ele.click();
	     driver.findElement(By.xpath(delete)).click();
	    driver.findElement(By.xpath(Yesdelete)).click();
	   
	       
	  }
	  @Test
	  public void noCancelDeleteSingleCandidateRecord() {
		  
	        String selectAllVacancy=props.getProperty("selectAllVacancy_loc");
	        String select2ndVacancy=props.getProperty("select2ndVacancy_loc");
	        String delete=props.getProperty("delete_loc");
	        String Yesdelete=props.getProperty("YesDelete_loc");
	        String Nocancel=props.getProperty("Nocancel_loc");              

	     WebElement ele=driver.findElement(By.xpath(select2ndVacancy));
	     ele.click();
	     driver.findElement(By.xpath(delete)).click();
	    driver.findElement(By.xpath(Nocancel)).click();
	      
	  }
	  @Test(enabled=false)
	  public void yesDeleteAllCandidateRecord()  {
		  
	        String selectAllVacancy=props.getProperty("selectAllVacancy_loc");
	        String delete=props.getProperty("delete_loc");
	        String Yesdelete=props.getProperty("YesDelete_loc");
	        String Nocancel=props.getProperty("Nocancel_loc");
	       
	     WebElement ele=driver.findElement(By.xpath(selectAllVacancy));
	     ele.click();
	     driver.findElement(By.xpath(delete)).click();
	    driver.findElement(By.xpath(Yesdelete)).click();
	   
	       
	  }
	  @Test (enabled=false)
	  public void NoCancelDeleteAllCandidateRecord() {
		 
	        String selectAllVacancy=props.getProperty("selectAllVacancy_loc");
	        String delete=props.getProperty("delete_loc");
	        String Yesdelete=props.getProperty("YesDelete_loc");
	        String Nocancel=props.getProperty("Nocancel_loc");              
	       
	        WebElement ele=driver.findElement(By.xpath(selectAllVacancy));
	     ele.click();
	     driver.findElement(By.xpath(delete)).click();
	    driver.findElement(By.xpath(Nocancel)).click();
	      
	  }
  @BeforeMethod
  public void beforeMethod() {
	  WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "D:\\old laptop programs\\selenium jars\\browser\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
	    co.addArguments("--remote-allow-origins=*");
      driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		try {
			reader=new FileReader("D:\\old laptop programs\\eclipse-workspace old\\ExcelR\\ExcelR_Training\\com_orangeHRM_project\\src\\main\\java\\config\\candidate_delete_view.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     props=new Properties();
	      try {
			props.load(reader);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      String url =props.getProperty("mainURL");
	      String uname_loc =props.getProperty("username_loc");
	      String uname =props.getProperty("username");
	      String pwd_loc =props.getProperty("password_loc");
	      String pwd =props.getProperty("password");
	      String login_loc =props.getProperty("loginButton_loc");
	      String recr=props.getProperty("rec");
	      driver.get(url);
	      driver.findElement(By.name(uname_loc)).sendKeys(uname);
	      driver.findElement(By.name(pwd_loc)).sendKeys(pwd);
	      driver.findElement(By.xpath(login_loc)).click();  
	        driver.findElement(By.xpath(recr)).click();
		
  }

  @AfterMethod
  public void afterMethod() {
	  
		 
  }

}
