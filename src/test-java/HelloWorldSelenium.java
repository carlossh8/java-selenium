package br.com.alura.leilao;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class HelloWorldSelenium {

    @Test
    public void hello(){
        System.set.Property("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver browser = new ChromeDriver ();
        browser.navigate().to ("http://localhost:8080/leiloes")
        browser.quit();
    }

}