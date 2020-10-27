package com.sophossolutions.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PageAddToCart {
    public static final Target SELECT_ADD_TO_CAR = Target.the("Select the product").located(By.xpath("//div[@class='info-wrapper']//button[contains(@class,'add-to-cart')]"));
    public static final Target CLOSE_POP_UP_EMAIL = Target.the("Select the product").located(By.xpath("//button[@class='modal-address__close font-icn cross']"));
    public static final Target CLICK_SEE_CART = Target.the("Add name the product for search").located(By.xpath("//div[@class='minicart minicart--floating minicart--has-items minicart--single-category']//a[@class='btn primary minicart__action minicart__action--buy']//span[text()='Ver carrito']"));

}
