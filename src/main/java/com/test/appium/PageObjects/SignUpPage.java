package com.test.appium.PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
    private AppiumDriver driver;

    @AndroidFindBy(id = "br.com.alura.aluraesporte:id/input_nome")
    private AndroidElement input_name;

    @AndroidFindBy(id = "br.com.alura.aluraesporte:id/input_senha")
    private AndroidElement input_password;

    @AndroidFindBy(id = "br.com.alura.aluraesporte:id/input_confirmar_senha")
    private AndroidElement input_confirm_password;

    @AndroidFindBy(id = "br.com.alura.aluraesporte:id/cadastro_usuario_botao_cadastrar")
    private AndroidElement button_sign_up;

    @AndroidFindBy(id = "br.com.alura.aluraesporte:id/erro_cadastro")
    private AndroidElement message_sign_up_error;


    public SignUpPage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    // ------------ Page components methods ------------

    public void set_name_input(String name) {
        this.input_name.sendKeys(name);
    }

    public void set_password_input(String password) {
        this.input_password.sendKeys(password);
    }

    public void set_confirm_password_input(String password) {
        this.input_confirm_password.sendKeys(password);
    }

    public void btn_sign_up() {
        this.button_sign_up.click();
    }

    // --------------- Assertion Methods --------------

    public void assert_sign_up_error_message() {
        Assert.assertEquals("Different Passwords error message is incorrect", "Senhas não conferem", this.message_sign_up_error.getText());
    }

}
