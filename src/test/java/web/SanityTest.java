package web;

import web.basePages.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import web.baseWeb.BaseWeb;



public class SanityTest extends BaseWeb {

    WebDriver driver = init();

    @Test()
    public void testCheckMenAddedProductToCart(){
        Men.checkMenAddedProductToCart(driver);
        Assert.assertEquals(Men.PRODUCT_IN_CART_TEXT,"ATID Blue Shoes");
    }
    @Test()
    public void testCouponOfProduct(){
        Men.applyCouponOfProduct(driver);
        Assert.assertEquals(Men.COUPON_TEXT,"Coupon 123456 does not exist!");
    }

    @Test()
    public void testAdditionalInformation(){
        String text = Women.additionalInformation(driver);
        Assert.assertEquals(text,"color\n" +
                "Black, Blue, Brown, Red");
    }
    @Test()
    public void testAddReviewProduct(){
         Women.addReviewProduct(driver);

    }
    @Test()
    public void testSortByLatest(){
         Accessories.sortByLatest(driver);

    }

    @Test()
    public void testFilterByPrice(){
         Store.filterByPrice(driver);

    }



}
