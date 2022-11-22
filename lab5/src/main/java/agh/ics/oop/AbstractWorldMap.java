package agh.ics.oop;

import java.util.ArrayList;
import java.util.List;

abstract public class AbstractWorldMap implements IWorldMap {

    protected List<Animal> animals = new ArrayList<>();
    private int width;
    private int height;


    @Override
    public boolean canMoveTo(Vector2d position) {

        return (position.follows(new Vector2d(0,0))&&position.precedes(new Vector2d(width,height))&&!isOccupied(position));
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
        return objectAt(position) != null;

//        for (Animal a : animalList) {
//            if(a.isAt(position)) {
//                return true;
//            }
//        }

        //Streamy:
//        return animals.stream()
//                .anyMatch(animal -> animal.isAt(position));

        //wczesniejsze rozwiazanie
//        for (Animal animal : animals){
//            if(animal.isAt(position)) return true;
//        }
//        return false;
    }

    @Override
    public Object objectAt(Vector2d position) {

        //STREAMY:
//        return animals.stream()
//                .filter(animal -> animal.isAt(position))
//                .findFirst().orElse(null);
//

        for (Animal a :animals) {
            if(a.isAt(position)){
                return a;
            }

        }
        return null;
    }

    @Override
    public String toString() {

        MapVisualizer myMap = new MapVisualizer(this);

        return myMap.draw(new Vector2d(0,0), new Vector2d(width,height));

    }


}
