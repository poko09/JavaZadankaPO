package agh.ics.oop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

abstract public class AbstractWorldMap implements IWorldMap, IPositionChangeObserver {

    //protected List<Animal> animals = new ArrayList<>();
    protected Map<Vector2d, Animal> animals = new HashMap<>();

    @Override
    public boolean place(Animal animal) {
        if(canMoveTo(animal.getPosition())) {
            animals.put(animal.getPosition(), animal);
            return true;
        }
        return false;
    }

    //28.11
//    @Override
//    public boolean place(Animal animal) {
//        if(canMoveTo(animal.getPosition())) {
//            return animals.add(animal);
//        }
//        return false;
//    }


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
//        if(animals.containsValue(position)){
//            return animals.keySet(); //????????
//        }
        return animals.get(position);

        //28.11

//        for (Animal a :animals) {
//            if(a.isAt(position)){
//                return a;
//            }
//
//        }
    }

    public String toString() {

        MapVisualizer myMap = new MapVisualizer(this);

        return myMap.draw(calculateLowerBound(),calculateUpperBound());

    }
    protected abstract Vector2d calculateLowerBound();
    protected abstract Vector2d calculateUpperBound();

    // TESTY!
    @Override
    public void positionChanged(Vector2d oldPosition, Vector2d newPosition) {
        animals.remove(oldPosition);
        animals.put(newPosition, new Animal(this, newPosition));
    }

}
