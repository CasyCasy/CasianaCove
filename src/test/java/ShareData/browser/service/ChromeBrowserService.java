package ShareData.browser.service;

import configFIle.configNode.DriverConfigNode;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ChromeBrowserService implements  BrowserService{

    private WebDriver driver;
    @Override
    public void openBrowser(DriverConfigNode driverConfigNode) {

        ChromeOptions options = (ChromeOptions) getBrowserOption(driverConfigNode);
        driver = new ChromeDriver(options);
        driver.get(driverConfigNode.url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @Override
    public Object getBrowserOption(DriverConfigNode driverConfigNode) {
        ChromeOptions options= new ChromeOptions();

        if (!driverConfigNode.headelss.isEmpty())
        {
            options.addArguments(driverConfigNode.headelss);
        }
        options.addArguments(driverConfigNode.resolution);
        options.addArguments(driverConfigNode.gpu);
        options.addArguments(driverConfigNode.extentions);
        return options;
    }

    public WebDriver getDriver() {
        return driver;
    }
}
