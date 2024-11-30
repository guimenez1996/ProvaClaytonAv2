package automatizado.testes;

import automatizado.pageObject.ProdutoPO;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.*;

public class ProdutoTestes extends BaseTest{

    private static ProdutoPO paginaProduto;

    @BeforeClass
    public static void iniciarTestes(){
        driver.get("file:///C:/Users/36129382023.1n/Downloads/selenium-lab-clayton/selenium-lab-main/sistema/produtos.html#");
        paginaProduto = new ProdutoPO(driver);
    }

    @Test
    public void T1_Nao_Deve_Salvar_O_Produto_Sem_O_Campo_Nome_Preenchido() {
        ProdutoPO produtoPO = new ProdutoPO(driver);

        produtoPO.buttomCriar.click();
        produtoPO.buttomCriar.click();

        // Preencher os campos obrigatórios, exceto o "Nome"

        produtoPO.inputCodigo.sendKeys("12345");
        produtoPO.inputQuantidade.sendKeys("10");
        produtoPO.inputValor.sendKeys("1");
        produtoPO.inputDataCadastro.sendKeys("29/11/2024");

        produtoPO.buttomSalvar.click();

        String mensagem = produtoPO.obterMensagem();

        assertEquals(mensagem, "Todos os campos são obrigatórios para o cadastro!");
    }


    @Test
    public void T2_Nao_Deve_Salvar_O_Produto_Sem_Nenhum_Campo_Preenchido() {
        ProdutoPO produtoPO = new ProdutoPO(driver);

        produtoPO.buttomCriar.click();
        produtoPO.buttomCriar.click();

        // Preencher os campos obrigatórios, exceto o "Nome"

        produtoPO.inputCodigo.sendKeys("");
        produtoPO.inputQuantidade.sendKeys("");
        produtoPO.inputValor.sendKeys("");
        produtoPO.inputDataCadastro.sendKeys("");

        produtoPO.buttomSalvar.click();

        String mensagem = produtoPO.obterMensagem();

        assertEquals(mensagem, "Todos os campos são obrigatórios para o cadastro!");

    }

    @Test
    public void T3_Nao_Deve_Salvar_O_Produto_Sem_O_Campo_Quantidade_Preenchido() {
        ProdutoPO produtoPO = new ProdutoPO(driver);

        produtoPO.buttomCriar.click();
        produtoPO.buttomCriar.click();


        produtoPO.inputNome.sendKeys("Carteira");
        produtoPO.inputCodigo.sendKeys("3");
        produtoPO.inputQuantidade.sendKeys("");
        produtoPO.inputValor.sendKeys("5");
        produtoPO.inputDataCadastro.sendKeys("25/11/2024");

        produtoPO.buttomSalvar.click();

        String mensagem = produtoPO.obterMensagem();

        assertEquals(mensagem, "Todos os campos são obrigatórios para o cadastro!");

    }

}


