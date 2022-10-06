package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static starter.search.UiLogin.MSGLOGIN;

public class MensajeProductos implements Question<String> {
    public static MensajeProductos EnHome(){return new MensajeProductos();}

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(MSGLOGIN, WebElementStateMatchers.isPresent()).forNoMoreThan(15).seconds()
        );

        String mensaje = MSGLOGIN.resolveFor(actor).getText();
        return MSGLOGIN.resolveFor(actor).getText();
    }
}
