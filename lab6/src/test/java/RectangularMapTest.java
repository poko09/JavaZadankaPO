import agh.ics.oop.Animal;
import agh.ics.oop.RectangularMap;
import agh.ics.oop.Vector2d;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangularMapTest {

    Vector2d lowerBound = new Vector2d(0,0);
    Vector2d upperBound = new Vector2d(10,10);
    RectangularMap rMap = new RectangularMap(10,20, lowerBound, upperBound);
    Animal animal = new Animal(rMap, new Vector2d(4,5));

    RectangularMap rcMap = new RectangularMap(1,1, lowerBound, upperBound);

    String myMap = " y\\x  0 1\n" +
            "  2: -----\n" +
            "  1: | | |\n" +
            "  0: | | |\n" +
            " -1: -----\n";


    @Test
    void testViewOfMap(){
        Assertions.assertEquals(myMap, rcMap.toString());
    }

    @Test
    void testIsOccupied() {
        rMap.place(animal);
        System.out.println(rMap);
        Assertions.assertFalse(rMap.isOccupied(new Vector2d(5,5)));
    }

    // TEST CD. - analogicznie do testów z klasy GrassField
    // Testy nie zostały skończone, ponieważ wystąpił problem, którego nie zdążyłem poprawić
    // Czy jest możliwość dopisania testów po terminie, bez utraty punktów?



}
