package br.com.pickshowteste;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class SeleniumPickShow {

	@Test
	void test() {
		System.setProperty("webdriver.chrome.driver", "D:\\PROJETOS\\chromedriver.exe");
		
		WebDriver browser = new ChromeDriver();
		
		browser.get("file:///D:/PROJETOS/PickShow_V1/App/View/index.html");
		
		//Tempo para a página poder carregar o conteúdo.
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//buscar a classe de recuperação de senha.
		browser.findElement(By.className("txt2")).click();
		
		//capturar o título da página.
		String tituloPagina = browser.getTitle();
		
		//Verificar se é o título certo.
		assertEquals("Recuperação de senha", tituloPagina);
	}

}