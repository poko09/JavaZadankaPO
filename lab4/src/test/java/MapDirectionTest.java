import agh.ics.oop.MapDirection;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MapDirectionTest {

    @Test
    void checkNext(){

        assertEquals("Północ", MapDirection.NORTH.toString());
        assertEquals("Wschód", MapDirection.EAST.toString());
        assertEquals("Południe", MapDirection.SOUTH.toString());
        assertEquals("Zachód", MapDirection.WEST.toString());
        //boolean = asserTrue
        //object = assertNotNull
        //asse
    }

    @Test
    void testPrevious() {
        assertEquals("Zachód", MapDirection.NORTH.previous());
        assertEquals("Północ", MapDirection.EAST.previous());
        assertEquals("Wschód", MapDirection.SOUTH.previous());
        assertEquals("Południe", MapDirection.WEST.previous());

    }


}


