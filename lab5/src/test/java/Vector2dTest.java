import agh.ics.oop.Vector2d;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Vector2dTest {

    Vector2d v1 = new Vector2d(1,2);
    Vector2d v2 = new Vector2d(3,4);
    Vector2d v3 = new Vector2d(4,6);
    Vector2d v4 = new Vector2d(-1,-2);
    Vector2d v5 = new Vector2d(1,2);

    String testString = "(1, 2)";

    @Test
    void testPrecedes() {

        assertTrue(v1.precedes(v2));
    }

    @Test
    void testFollows(){

        assertNotNull(v2.precedes(v1));
    }

    @Test
    void testAddition(){

        assertEquals(v3, v1.add(v2));
    }

    @Test
    void testSubstraction(){

        assertNotEquals(v3, v1.substract(v2));
    }

    @Test
    void testUpperRight(){

        assertNotEquals(v3, v1.lowerLeft(v2));
    }

    @Test
    void testLowerLeft(){

        assertNotEquals(v3, v1.lowerLeft(v2));
    }

    @Test
    void testLowerRight(){

        assertNotEquals(v3, v1.upperRight(v2));
    }
//Objects.equals(x,y);

    @Test
    void testOppositr(){
        assertEquals(v4, v1.oposite());
    }

    @Test
    void testEquals(){
        assertTrue(v5.equals(v1));
    }

    @Test
    void testToString() {
        assertEquals(testString, v1.toString());

    }

}

// given
//co jest dane w naszych testach
// when
//co chcemy sprawdzic w tym tescie, co sie wydarzyl np. Strong v1text = v1.ToString()
// then
//porównanie, asercje


// jak nazywać testy?

// AssertAll - używać

