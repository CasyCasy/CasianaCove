package ShareData.browser;

import ShareData.browser.service.ChromeBrowserService;
import ShareData.browser.service.EdgeBrowserService;
import configFIle.ConfigFIle;
import configFIle.configNode.ConfigurationNode;
import org.openqa.selenium.WebDriver;

import java.util.Locale;

public class BrowserFactory
{
    public WebDriver getBrowserFactory ()
    {

        String  ciCd = System.getProperty("ciCd");

        String browser = System.getProperty("browser").toLowerCase(Locale.ROOT);

        System.out.println("Uita-te aici !" + browser);

        ConfigurationNode configurationNode = ConfigFIle.createConfigNode(ConfigurationNode.class);
        if (Boolean.parseBoolean(ciCd))

        {
            configurationNode.driverConfigNode.headelss = "--headless";
        }
        else

        {
            browser = configurationNode.driverConfigNode.localBrowser;


        }

        switch (browser)
        {
            case BrowserType.BROWSER_CHROME:
                ChromeBrowserService chromeService = new ChromeBrowserService();
                chromeService.openBrowser(configurationNode.driverConfigNode);
                return chromeService.getDriver();

            case BrowserType.BROWSER_EDGE:
                EdgeBrowserService edgeService = new EdgeBrowserService();
                edgeService.openBrowser(configurationNode.driverConfigNode);
                return edgeService.getDriver();

        }
        return null;


    }
}
