package Test;

import HerpelMethod.AlertMethod;
import HerpelMethod.ElementsMethod;
import HerpelMethod.JavaScriptMethod;
import Pages.CommonPage;
import Pages.HomePage;
import ShareData.ShareData;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class AllerTest  extends ShareData {

   // public WebDriver driver;
    public ElementsMethod elementMethod;
     public AlertMethod alertMethods;
//    JavaScriptMethod javaScriptMethod;

    HomePage homePage;
    CommonPage commonPage;

    @Test
//definim metoda / metoda de test
    public void automationmethod() {
        //deschide un browser de Chrome

       // driver = new ChromeDriver();

        //accesam o pagina web / apelez o metoda ..de ex cu get
       // driver.get("https://demoqa.com/");


        //definim un wait implicit pt un interval de maxim de timp

       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //facem Browserul in stilul Maximize

        //driver.manage().window().maximize();

        elementMethod= new ElementsMethod(getDriver());
       alertMethods = new AlertMethod(getDriver());
//        javaScriptMethod= new JavaScriptMethod(getDriver());
        homePage = new HomePage(getDriver());
        commonPage = new CommonPage(getDriver());

//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,400)");

//       WebElement alertFrameWindowElement = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
//       elementMethod.clickOnElement(alertFrameWindowElement);
//      alertFrameWindowElement.click();
        homePage.goToDesiredMenu("Alerts, Frame & Windows");

//        WebElement alertsubmeniuElement = driver.findElement(By.xpath("//span[text()='Alerts']"));
//        elementMethod.clickOnElement(alertsubmeniuElement);
//       alertsubmeniuElement.click();

        commonPage.goToDesiresubdMenu("Alerts");

        WebElement alertokElement = getDriver().findElement(By.id("alertButton"));
        //alertokElement.click();
        elementMethod.clickOnElement(alertokElement);

        // definim o variabila de ex Alert
        //ne mutam focusul pe alerta

        alertMethods.interractWithAlertOk();
//        Alert alertok = driver.switchTo().alert();
//        alertok.accept();





         WebElement alerDelayokElement = getDriver().findElement(By.id("timerAlertButton"));
         elementMethod.clickOnElement(alerDelayokElement);
        // alerDelayokElement.click();

       // definim un wait explicit ca sa astepte dupa alerte

        alertMethods.interractWithDelayAlert();

//          WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//          wait.until(ExpectedConditions.alertIsPresent());
//        Alert alertDelayok = driver.switchTo().alert();
//        alertDelayok.accept();
//
//        WebElement confirmationAlertElement = driver.findElement(By.id("confirmButton"));
//        confirmationAlertElement.click();
//        Alert confirmationAlert = driver.switchTo().alert();
//        confirmationAlert.dismiss();
//
//
//        WebElement promtalertElement = driver.findElement(By.id("promtButton"));
//        promtalertElement.click();
//
//        Alert promtAlert = driver.switchTo().alert();
//        promtAlert.sendKeys("Casiana");
//        promtAlert.accept();
//
//
   }
}
