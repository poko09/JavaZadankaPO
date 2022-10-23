package agh.ics.oop;


import javax.swing.text.html.Option;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class World {

    public static void main(String args[]) {

        Animal animal = new Animal();
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


