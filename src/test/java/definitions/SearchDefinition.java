package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.HomeSteps;

public class SearchDefinition {

    @Steps
    private HomeSteps mHomeSteps;

    /**
     * 1. Abro la pagina de Google
     * 2. Verifico que estoy en la página de google --> Buena practica
     */
    @Given("^Estoy en la pagina de inicio de google$")
    public void estoy_en_la_pagina_de_inicio_de_google() {
        mHomeSteps.goToGoogle();
        mHomeSteps.verifyGoogle();
    }

    /**
     * 1. Escribo en el buscador Eduardo
     * 2. le doy en buscar con google
     */
    @When("^Realizo la busqueda de eduardo vargas$")
    public void realizo_la_busqueda_de_Eduardo_en_google_accion() {
        mHomeSteps.setTextInSearcher("Eduardo Vargas");
        //mHomeSteps.clickSearchInGoogle();
    }
    /**
     * Doy click en el link de Eduardo Vargas Wikipedia
     */

    @And("^Entro al link de wikipedia$")
    public void entro_al_link_de_wikipedia(){
        mHomeSteps.clickLink();
    }

    /**
     * Valido que se muestre la biografía de Eduardo Vargas
     */
    @Then("^Validar que se muestra la biografía de eduardo vargas$")
    public void validar_que_se_muestra_la_biografía_de_eduardo_vargas() {
        mHomeSteps.verifyPage();
    }
}


/**
        Given Estoy en la pagina de inicio de google
        When Realizo la busqueda de eduardo vargas
        And Entro al link de wikipedia
        Then Validar que se muestra la biografía de eduardo vargas
 **/