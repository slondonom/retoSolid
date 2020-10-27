package com.sophossolutions.userinterfaces;

import static com.sophossolutions.utilities.Constant.URL_PAGE;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl(URL_PAGE)
public class MainPageWong extends PageObject {
    public static final Target CLOSE_POP_UP = Target.the("Close pop up").located(By.id("onesignal-slidedown-cancel-button"));

}
