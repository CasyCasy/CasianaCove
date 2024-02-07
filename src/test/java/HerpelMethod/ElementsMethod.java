package HerpelMethod;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;
import java.util.List;
import java.util.Scanner;

public class ElementsMethod {

    WebDriver driver;

    JavascriptExecutor js;

    Actions actions;


    public ElementsMethod(WebDriver driver) {
    // this se refera la cel ce se afla in interiorul clasei
        this.driver = driver;
        js = (JavascriptExecutor) driver;

       this.actions = new Actions( driver);
       //aici instantiem obiectul de newActions si in interiorul parantezelor, constructorul cere driverul
    }


    public void clickOnElement(WebElement element) {
        element.click();
    }

    public void fillElement(WebElement element, String value){
        element.sendKeys(value);
    }

    public void displayContentOfElement(WebElement element){
        System.out.println("Textul din element este: " + element.getText());
    }

    public void uploadPicture (WebElement element){
        File file = new File("src/test/resources/1.png");
        element.sendKeys(file.getAbsolutePath());

    }

    public void fillElementWithActions(WebElement webElement, String value){
        actions.sendKeys(value).build();
        waitVisibilityElement(webElement);
        actions.sendKeys(Keys.ENTER).perform();
        //daca lasam asa metoda nu va functiona pt ca el nu va astepta sa dea click acolo, ar trebui un wait ceva

    }

// parametrii metodei "WebElement" webElement
    public void waitVisibilityElement (WebElement webElement){

        // wait explicit pt a astepta vizibilitatea unui element

        WebDriverWait wait= new WebDriverWait( driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }



    public void selectElementFromListbyText(List<WebElement> elementsList, String value){
        for ( int i=0; i <elementsList.size(); i ++) {
            if (elementsList.get(i).getText().equals(value)) {
                clickOnElement(elementsList.get(i));
                break;
            }
        }

    }
// parcurg lista de stringuri
    //parcurg lista de webelementuri
    //daca webelementul este = cu o valoare din lista atunci o sa dea click
    public void clickMultipleValues (List <WebElement> webElements, List<String> list){
        for (String value: list){
            for (WebElement webElement: webElements){
                if (webElement.getText().equals(value)){
                    webElement.click();
                }
            }
        }
    }
    public void fillMultipleValues (WebElement webElement, List<String> list){

        for (String value:list){webElement.sendKeys(value);
            webElement.sendKeys(Keys.ENTER);
        }

}


}
