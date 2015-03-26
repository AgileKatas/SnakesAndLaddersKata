package uk.co.agilekatas.katas.snakesandladders.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import uk.co.agilekatas.katas.snakesandladders.SnakesAndLadders;

public class SnakesAndLaddersStepdefs {

    private SnakesAndLadders snakesAndLadders;

    @Given("^the game is started$")
    public void the_game_is_started() {
        snakesAndLadders = new SnakesAndLadders();
    }

    @Then("^the token is on square (\\d+)$")
    public void the_token_is_on_square(int position) {

    }
}
