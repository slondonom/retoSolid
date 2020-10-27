package com.sophossolutions.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PageSearchProduct {
    public static final Target SEARCH_THE_PRODUCT = Target.the("Add name the product for search").located(By.id("search-autocomplete-input"));
    public static final Target SELECT_THE_PRODUCCT = Target.the("Select the product").located(By.xpath("//li//a[text()='Pan Centeno Vollkorn Mestemacher 500 g']"));
}
