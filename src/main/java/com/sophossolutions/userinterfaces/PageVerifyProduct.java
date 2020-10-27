package com.sophossolutions.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PageVerifyProduct {
    public static final Target VERIFY_PRODUCT = Target.the("Select the product").located(By.xpath("//div[@class='cart-products-items']//a[text()='Pan Centeno Vollkorn Mestemacher 500 g']"));
}
