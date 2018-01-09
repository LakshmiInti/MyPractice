import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Hello {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.ie.driver", "E:\\Selenium\\IEDriverServer_x64_2.53.1\\IEDriverServer.exe");

WebDriver  driver= new InternetExplorerDriver();
driver.get("https://pdt-ardweb.swacorp.com/app_ard/apf/init/login?SITE=AWNBAWNB&LANGUAGE=US&MARKETS=ARDW_PDT_INTRA,ARDW_");
	driver.findElement(By.id("overridelink")).click();
	Thread.sleep(2000);
	driver.findElement(By.name("USER_ALIAS")).sendKeys("T1DAL982");;
	driver.findElement(By.id("eusermanagement_login_logi_PASSWORD_id_input")).sendKeys("2Amadeus");;
	driver.findElement(By.id("eusermanagement_login_logi_signin_id"));
	}

}
