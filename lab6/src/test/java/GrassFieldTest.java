import agh.ics.oop.Animal;
import agh.ics.oop.GrassField;
import agh.ics.oop.Vector2d;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrassFieldTest {

    GrassField grass = new GrassField(10);
    GrassField grass1 = new GrassField(10);

    Vector2d v1 = new Vector2d(11,11);

    Animal animal = new Animal(grass,new Vector2d(4,5));
    Animal animal2 = new Animal(grass1,new Vector2d(3,5));




    @Test
    void testRandomClumpsOfGrass() { //checks whether the constructor works properly
        assertNotEquals(grass, grass1);
    }

    @Test
    void testIsGrass() {
        grass.place(animal);
        grass.place(animal2);
        assertFalse(grass.isGrass(new Vector2d(3,5)));

    }

    @Test
    void testPlace(){
        Animal animal3 = new Animal(grass1, new Vector2d(4,4));
        assertTrue(grass.place(animal3));
    }

    @Test
    void testIsOcupied() {
        assertTrue(grass.isOccupied(new Vector2d(4,5)));

    }
    @Test
    void testCanMoveTo() {
        assertTrue(grass.canMoveTo(new Vector2d(4,8)));
    }





}