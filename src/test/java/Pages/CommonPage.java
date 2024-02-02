package Pages;

import HerpelMethod.ElementsMethod;
import HerpelMethod.JavaScriptMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CommonPage {

    WebDriver driver;
    ElementsMethod elementsMethod;
    JavaScriptMethod javaScriptMethod;
// atunci cand creez un contructor, daca pun toti parametrii de mai sus mi-i va pune ca elemente, noi avem neoie de driver si celelalte le initializam separat
    public CommonPage(WebDriver driver) {
        this.driver = driver;
        this.elementsMethod = new ElementsMethod(driver);
        this.javaScriptMethod = new JavaScriptMethod(driver);
        PageFactory.initElements(driver, this);
    }

    // identificam Weblementele specifice pt sub pagina asta
    @FindBy(xpath ="//span[@class='text']")
    List<WebElement> elements;

    //Facem metode specifice pt pagina

    public void goToDesiresubdMenu (String submenu) {
        javaScriptMethod.scrollDownOnWindow(400);
        elementsMethod.selectElementFromListbyText(elements, submenu);
    }





}
