//package automatizado;
//
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class GoogleFirstTest {
//    private WebDriver driver;
//    private String URL_BASE = "https://academico.rj.senac.br/";
//    private String PATH_DRIVER = "src/test/resources/chromedriver.exe";
//
//    private void iniciar(){
//        System.setProperty("webdriver.chrome.driver", PATH_DRIVER);
//        driver = new ChromeDriver(); // Chama o Chormedriver e inicia o processo
//        driver.manage().window().maximize(); // para maximizar o navegador
//        driver.get(URL_BASE);
//    }
//
//    @Test
//    public void pesquisarNoGoogle(){
//        // Montagem do cenário
//
//        iniciar();
//
//        // Preparação
//        WebElement inputPesquisa = driver.findElement(By.name("q"));
//
//        // Execução
//        inputPesquisa.sendKeys("");
//    }
//
//}

package automatizado;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleFirstTest {
    private WebDriver driver;
    private String URL_BASE = "https://edujira.acesso.rj.senac.br/secure/Dashboard.jspa";
    private String PATH_DRIVER = "src/test/resources/chromedriver.exe";

    // Dados de login
    private String usuario = "16754282711";
    private String senha = "16754282711";

    private void iniciar(){
        System.setProperty("webdriver.chrome.driver", PATH_DRIVER);
        driver = new ChromeDriver(); // Chama o ChromeDriver e inicia o processo
        driver.manage().window().maximize(); // Maximiza a janela do navegador
        driver.get(URL_BASE); // Acessa a URL base
    }

    @Test
    public void fazerLogin(){
        // Inicia o navegador e abre a página
        iniciar();

        // Localizar o campo de login (usuário)
        WebElement campoUsuario = driver.findElement(By.id("login-form-username"));
        campoUsuario.sendKeys(usuario); // Envia o usuário

        // Localizar o campo de senha
        WebElement campoSenha = driver.findElement(By.id("login-form-password"));
        campoSenha.sendKeys(senha); // Envia a senha

        // Localizar o botão de login
        WebElement botaoLogin = driver.findElement(By.id("login"));
        botaoLogin.click(); // Clica no botão de login

    }
}

