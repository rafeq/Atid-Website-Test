package web.basePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Store {

    final public static String STORE_NAV_LINK = "menu-item-45";
    final public static String SLIDER_XPATH = "//*[@id=\"woocommerce_price_filter-2\"]/form/div/div[1]/div";
    final public static String SUBMIT_CLASS = "button";

    public static void storeLinkClick(WebDriver driver){
        WebElement storeLink = driver.findElement(By.id(STORE_NAV_LINK));
        storeLink.click();
    }

    public static void filterByPrice(WebDriver driver){
        storeLinkClick(driver);
        WebElement slider = driver.findElement(By.xpath(SLIDER_XPATH));
        Actions move = new Actions(driver);
        Action action = (Action) move.dragAndDropBy(slider, 4, 0).build();
        action.perform();
        WebElement submit = driver.findElement(By.className(SUBMIT_CLASS));
        submit.click();
    }

}
