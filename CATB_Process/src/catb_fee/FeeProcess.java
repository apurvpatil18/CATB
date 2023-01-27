package catb_fee;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.ArrayList;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class FeeProcess {
	
  @Test (priority = 1)
  public void Admission_Tag_Master() {
	  try {
			 System.setProperty("webdriver.chrome.driver","C:\\Software Testing\\chromedriver\\chromedriver.exe");
			 
				//Creating WebDriver instance
	             WebDriver driver = new ChromeDriver();
	             
	             //Navigate to web page
	             driver.get("https://uatums.digivarsity.com/");
	             
	             //Maximizing window
	             driver.manage().window().maximize();
	             
			        // login to new website 
			  driver.findElement(By.id("UserName")).sendKeys("admin");
			  driver.findElement(By.id("Password")).sendKeys("tl@20201");
		   	 driver.findElement(By.className("blue")).click();
			 System.out.println("Logged IN Successfully");
			 Thread.sleep(1000);
			
			
			//Navigate to web page
                //driver.get("https://ums.suonline.in/Home/Index?data=F4UBqMqVjss%3d");
               Thread.sleep(1000);
               driver.findElement(By.xpath("//*[@id=\"mn_801\"]/span[1]")).click();
               Thread.sleep(1000);
               System.out.println("Fee Management Menu");
                  //switch to new tab
               // hold all window handles in array list
             //  ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
               //driver.switchTo().window(newTb.get(1));
               ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
               driver.switchTo().window(tabs2.get(1));
               
               
               System.out.println("2nd Tab Management Menu");
              
               //getting all the handles currently available
               //opening the new tab
               

              
               
               driver.findElement(By.xpath("//*[@id=\"mn_1175\"]")).click();
               Thread.sleep(1000);
               System.out.println("CATB Process");
               driver.findElement(By.xpath("//*[@id=\"mn_1173\"]/span")).click();
               Thread.sleep(1000);
               System.out.println("Admission Tag Master");
         
                // Add New Tag
                driver.findElement(By.xpath("//*[@id=\"sendBtn\"]")).click();
                Thread.sleep(2000);
                System.out.println("Added New Tag");
         
               //cancel click
               driver.findElement(By.xpath("//*[@id=\"confirmationTag\"]/div/div/div[2]/div/div[2]/button[1]")).click();
               Thread.sleep(1000);
               System.out.println("Clicking ON cancel Button");
         
               // Title Textbox functionality
                WebElement TitleBtn =  driver.findElement(By.id("Tag_Title"));
                TitleBtn.sendKeys("CATB");
                Thread.sleep(2000);
                TitleBtn.clear();
                Thread.sleep(2000);
                System.out.println("Title");
         
         //Display Textbox Functionality 
         WebElement DisBtn = driver.findElement(By.id("Display_Name"));
         DisBtn.sendKeys("CATA");
         Thread.sleep(2000);
         DisBtn.clear();
         Thread.sleep(2000);
         System.out.println("Title");
         
         // Status Textbox Functionality
         WebElement StatusBtn = driver.findElement(By.xpath("//*[@id=\"statussearch\"]"));
         StatusBtn.sendKeys("Active");
         Thread.sleep(1000);
         
         
         //Search Button Functionality
         driver.findElement(By.xpath("//*[@id=\"myForm\"]/div/div[1]/div/div/div[4]/button")).click();
         Thread.sleep(1000);
         System.out.println("Search Button");
         
         //Edit Button Functionality 
         //driver.findElement(By.className("fa fa-pencil text-success")).click();
         driver.findElement(By.className("fa fa-pencil text-success"));
         Thread.sleep(1000);
         System.out.println("Edit");
         
         	
			
		} catch (Exception e) {}
  }
  
  

  @Test (priority = 2)
  public void CATB_Str_Definiation() {
	  try {
			 System.setProperty("webdriver.chrome.driver","C:\\Software Testing\\chromedriver\\chromedriver.exe");
			 
				//Creating WebDriver instance
	             WebDriver driver = new ChromeDriver();
	             
	             //Navigate to web page
	             driver.get("https://uatums.digivarsity.com/");
	             
	             //Maximizing window
	             driver.manage().window().maximize();
	             
			        // login to new website 
			 driver.findElement(By.id("UserName")).sendKeys("admin");
			 driver.findElement(By.id("Password")).sendKeys("tl@20201");
			 driver.findElement(By.className("blue")).click();
			 System.out.println("Logged IN Successfully");
			Thread.sleep(1000);
			
			
			//Navigate to web page
      //driver.get("https://ums.suonline.in/Home/Index?data=F4UBqMqVjss%3d");
      Thread.sleep(1000);
      //FeeManagement
      driver.findElement(By.xpath("//*[@id=\"mn_801\"]/span[1]")).click();
      Thread.sleep(1000);
      System.out.println("Fee Management Menu");
      //CATB Process
      driver.findElement(By.xpath("//*[@id=\"mn_1175\"]/span[1]")).click();
      Thread.sleep(1000);
      System.out.println("CATB Process");
      //Associate Admission Tag
      driver.findElement(By.xpath("//*[@id=\"mn_1176\"]/span")).click();
      Thread.sleep(1000);
      System.out.println("CAT B - STRUCTURE DEFINITION");
      
      // ELEMENT On 
      // University Textbox Functionality
     WebElement univ =  driver.findElement(By.xpath("//*[@id=\"univ_id\"]"));
     univ.sendKeys("Acharya Nagarjuna University");
   //univ.clear();
     Thread.sleep(1000);
     System.out.println("UAT");
     
    //University Textbox Functionality
     WebElement  str =  driver.findElement(By.xpath("//*[@id=\"Structure_Name\"]"));
     str.sendKeys("PGDY 2022");
   //  str.clear();
     Thread.sleep(2000);
     System.out.println("Univ");
     
     // Status Textbox Funtionality
     WebElement status = driver.findElement(By.xpath("//*[@id=\"statussearch\"]"));
     status.sendKeys("Active");
    // status.clear();
     Thread.sleep(1000);
     System.out.println("status");
     
     //Add Structure Functionality
     driver.findElement(By.xpath("//*[@id=\"sendBtn\"]")).click();
     Thread.sleep(1000);
     System.out.println("Add Str");
     
     //CAT B - ADD STRUCTURE
     WebElement add = driver.findElement(By.xpath("//*[@id=\"univ_id\"]"));
     add.sendKeys("Acharya Nagarjuna University"); 
     Thread.sleep(1000);
     System.out.println("CATB Add");
     
     //Struture Name
     WebElement name = driver.findElement(By.xpath("//*[@id=\"add-StrutureName\"]"));
     name.sendKeys("Test21");
     Thread.sleep(1000);
   //name.clear();
     System.out.println("Str Name");
     
     
     //No Of Parts
     WebElement parts = driver.findElement(By.xpath("//*[@id=\"add-NoOfParts\"]"));
     parts.sendKeys("3");
    // parts.clear();
     Thread.sleep(1000);
     System.out.println("No of Parts displayed ");
     
     //From Date 
     WebElement f_date = driver.findElement(By.xpath("//*[@id=\"Add-txtfrom\"]"));
     f_date.clear();
     f_date.sendKeys("18-01-2023");
     Thread.sleep(1000);
     System.out.println("From Date is ");
     
     //To Date
     WebElement t_date = driver.findElement(By.xpath("//*[@id=\"Add-txtto\"]"));
     t_date.sendKeys("25-01-2023");
     Thread.sleep(1000);
     System.out.println("To Date is ");
     
     //Cancel Button 
   //  driver.findElement(By.xpath("//*[@id=\"ADDStructureModel\"]/div/div/div[2]/div/div/div/div[2]/div[2]/button[2]")).click();
   //  Thread.sleep(1000);
   //  System.out.println("Cancel Button ");
     
     //Show Button 
     driver.findElement(By.xpath("//*[@id=\"ADDStructureModel\"]/div/div/div[2]/div/div/div/div[2]/div[2]/button[1]")).click();
     Thread.sleep(1000);
     System.out.println("Show Button ");
     
     //Search Functionality
     driver.findElement(By.xpath("//*[@id=\"CATB_Form\"]/div/div[1]/div/div[2]/button")).click();
     Thread.sleep(1000);
     
     //
     
     
	  } catch (Exception e) {}
	
  }
  

  
  @Test (priority = 3)
  public void Associate_Admission_Tag() {
	  try {
			 System.setProperty("webdriver.chrome.driver","C:\\Software Testing\\chromedriver\\chromedriver.exe");
			 
				//Creating WebDriver instance
	             WebDriver driver = new ChromeDriver();
	             
	             //Navigate to web page
	             driver.get("https://uatums.digivarsity.com/");
	             
	             //Maximizing window
	             driver.manage().window().maximize();
	             
			        // login to new website 
			 driver.findElement(By.id("UserName")).sendKeys("admin");
			 driver.findElement(By.id("Password")).sendKeys("tl@20201");
			 driver.findElement(By.className("blue")).click();
			 System.out.println("Logged IN Successfully");
			Thread.sleep(1000);
			
			
			//Navigate to web page
           //driver.get("https://ums.suonline.in/Home/Index?data=F4UBqMqVjss%3d");
           //  Thread.sleep(1000);
             //Fee Management
             driver.findElement(By.xpath("//*[@id=\"mn_801\"]")).click();
             Thread.sleep(1000);
             System.out.println("Fee Management Menu");
             //CATB Process
             driver.findElement(By.xpath("//*[@id=\"mn_1175\"]/span[1]")).click();
             Thread.sleep(1000);
             System.out.println("CATB Process");
             //Associate Admission Tag
             driver.findElement(By.xpath("//*[@id=\"mn_1174\"]")).click();
             Thread.sleep(1000);
             System.out.println("Associate Admission Tag");
   
             // ELEMENT On
             
             //Click on show button 
             driver.findElement(By.xpath("//*[@id=\"mfrm\"]/div[2]/div/div[2]/input")).click();
             Thread.sleep(1000);
             System.out.println("Show");
             
             //Sample File  
             driver.findElement(By.xpath("//*[@id=\"mfrm\"]/div[2]/div/div[1]/a")).click();
             Thread.sleep(1000);
             System.out.println("Sample File");
     
   
	  } catch (Exception e) {}
  }
  
 
 
  @Test (priority = 4)
  public void CATB_Billing() {
	  try {
			 System.setProperty("webdriver.chrome.driver","C:\\Software Testing\\chromedriver\\chromedriver.exe");
			 
				//Creating WebDriver instance
	             WebDriver driver = new ChromeDriver();
	             
	             //Navigate to web page
	             driver.get("https://uatums.digivarsity.com/");
	             
	             //Maximizing window
	             driver.manage().window().maximize();
	             
			        // login to new website 
			 driver.findElement(By.id("UserName")).sendKeys("admin");
			 driver.findElement(By.id("Password")).sendKeys("tl@20201");
			 driver.findElement(By.className("blue")).click();
			 System.out.println("Logged IN Successfully");
			Thread.sleep(1000);
			
			
			//Navigate to web page
           //driver.get("https://ums.suonline.in/Home/Index?data=F4UBqMqVjss%3d");
           Thread.sleep(1000);
           
           //Fee Management
           driver.findElement(By.xpath("//*[@id=\"mn_801\"]")).click();
           Thread.sleep(1000);
           System.out.println("Fee Management Menu");
           
           //CATB Process
           driver.findElement(By.xpath("//*[@id=\"mn_1175\"]/span[1]")).click();
           Thread.sleep(1000);
           System.out.println("CATB Process");
           
           //CATB Billing/Reconcilliation
           driver.findElement(By.xpath("//*[@id=\"mn_1177\"]/span")).click();
           Thread.sleep(1000);
           System.out.println("CAT B Billing");

           // ELEMENT On 
           
           //For Manual Import 
           //Performing University textbox click
           WebElement univ1 = driver.findElement(By.xpath("//*[@id=\"univ_id\"]"));
           univ1.sendKeys("UAT University");
           Thread.sleep(1000);
           System.out.println("UAT University");
           
         //Performing Batch textbox click
          WebElement batch = driver.findElement(By.xpath("//*[@id=\"batch_idB\"]"));
          batch.sendKeys("demo batch");
          Thread.sleep(1000);
          System.out.println("Batch");
          
          // Performing Course Textbox Click
          WebElement course =  driver.findElement(By.xpath("//*[@id=\"course_idB\"]"));
          course.sendKeys("Post Graduate Diploma in Yoga");
          Thread.sleep(1000);
          System.out.println("Course");
          
          // Performing Part wise selection Click 
          WebElement part = driver.findElement(By.xpath("//*[@id=\"PART\"]"));
          part.sendKeys("Part 1");
          Thread.sleep(1000);
          System.out.println("Part");
          
          // Performing Student name click 
          WebElement s_name = driver.findElement(By.xpath("//*[@id=\"StudentName\"]"));
          s_name.sendKeys("Demo");
          s_name.clear();
          Thread.sleep(1000);
          System.out.println("Student Name ");
          
          //Click onshow button 
          driver.findElement(By.xpath("//*[@id=\"myfrm\"]/div[4]/div/div[2]/div[3]/div/button")).click();
          Thread.sleep(1000);
          System.out.println("Search Click ");
          
          //For File
          // For File click
          WebElement select = driver.findElement(By.xpath("//*[@id=\"dataSource\"]"));
          select.sendKeys("File");
          Thread.sleep(1000);
          System.out.println("File ");
          
          // For File click
          driver.findElement(By.xpath("//*[@id=\"myfrm\"]/div[3]/div/div[3]/input[1]")).click();
          Thread.sleep(1000);
          System.out.println("Show ");
          
          // Sample file download 
          driver.findElement(By.xpath("//*[@id=\"myfrm\"]/div[3]/div/div[1]/a")).click();
          Thread.sleep(1000);
          System.out.println("Sample File ");
          
          // For Import new File  
          driver.findElement(By.xpath("//*[@id=\"importFile\"]")).click();
          Thread.sleep(1000);
          System.out.println("Import File ");
          
          
          
           
           
           
	   } catch (Exception e) {}
}
  

  @Test (priority = 5)
  public void CATB_Revenue_Report() {
	  try {
			 System.setProperty("webdriver.chrome.driver","C:\\Software Testing\\chromedriver\\chromedriver.exe");
			 
				//Creating WebDriver instance
	             WebDriver driver = new ChromeDriver();
	             
	             //Navigate to web page
	             driver.get("https://uatums.digivarsity.com/");
	             
	             //Maximizing window
	             driver.manage().window().maximize();
	             
			        // login to new website 
			     driver.findElement(By.id("UserName")).sendKeys("admin");
			     driver.findElement(By.id("Password")).sendKeys("tl@20201");
			     driver.findElement(By.className("blue")).click();
			     System.out.println("Logged IN Successfully");
			     Thread.sleep(1000);
			
			 
			      //Navigate to web page
                 //driver.get("https://ums.suonline.in/Home/Index?data=F4UBqMqVjss%3d");
			     //driver.get("https://ums.suonline.in/Home/Index?data=F4UBqMqVjss%3d");
		           Thread.sleep(1000);
		           
		           //Fee Management
		           driver.findElement(By.xpath("//*[@id=\"mn_801\"]")).click();
		           Thread.sleep(1000);
		           System.out.println("Fee Management Menu");
		           
		           //CATB Process
		           driver.findElement(By.xpath("//*[@id=\"mn_1175\"]/span[1]")).click();
		           Thread.sleep(1000);
		           System.out.println("CATB Process");
		           
		           //CATB Billing/Reconcilliation
		           driver.findElement(By.xpath("//*[@id=\"mn_1178\"]/span")).click();
		           Thread.sleep(1000);
		           System.out.println("CAT B Billing");

		           
                  //University Select
                  WebElement univ2 = driver.findElement(By.xpath("//*[@id=\"univ_id\"]"));
                  univ2.sendKeys("UAT University");
                  Thread.sleep(1000);
		          System.out.println("Univerity");
		          
		          //Part Select 
		          WebElement part = driver.findElement(By.xpath("//*[@id=\"PART\"]"));
		          part.sendKeys("Part 1");
		          Thread.sleep(1000);
		          System.out.println("Part is Selected");
		          
		          //For status has been selected 
		          WebElement status1 = driver.findElement(By.xpath("//*[@id=\"statussearch\"]"));
		          status1.sendKeys("Exited");
		          Thread.sleep(1000);
		          System.out.println("Status has bee selected");
                  
		          // Count Type 
		          driver.findElement(By.xpath("//*[@id=\"myfrm\"]/div/div/div[2]/div[1]/div/div[1]/label")).click();
		          Thread.sleep(1000);
		          System.out.println("Amount is Selected");
		          
		          // Count Type Students
		          driver.findElement(By.xpath("//*[@id=\"myfrm\"]/div/div/div[2]/div[1]/div/div[2]/label")).click();
		          Thread.sleep(1000);
		          System.out.println("Students is Selected");
		          
		          
		          // Search Functionality 
		          driver.findElement(By.xpath("//*[@id=\"myfrm\"]/div/div/div[2]/div[2]/button[1]")).click();
		          Thread.sleep(1000);
		          System.out.println("Search is");
		          
		          // Export all data 
		          driver.findElement(By.xpath("//*[@id=\"exportBtn\"]")).click();
		          Thread.sleep(1000);
		          System.out.println("Export data");
		           
        
	   } catch (Exception e) {}
	  
  }
  

  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
