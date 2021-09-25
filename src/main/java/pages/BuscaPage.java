package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

public class BuscaPage extends BasePage {

	public void setCEP(String cep) {
		escrever(By.xpath("//input[@id = 'relaxation']"), cep);
	}
	
	public void setLogradouro(String logradouro) {
		escrever(By.xpath("//input[@id = 'relaxation']"), logradouro);
	}

	public void pesquisar() {
		clicarBotao(By.xpath("//input[contains(@placeholder,'Digite um CEP ou um endereço')]/..//button"));
	}
	
	public String obterResultadoCep(){
		return obterTexto(By.xpath("//td[contains(@data-th,'Logradouro/Nome')]"));
	}
	
	public void validarResultadoCEP(String logradouro){
		Assert.assertEquals(logradouro, obterResultadoCep());		
	}

	
}
