package agh.ics.oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class SimulationEngine implements IEngine{


    public SimulationEngine(MapDirection direction, IWorldMap map, Vector2d[] vectors) {
        this.direction = direction;
        this.map = map;
        this.vectors = vectors;

    }

    private MapDirection direction;
    private IWorldMap map;
   Vector2d[] vectors;


    private MapDirection orientation = MapDirection.NORTH;

    public void addAnimalsToMap() {
        for (Vector2d vector : vectors) {
            Animal animal = new Animal(this.map, vector);
            map.place(animal);
        }

    }












    @Override
    public void run() {

    }
}
