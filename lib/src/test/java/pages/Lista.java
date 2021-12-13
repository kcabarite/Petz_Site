package pages;

	public class Lista extends PageObject {

		//@FindBy(xpath = "//h3[contains(text(),'Coleira Petz Azul para C�es')]")
		//private WebElement produtoDesejado;
		
		@FindBy(xpath = "/html[1]/body[1]/div[9]/div[2]/div[2]/div[2]/div[1]/h1[1]")
		WebElement cabecalhoResultado;
		
		public Lista(WebDriver driver) {
			super(driver);
		}
		
		public void clicarNoProduto(String produto) {
			//produtoDesejado.click();
			WebElement produtoDesejado = driver.findElement(By.xpath("//h3[contains(text(),'" + produto + "')]"));
			produtoDesejado.click();		
		}
		
		public String lerCabecalhoResultado() {
			//WebElement cabecalhoResultado = driver.findElement(By.cssSelector("h2Categoria.nomeCategoria"));
			return cabecalhoResultado.getText();		
		}
		

}
