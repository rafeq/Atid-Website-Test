package web.basePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Accessories {
    final public static String WOMEN_NAV_LINK = "menu-item-671";
    final public static String SELECT_NAME = "orderby";


    public static void sortByLatest(WebDriver driver) {
        WebElement accessoriesLink = driver.findElement(By.id(WOMEN_NAV_LINK));
        accessoriesLink.click();
        Select objSelect = new Select(driver.findElement(By.name(SELECT_NAME)));
        objSelect.selectByVisibleText("Sort by latest");
    }
}
