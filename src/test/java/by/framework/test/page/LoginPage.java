package by.framework.test.page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by skinner on 01.05.2017.
 */
@Lazy
@Component
public class LoginPage {

    public void openGmailPage() {
        open("https://account.mail.ru/");
    }

    public SelenideElement getLoginTextField() {
        return $(By.name("Username"));
    }

    public SelenideElement getValidationLabel() {
        return $(".b-form-field__errors__error_visible");
    }
}
