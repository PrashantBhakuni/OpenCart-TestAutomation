package prashantbhakuni.TestComponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

	protected WebDriver driver;
	public void initializeDriver() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")
				+"\\src\\main\\java\\prashantbhakuni\\Resources\\GlobalData.properties");
		prop.load(fis);
		String browserName = System.getProperty("browser")!=null?System.getProperty("browser"):prop.getProperty("browser");
		
		if (browserName.contains("chrome")) {
			driver = new ChromeDriver();
		}
		
		else if (browserName.contains("edge")) {
			driver = new EdgeDriver();
		}
		
		else if(browserName.contains("firefox")) {
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
	}
	
	@BeforeMethod
	public void launchWebsite() throws IOException {
		initializeDriver();
		driver.get("https://awesomeqa.com/ui/index.php?route=common/home");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
