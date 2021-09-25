package steps;


import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.BasePage;
import pages.BuscaPage;

public class BuscaLogradouroStep {
	BasePage page = new BasePage();
	BuscaPage busca = new BuscaPage();
	
	@Quando("inserir um Logradouro")
	public void inserir_um_Logradouro() {
		busca.setLogradouro("Rua João Mucci");
		busca.pesquisar();
		busca.trocarAba(1);
	}

	@Entao("validar enderecos encontrados")
	public void validar_enderecos_encontrados() {
		busca.resultadosLogradouros();
		
	
	}
	


}
