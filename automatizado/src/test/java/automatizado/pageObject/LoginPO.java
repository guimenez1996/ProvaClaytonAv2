package automatizado.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPO extends BasePO{

    @FindBy(id = "email")
    public WebElement inputEmail;

    @FindBy (id = "senha")
    public WebElement inputSenha;

    //Padrão do nome da variável: nome do elemnto html + o que ele representa

    @FindBy (id = "btn-entrar")
    public WebElement buttomEntrar;

    @FindBy(css = "form.form-login>div.alert>span")
    public WebElement spanMensagem;
    //OBS: capturar
    /**
     * Construtor padrão para a criação de uma nova página de login
     *
     * @param driver da página de login
     */
    public LoginPO(WebDriver driver) { super(driver); }

    public String obterMensagem() {
        return this.spanMensagem.getText();
    }
}
