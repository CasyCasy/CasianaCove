package HerpelMethod;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptMethod {


    WebDriver driver;
    WebElement element;
    JavascriptExecutor javascriptExecutor;


    public JavaScriptMethod(WebDriver driver) {
        this.driver = driver;
        this.javascriptExecutor = (JavascriptExecutor) driver;

    }

    public void scrollOnWindow (int x, int y) {
        javascriptExecutor.executeScript("window.scrollBy(" + x + "," + y + ")");
    }

    public void scrollDownOnWindow (int y) {
        scrollOnWindow(0, y);
    }

    public void scrollRightOnWindow (int x) {
        scrollOnWindow(x, 0);
    }

    public void forceClick(WebElement element) {
        javascriptExecutor.executeScript("arguments[0].click();", element);
    }
}
