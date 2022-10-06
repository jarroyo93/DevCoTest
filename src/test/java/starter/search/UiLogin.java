package starter.search;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UiLogin {
    public static final Target USER =  Target.the("User").located(By.id("user-name"));
    public static final Target PASS =  Target.the("User").located(By.id("password"));
    public static final Target LOGINBUTTON =  Target.the("User").located(By.id("login-button"));
    public static final Target MSGLOGIN =  Target.the("User").located(By.xpath("//span[text()='Products']"));



    private UiLogin(){
        throw new IllegalStateException("Error UiLogin");
    }
}
