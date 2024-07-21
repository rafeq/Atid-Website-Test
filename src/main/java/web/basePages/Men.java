package web.basePages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Men {
    final public static String MEN_NAV_LINK = "menu-item-266";
    final public static String PRODUCT_XPATH = "//*[@id=\"main\"]/div/ul/li[1]/div[2]/a/h2";
    final public static String ADD_TO_CART_NAME = "add-to-cart";
    final public static String VIEW_CART_XPATH = "//*[@id=\"main\"]/div/div[1]/div/a";
    final public static String PRODUCT_IN_CART_XPATH = "//*[@id=\"post-39\"]/div/div/section[2]/div/div/div/div/div/div/div/form/table/tbody/tr[1]/td[3]/a";
    final public static String PRODUCT_IN_CART_TEXT = "ATID Blue Shoes";
    final public static String COUPON_CODE_LABEL_ID = "coupon_code";
    final public static String APPLY_COUPON_BUTTON_NAME = "apply_coupon";
    final public static String COUPON_TEXT = "Coupon 123456 does not exist!";
    final public static String COUPON_TEXT_XPATH = "//*[@id=\"post-39\"]/div/div/section[2]/div/div/div/div/div/div/div/div[1]";
    public static String checkMenAddedProductToCart(WebDriver driver){
        WebElement menLink = driver.findElement(By.id(MEN_NAV_LINK));
        menLink.click();
        WebElement product = driver.findElement(By.xpath(PRODUCT_XPATH));
        product.click();
        WebElement addToCartButton = driver.findElement(By.name(ADD_TO_CART_NAME));
        addToCartButton.click();
        WebElement viewCartButton = driver.findElement(By.xpath(VIEW_CART_XPATH));
        viewCartButton.click();
        WebElement productInCartText = driver.findElement(By.xpath(PRODUCT_IN_CART_XPATH));
        String text = productInCartText.getText().toString();
        return text;

    }

    public static String applyCouponOfProduct(WebDriver driver){
        WebElement menLink = driver.findElement(By.id(MEN_NAV_LINK));
        menLink.click();
        WebElement product = driver.findElement(By.xpath(PRODUCT_XPATH));
        product.click();
        WebElement addToCartButton = driver.findElement(By.name(ADD_TO_CART_NAME));
        addToCartButton.click();
        WebElement viewCartButton = driver.findElement(By.xpath(VIEW_CART_XPATH));
        viewCartButton.click();
        WebElement couponCode = driver.findElement(By.id(COUPON_CODE_LABEL_ID));
        couponCode.sendKeys("123456");
        WebElement applyCode = driver.findElement(By.name(APPLY_COUPON_BUTTON_NAME));
        applyCode.click();
        WebElement applyCodeText = driver.findElement(By.xpath(COUPON_TEXT_XPATH));
        String text = applyCodeText.getText().toString();
        return text;

    }
}
