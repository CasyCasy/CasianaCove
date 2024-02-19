package ShareData;

import HerpelMethod.ElementsMethod;
import ShareData.browser.BrowserFactory;
import configFIle.ConfigFIle;
import configFIle.configNode.ConfigurationNode;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
//import sun.security.provider.ConfigFile;

import java.time.Duration;

public class ShareData {

    private  WebDriver driver;

    @BeforeMethod
    // este o adnotare care se activeaza inaintea unei clase de test
    //executa inaintea lui, face toate liniile pe care tu i le-ai zis sa le execute si dupa vine sa curete dupa noi cu un AfterMetod

    public void prepareBrowser()
    {

        driver = new BrowserFactory().getBrowserFactory();

//        ConfigurationNode configurationNode = ConfigFIle.createConfigNode(ConfigurationNode.class);
//        driver = new ChromeDriver();
//        driver.get(configurationNode.driverConfigNode.url);
//
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @AfterMethod

    public void clearbrowser()
    {

        driver.quit();

    }

    public WebDriver getDriver() {
        return driver;
    }
}
