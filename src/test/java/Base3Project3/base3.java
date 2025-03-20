package Base3Project3;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class base3 {
    public static WebDriver driver;
    String browserstackUserName = "";
    String browserstackAccessKey = "";
    String saucelabsUserName = "";
    String saucelabsAccessKey = "";

    //Step 3 A general WebDriver Setup - holding both local and cloud setup

    public void WebDriverSetup(boolean useCloud,String cloudName,
                               String browserName,String browserVersion,
                               String platformName,String url) throws MalformedURLException {
        if(useCloud==true){
            if(cloudName.equalsIgnoreCase("browserstack")){
                cloudDriverSetup(cloudName,browserstackUserName,browserstackAccessKey,
                        browserName,browserVersion,platformName);
            }
            if(cloudName.equalsIgnoreCase("saucelabs")){
                cloudDriverSetup(cloudName,saucelabsUserName,saucelabsAccessKey,
                        browserName,browserVersion,platformName);

            }
        }
        else{
            localDriverSetup(browserName);
        }
        driver.get(url);
        driver.manage().window().maximize();
    }

    //Step 1 Local WebDriver setup

    public WebDriver localDriverSetup(String browserName){
        if(browserName.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        }
        else if(browserName.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        }
        return driver;
    }


    //step 2 - Cloud WebDriver setup
    public WebDriver cloudDriverSetup(String cloudName,String cloudUserName,
                                      String cloudAccessKey,String browserName,
                                      String browserVersion,String platformName) throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setPlatform(Platform.fromString(platformName));
        cap.setBrowserName(browserName);
        cap.setVersion(browserVersion);

        if(cloudName.equalsIgnoreCase("browserstack")){
            driver = new RemoteWebDriver(new URL("http://"+cloudName+":"+cloudAccessKey+
                    "@hub-cloud.browserstack.com/wd/hub"),cap);

        }
        else if(cloudName.equalsIgnoreCase("saucelabs")){
            driver = new RemoteWebDriver(new URL("http://"+cloudName+":"+cloudAccessKey+
                    "@ondemand.saucelabs.com:80/wd/hub"),cap);
        }
        return driver;
    }


}
