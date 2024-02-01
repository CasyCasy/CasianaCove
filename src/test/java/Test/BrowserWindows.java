package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class BrowserWindows {

    public WebDriver driver;

    @Test
//definim metoda / metoda de test
    public void automationmethod() {

        //deschide un browser de Chrome

        driver = new ChromeDriver();
        //accesam o pagina web / apelez o metoda ..de ex cu get
        driver.get("https://demoqa.com/");


        //facem Browserul in stilul Maximize

        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");

        WebElement alertFrameWindowElement = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
        alertFrameWindowElement.click();

        WebElement browserElement = driver.findElement(By.xpath("//span[text()='Browser Windows']"));
        browserElement.click();

        WebElement tabButtonElement = driver.findElement(By.id("tabButton"));
        tabButtonElement.click();

        // metoda care ne returneaza noua listele
        //getwindows handles returneaza toate taburile deschise in windows / toate windows-urile

        List<String> tablist= new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tablist.get(1));

        WebElement sampleHeadingElement = driver.findElement(By.id("sampleHeading"));
        System.out.println(" Textul din new tab este: " + sampleHeadingElement.getText());
        driver.close();


        driver.switchTo().window(tablist.get(0));

        WebElement windowsButtonElement = driver.findElement(By.id("windowButton"));
        windowsButtonElement.click();

        List<String> windowsList= new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windowsList.get(1));

        WebElement sampleHeadingWindowElement = driver.findElement(By.id("sampleHeading"));
        System.out.println(" Textul din new windows este: " + sampleHeadingWindowElement.getText());

        driver.close();
        driver.switchTo().window(windowsList.get(0));










    }
}

