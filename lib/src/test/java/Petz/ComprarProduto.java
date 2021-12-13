package Petz;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.Home;

	public class ComprarProduto {

	//3.1 - Atributos
	String url;       //endereço de site alvo
	WebDriver driver; // objeto do Selenium WebDriver	
	
	Home home; //Objeto Home herdando a classe Home
	
	//3.2 - Métodos ou funções
	
	@Before
	public void iniciar() {
		url = "https://www.petz.com.br"; //endereço do Petz
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\kcabarit\\eclipse-workspace\\Petz\\lib\\driver\\chrome\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize(); // Maximizar a janela do browser
	driver.manage().timeouts().implicitlyWait(30000,TimeUnit.MILLISECONDS);
	
	home = new Home(driver); //Instanciar a classe Home
	}

	@After
	public void finalizar() {
		driver.quit();
	}
	
	@Dado("^que acesso o site Petz$")
	public void que_acesso_o_site_Petz() {
		driver.get(url); //Abre o site da Petz
		System.out.println("Passo 1");
	}

	@Quando("^busco por \"([^\"]*)\" e pressiono Enter$")
	public void busco_por_e_pressiono_Enter(String produto) {
		home.buscarProdutoComEnter(produto);
		System.out.println("Passo 2");
	}

	@Entao("^exibe uma lista de produtos relacionados com \"([^\"]*)\"$")
	public void exibe_uma_lista_de_produtos_relacionados_com(String arg1) {
		System.out.println("Passo 3");
	
	}

	@Quando("^escolho \"([^\"]*)\"$")
	public void escolho(String arg1) {
		System.out.println("Passo 4");
	    
	}

	@Entao("^exibe para o \"([^\"]*)\" o preco de \"([^\"]*)\"$")
	public void exibe_para_o_o_preco_de(String arg1, String arg2) {
		System.out.println("Passo 5");
	}

	
	
}
