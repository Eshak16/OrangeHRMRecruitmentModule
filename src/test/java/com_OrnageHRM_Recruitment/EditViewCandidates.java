package com_OrnageHRM_Recruitment;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;

public class EditViewCandidates {
	WebDriver driver;
	FileReader reader;
	Properties props;
	
	@Test
	  public void editAndSaveWithValidData() throws IOException,InterruptedException  {
		
	       
	        String firstn_loc=props.getProperty("firstName_loc");
	        String firstn=props.getProperty("firstName");
	        String middlen_loc=props.getProperty("middleName_loc");
	        String middlen=props.getProperty("middleName");
	        String lastn_loc=props.getProperty("lastName_loc");
	        String lastn=props.getProperty("lastName");
	        String vac_loc=props.getProperty("vacancy_loc");
	        String vac_option=props.getProperty("vacancy_option");
	        String vacancy=props.getProperty("vacancy");
	        String email_loc=props.getProperty("email_loc");
	        String email=props.getProperty("email");
	        String contact_loc=props.getProperty("contactNumber_loc");
	        String contact=props.getProperty("contactNumber");
	        String key_loc=props.getProperty("keywords_loc");
	        String key=props.getProperty("keywords");
	        String Dateofapp_loc=props.getProperty("DateOfApplication_loc");
	        String Dateofapp=props.getProperty("DateOfApplication");
	        String notes_loc=props.getProperty("notes_loc");
	        String notes=props.getProperty("notes");
	        String consent_loc=props.getProperty("consent_loc");
	        String savebtn_loc=props.getProperty("saveButton_loc");
	        
	        driver.findElement(By.name(firstn_loc)).sendKeys(firstn);
	        driver.findElement(By.name(lastn_loc)).sendKeys(lastn);
	        driver.findElement(By.xpath(vac_loc)).click();
	        try {
	 			Thread.sleep(4000);
	 		} catch (InterruptedException e) {
	 			// TODO Auto-generated catch block
	 			e.printStackTrace();
	 		}
	 			 List<WebElement> vlist = driver.findElements(By.xpath(vac_option));
	 			 Iterator<WebElement> iterator3 = vlist.iterator();
	 			 while (iterator3.hasNext()) {
	 				WebElement vwebElement = (WebElement) iterator3.next();
	 				System.out.println(vwebElement.getText());
	 				if(vwebElement.getText().equals(vacancy)) {
	 					vwebElement.click();
	 					
	 				}
	 			 }
	 			 driver.findElement(By.name(email_loc)).sendKeys(email);
	 			 driver.findElement(By.name(contact_loc)).sendKeys(contact);
	 			 driver.findElement(By.name(key_loc)).sendKeys(key);
	 			 driver.findElement(By.name(Dateofapp_loc)).sendKeys(Dateofapp);
	 			 driver.findElement(By.name(notes_loc)).sendKeys(notes);
	 			 driver.findElement(By.name(consent_loc)).click();
	 			 driver.findElement(By.xpath(savebtn_loc)).click();
	  }
	  @Test
	  public void editAndSaveWithInvalidData() throws IOException,InterruptedException  {
		
	       
	        String firstn_loc=props.getProperty("firstName_loc");
	        String Invalidfirstn=props.getProperty("InvalidfirstName");
	        String middlen_loc=props.getProperty("middleName_loc");
	        String Invalidmiddlen=props.getProperty("InvalidmiddleName");
	        String lastn_loc=props.getProperty("lastName_loc");
	        String Invalidlastn=props.getProperty("InvalidlastName");
	        String vac_loc=props.getProperty("vacancy_loc");
	        String vac_option=props.getProperty("vacancy_option");
	        String vacancy=props.getProperty("vacancy");
	        String email_loc=props.getProperty("email_loc");
	        String Invalidemail=props.getProperty("Invalidemail");
	        String contact_loc=props.getProperty("contactNumber_loc");
	        String Invalidcontact=props.getProperty("InvalidcontactNumber");
	        String key_loc=props.getProperty("keywords_loc");
	        String key=props.getProperty("keywords");
	        String Dateofapp_loc=props.getProperty("DateOfApplication_loc");
	        String Dateofapp=props.getProperty("DateOfApplication");
	        String notes_loc=props.getProperty("notes_loc");
	        String notes=props.getProperty("notes");
	        String consent_loc=props.getProperty("consent_loc");
	        String savebtn_loc=props.getProperty("saveButton_loc");
	        
	        driver.findElement(By.name(firstn_loc)).sendKeys(Invalidfirstn);
	        driver.findElement(By.name(lastn_loc)).sendKeys(Invalidlastn);
	        driver.findElement(By.xpath(vac_loc)).click();
	        try {
	 			Thread.sleep(4000);
	 		} catch (InterruptedException e) {
	 			// TODO Auto-generated catch block
	 			e.printStackTrace();
	 		}
	 			 List<WebElement> vlist = driver.findElements(By.xpath(vac_option));
	 			 Iterator<WebElement> iterator3 = vlist.iterator();
	 			 while (iterator3.hasNext()) {
	 				WebElement vwebElement = (WebElement) iterator3.next();
	 				System.out.println(vwebElement.getText());
	 				if(vwebElement.getText().equals(vacancy)) {
	 					vwebElement.click();
	 					
	 				}
	 			 }
	 			 driver.findElement(By.name(email_loc)).sendKeys(Invalidemail);
	 			 driver.findElement(By.name(contact_loc)).sendKeys(Invalidcontact);
	 			 driver.findElement(By.name(key_loc)).sendKeys(key);
	 			 driver.findElement(By.name(Dateofapp_loc)).sendKeys(Dateofapp);
	 			 driver.findElement(By.name(notes_loc)).sendKeys(notes);
	 			 driver.findElement(By.name(consent_loc)).click();
	 			 driver.findElement(By.xpath(savebtn_loc)).click();
	  }
	  @Test
	  public void editAndCancelWithAllData() throws IOException,InterruptedException  {
	      
		  String firstn_loc=props.getProperty("firstName_loc");
	      String firstn=props.getProperty("firstName");
	      String middlen_loc=props.getProperty("middleName_loc");
	      String middlen=props.getProperty("middleName");
	      String lastn_loc=props.getProperty("lastName_loc");
	      String lastn=props.getProperty("lastName");
	      String vac_loc=props.getProperty("vacancy_loc");
	      String vac_option=props.getProperty("vacancy_option");
	      String vacancy=props.getProperty("vacancy");
	      String email_loc=props.getProperty("email_loc");
	      String email=props.getProperty("email");
	      String contact_loc=props.getProperty("contactNumber_loc");
	      String contact=props.getProperty("contactNumber");
	      String key_loc=props.getProperty("keywords_loc");
	      String key=props.getProperty("keywords");
	      String Dateofapp_loc=props.getProperty("DateOfApplication_loc");
	      String Dateofapp=props.getProperty("DateOfApplication");
	      String notes_loc=props.getProperty("notes_loc");
	      String notes=props.getProperty("notes");
	      String consent_loc=props.getProperty("consent_loc");
	      String cancelbtn_loc=props.getProperty("cancelButton_loc");
	      
	      driver.findElement(By.name(firstn_loc)).sendKeys(firstn);
	      driver.findElement(By.name(lastn_loc)).sendKeys(lastn);
	      driver.findElement(By.xpath(vac_loc)).click();
	      try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				 List<WebElement> vlist = driver.findElements(By.xpath(vac_option));
				 Iterator<WebElement> iterator3 = vlist.iterator();
				 while (iterator3.hasNext()) {
					WebElement vwebElement = (WebElement) iterator3.next();
					System.out.println(vwebElement.getText());
					if(vwebElement.getText().equals(vacancy)) {
						vwebElement.click();
						
					}
				 }
				 driver.findElement(By.name(email_loc)).sendKeys(email);
				 driver.findElement(By.name(contact_loc)).sendKeys(contact);
				 driver.findElement(By.name(key_loc)).sendKeys(key);
				 driver.findElement(By.name(Dateofapp_loc)).sendKeys(Dateofapp);
				 driver.findElement(By.name(notes_loc)).sendKeys(notes);
				 driver.findElement(By.name(consent_loc)).click();
	 			 driver.findElement(By.xpath(cancelbtn_loc)).click();
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
	      String recuitmentTab=props.getProperty("recuitmentTab_loc");
	      String editView1st=props.getProperty("editView1st_loc");
		  String editButton=props.getProperty("editButton_loc");
	      driver.get(url);
	      driver.findElement(By.name(uname_loc)).sendKeys(uname);
	      driver.findElement(By.name(pwd_loc)).sendKeys(pwd);
	      driver.findElement(By.xpath(login_loc)).click();  
	      driver.findElement(By.xpath(recuitmentTab)).click();
	      driver.findElement(By.xpath(editView1st)).click();
	      driver.findElement(By.xpath(editButton)).click(); 
	      
		
  }


  @AfterMethod
  public void afterMethod() {
	  driver.close();
		 
  }


}
