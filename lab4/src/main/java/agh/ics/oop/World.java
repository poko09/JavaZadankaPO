package agh.ics.oop;


import javax.swing.text.html.Option;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class World {

    public static void main(String args[]) {

//        Vector2d initialP = new Vector2d(2,2);
//
//        RectangularMap map = new RectangularMap(2,2);
//        Animal animal = new Animal(map, initialP);
//        System.out.println(animal.toString());
//        animal.move2(MoveDirection.RIGHT);
//        System.out.println(animal);

        RectangularMap rcMap = new RectangularMap(5,5);
        System.out.println(rcMap);
        Vector2d[] positions = { new Vector2d(2,2), new Vector2d(3,4) };

        SimulationEngine newEngine = new SimulationEngine(MapDirection.NORTH,rcMap, positions);
       // newEngine.addAnimalsToMap();




        /*
        System.out.println(animal.toString());
        animal.move(MoveDirection.RIGHT);
        System.out.println(animal.getOrientation());
        animal.move(MoveDirection.BACKWARD);
        System.out.println(animal.getOrientation());
        System.out.println(animal.getPosition());
        */
        /*

        animal.move(MoveDirection.RIGHT);
        System.out.println(animal.getOrientation());
        animal.move(MoveDirection.FORWARD);
        System.out.println(animal.getPosition());
        animal.move(MoveDirection.FORWARD);
        System.out.println(animal.getPosition());
        animal.move(MoveDirection.FORWARD);
        System.out.println(animal.getPosition());
        */

        //

        /* lab3
        Animal animal = new Animal();
        String[] movementNew = new String[]{"l","r","f","b","f"};

        ArrayList<MoveDirection> listOfDirections = new ArrayList<MoveDirection>();

        listOfDirections = OptionsParser.parse(movementNew);

        System.out.println(listOfDirections.toString());

        for(var object : listOfDirections){
            animal.move(object);
            System.out.println(object);
            System.out.println(animal.getPosition());
            System.out.println(animal.getOrientation());
        }

        */






        //System.out.println(Arrays.asList(OptionsParser.parse(movement)));
        //MoveDirection[] directions = new MoveDirection[movement.length];
        //OptionsParser.parse(movement);








        // Vector2d vector = new Vector2d(3,4);
        //animal.setPosition(vector);




        /*
        Vector2d position1 = new Vector2d(10,20);
        Vector2d position2 = new Vector2d(3,50);

        System.out.println(position1.toString());

        Object position3 = position1.add(position2);

        System.out.println(position1.precedes(position2));

        System.out.println(position1.follows(position2));

        System.out.println(position1.substract(position2));

        System.out.println(position1.upperRight(position2));

        System.out.println(position1.lowerLeft(position2));

        System.out.println(position1.oposite());

        if (position1.equals(position2)) {
            System.out.println("Equal ");
        } else {
            System.out.println("Not Equal ");
        }

        System.out.println(position1.toString());

        System.out.println("\nSPRAWDZENIE: \n");

        Vector2d position11 = new Vector2d(1,2);
        System.out.println(position11);
        Vector2d position22 = new Vector2d(-2,1);
        System.out.println(position22);
        System.out.println(position1.add(position22));


        System.out.println(MapDirection.SOUTH.toString());
        System.out.println(MapDirection.SOUTH.next());
        System.out.println(MapDirection.SOUTH.previous());
        System.out.println(MapDirection.SOUTH.toUnitVector());
        */








    }
}


