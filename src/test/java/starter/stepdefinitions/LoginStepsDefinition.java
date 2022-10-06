package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.models.CredencialesLogin;
import starter.navigation.NavigateTo;
import starter.questions.MensajeProductos;
import starter.task.HaceLogin;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class LoginStepsDefinition {
    @Given("^Que (.*) este en la app de SWAGLABS$")
    public void queEsteEnLaAppDeSwagLabs(String nombre){theActorCalled(nombre).wasAbleTo(NavigateTo.theSwagLabsHomePage());}

    @When("^Diligencie el formulario de ingreso con (.*) y (.*)$")
    public void queDiligenciaElFormularioDeIngreso(String user, String pass){
        theActorInTheSpotlight().attemptsTo(HaceLogin.correctamenteEnLaApp(user, pass));
    }

    @Then("^Verá el mensaje de (.*)$")
    public void veraElmensaje(String msg){
        theActorInTheSpotlight().should(
                seeThat(MensajeProductos.EnHome(), equalTo(msg))
        );
    }
}
