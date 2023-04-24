package Framework.AppiumFramework;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;


public class AppiumBasic {
	
	@SuppressWarnings("deprecation")
	@Test
	
	public void AppiumTest() throws MalformedURLException, InterruptedException {
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("EatasamDevice");
		options.setApp("C:\\Users\\ahmedeat\\eclipse-workspace\\DVISuite\\src\\test\\java\\resources\\DVI_Suite™_base.apk");

		
		// options.setCapability("appPackage", "com.rowriter.*");
		//options.setCapability("appActivity", "com.rowriter.*");
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
		driver.manage().timeouts().implicitlyWait(60000, TimeUnit.SECONDS);

		WebElement el1 = driver.findElement(AppiumBy.id("com.rowriter.rotouchandroid:id/dataPathInput"));
		el1.click();
		el1.sendKeys("http://10.241.4.210");
		
		WebElement el3 =  driver.findElement(AppiumBy.id("android:id/button1"));
		el3.click();
		
		
		
		WebElement el4 = driver.findElement(AppiumBy.id("com.rowriter.rotouchandroid:id/username"));
		el4.sendKeys("admin");
		WebElement el5 = driver.findElement(AppiumBy.id("com.rowriter.rotouchandroid:id/password"));
		el5.sendKeys("touch");
		WebElement el8 =   driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"More options\"]"));
		el8.click();
		WebElement el9 =   driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout"));
		el9.click();
		WebElement el10 =   driver.findElement(AppiumBy.id("android:id/button1"));
		el10.click();
		WebElement el11 =   driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"More options\"]"));
		el11.click();
		WebElement el12 =   driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout"));
		el12.click();
		WebElement el13 =   driver.findElement(AppiumBy.id("com.rowriter.rotouchandroid:id/button"));
		el13.click();
		WebElement el14 =   driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"More options\"]"));
		el14.click();
		driver.manage().timeouts().implicitlyWait(60000, TimeUnit.SECONDS);

		WebElement el15 =   driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.LinearLayout"));
		el15.click();
		WebElement el16 =   driver.findElement(AppiumBy.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]"));
		el16.click();
		WebElement el17 =   driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"More options\"]"));
		el17.click();
		driver.manage().timeouts().implicitlyWait(60000, TimeUnit.SECONDS);
		WebElement el18 =   driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[4]/android.widget.LinearLayout"));
		el18.click();
		WebElement el19 =   driver.findElement(AppiumBy.id("android:id/button2"));
		el19.click();
		WebElement el6 = driver.findElement(AppiumBy.id("com.rowriter.rotouchandroid:id/email_sign_in_button"));
	      el6.click();
		WebElement el7 = driver.findElement(AppiumBy.id("com.rowriter.rotouchandroid:id/imageButtona"));
		el7.click();
		
		
			}


}
