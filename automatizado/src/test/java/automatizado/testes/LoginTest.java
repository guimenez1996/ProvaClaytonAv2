package automatizado.testes;

import automatizado.pageObject.LoginPO;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class LoginTest extends BaseTest{


    private static LoginPO loginPage;

    @BeforeClass
    public static void prepararTestes(){
        driver.get("file:///C:/Guilherme/sistema/login.html");
        loginPage = new LoginPO(driver);
    }

    @Test
    public void TC001_naoDeveLogarNoSistemaComEmailESenhaVazio(){
        loginPage.inputEmail.sendKeys("");
        loginPage.inputSenha.sendKeys("");

        loginPage.buttomEntrar.click();

        String mensagem = loginPage.obterMensagem();

        assertEquals(mensagem, "Os campos não podem ser brancos");
    }

    @Test
    public void TC002_naoDeveLogarNoSistemaComEmailIncorretoESenhaVazio(){

        loginPage.inputEmail.sendKeys("guilherme@gmail.com");
        loginPage.inputSenha.sendKeys("");

        loginPage.buttomEntrar.click();

        String mensagem = loginPage.obterMensagem();

        assertEquals(mensagem, "Os campos não podem ser brancos");

    }
}
