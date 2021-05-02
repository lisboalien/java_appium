package com.test.appium;

import com.test.appium.PageObjects.LoginPage;
import com.test.appium.PageObjects.SignUpPage;
import io.appium.java_client.AppiumDriver;
import org.junit.Test;

import java.util.NoSuchElementException;


public class FeatureSignUp {

    @Test
    public void cannot_register_different_passwords() {
        AppiumDriver appiumDriver = AppiumDriverConfig.Instance().driver;

        SignUpPage signUpPage = new SignUpPage(appiumDriver);
        LoginPage loginPage = new LoginPage(appiumDriver);

        loginPage.btn_sign_up_page();

        signUpPage.set_name_input("Aline");
        signUpPage.set_password_input("123");
        signUpPage.set_confirm_password_input("456");
        signUpPage.btn_sign_up();
        signUpPage.assert_sign_up_error_message();

        appiumDriver.navigate().back();
    }

    @Test
    public void sign_up_new_user() throws NoSuchElementException {
        AppiumDriver appiumDriver = AppiumDriverConfig.Instance().driver;

        SignUpPage signUpPage = new SignUpPage(appiumDriver);
        LoginPage loginPage = new LoginPage(appiumDriver);

        loginPage.btn_sign_up_page();

        signUpPage.set_name_input("Aline");
        signUpPage.set_password_input("123");
        signUpPage.set_confirm_password_input("123");
        signUpPage.btn_sign_up();
    }
}
