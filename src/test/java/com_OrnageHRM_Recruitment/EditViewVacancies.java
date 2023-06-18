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

public class EditViewVacancies {
	WebDriver driver;
	FileReader reader;
	Properties props;
	@Test
	  public void editAndSaveWithValidData() throws IOException, InterruptedException {
		  
		    String FirstVacancyEditTab =props.getProperty("FirstVacancyEditTab_loc");
	        String vac_loc=props.getProperty("vacancy_loc");
	        String vac=props.getProperty("vacancy");
	        String job_loc=props.getProperty("jobTitle_loc");
	        String job_option=props.getProperty("jobTitle_option");
	        String jobTitle=props.getProperty("jobTitle");
	        String desc_loc=props.getProperty("description_loc");
	        String desc=props.getProperty("description");
	        String hmanager_loc=props.getProperty("hiringManager_loc");
	        String hmanager=props.getProperty("hiringManager");
	        String nop_loc=props.getProperty("NumberOfPosition_loc");
	        String nop=props.getProperty("NumberOfPosition");
	        String active_loc=props.getProperty("active_btn_loc");
	        String publish_loc=props.getProperty("publish_btn_loc");       
	        String save_loc=props.getProperty("saveButton_loc");
	        String cancel_loc=props.getProperty("cancelButton_loc");
	              
	     
	     driver.findElement(By.xpath(FirstVacancyEditTab)).click();
	     driver.findElement(By.xpath(vac_loc)).sendKeys(vac);
	     driver.findElement(By.xpath(job_loc)).click();
	     try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				 List<WebElement> jlist = driver.findElements(By.xpath(job_option));
				 Iterator<WebElement> iterator1 = jlist.iterator();
				 while (iterator1.hasNext()) {
					WebElement jwebElement = (WebElement) iterator1.next();
					System.out.println(jwebElement.getText());
					if(jwebElement.getText().equals(jobTitle)) {
						jwebElement.click();
						
					}
				 }
	     driver.findElement(By.xpath(desc_loc)).sendKeys(desc);
	     driver.findElement(By.xpath(hmanager_loc)).sendKeys(hmanager);
	     driver.findElement(By.xpath(nop_loc)).sendKeys(nop);
	     driver.findElement(By.xpath(active_loc)).click();
	     driver.findElement(By.xpath(publish_loc)).click();
	     driver.findElement(By.xpath(save_loc)).click();
	     
	  }
	  @Test
	  public void editAndSaveWithInValidData() throws IOException, InterruptedException {
		  
		    String FirstVacancyEditTab =props.getProperty("FirstVacancyEditTab_loc");
	        String vac_loc=props.getProperty("vacancy_loc");
	        String Invalidvac=props.getProperty("Invalidvacancy");
	        String job_loc=props.getProperty("jobTitle_loc");
	        String job_option=props.getProperty("jobTitle_option");
	        String jobTitle=props.getProperty("jobTitle");
	        String desc_loc=props.getProperty("description_loc");
	        String desc=props.getProperty("description");
	        String hmanager_loc=props.getProperty("hiringManager_loc");
	        String hmanager=props.getProperty("hiringManager");
	        String nop_loc=props.getProperty("NumberOfPosition_loc");
	        String nop=props.getProperty("NumberOfPosition");
	        String active_loc=props.getProperty("active_btn_loc");
	        String publish_loc=props.getProperty("publish_btn_loc");       
	        String save_loc=props.getProperty("saveButton_loc");
	        String cancel_loc=props.getProperty("cancelButton_loc");
	              
	     
	      driver.findElement(By.xpath(FirstVacancyEditTab)).click();
	     driver.findElement(By.xpath(vac_loc)).sendKeys(Invalidvac);
	     driver.findElement(By.xpath(job_loc)).click();
	     try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				 List<WebElement> jlist = driver.findElements(By.xpath(job_option));
				 Iterator<WebElement> iterator1 = jlist.iterator();
				 while (iterator1.hasNext()) {
					WebElement jwebElement = (WebElement) iterator1.next();
					System.out.println(jwebElement.getText());
					if(jwebElement.getText().equals(jobTitle)) {
						jwebElement.click();
						
					}
				 }
	     driver.findElement(By.xpath(desc_loc)).sendKeys(desc);
	     driver.findElement(By.xpath(hmanager_loc)).sendKeys(hmanager);
	     driver.findElement(By.xpath(nop_loc)).sendKeys(nop);
	     driver.findElement(By.xpath(active_loc)).click();
	     driver.findElement(By.xpath(publish_loc)).click();
	     driver.findElement(By.xpath(save_loc)).click();
	     
	  }
	  @Test
	  public void editAndCancelWithAllData() throws IOException, InterruptedException {
		  
		  String FirstVacancyEditTab =props.getProperty("FirstVacancyEditTab_loc");
	        String vac_loc=props.getProperty("vacancy_loc");
	        String vac=props.getProperty("vacancy");
	        String Invalidvac=props.getProperty("Invalidvacancy");
	        String job_loc=props.getProperty("jobTitle_loc");
	        String job_option=props.getProperty("jobTitle_option");
	        String jobTitle=props.getProperty("jobTitle");
	        String desc_loc=props.getProperty("description_loc");
	        String desc=props.getProperty("description");
	        String hmanager_loc=props.getProperty("hiringManager_loc");
	        String hmanager=props.getProperty("hiringManager");
	        String nop_loc=props.getProperty("NumberOfPosition_loc");
	        String nop=props.getProperty("NumberOfPosition");
	        String active_loc=props.getProperty("active_btn_loc");
	        String publish_loc=props.getProperty("publish_btn_loc");       
	        String cancel_loc=props.getProperty("cancelButton_loc");
	              
	     
	      driver.findElement(By.xpath(FirstVacancyEditTab)).click();
	     driver.findElement(By.xpath(vac_loc)).sendKeys(vac);
	     driver.findElement(By.xpath(job_loc)).click();
	     try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				 List<WebElement> jlist = driver.findElements(By.xpath(job_option));
				 Iterator<WebElement> iterator1 = jlist.iterator();
				 while (iterator1.hasNext()) {
					WebElement jwebElement = (WebElement) iterator1.next();
					System.out.println(jwebElement.getText());
					if(jwebElement.getText().equals(jobTitle)) {
						jwebElement.click();
						
					}
				 }
	     driver.findElement(By.xpath(desc_loc)).sendKeys(desc);
	     driver.findElement(By.xpath(hmanager_loc)).sendKeys(hmanager);
	     driver.findElement(By.xpath(nop_loc)).sendKeys(nop);
	    driver.findElement(By.xpath(active_loc)).click();
	    driver.findElement(By.xpath(publish_loc)).click();
	   driver.findElement(By.xpath(cancel_loc)).click();
	     
	  }
	  @Test
	  public void AddAttachementAndSaveTheChanges() throws IOException, InterruptedException {
		  String FirstVacancyEditTab =props.getProperty("FirstVacancyEditTab_loc");
		  String AttachementAddButton =props.getProperty("AttachementAddButton_loc");
		  String CommentBox =props.getProperty("CommentBox_loc");
		  String Comment =props.getProperty("Comment");
		  String AttachmentSaveButton =props.getProperty("AttachmentSaveButton_loc");
		  driver.findElement(By.xpath(FirstVacancyEditTab)).click();
		  driver.findElement(By.xpath(AttachementAddButton)).click();
		  driver.findElement(By.xpath(CommentBox)).sendKeys(Comment);
		  driver.findElement(By.xpath(AttachmentSaveButton)).click();
		  
	  }
	  @Test
	  public void AddAttachementAndCancelTheChanges() throws IOException, InterruptedException {
		  String FirstVacancyEditTab =props.getProperty("FirstVacancyEditTab_loc");
		  String AttachmentAddButton =props.getProperty("AttachementAddButton_loc");
		  String CommentBox =props.getProperty("CommentBox_loc");
		  String Comment =props.getProperty("Comment");
		  String AttachmentCancelButton =props.getProperty("AttachmentCancelButton_loc");
		  driver.findElement(By.xpath(FirstVacancyEditTab)).click();
		  driver.findElement(By.xpath(AttachmentAddButton)).click();
		  driver.findElement(By.xpath(CommentBox)).sendKeys(Comment);
		  driver.findElement(By.xpath(AttachmentCancelButton)).click();
		  
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
			reader=new FileReader("D:\\old laptop programs\\eclipse-workspace old\\ExcelR\\ExcelR_Training\\com_orangeHRM_project\\src\\main\\java\\config\\vacancies_delete_view.properties");
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
	      String vacancies_tab=props.getProperty("vacancies_tab_loc");
	        
	      driver.get(url);
	      driver.findElement(By.name(uname_loc)).sendKeys(uname);
	      driver.findElement(By.name(pwd_loc)).sendKeys(pwd);
	      driver.findElement(By.xpath(login_loc)).click();  
	      driver.findElement(By.xpath(recuitmentTab)).click();
	      driver.findElement(By.linkText(vacancies_tab)).click();
		
		
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
