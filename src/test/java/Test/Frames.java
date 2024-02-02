package Test;

import HerpelMethod.ElementsMethod;
import HerpelMethod.JavaScriptMethod;
import Pages.CommonPage;
import Pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Frames {

    public WebDriver driver;
    JavaScriptMethod javaScriptMethod;
    ElementsMethod elementsMethod;
    HomePage homePage;
    CommonPage commonPage;

    @Test
//definim metoda / metoda de test
    public void automationmethod() {

        //deschide un browser de Chrome

        driver = new ChromeDriver();
        //accesam o pagina web / apelez o metoda ..de ex cu get
        driver.get("https://demoqa.com/");
        javaScriptMethod = new JavaScriptMethod(driver);
        elementsMethod = new ElementsMethod(driver);
        homePage = new HomePage(driver);
        commonPage = new CommonPage(driver);

        //facem Browserul in stilul Maximize

        driver.manage().window().maximize();

          JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,400)");
//
//        WebElement alertFrameWindowElement = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
//        alertFrameWindowElement.click();
        homePage.goToDesiredMenu("Alerts, Frame & Windows");

//        WebElement frameElement = driver.findElement(By.xpath("//span[text()='Frames']"));
//        frameElement.click();
        commonPage.goToDesiresubdMenu("Frames");

        WebElement frameElement1 = driver.findElement(By.id("frame1"));
        frameElement1.click();

        driver.switchTo().frame(frameElement1);

        WebElement sampleHeadingFrameElement = driver.findElement(By.id("sampleHeading"));
        System.out.println(" Textul din new tab este: " + sampleHeadingFrameElement.getText());

        // ne duce cu focusul pe pagina principala
        driver.switchTo().defaultContent();

        WebElement frameElement2 = driver.findElement(By.id("frame2"));
        frameElement2.click();

        js.executeScript("window.scrollBy(200,200)");
}

}
