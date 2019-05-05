package Monopoly.Elements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CupTest {

    @Test
    void aCupShouldHaveTheCorrectNumberOfDice() {
        Cup cup = new Cup(2);
        int nbDice = 0;
        for (Die die : cup.getDice()) {
            nbDice++;
        }
        assertEquals(2, nbDice);
    }
}