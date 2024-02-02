package HerpelMethod;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.util.List;

public class ElementsMethod {

    WebDriver driver;

    public ElementsMethod(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnElement(WebElement element) {

        element.click();
    }

    public void fillElement(WebElement element, String value){

        element.sendKeys(value);
    }

    public void uploadPicture (WebElement element){
        File file = new File("src/test/resources/1.png");
        element.sendKeys(file.getAbsolutePath());

    }

    public void selectElementFromListbyText(List<WebElement> elementsList, String value){
        for ( int i=0; i <elementsList.size(); i ++){
            if (elementsList.get(i).getText().equals(value)){
                clickOnElement(elementsList.get(i));
                break;
            }

        }

    }
}
