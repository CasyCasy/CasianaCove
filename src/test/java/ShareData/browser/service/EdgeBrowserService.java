package ShareData.browser.service;

import configFIle.configNode.DriverConfigNode;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;

public class EdgeBrowserService  implements  BrowserService{

    private WebDriver driver;
    @Override
    public void openBrowser(DriverConfigNode driverConfigNode) {
        EdgeOptions options= (EdgeOptions) getBrowserOption(driverConfigNode);
        driver = new EdgeDriver(options);
        driver.get(driverConfigNode.url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    public WebDriver getDriver() {
        return driver;
    }

    @Override
    public Object getBrowserOption(DriverConfigNode driverConfigNode) {
        EdgeOptions options = new EdgeOptions();

        if (!driverConfigNode.headelss.isEmpty())
        {
            options.addArguments(driverConfigNode.headelss);
        }

        options.addArguments(driverConfigNode.resolution);

        options.addArguments(driverConfigNode.gpu);
        options.addArguments(driverConfigNode.extentions);

        return options;


    }

}
