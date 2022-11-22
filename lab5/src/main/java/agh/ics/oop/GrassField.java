package agh.ics.oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GrassField extends AbstractWorldMap {

    private int grassFieldNumber;
    private List<Grass> grassList = new ArrayList<>();

    private List<Animal> animalList = new ArrayList<>();

    public GrassField(int grassFieldNumber) {
        this.grassFieldNumber = grassFieldNumber;


        Random rand = new Random();
        for(int i = 0; i< grassFieldNumber; i++) {
            while(true){
                int x = rand.nextInt((int)Math.sqrt(this.grassFieldNumber*10));
                int y = rand.nextInt((int)Math.sqrt(this.grassFieldNumber*10));
                Vector2d grassVector = new Vector2d(x,y);
                Grass grass = new Grass(grassVector);
                if(!this.isGrass(grass.getGrassPosition())) {
                    this.grassList.add(grass);
                    break;
            }
            }
        }
    }

    public boolean isGrass(Vector2d position) {
        return grassList.stream()
                .anyMatch(grass -> grass.isAt(position));

    }

    @Override
    public boolean canMoveTo(Vector2d position) {
        for (Animal animal : this.animalList) {
            if (animal.isAt(position)) {
                return false;}
        }
        return true;
    }

    @Override
    public boolean isOccupied(Vector2d position) {
        boolean checkIfOccupied = super.isOccupied(position);

        for (Grass g : grassList){
            if (g.isAt(position)) {
                return true;
            }
            }
        return checkIfOccupied;
        }


    @Override
    public Object objectAt(Vector2d position) {
        Object object = super.objectAt(position);
//        for (Animal a : animalList) {
//            if(a.isAt(position)) {
//                return a;
//            }
//        }
        for (Grass g : grassList){
            if (g.isAt(position)) {
                return g;
            }
        }
        return object; //null?
    }

    public List<Animal> getListOfAnimals() {
        return List.copyOf(this.animalList);
    }

    public List<Grass> getListOfGrass() {
        return List.copyOf(this.grassList);
    }

    @Override
    public String toString() {

        MapVisualizer myMap = new MapVisualizer(this);
        Vector2d v1 = new Vector2d(0,0);
        Vector2d v2 = new Vector2d(10,10);
        return myMap.draw(v1, v2);

    }


}
