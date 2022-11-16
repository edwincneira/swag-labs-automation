package com.swag.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    public static final Target TXT_USER = Target.the("Txt for email").located(By.xpath("//android.widget.EditText[@content-desc='test-Usuario']"));
    public static final Target TXT_PASSWORD = Target.the("Txt for password").located(By.xpath("//android.widget.EditText[@content-desc='test-Contraseña']"));
    public static final Target BTN_LOGIN = Target.the("Btn for login").located(By.xpath("//android.view.ViewGroup[@content-desc='test-LOGIN']"));


}
