package com.swag.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BuyPage {

    public static final Target BTN_MENU = Target.the("Btn of menu").located(By.xpath("//android.view.ViewGroup[@content-desc='test-Menu']/android.view.ViewGroup"));
    public static final Target BTN_CLOSE_SESSION = Target.the("Btn close session").located(By.xpath("//android.view.ViewGroup[@content-desc='test-CERRAR SESION']"));
    public static final Target BTN_CLOSE_MENU = Target.the("Btn close menu").located(By.xpath("//android.view.ViewGroup[@content-desc='test-Cerrar']/android.widget.ImageView"));

}
