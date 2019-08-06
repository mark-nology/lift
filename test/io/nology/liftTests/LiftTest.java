package io.nology.liftTests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import io.nology.lifts.Lift;
import static io.nology.lifts.TravelDirection.*;

class LiftTest {
    @Test
    public void testLiftInstantiation() {
        Lift lift = new Lift(4);
        assertEquals(0, lift.getFloor());
        assertArrayEquals(new boolean[] {false, false, false, false}, lift.getDestinations());

        assertEquals(NONE, lift.getTravelDirection());
        assertEquals(0, lift.getLocation());
    }
}