package com.test.appium;

import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;
import java.util.NoSuchElementException;


public class FeatureSignUp {

    @Test
    public void cannot_register_different_passwords() throws MalformedURLException {
        AppiumDriverConfig appiumDriver = new AppiumDriverConfig();

        MobileElement signUpPageButton = (MobileElement) appiumDriver.driver.findElementById("br.com.alura.aluraesporte:id/login_botao_cadastrar_usuario");
        signUpPageButton.click();

        MobileElement nameInput = (MobileElement) appiumDriver.driver.findElementById("br.com.alura.aluraesporte:id/input_nome");
        nameInput.setValue("Aline");

        MobileElement passwordInput = (MobileElement) appiumDriver.driver.findElementById("br.com.alura.aluraesporte:id/input_senha");
        passwordInput.setValue("123");

        MobileElement confirmPasswordInput = (MobileElement) appiumDriver.driver.findElementById("br.com.alura.aluraesporte:id/input_confirmar_senha");
        confirmPasswordInput.setValue("456");

        MobileElement signUpButton = (MobileElement) appiumDriver.driver.findElementById("br.com.alura.aluraesporte:id/cadastro_usuario_botao_cadastrar");
        signUpButton.click();

        MobileElement errorMessage = (MobileElement) appiumDriver.driver.findElementById("br.com.alura.aluraesporte:id/erro_cadastro");
        Assert.assertEquals("Different Passwords error message is incorrect", "Senhas não conferem", errorMessage.getText());
    }

    @Test
    public void sign_up_new_user() throws NoSuchElementException, MalformedURLException {
        AppiumDriverConfig appiumDriver = new AppiumDriverConfig();

        MobileElement signUpPageButton = (MobileElement) appiumDriver.driver.findElementById("br.com.alura.aluraesporte:id/login_botao_cadastrar_usuario");
        signUpPageButton.click();

        MobileElement nameInput = (MobileElement) appiumDriver.driver.findElementById("br.com.alura.aluraesporte:id/input_nome");
        nameInput.setValue("Aline");

        MobileElement passwordInput = (MobileElement) appiumDriver.driver.findElementById("br.com.alura.aluraesporte:id/input_senha");
        passwordInput.setValue("123");

        MobileElement confirmPasswordInput = (MobileElement) appiumDriver.driver.findElementById("br.com.alura.aluraesporte:id/input_confirmar_senha");
        confirmPasswordInput.setValue("123");

        MobileElement signUpButton = (MobileElement) appiumDriver.driver.findElementById("br.com.alura.aluraesporte:id/cadastro_usuario_botao_cadastrar");
        signUpButton.click();

        MobileElement loginButton = (MobileElement) appiumDriver.driver.findElementById("br.com.alura.aluraesporte:id/login_botao_logar");
    }
}
