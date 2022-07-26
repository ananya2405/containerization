package ContainerTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class newTest {
	
	@Test
	public void test1() throws MalformedURLException{
		//Create a WebDriver instance, named driver, with the FirefoxDriver().
	//System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//Drivers//geckodriver.exe");	
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName(BrowserType.FIREFOX);
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444"), cap);
        driver.get("https://www.training-support.net");

        //Get the title of the page using driver.getTitle() and print out the title.
        System.out.println("The title of the page = " + driver.getTitle());

        //Use findElement() with xpath() to find and click the "About Us" link on the page.
        driver.findElement(By.xpath("//a[@id='about-link']")).click();

        //Print the title of the new page that open when the link is clicked.
        System.out.println("The title of the new page is = " + driver.getTitle());

        driver.quit();
	}

}
