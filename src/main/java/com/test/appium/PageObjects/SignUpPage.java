package com.test.appium.PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends CommonPageObject {

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
        super(driver);
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

    public String get_sign_up_error_message() {
        wait_until_element_is_displayed(this.message_sign_up_error);
        return this.message_sign_up_error.getText();
    }

    // ------------- Interaction methods -------------
    public void fill_sign_up_form(String name, String password, String confirmPassword) {
        set_name_input(name);
        set_password_input(password);
        set_confirm_password_input(confirmPassword);
    }

    public void register_new_user(String name, String password, String confirmPassword) {
        fill_sign_up_form(name, password, confirmPassword);
        btn_sign_up();
    }

}
