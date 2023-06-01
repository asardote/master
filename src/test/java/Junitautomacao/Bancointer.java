package Junitautomacao;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bancointer {

	WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
		// comando para apontar o driver do navegador
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		// comando para indicar o meu driver instanciado
		driver = new ChromeDriver();		
		// comando para maximizar a tela
		driver.manage().window().maximize();
		// comando para indicar o site a ser aberto
		driver.get("https://www.4devs.com.br/gerador_de_pessoas");
		// comando para indicar o elemento a ter interação
	    //driver.findElement(By.cssSelector ("#gatsby-focus-wrapper > div > header > section > div > div > div > div > div.styles_LogoNIcons-sc-1gbjc3e-6.gjJzHM > div.stylesSearchNFlags-sc-1gbjc3e-8.yVPnY > div.styles_ButtonsWrapper-sc-1gbjc3e-9.PKrxs > button:nth-child(1)")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("bt_gerar_pessoa")).click();
		Thread.sleep(3000);
	String nome;
	nome = driver.findElement(By.id("nome")).getText();
	System.out.println(nome);
	String telefone;
	telefone = driver.findElement(By.id("telefone_fixo")).getText();
	System.out.println(telefone);
	String email;
	email =  driver.findElement(By.id("email")).getText();
	System.out.println(email);
	String cpf;
	cpf = driver.findElement(By.id("cpf")).getText();
	System.out.println(cpf);
	String data;
	data = driver.findElement(By.id("data_nasc")).getText();
	System.out.println(data);
	
	driver.quit();
	
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	// comando para indicar o meu driver instanciado
	driver = new ChromeDriver();		
	// comando para maximizar a tela
	driver.manage().window().maximize();
	// comando para indicar o site a ser aberto
	driver.get("https://www.bancointer.com.br/");
	// comando para indicar o elemento a ter interação
    driver.findElement(By.cssSelector ("#gatsby-focus-wrapper > div > header > section > div > div > div > div > div.styles_LogoNIcons-sc-1gbjc3e-6.gjJzHM > div.stylesSearchNFlags-sc-1gbjc3e-8.yVPnY > div.styles_ButtonsWrapper-sc-1gbjc3e-9.PKrxs > button:nth-child(1)")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("nome")).sendKeys(nome);
	driver.findElement(By.id("telefone")).sendKeys(telefone);
	driver.findElement(By.id("email")).sendKeys(email);
	driver.findElement(By.id("cpf")).sendKeys(cpf);	
	driver.findElement(By.id("data")).sendKeys(data);
	
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
	
	@Test
	public void validacaodoTextoFormulario() throws InterruptedException {
		String texto;
		Thread.sleep(5000);
		texto = driver.findElement(By.cssSelector("body > div.style_ModalContent-wuavw4-0.hOXgJK > div.style_Container-sc-138k8xa-0.dlLgSU.d-flex.align-items-center > div > div.col-12.text-center.py-4.pt-lg-0 > h2")).getText();	
		System.out.println(texto);
		assertEquals("Abra agora sua Conta Digital", texto);
	
	}
}