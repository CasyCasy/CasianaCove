package HerpelMethod;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertMethod {

    WebDriver driver;

    public AlertMethod(WebDriver driver) {
        this.driver = driver;
    }

    public void interractWithAlertOk(){

        Alert alertok = driver.switchTo().alert();
        alertok.accept();
    }

    public void explicitAlertWait (){

        // definim un wait explicit ca sa astepte dupa alerte

        WebDriverWait wait= new WebDriverWait( driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());


    }

    public void interractWithDelayAlert (){

        explicitAlertWait();
        Alert alertDelayok = driver.switchTo().alert();
        alertDelayok.accept();


    }
}
