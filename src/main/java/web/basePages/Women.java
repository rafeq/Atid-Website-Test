package web.basePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Women {
    final public static String WOMEN_NAV_LINK = "menu-item-267";
    final public static String PRODUCT_XPATH = "//*[@id=\"main\"]/div/ul/li[1]/div[1]/a/img";
    final public static String ADDITIONAL_INFORMATION_ID = "tab-title-additional_information";
    final public static String ADDITIONAL_INFORMATION_TAB_ID = "tab-additional_information";
    final public static String REVIEW_TAB_ID = "tab-title-reviews";
    final public static String REVIEW_3_XPATH = "//*[@id=\"commentform\"]/div/p/span/a[3]";
    final public static String COMMENT_ID = "comment";
    final public static String AUTHOR_ID = "author";
    final public static String EMAIL_ID = "email";
    final public static String SUBMIT_ID = "submit";


    public static String additionalInformation(WebDriver driver){
        WebElement womenLink = driver.findElement(By.id(WOMEN_NAV_LINK));
        womenLink.click();
        WebElement product = driver.findElement(By.xpath(PRODUCT_XPATH));
        product.click();
        WebElement additionalInformationButton = driver.findElement(By.id(ADDITIONAL_INFORMATION_ID));
        additionalInformationButton.click();
        WebElement additionalInformationTab = driver.findElement(By.id(ADDITIONAL_INFORMATION_TAB_ID));
        String text = additionalInformationTab.getText().toString();
        return text;
    }


    public static void addReviewProduct(WebDriver driver){
        WebElement womenLink = driver.findElement(By.id(WOMEN_NAV_LINK));
        womenLink.click();
        WebElement product = driver.findElement(By.xpath(PRODUCT_XPATH));
        product.click();
        WebElement addReviewButton = driver.findElement(By.id(REVIEW_TAB_ID));
        addReviewButton.click();
        WebElement reviewButton = driver.findElement(By.xpath(REVIEW_3_XPATH));
        reviewButton.click();
        WebElement comment = driver.findElement(By.id(COMMENT_ID));
        comment.sendKeys("good");
        WebElement author = driver.findElement(By.id(AUTHOR_ID));
        author.sendKeys("rafe");
        WebElement email = driver.findElement(By.id(EMAIL_ID));
        email.sendKeys("rafe@gmail.com");
        WebElement submit = driver.findElement(By.id(SUBMIT_ID));
        submit.click();
    }
}
