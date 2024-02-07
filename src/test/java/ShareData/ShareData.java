package ShareData;

import HerpelMethod.ElementsMethod;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class ShareData {

    public WebDriver driver;

    @BeforeMethod
    // este o adnotare care se actoveaza inaintea unei clase de test
    //executa inaintea lui, face toate liniile pe care tu i le-ai zis sa le execute si dupa vine sa curete dupa noi cu un AfterMetod

    public void prepareBrowser()
    {

        driver = new ChromeDriver();
        //accesam o pagina web / apelez o metoda ..de ex cu get

        driver.get("https://demoqa.com/");
        //facem Browserul in stilul Maximize

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @AfterMethod

    public void clearbrowser()
    {

        driver.quit();


    }
}
