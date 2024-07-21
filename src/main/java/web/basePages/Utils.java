package web.basePages;

import org.openqa.selenium.WebDriver;

public class Utils {

    public String getUrlText(WebDriver driver){
        String url = driver.getCurrentUrl();
        return url;
    }
}
