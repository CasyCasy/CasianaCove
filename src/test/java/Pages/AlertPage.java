package Pages;

import HerpelMethod.AlertMethod;
import HerpelMethod.ElementsMethod;
import HerpelMethod.JavaScriptMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class AlertPage extends CommonPage
{
//    WebDriver driver;
//    ElementsMethod elementsMethod;
//    JavaScriptMethod javascriptMethod;
//    AlertMethod alertMethod;

//    public AlertPage (WebDriver driver) {
//        this.driver = driver;
//        this.elementsMethod = new ElementsMethod(driver);
//        this.javascriptMethod = new JavaScriptMethod(driver);
//        this.alertMethod = new AlertMethod(driver);
//        PageFactory.initElements(driver, this);
//    }

    @FindBy (id = "alertButton")
    private WebElement alertOkElement;

    @FindBy (id = "timerAlertButton")
    private WebElement alertDelayOkElement;

    @FindBy (id = "confirmButton")
    private WebElement alertConfirmationElement;

    @FindBy (id = "promtButton")
    private WebElement alertPromptButtonElement;

    public AlertPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnAlertFromList (String value) {
        switch (value) {
            case "alert ok":
                elementsMethod.clickOnElement(alertOkElement);
                break;
            case "alert ok with delay":
                elementsMethod.clickOnElement(alertDelayOkElement);
                break;
            case "alert confirmation":
                elementsMethod.clickOnElement(alertConfirmationElement);
                break;
            case "alert prompt button":
                elementsMethod.clickOnElement(alertPromptButtonElement);
                break;
        }
    }

    public void interactWithAlert () {
        alertMethod.interractWithAlertOk();
    }
    public void interactWithAlertDelay () {
        alertMethod.interractWithDelayAlert();
    }
    public void stopInteractingWithAlertDelay () {
        alertMethod.stopInteractingWithAlertDelay();
    }
    public void sendValueToAlertButton (String value) {
        alertMethod.sendKeysToAlertButton(value);
    }
}