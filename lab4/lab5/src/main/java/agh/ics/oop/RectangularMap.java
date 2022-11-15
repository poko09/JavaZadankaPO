package agh.ics.oop;

import java.util.ArrayList;
import java.util.List;

public class RectangularMap implements IWorldMap{

    private int width;
    private int height;

    List<Animal> animals = new ArrayList<>();
    Vector2d vector1;
    Vector2d vector2;
    public RectangularMap(int width, int height) {
        this.width = width;
        this.height = height;

        vector1 = new Vector2d(0, 0);
        vector2  = new Vector2d(width, height);

    }


    @Override
    public boolean canMoveTo(Vector2d position) {

        return (position.follows(vector1)&&position.precedes(vector2)&&!isOccupied(position));
    }

    @Override
    public boolean place(Animal animal) {
        if(canMoveTo(animal.getPosition())) {
            return animals.add(animal);
        }
        return false;
    }

    @Override
    public boolean isOccupied(Vector2d position) {
        for (Animal animal : animals){
            if(animal.isAt(position)) return true;
        }
        return false;
    }

    @Override
    public Object objectAt(Vector2d position) {
        return null;
    }

    @Override
    public String toString() {

       MapVisualizer myMap = new MapVisualizer(this);

        return myMap.draw(vector1, vector2 );

    }
}
