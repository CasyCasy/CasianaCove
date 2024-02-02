package Pages;

import HerpelMethod.ElementsMethod;
import HerpelMethod.JavaScriptMethod;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class
     // 1. Am nevoie de un webdrive
    //  2. Am nevoie de un constructor
    //  3. Declaram elementele
    //4. Ca sa ma pot folosi de helpuri, de metodele de ajutor, trebuie sa le declar ( ElementsMethod)
    // 5. Dupa ce am adus ElementsMethod trebuie sa il initializez prin this.driver... linia 23
    // 6. Pagine HOme Page pt a putea fi folosita trebuie sa creem un obiect pe care sa il initializam
HomePage extends CommonPage {
//    WebDriver driver;
//    ElementsMethod elementsMethod;
//    JavascriptMethod javascriptMethod;
//    public HomePage(WebDriver driver) {
//        this.driver = driver;
//        this.elementsMethod = new ElementsMethod(driver);
//        this.javascriptMethod = new JavascriptMethod(driver);
//        PageFactory.initElements(driver, this);
//    }

    // identificam webelementele specifice acestei pagini
    @FindBy(xpath = "//h5")
     List<WebElement> elements;

    @FindBy(xpath = "//p[text()='Consent']")
     WebElement consentElement;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    // facem metode specifice pentru pagina
    public void goToDesiredMenu (String menu) {
        elementsMethod.clickOnElement(consentElement);
        javaScriptMethod.scrollDownOnWindow(400);
        elementsMethod.selectElementFromListbyText(elements, menu);
    }


}
