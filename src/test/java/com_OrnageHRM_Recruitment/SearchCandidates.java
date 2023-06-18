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

public class SearchCandidates {
	WebDriver driver;
	FileReader reader;
	Properties props;
	  @Test
	  public void searchWithSingleData()  {	       
		    String hmanager_loc=props.getProperty("hiringManager_loc");
	        String hmanager_option=props.getProperty("hiringManager_option");	
	        String hmanagerName=props.getProperty("hiringManagerName");
	        String Search_loc=props.getProperty("SearchButton_loc");
	      
	        
	       driver.findElement(By.xpath(hmanager_loc)).click();
	       try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			 List<WebElement> list = driver.findElements(By.xpath(hmanager_option));
			 Iterator<WebElement> iterator = list.iterator();
			 while (iterator.hasNext()) {
				WebElement webElement = (WebElement) iterator.next();
				System.out.println(webElement.getText());
				if(webElement.getText().equals(hmanagerName)) {
					webElement.click();
					
				}
			 }
			 driver.findElement(By.xpath(Search_loc)).click();
	  }
  @Test (enabled=false)
  public void searchWithAllData()  {
	  
        String job_loc=props.getProperty("jobTitle_loc");
        String job_option=props.getProperty("jobTitle_option");
        String jobTitle=props.getProperty("jobTitle");
        String hmanager_loc=props.getProperty("hiringManager_loc");
        String hmanager_option=props.getProperty("hiringManager_option");
        String hmanagerName=props.getProperty("hiringManagerName");
        String vac_loc=props.getProperty("vacancy_loc");
        String vac_option=props.getProperty("vacancy_option");
        String vacName=props.getProperty("vacancyName");
        String stat_loc=props.getProperty("status_loc");
        String stat_option=props.getProperty("status_option");
        String status=props.getProperty("status");
        String candidate_loc=props.getProperty("candidateName_loc");
        String candName=props.getProperty("candidateName_option");
        String key_loc=props.getProperty("keywords_loc");
        String key=props.getProperty("keywords");
        String FromD_loc=props.getProperty("FromDate_loc");
        String FromD=props.getProperty("FromDate");
        String ToD_loc=props.getProperty("ToDate_loc");
        String ToD=props.getProperty("ToDate");
        String MethodOfApp_loc=props.getProperty("MethodOfApplication_loc");
        String MethodOfApp_option=props.getProperty("MethodOfApplication_option");
        String MethodOfApp=props.getProperty("MethodOfApplication");
        String Search_loc=props.getProperty("SearchButton_loc");
        String Reset_loc=props.getProperty("ResetButton_loc");
        
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
       driver.findElement(By.xpath(hmanager_loc)).click();
       try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			 List<WebElement> hlist = driver.findElements(By.xpath(hmanager_option));
			 Iterator<WebElement> iterator2 = hlist.iterator();
			 while (iterator2.hasNext()) {
				WebElement hwebElement = (WebElement) iterator2.next();
				System.out.println(hwebElement.getText());
				if(hwebElement.getText().equals(hmanagerName)) {
					hwebElement.click();
					
				}
			 }
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
				if(vwebElement.getText().equals(vacName)) {
					vwebElement.click();
					
				}
			 }
       driver.findElement(By.xpath(stat_loc)).click();
       try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			 List<WebElement> slist = driver.findElements(By.xpath(stat_option));
			 Iterator<WebElement> iterator4 = slist.iterator();
			 while (iterator4.hasNext()) {
				WebElement swebElement = (WebElement) iterator4.next();
				System.out.println(swebElement.getText());
				if(swebElement.getText().equals(status)) {
					swebElement.click();
					
				}
			 }
       driver.findElement(By.xpath(candidate_loc)).sendKeys(candName);
       driver.findElement(By.xpath(key_loc)).sendKeys(key);
       driver.findElement(By.xpath(FromD_loc)).sendKeys(FromD);
       driver.findElement(By.xpath( ToD_loc)).sendKeys( ToD);
       driver.findElement(By.xpath(MethodOfApp_loc)).click();
       try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			 List<WebElement> alist = driver.findElements(By.xpath(MethodOfApp_option));
			 Iterator<WebElement> iterator5 = alist.iterator();
			 while (iterator5.hasNext()) {
				WebElement awebElement = (WebElement) iterator5.next();
				System.out.println(awebElement.getText());
				if(awebElement.getText().equals("Manual")) {
					awebElement.click();
					
				}
			 }
       driver.findElement(By.xpath(Search_loc)).click();
  }
  @Test(enabled=false)
  public void resetWithSingleData()  {	       
	  String hmanager_loc=props.getProperty("hiringManager_loc");
      String hmanager_option=props.getProperty("hiringManager_option");	
      String hmanagerName=props.getProperty("hiringManagerName");
    
      String Reset_loc=props.getProperty("ResetButton_loc");
    
      
     driver.findElement(By.xpath(hmanager_loc)).click();
     try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		 List<WebElement> list = driver.findElements(By.xpath(hmanager_option));
		 Iterator<WebElement> iterator = list.iterator();
		 while (iterator.hasNext()) {
			WebElement webElement = (WebElement) iterator.next();
			System.out.println(webElement.getText());
			if(webElement.getText().equals(hmanagerName)) {
				webElement.click();
				
			}
		 }
		 driver.findElement(By.xpath(Reset_loc)).click();
}
@Test(enabled=false)
public void restWithAllData()  {
  
	 String job_loc=props.getProperty("jobTitle_loc");
     String job_option=props.getProperty("jobTitle_option");
     String jobTitle=props.getProperty("jobTitle");
     String hmanager_loc=props.getProperty("hiringManager_loc");
     String hmanager_option=props.getProperty("hiringManager_option");
     String hmanagerName=props.getProperty("hiringManagerName");
     String vac_loc=props.getProperty("vacancy_loc");
     String vac_option=props.getProperty("vacancy_option");
     String vacName=props.getProperty("vacancyName");
     String stat_loc=props.getProperty("status_loc");
     String stat_option=props.getProperty("status_option");
     String status=props.getProperty("status");
     String candidate_loc=props.getProperty("candidateName_loc");
     String candName=props.getProperty("candidateName_option");
     String key_loc=props.getProperty("keywords_loc");
     String key=props.getProperty("keywords");
     String FromD_loc=props.getProperty("FromDate_loc");
     String FromD=props.getProperty("FromDate");
     String ToD_loc=props.getProperty("ToDate_loc");
     String ToD=props.getProperty("ToDate");
     String MethodOfApp_loc=props.getProperty("MethodOfApplication_loc");
     String MethodOfApp_option=props.getProperty("MethodOfApplication_option");
     String MethodOfApp=props.getProperty("MethodOfApplication");
     String Search_loc=props.getProperty("SearchButton_loc");
     String Reset_loc=props.getProperty("ResetButton_loc");
     
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
    driver.findElement(By.xpath(hmanager_loc)).click();
    try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			 List<WebElement> hlist = driver.findElements(By.xpath(hmanager_option));
			 Iterator<WebElement> iterator2 = hlist.iterator();
			 while (iterator2.hasNext()) {
				WebElement hwebElement = (WebElement) iterator2.next();
				System.out.println(hwebElement.getText());
				if(hwebElement.getText().equals(hmanagerName)) {
					hwebElement.click();
					
				}
			 }
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
				if(vwebElement.getText().equals(vacName)) {
					vwebElement.click();
					
				}
			 }
    driver.findElement(By.xpath(stat_loc)).click();
    try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			 List<WebElement> slist = driver.findElements(By.xpath(stat_option));
			 Iterator<WebElement> iterator4 = slist.iterator();
			 while (iterator4.hasNext()) {
				WebElement swebElement = (WebElement) iterator4.next();
				System.out.println(swebElement.getText());
				if(swebElement.getText().equals(status)) {
					swebElement.click();
					
				}
			 }
    driver.findElement(By.xpath(candidate_loc)).sendKeys(candName);
    driver.findElement(By.xpath(key_loc)).sendKeys(key);
    driver.findElement(By.xpath(FromD_loc)).sendKeys(FromD);
    driver.findElement(By.xpath( ToD_loc)).sendKeys( ToD);
    driver.findElement(By.xpath(MethodOfApp_loc)).click();
    try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			 List<WebElement> alist = driver.findElements(By.xpath(MethodOfApp_option));
			 Iterator<WebElement> iterator5 = alist.iterator();
			 while (iterator5.hasNext()) {
				WebElement awebElement = (WebElement) iterator5.next();
				System.out.println(awebElement.getText());
				if(awebElement.getText().equals("Manual")) {
					awebElement.click();
					
				}
			 }
   driver.findElement(By.xpath(Reset_loc)).click();
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
			reader=new FileReader("D:\\old laptop programs\\eclipse-workspace old\\ExcelR\\ExcelR_Training\\com_orangeHRM_project\\src\\main\\java\\config\\candidate_search.properties");
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
	      driver.get(url);
	      
	      driver.findElement(By.name(uname_loc)).sendKeys(uname);
	      driver.findElement(By.name(pwd_loc)).sendKeys(pwd);
	      driver.findElement(By.xpath(login_loc)).click();  
	      driver.findElement(By.xpath(recuitmentTab)).click();
		
  }

  @AfterMethod
  public void afterMethod() {
	  //driver.quit();
  }

}
