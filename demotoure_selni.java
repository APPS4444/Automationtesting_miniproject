package Seleniumweb;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class demotoure_selni {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the username");
		String un = sc.next();
		
		
		System.out.println("enter the password");
		
		String pass = sc.next();
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\hp\\Desktop\\Seleniumjar\\geckodriver.exe");

		WebDriver W= new FirefoxDriver();
		
		//2 open url
		W.get(" https://www.google.com/"); 
	
         W.navigate().to("http://demo.guru99.com/test/newtours/index.php");
		
		//W.get("http://demo.guru99.com/test/newtours/index.php");
		
		System.out.println("webpage is launch");
		
		System.out.println("title of page" +W.getTitle());
		System.out.println("URL  " +W.getCurrentUrl() );
		
		Thread.sleep(2000);
		
		System.out.println("webpage is launch");
		
		
		if(W.getTitle().equals("Welcome: Mercury Tours"))
		{
		//3 username
		W.findElement(By.name("userName")).sendKeys(un);//for textfield we use sendkey
		
		
		//4 password
		W.findElement(By.name("password")).sendKeys(pass);
		
		//5 click submit
		W.findElement(By.name("submit")).click();
		System.out.println("Login done");
	}
		else
		{
			System.out.println("login failed");
		}
	
		String apps = W.findElement(By.xpath("//tbody//tr//td//h3")).getText();
		System.out.println(apps);
		String apps1 = W.findElement(By.xpath("//b[contains(text(),'Thank you for Loggin.')]")).getText();
		System.out.println(apps1);
		
	
		
		System.out.println("title of page" +W.getTitle());
		System.out.println("URL  " +W.getCurrentUrl() );
		
		
		if(W.getTitle().equals("Login: Mercury Tours"))
		{
			W.findElement(By.linkText("SIGN-OFF")).click();
			System.out.println("logoutdone");
		}
		else
		{
			System.out.println("logout failed");
		}
	//	W.navigate().back();
		
		
		System.out.println("signon excute");
		W.findElement(By.linkText("SIGN-ON")).click();
		W.navigate().refresh();
		Thread.sleep(200);
		
		System.out.println("register excute");
		W.findElement(By.linkText("REGISTER")).click();
		W.navigate().refresh();
		Thread.sleep(200);
		
		
		System.out.println("support excute");
		W.findElement(By.linkText("SUPPORT")).click();
		W.navigate().refresh();
		Thread.sleep(200);
		
		System.out.println("contact excute");
		W.findElement(By.linkText("CONTACT")).click();
		System.out.println("title  " +W.getTitle());
		W.navigate().refresh();
		Thread.sleep(2000);
		
		System.out.println("home excute");
		W.findElement(By.linkText("Home")).click();
		W.navigate().refresh();
		//W.navigate().back();
		Thread.sleep(200);
		
		System.out.println("flights excute");
		W.findElement(By.linkText("Flights")).click();
	W.navigate().refresh();
	//	W.navigate().back();
		Thread.sleep(200);
		
		System.out.println("hotels excute");
		W.findElement(By.linkText("Hotels")).click();
		
		W.navigate().refresh();
		//W.navigate().back();
        Thread.sleep(200);
		
        System.out.println("car excute");
		W.findElement(By.linkText("Car Rentals")).click();
		
		W.navigate().refresh();
		//W.navigate().back();
		Thread.sleep(200);
		
		System.out.println("cruises excute");
		W.findElement(By.linkText("Cruises")).click();
		
		W.navigate().refresh();
		//W.navigate().back();
		Thread.sleep(200);
		
		System.out.println("Destinations excute");
		W.findElement(By.linkText("Destinations")).click();
		W.navigate().refresh();
		//W.navigate().back();
		
List<WebElement> L= W.findElements(By.tagName("a"));
		
		System.out.println("total " +L.size());
         
		Thread.sleep(2000);
		
        System.out.println("file upload");
     	W.findElement(By.partialLinkText("Seleni")).click();
		Thread.sleep(2000);
		W.findElement(By.linkText("File Upload")).click();
     	W.findElement(By.id("uploadfile_0")).sendKeys("C:\\Users\\hp\\Desktop\\APARNA\\image.jpg");
     	
     	W.findElement(By.id("terms")).click();
     	W.findElement(By.name("send")).click();
     	
     	W.navigate().refresh();
     	
		System.out.println("draganddrop");
		W.findElement(By.partialLinkText("Seleni")).click();
		Thread.sleep(2000);
		W.findElement(By.linkText("Drag and Drop Action")).click();
	
		
	
       Actions a = new Actions(W);
       
 		
 	WebElement bank = W.findElement(By.partialLinkText("BANK"));
 		WebElement drop1 = W.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/ol[1]/li[1]"));
 		a.dragAndDrop(bank, drop1).build().perform();
 		
 		WebElement amt = W.findElement(By.xpath("//body/section[@id='g-container-main']/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[4]/a[1]"));
 		WebElement drop2 = W.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/ol[1]/li[1]"));
 		a.dragAndDrop(amt, drop2).build().perform();
 WebElement sales = W.findElement(By.partialLinkText("SALES"));
 		WebElement drop3 = W.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/ol[1]/li[1]"));
 		a.dragAndDrop(sales, drop3).build().perform();
 		
 		WebElement amt2 = W.findElement(By.xpath("//body/section[@id='g-container-main']/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]"));
 		WebElement drop4 = W.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/ol[1]/li[1]"));
 		a.dragAndDrop(amt2, drop4).build().perform();
	
		W.navigate().refresh();
		
	
		
		//W.findElement(By.linkText("Insurance Project")).click();
		//W.navigate().refresh();
		
	/*	W.findElement(By.linkText("Agile Project")).click();
		
	W.findElement(By.name("uid")).sendKeys("test");//for textfield we use sendkey
		
		
		//5 password
		W.findElement(By.name("password")).sendKeys("test");
		
		//6 click submit
		W.findElement(By.name("btnLogin")).click();
		Thread.sleep(5000);
		//7 get
		
		Alert a1 = W.switchTo().alert();
		System.out.println(a1.getText());
		
		a1.accept();*/
		
	/*	W.findElement(By.linkText("Bank Project")).click();
		W.navigate().refresh();
		
		W.findElement(By.linkText("Security Project")).click();
		W.navigate().refresh();
		
    	W.findElement(By.linkText("Telecom Project")).click();
		W.navigate().refresh();*/
		
		W.findElement(By.linkText("Payment Gateway Project")).click();
		
	JavascriptExecutor js = (JavascriptExecutor) W;
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		System.out.println("page end");
		
		Thread.sleep(1000);
		
		js.executeScript("window.scrollBy(0,-100)");
		
		System.out.println("page up");
		
		
		System.out.println("title  " +W.getTitle());
		
		Thread.sleep(1000);
		W.findElement(By.xpath("//body/section[@id='three']/div[1]/form[1]/div[1]/div[8]/ul[1]/li[1]/input[1]")).click();
		//W.navigate().refresh();
		//W.navigate().back();//("http://demo.guru99.com/test/newtours/index.php");
	//W.findElement(By.linkText("New Tours")).click();
		W.findElement(By.xpath("//a[contains(text(),'New Tours')]")).click();
       TakesScreenshot t = (TakesScreenshot) W;
		
		File src = t.getScreenshotAs(OutputType.FILE);
		
		Files.copy(src, new File("F:\\Screenshot\\app2156.png"));
		W.navigate().refresh();
		
	}

}
