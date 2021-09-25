package runner;

import static config.Driver.getDriver;
import static config.Driver.killDriver;

import config.Propriedades;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import pages.BasePage;

public class Hooks{
	BasePage base = new BasePage();
	
	@Before
	public void setup(){
		getDriver();
		base.acessarUrl();
		
		}
	
	@After
	public void finaliza(){
		if(Propriedades.FECHAR_BROWSER){
			killDriver();
		}
	}
	
	

}
