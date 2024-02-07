package HerpelMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FramesMethod {

    WebDriver driver;
    public FramesMethod(WebDriver driver) {
        this.driver = driver;
    }

    public void switchToFrame(WebElement element) {
        driver.switchTo().frame(element);
    }

    public void switchToMainContent() {
        driver.switchTo().defaultContent();
    }
}
