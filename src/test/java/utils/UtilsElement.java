package utils;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.JavascriptExecutor;

public class UtilsElement extends PageObject {


    public void setHighLine(WebElementFacade element){
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript ("arguments[0].style.border='1px solid #e91e63';",element);
    }

    public void removeHighLine(WebElementFacade element){
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript ("arguments[0].style.border='none';",element);
    }

}
