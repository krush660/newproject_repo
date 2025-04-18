package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class validation_comand {
	
	public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // Creating an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Opening a website (example: Google)
        driver.get("https://www.facebook.com/");
        
        driver .manage().window().maximize();
        
        
        
       driver .findElement(By.name("email")).sendKeys("bdf nxhsd");
       driver .findElement(By.name("pass")).sendKeys("bdf nxhsd");
       driver .findElement(By.name("login")).click();
       
       boolean e =driver.findElement(By.name("email")).isDisplayed();
       boolean e3 =driver.findElement(By.name("email")).isSelected();
       Dimension  e4 =driver.findElement(By.name("login")).getSize();
       String e5 =driver.findElement(By.name("login")).getTagName();
       boolean e1 =driver.findElement(By.name("email")).isEnabled();
       boolean e2 =driver.findElement(By.name("login")).isDisplayed();

       System.out.println(e);
       System.out.println(e1);
       System.out.println(e2);
       System.out.println(e3);
       System.out.println(e4);
       System.out.println(e5);

       String tital=driver.getTitle();
       String url=driver.getCurrentUrl();
       String pagesource=driver.getPageSource();
     
       
       System.out.println("the tital of the faceook is   "+tital);
       System.out.println("the url of the faceook is   "+url);
       System.out.println("the url of the faceook is   "+pagesource);
       

       driver.close();



}
	
}
