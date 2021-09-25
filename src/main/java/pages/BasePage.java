package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static config.Driver.*;

public class BasePage {

	public void acessarUrl() {
		getDriver().get("https://www.correios.com.br");
	}

	public void acessarUrl(String url) {
		getDriver().get(url);
	}

	// ============= Botão =============//

	public void clicarPolitica(){
		getDriver().findElement(By.id("btnCookie")).click();
	}

	public void clicarBotao(By by){
		getDriver().findElement(by).click();
	}

	// ============= TextField =============//

	public void escrever(By by, String texto){
		getDriver().findElement(by).clear();
		getDriver().findElement(by).sendKeys(texto);
	}

	// ============= Texto =============//

	public String obterTexto(By by){
		return getDriver().findElement(by).getText();

	}
	// ============= Aba =============//	

	public void trocarAba(int aba) {
		List<String> abas = new ArrayList<>(getDriver().getWindowHandles());
		getDriver().switchTo().window(abas.get(aba));
	}

	// ============= Lista =============//

	public void resultadosLogradouros(){
		List<WebElement> resultados = getDriver().findElements(By.xpath("//td"));
		//criado lista string para manipular o output
		List<String> lista = new ArrayList<>();
		lista.add(0, "");
		for (int i=0;i<resultados.size();i++){
			lista.add(resultados.get(i).getText());
		}

		for (int i=0;i<lista.size();i++){
			if(i % 4 == 0){
				System.out.print(lista.get(i));
				System.out.println();
			}else {
				System.out.print(lista.get(i) + " - ");
			}
		}
	}



}
