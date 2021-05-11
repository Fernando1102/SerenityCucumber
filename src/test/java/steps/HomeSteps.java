package steps;

import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import pages.HomePage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class HomeSteps {
    private HomePage mHomePage;

    @Step
    public void goToGoogle() {
        mHomePage.open();
    }

    @Step
    public void verifyGoogle(){
        mHomePage.getBtnBuscarConGoogle().waitUntilVisible();
        assertThat(mHomePage.getBtnBuscarConGoogle().isCurrentlyVisible(), is(true));

        mHomePage.setHighLine(mHomePage.getBtnBuscarConGoogle());
        Serenity.takeScreenshot();
        mHomePage.removeHighLine(mHomePage.getBtnBuscarConGoogle());

    }

    @Step
    public void setTextInSearcher(String text){
        mHomePage.getInpBuscadorGoogle().typeAndEnter(text);
    }

    @Step
    public void clickSearchInGoogle(){
        mHomePage.getBtnBuscarConGoogle().click();
    }

    @Step
    public void validateLblNoResult(){
        assertThat(mHomePage.getLblNoResultado().isCurrentlyVisible(), is(false));
    }

    @Step
    public void clickLink(){ mHomePage.getLinkWikipedia().click();



    }

    @Step
    public void verifyPage(){
        assertThat(mHomePage.imgLogo().isCurrentlyVisible(),is(true));
    }



}