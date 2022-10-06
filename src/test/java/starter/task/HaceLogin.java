package starter.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.models.CredencialesLogin;

import static starter.search.UiLogin.*;

public class HaceLogin implements Task {
    String User;
    String Pass;
    CredencialesLogin credLog;

    public HaceLogin(String user, String pass) {
        User = user;
        Pass = pass;
    }



    public static HaceLogin correctamenteEnLaApp(String user, String pass){
        return Tasks.instrumented(HaceLogin.class, user, pass);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(User).into(USER),
                Enter.theValue(Pass).into(PASS),
                Click.on(LOGINBUTTON)
        );
    }
}
