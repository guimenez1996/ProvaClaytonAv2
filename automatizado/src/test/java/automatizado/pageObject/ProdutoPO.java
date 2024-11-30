package automatizado.pageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProdutoPO extends BasePO {


    public ProdutoPO(WebDriver driver) { super(driver); }

    @FindBy(id = "data")
    public WebElement inputDataCadastro;
    @FindBy(id = "btn-adicionar")
    public WebElement buttomCriar;

    @FindBy(className = "close")
    public WebElement xFechar;

    @FindBy (id = "codigo")
    public WebElement inputCodigo;

    @FindBy (id = "nome")
    public WebElement inputNome;

    @FindBy (id = "quantidade")
    public WebElement inputQuantidade;

    @FindBy (id = "valor")
    public WebElement inputValor;

    @FindBy (id = "btn-salvar")
    public WebElement buttomSalvar;

    @FindBy (id = "btn-sair")
    public WebElement buttomSair;

    @FindBy (id = "mensagem")
    public WebElement spanMensagem;

    public String obterMensagem() {
        return this.spanMensagem.getText();
    }

}
