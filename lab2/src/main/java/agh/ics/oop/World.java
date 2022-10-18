package agh.ics.oop;



public class World {

    public static void main(String args[]) {


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









    }
}


