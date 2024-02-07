package nl.tudelft.jpacman.board;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * A very simple (and not particularly useful)
 * test class to have a starting point where to put tests.
 *
 * @author Arie van Deursen
 */
public class DirectionTest {
    /**
     * Do we get the correct delta when moving north?
     */
    @Test
    void testNorth() {
        Direction north = Direction.valueOf("NORTH");
        assertThat(north.getDeltaY()).isEqualTo(-1);
    }

    @Test
    void testGetDeltaX() {
        Direction dirN = Direction.NORTH;
        Direction dirW = Direction.WEST;
        Direction dirE = Direction.EAST;
        Direction dirS = Direction.SOUTH;

        assertThat(dirN.getDeltaX()).isEqualTo(0);
        assertThat(dirW.getDeltaX()).isEqualTo(-1);
        assertThat(dirE.getDeltaX()).isEqualTo(1);
        assertThat(dirS.getDeltaX()).isEqualTo(0);
    }
}
