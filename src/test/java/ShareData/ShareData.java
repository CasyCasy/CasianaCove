package ShareData;

import HerpelMethod.ElementsMethod;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class ShareData {
    public WebDriver driver;

    @BeforeMethod

    public void prepareBrowser(){

        driver = new ChromeDriver();
        //accesam o pagina web / apelez o metoda ..de ex cu get
        driver.get("https://demoqa.com/");

        //facem Browserul in stilul Maximize

        driver.manage().window().maximize();




    }
}
