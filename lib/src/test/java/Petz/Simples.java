//1 - Nome do Pacote 
package Petz;

//2 - Biblioteca Importada
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


//3 - Classe
public class Simples {

	//3.1 - Atributos
	String url;       //endereço de site alvo
	WebDriver driver; // objeto do Selenium WebDriver	
	
	//3.2 - Métodos ou funções
	
	@Before
	public void iniciar() {
		url = "https://www.petz.com.br"; //endereço do Petz
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kcabarit\\eclipse-workspace\\Petz\\lib\\driver\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize(); // Maximizar a janela do browser
		driver.manage().timeouts().implicitlyWait(30000,TimeUnit.MILLISECONDS);
	}
	
	@After
	public void finalizar() {
		driver.quit();
	}
	
	@Test
	public void abrirPagina() {
		driver.get(url); //abrir a pagina inicial do site Petz
		assertEquals("Pet Shop: Petz o maior pet shop do Brasil.", driver.getTitle()); //valida o texto na guia da página
		
	}

}
