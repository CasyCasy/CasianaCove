package Pages;

import HerpelMethod.AlertMethod;
import HerpelMethod.ElementsMethod;
import HerpelMethod.JavaScriptMethod;
import HerpelMethod.WindowsMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class BrowserPage extends CommonPage {
//    WebDriver driver;
//    ElementsMethod elementsMethod;
//    JavascriptMethod javascriptMethod;
//    AlertsMethod alertsMethod;
//    WindowsMethod windowsMethod;
//
//    public BrowserPage (WebDriver driver) {
//        this.driver = driver;
//        this.elementsMethod = new ElementsMethod(driver);
//        this.javascriptMethod = new JavascriptMethod(driver);
//        this.alertsMethod = new AlertsMethod(driver);
//        this.windowsMethod = new WindowsMethod(driver);
//        PageFactory.initElements(driver, this);
//    }

    @FindBy(id = "tabButton")
    private WebElement tabButtonElement;

    @FindBy(id = "sampleHeading")
    private WebElement sampleHeadingElement;

    @FindBy(id = "windowButton")
    private WebElement windowsButtonElement;

    @FindBy(id = "sampleHeading")
    private WebElement sampleHeadingWindowElement;

    public BrowserPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnElement () {
        elementsMethod.clickOnElement(tabButtonElement);
    }

    public void scrollWithJava (Integer x, Integer y) {javaScriptMethod.scrollOnWindow(x, y);}

    public void switchToOpenedTab () {
        List<String> tabList = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabList.get(1));
    }

    public void displayContentOfTab () {
        elementsMethod.displayContentOfElement(sampleHeadingElement);
    }

    public void displayContentOfWindow () {
        elementsMethod.displayContentOfElement(sampleHeadingWindowElement);
    }

    public void closeDriver () {
        driver.close();
    }

    public void switchToMainTab () {
        windowsMethod.switchToMainTab();
    }

    public void clickOnElement (String value) {
        switch (value) {
            case "tab button":
                elementsMethod.clickOnElement(tabButtonElement);
                break;
            case "windows button":
                elementsMethod.clickOnElement(windowsButtonElement);
                break;
        }
    }











}
