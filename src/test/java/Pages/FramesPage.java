package Pages;

import HerpelMethod.ElementsMethod;
import HerpelMethod.FramesMethod;
import HerpelMethod.JavaScriptMethod;
import HerpelMethod.WindowsMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FramesPage extends CommonPage {

//    public WebDriver driver;
//    public JavascriptMethod javascriptMethod;
//    public FramesMethod framesMethod;
//    public ElementsMethod elementsMethod;
//    public WindowsMethod windowsMethod;
//    public FramesPage (WebDriver driver) {
//        this.driver = driver;
//        this.framesMethod = new FramesMethod(driver);
//        this.javascriptMethod = new JavascriptMethod(driver);
//        this.elementsMethod = new ElementsMethod(driver);
//        this.windowsMethod = new WindowsMethod(driver);
//    }

    @FindBy(id = "frame1")
    private WebElement frame1Element;

    @FindBy(id = "frame2")
    private WebElement frame2Element;

    @FindBy(id = "sampleHeading")
    private WebElement sampleHeadingFrame1Element;

    @FindBy(id = "sampleHeading")
    private WebElement sampleHeadingFrame2Element;

    public FramesPage(WebDriver driver) {
        super(driver);
    }

    public void switchToFrame (String value) {
        switch (value) {
            case "frame1":
                framesMethod.switchToFrame(frame1Element);
            case "frame2":
                framesMethod.switchToFrame(frame2Element);
        }
    }

    public void displayContentOfElement (String value) {
        switch (value) {
            case "frame 1":
                elementsMethod.displayContentOfElement(sampleHeadingFrame1Element);
            case "frame 2":
                elementsMethod.displayContentOfElement(sampleHeadingFrame2Element);
        }
    }

    public void threadSleep (Integer seconds) throws InterruptedException {
        Thread.sleep(seconds);
    }

    public void scroll (Integer x, Integer y) {
        javaScriptMethod.scrollOnWindow(x,y);
    }

}