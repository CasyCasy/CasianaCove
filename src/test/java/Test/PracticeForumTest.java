package Test;


import HerpelMethod.ElementsMethod;
import HerpelMethod.JavascriptHelpers;
import Pages.HomePage;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class PracticeForumTest {

    public WebDriver driver;
    public ElementsMethod elementMethod;

   //JavascriptHelpers javascriptHelpers;
    JavascriptExecutor javascriptExecutor;
     HomePage homePage;

    @Test
//definim metoda / metoda de test
    public void automationmethod () {

        //deschide un browser de Chrome

        driver = new ChromeDriver();

        //accesam o pagina web / apelez o metoda ..de ex cu get
        driver.get("https://demoqa.com/");

        //facem Browserul in stilul Maximize pentru a evita repozitionarea
        //elementele cu marimea default a ferestrei

        driver.manage().window().maximize();
        elementMethod= new ElementsMethod(driver);

        homePage= new HomePage(driver);
        //javascriptHelpers= new JavascriptHelpers(driver);



        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("window.scrollBy(0,400)");



        // declaram un element
        List <WebElement> formElement=driver.findElements(By.xpath("//h5"));

        elementMethod.selectElementFromListbyText(formElement,"Forms");

        //elementMethod.clickOnElement(formElement);


       List<WebElement> practiceFormElement= driver.findElements(By.xpath("//span[text()='Practice Form']"));
        elementMethod.selectElementFromListbyText(practiceFormElement,"Practice Form");

        WebElement firstNameElement=driver.findElement(By.id("firstName"));
        elementMethod.fillElement(firstNameElement, "Mihai");

       WebElement lastNameElement=driver.findElement(By.id("lastName"));
       elementMethod.fillElement(lastNameElement, "Casiana");

       WebElement EmailElement=driver.findElement(By.id("userEmail"));
       elementMethod.fillElement(EmailElement, "casianam@yahoo.com");

       WebElement MobileElement=driver.findElement(By.cssSelector("input[placeholder='Mobile Number']"));
       elementMethod.fillElement(MobileElement, " 0746610111");

       WebElement pictureElement= driver.findElement(By.id("uploadPicture"));
       elementMethod.uploadPicture(pictureElement);


        WebElement MaleElement= driver.findElement(By.xpath("//label[@for='gender-radio-1']"));
        WebElement FemeleElement=driver.findElement(By.xpath("//label[@for='gender-radio-2']"));
        WebElement OtherElement= driver.findElement(By.xpath("//label[@for='gender-radio-3']"));

        List <WebElement> genderElement = new ArrayList<>();
        genderElement.add(MaleElement);
        genderElement.add(FemeleElement);
        genderElement.add(OtherElement);

        elementMethod.selectElementFromListbyText(genderElement, "Female");

//        String genderValue= "Male";
//
//        if(MaleElement.getText().equals(genderValue ))
//        {
//            MaleElement.click();}
//
//        else if (FemeleElement.getText().equals(genderValue)){
//            FemeleElement.click();
//        }
//
//        else if (OtherElement.getText().equals(genderValue)){
//            OtherElement.click();
//        }
//
//

//       WebElement SubjectElement=driver.findElement(By.id("subjectsInput"));
//       String SubjectsValue="Social Studies";
//       SubjectElement.sendKeys(SubjectsValue);
//       SubjectElement.sendKeys((Keys.ENTER));
//
//       WebElement StateElement=driver.findElement(By.id("react-select-3-input"));
//        js.executeScript("arguments[0].click();", StateElement);
//        StateElement.sendKeys("NCR");
//        StateElement.sendKeys(Keys.ENTER);
//
//        WebElement CityElement=driver.findElement(By.id("react-select-4-input"));
//        js.executeScript("arguments[0].click();", CityElement);
//        CityElement.sendKeys("Delhi");
//        CityElement.sendKeys(Keys.ENTER);
//
//        WebElement SubmitElement = driver.findElement(By.id("submit"));
//        js.executeScript("arguments[0].click();", SubmitElement);

    }
}
