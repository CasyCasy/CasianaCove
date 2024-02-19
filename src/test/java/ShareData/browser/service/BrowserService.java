package ShareData.browser.service;

import configFIle.configNode.DriverConfigNode;

public interface BrowserService {

    void openBrowser (DriverConfigNode configNode);

    Object getBrowserOption (DriverConfigNode driverConfigNode);

}
