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
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class WebTableTest {

    // tip de data specifica Seleniumului "Webdriver-ul. Definim o variabila globala
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

        //facem Browserul in stilul Maximize

        driver.manage().window().maximize();
        javaScriptMethod = new JavaScriptMethod(driver);
        elementsMethod = new ElementsMethod(driver);
        homePage = new HomePage(driver);
        commonPage = new CommonPage(driver);

//        // facem un scroll
//        // 0 este x / 100 este y
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,400)");
//        //declaram un element - acest element este o varianta locala si anume Webelement
//
//        WebElement Elementsfield = driver.findElement(By.xpath("//h5[text()='Elements']"));
//        Elementsfield.click();
        homePage.goToDesiredMenu("Elements");


//        WebElement WebTablefiel = driver.findElement(By.xpath("//span[text()='Web Tables']"));
//        WebTablefiel.click();
        commonPage.goToDesiresubdMenu("Web Tables");

        List<WebElement> tableElement = driver.findElements(By.xpath("//div[@class='rt-tbody']/div/div[@class='rt-tr -even' or @class='rt-tr -odd']"));
        Integer actualTablesize = tableElement.size();


        WebElement Addfield = driver.findElement(By.id("addNewRecordButton"));
        Addfield.click();

        WebElement Firstnamefield = driver.findElement(By.id("firstName"));
        String firstName = "Covasneanu";
        Firstnamefield.sendKeys(firstName);

        WebElement Lastnamefield = driver.findElement(By.id("lastName"));
        String lastName = "Casiana";
        Lastnamefield.sendKeys(lastName);

        WebElement Emailfield = driver.findElement(By.id("userEmail"));
        String userEmail = "Casianam@yahoo.com";
        Emailfield.sendKeys(userEmail);

        WebElement Agefield = driver.findElement(By.id("age"));
        String age = "37";
        Agefield.sendKeys(age);

        WebElement Salaryfield = driver.findElement(By.id("salary"));
        String salary = "2500";
        Salaryfield.sendKeys(salary);

        WebElement Departmentfield = driver.findElement(By.id("department"));
        String department = "HR";
        Departmentfield.sendKeys(department);

        WebElement Submitbutton = driver.findElement(By.id("submit"));
        Submitbutton.click();


        List<WebElement> expctedTableElement = driver.findElements(By.xpath("//div[@class='rt-tbody']/div/div[@class='rt-tr -even' or @class='rt-tr -odd']"));

        Integer expectedTablesize = actualTablesize + 1;
        Assert.assertEquals(expctedTableElement.size(), expectedTablesize);

        String actualTableValue = expctedTableElement.get(3).getText();

        Assert.assertTrue(actualTableValue.contains(firstName));
        Assert.assertTrue(actualTableValue.contains(lastName));
        Assert.assertTrue(actualTableValue.contains(userEmail));
        Assert.assertTrue(actualTableValue.contains(age));
        Assert.assertTrue(actualTableValue.contains(salary));
        Assert.assertTrue(actualTableValue.contains(department));

// Validare

//        List<WebElement > primulElement =driver.findElements(By.xpath("//div[@class='rt-tbody']/div/div[@class='rt-tr -even' or @class='rt-tr -odd']"));
//        Integer actualPrimulElementsize = primulElement.size();
//
//        List<WebElement > expctedTableElement =driver.findElements(By.xpath("//div[@class='rt-tbody']/div/div[@class='rt-tr -even' or @class='rt-tr -odd']"));
//
//        Integer expectedTablesize= actualTablesize+1;
//        Assert.assertEquals(expctedTableElement.size(),expectedTablesize);


    }
}
