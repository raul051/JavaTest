package com.raul051.javatest.player;

import org.junit.Test;
import org.mockito.Mockito;
import static org.junit.Assert.*;

public class playerTest {

    @Test
    public void loose_when_dice_number_is_too_low(){

        Dice dice = Mockito.mock(Dice.class);

        Mockito.when(dice.roll()).thenReturn(2);

        player player = new player(dice,5);
        assertFalse(player.play());
    }

    @Test
    public void wins_when_dice_number_is_big(){

        Dice dice = Mockito.mock(Dice.class);

        Mockito.when(dice.roll()).thenReturn(4);

        player player = new player(dice,3);
        assertTrue(player.play());
    }

}

