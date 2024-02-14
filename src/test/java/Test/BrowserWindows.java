package Test;

import HerpelMethod.ElementsMethod;
import HerpelMethod.JavaScriptMethod;
import Pages.CommonPage;
import Pages.HomePage;
import ShareData.ShareData;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class BrowserWindows extends ShareData {

//    public WebDriver driver;
//    JavaScriptMethod javaScriptMethod;
//    ElementsMethod elementsMethod;
    HomePage homePage;
    CommonPage commonPage;


    @Test
//definim metoda / metoda de test
    public void automationmethod() {

        //deschide un browser de Chrome

//        driver = new ChromeDriver();
        //accesam o pagina web / apelez o metoda ..de ex cu get
//        driver.get("https://demoqa.com/");

//        javaScriptMethod = new JavaScriptMethod(driver);
//        elementsMethod = new ElementsMethod(driver);
        homePage = new HomePage(getDriver());
        commonPage = new CommonPage(getDriver());


        //facem Browserul in stilul Maximize

//        driver.manage().window().maximize();

//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,400)");
//
//        WebElement alertFrameWindowElement = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
//        alertFrameWindowElement.click();
        homePage.goToDesiredMenu("Alerts, Frame & Windows");

//        WebElement browserElement = driver.findElement(By.xpath("//span[text()='Browser Windows']"));
//        browserElement.click();

        commonPage.goToDesiresubdMenu("Browser Windows");

        WebElement tabButtonElement = getDriver().findElement(By.id("tabButton"));
        tabButtonElement.click();

        // metoda care ne returneaza noua listele
        //getwindows handles returneaza toate taburile deschise in windows / toate windows-urile

        List<String> tablist= new ArrayList<>(getDriver().getWindowHandles());
        getDriver().switchTo().window(tablist.get(1));

        WebElement sampleHeadingElement = getDriver().findElement(By.id("sampleHeading"));
        System.out.println(" Textul din new tab este: " + sampleHeadingElement.getText());
        getDriver().close();


        getDriver().switchTo().window(tablist.get(0));

        WebElement windowsButtonElement = getDriver().findElement(By.id("windowButton"));
        windowsButtonElement.click();

        List<String> windowsList= new ArrayList<>(getDriver().getWindowHandles());
        getDriver().switchTo().window(windowsList.get(1));

        WebElement sampleHeadingWindowElement = getDriver().findElement(By.id("sampleHeading"));
        System.out.println(" Textul din new windows este: " + sampleHeadingWindowElement.getText());

        getDriver().close();
        getDriver().switchTo().window(windowsList.get(0));










    }
}

