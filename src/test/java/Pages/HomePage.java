package Pages;

import HerpelMethod.ElementsMethod;
import HerpelMethod.JavascriptHelpers;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage {
     // 1. Am nevoie de un webdrive
    //  2. Am nevoie de un constructor
    //  3. Declaram elementele
    //4. Ca sa ma pot folosi de helpuri, de metodele de ajutor, trebuie sa le declar ( ElementsMethod)
    // 5. Dupa ce am adus ElementsMethod trebuie sa il initializez prin this.driver... linia 23
    // 6. Pagine HOme Page pt a putea fi folosita trebuie sa creem un obiect pe care sa il initializam
//1
    WebDriver driver;
    //3-4
    ElementsMethod elementsMethod;
    JavascriptHelpers javascriptHelpers;

//2
    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.elementsMethod = new ElementsMethod(driver);
        this.javascriptHelpers = new JavascriptHelpers(driver);

    }
// identificam Weblementele specifice pt pagina asta
    @FindBy(xpath ="//h5")
    List<WebElement> practiceFormElement;

    //Facem metode specifice pt pagina
public void goToDesiredMenu (List<WebElement>elementList, String menu){

//  javascriptHelpers.scrollDown(400);
    elementsMethod.selectElementFromListbyText(elementList,menu);
}

}
