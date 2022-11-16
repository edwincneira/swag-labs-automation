package com.swag.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static com.swag.user_interfaces.LoginPage.*;
import static com.swag.user_interfaces.BuyPage.*;

public class Login implements Task {

    private String email;
    private String pass;

    public Login(String email, String pass) {
        this.email = email;
        this.pass = pass;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(email).into(TXT_USER),
                Enter.theValue(pass).into(TXT_PASSWORD),
                Click.on(BTN_LOGIN),
                WaitUntil.the(BTN_MENU, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BTN_MENU)
        );

    }

    public static Login enLaApp(String email, String pass){
        return Tasks.instrumented(Login.class,email,pass);
    }

}
