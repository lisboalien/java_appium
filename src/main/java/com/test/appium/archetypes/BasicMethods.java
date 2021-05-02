package com.test.appium.archetypes;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasicMethods {
    public AppiumDriver driver;

    // -------------- Wait methods --------------
    public AndroidElement wait_ultil_element_is_displayed(AndroidElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(element));
        return element;
    }
}
