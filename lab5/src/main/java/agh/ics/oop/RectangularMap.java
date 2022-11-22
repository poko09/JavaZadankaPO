package agh.ics.oop;

import java.util.ArrayList;
import java.util.List;

public class RectangularMap extends AbstractWorldMap{

    private int width;
    private int height;

    //List<Animal> animals = new ArrayList<>();
    Vector2d vector1;
    Vector2d vector2;
    public RectangularMap(int width, int height) {
        this.width = width;
        this.height = height;

        vector1 = new Vector2d(0, 0);
        vector2  = new Vector2d(width, height);

    }

    @Override
    public String toString() {

        MapVisualizer myMap = new MapVisualizer(this);

        return myMap.draw(new Vector2d(0,0), new Vector2d(width,height));

    }



//    @Override
//    public boolean isOccupied(Vector2d position) {
//        return checkIfOccupied;
//
//        //Streamy:
////        return animals.stream()
////                .anyMatch(animal -> animal.isAt(position));
//
//        //wczesniejsze rozwiazanie
////        for (Animal animal : animals){
////            if(animal.isAt(position)) return true;
////        }
////        return false;
//    }


}
