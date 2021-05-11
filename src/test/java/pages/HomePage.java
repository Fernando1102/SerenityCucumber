package pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import utils.UtilsElement;

@DefaultUrl("https://www.google.com/?hl=es")
public class HomePage extends UtilsElement {
    public HomePage() {
    }

    private String btnBuscarConGoogle = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]";

    private String inpBuscadorGoogle = "//input[@class='gLFyf gsfi']";

    private String lblNoResultado = "//*[@id='topstuff']/div/div/p[1]";

    private String linkWikipedia = "//*[contains(text(),'Wikipedia,')]";

    private String imgLogo = "//a[@class=\"mw-wiki-logo\"]";

    public WebElementFacade getBtnBuscarConGoogle() {
        return findBy(btnBuscarConGoogle);
    }

    public WebElementFacade getInpBuscadorGoogle() {
        return findBy(inpBuscadorGoogle);
    }

    public WebElementFacade getLblNoResultado() {
        return findBy(lblNoResultado);
    }

    public WebElementFacade getLinkWikipedia() {return findBy(linkWikipedia); }

    public WebElementFacade imgLogo(){return findBy(imgLogo);}


    /**
     *
     * WebElement btnGoogle = driver.findElement(By.id("id_boton"));
     * btnGoogle.click();
     * .sendkeys("correo@gmail.com")
     * .getText();
     * .submit();
     */

}
