package Pages;

import HerpelMethod.ElementsMethod;
import HerpelMethod.JavaScriptMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class PracticeFormPage extends CommonPage {

//    WebDriver driver;
//    ElementsMethod elementsMethod;
//    JavascriptExecutor js;



//    public PracticeFormPage(WebDriver driver) {
//
////        this.driver = driver;
////        this.elementsMethod = new ElementsMethod(driver);
////        PageFactory.initElements(driver, this);
//
//    }
     @FindBy(id = "firstName")
    private WebElement firstNameElement;

    @FindBy(id="lastName")
    private WebElement lastNameElement;
    @FindBy(id="userEmail")
    private WebElement emailElement;
     @FindBy(css = "input[placeholder='Mobile Number']")
     private WebElement mobileElement;


    @FindBy(id="uploadPicture")
    private WebElement pictureElement;

    @FindBy(xpath = "//label[@for='gender-radio-1']")
    private WebElement MaleElement;
    @FindBy(xpath = "//label[@for='gender-radio-2']")
    private WebElement FemaleElement;
    @FindBy(xpath = "//label[@for='gender-radio-3']")
    private WebElement OtherElement;

     @FindBy(id="currentAddress")
     private WebElement adressElement;

    @FindBy(id="react-select-3-input")
    private WebElement stateElement;

    @FindBy(id="react-select-4-input")
    private WebElement cityElement;

    @FindBy(id="submit")
    private WebElement submitElement;

    @FindBy(xpath = "//label[@for='hobbies-checkbox-1']")
    private WebElement SportHobbiesElement;
    @FindBy(xpath = "//label[@for='hobbies-checkbox-2']")
    private  WebElement ReadingHobbiesElement;
     @FindBy(xpath = "//label[@for='hobbies-checkbox-3']")
     private WebElement MusicHobbiesElement;

//    @FindBy(xpath = "//div[@id='subjectsContainer']")
//    WebElement subjectElement;

    @FindBy(id="subjectsInput")
    private WebElement subjectElement;

    public PracticeFormPage(WebDriver driver) {
        super(driver);
    }


    public void completeFirstRegion (String firstname, String lastname, String email, String address, String mobileno){

    elementsMethod.fillElement(firstNameElement, firstname);
    elementsMethod.fillElement(lastNameElement, lastname);
    elementsMethod.fillElement(emailElement, email);
    elementsMethod.fillElement(adressElement, address);
    elementsMethod.fillElement(mobileElement, mobileno);
}

public void selectGender (String gender){

    switch (gender){
        case "Male":
            elementsMethod.clickOnElement(MaleElement);
            break;
        case "Female":
            elementsMethod.clickOnElement(FemaleElement);
            break;
        case "Other":
            elementsMethod.clickOnElement(OtherElement);
            break;

    }
}
public void completeSubject (String subject){
    elementsMethod.clickOnElement(subjectElement);
    elementsMethod.fillElementWithActions(subjectElement,subject);


}

public void completeSubjectWithList (List<String> list){
    elementsMethod.clickOnElement(subjectElement);
    elementsMethod.fillMultipleValues(subjectElement,list);
}
public void completeHobies (List <String> hobbies ){
    List <WebElement> hobbiesElement = new ArrayList<>();
    hobbiesElement.add(SportHobbiesElement);
    hobbiesElement.add(ReadingHobbiesElement);
    hobbiesElement.add(MusicHobbiesElement);
    elementsMethod.clickMultipleValues(hobbiesElement, hobbies);

    //javaScriptMethod.scrollOnWindow (0, 400);

}
}