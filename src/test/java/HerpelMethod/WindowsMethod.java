package HerpelMethod;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class WindowsMethod {
    WebDriver driver;
    public WindowsMethod(WebDriver driver) {
        this.driver = driver;
    }

    public void switchToOpenedTab() {
        List<String> tabList = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabList.get(1));
    }

    public void switchToMainTab() {
        List<String> tabList = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabList.get(0));
    }

}
