package config;


public class Propriedades {
	public static boolean FECHAR_BROWSER = true;
	//False = NAO finaliza o browser no fim de cada teste, true = FINALIZA o browser
	
	public static Browsers browser = Browsers.CHROME; // Escolher o browser a rodar o teste
	public enum Browsers {
		CHROME,
		FIREFOX
	}

}
