package uk.co.agilekatas.katas.snakesandladders;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SnakesAndLaddersTest {

    @Test
    public void playerShouldBeInPositionOneWhenGameIsStarted() {
        SnakesAndLadders snakesAndLadders = new SnakesAndLadders();
        assertThat(snakesAndLadders.getPlayerPosition()).isEqualTo(1);
    }

}