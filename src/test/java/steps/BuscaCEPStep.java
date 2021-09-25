package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.BuscaPage;

public class BuscaCEPStep {
	
	BuscaPage busca = new BuscaPage();
		
	@Dado("que esteja na pagina inicial")
	public void que_esteja_na_pagina_inicial() {
		busca.clicarPolitica();
	}

	@Quando("inserir um CEP valido")
	public void inserir_um_CEP_valido() {
		busca.setCEP("08160-120");
		busca.pesquisar();
		busca.trocarAba(1);
	}

	@Entao("validar endereco encontrado")
	public void validar_endereco_encontrado() {
		busca.resultadosLogradouros();
		busca.validarResultadoCEP("Rua Lagoa Cajubá");
	}

}
