import agh.ics.oop.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class AnimalTest {

    GrassField grassForAnimals = new GrassField(10);
    Vector2d vectorForAnimals = new Vector2d(2,2);
    @Test
    void isPositionRight() {
        //given
        Animal animal1 = new Animal(grassForAnimals,vectorForAnimals);
        Vector2d v1 = new Vector2d(2,2);

        //when
        animal1.getPosition();

        //then
        assertNotEquals(MapDirection.NORTH, animal1.getPosition());
        assertEquals(v1, animal1.getPosition());

    }

    @Test
    void isOrientationRight() {
        //given
        Animal animal1 = new Animal(grassForAnimals,vectorForAnimals);

        //when
        animal1.move(MoveDirection.LEFT);

        //then
        assertEquals(MapDirection.WEST, animal1.getOrientation());
    }


    @Test
    void isAnimalOusitdeTheMap() {
        //given

        Vector2d v1 = new Vector2d(2,4);
        Animal animal1 = new Animal(grassForAnimals,v1);

        //when
        animal1.move(MoveDirection.RIGHT);
        animal1.move(MoveDirection.FORWARD);
        animal1.move(MoveDirection.FORWARD);
        animal1.move(MoveDirection.FORWARD);
        animal1.move(MoveDirection.FORWARD);

        //then
        assertEquals(v1, animal1.getPosition());

    }

    @Test
    void isAnimalOusitdeTheMap2() {
        //given

        Vector2d v1 = new Vector2d(2,0);
        Animal animal1 = new Animal(grassForAnimals, v1);
        //when
        animal1.move(MoveDirection.BACKWARD);
        animal1.move(MoveDirection.BACKWARD);
        animal1.move(MoveDirection.BACKWARD);
        animal1.move(MoveDirection.BACKWARD);

        //then
        assertEquals(v1, animal1.getPosition());
    }

    @Test
    void isTheTypeCorrect() {
        //given
        String[] movementNew = new String[]{"l","r","f"};
        ArrayList<MoveDirection> listOfDirections = new ArrayList<MoveDirection>();
        ArrayList<MoveDirection> testingListOfDirections = new ArrayList<MoveDirection>();
        testingListOfDirections.add(MoveDirection.LEFT);
        testingListOfDirections.add(MoveDirection.RIGHT);
        testingListOfDirections.add(MoveDirection.FORWARD);

        //when
        listOfDirections = OptionsParser.parse(movementNew);

        //then
        assertEquals(testingListOfDirections, listOfDirections);


    }


}


