package agh.ics.oop;

public class RectangularMap extends AbstractWorldMap{


    private final Vector2d lowerBound;
    private final Vector2d upperBound;

    //List<Animal> animals = new ArrayList<>();
//    Vector2d vector1;
//    Vector2d vector2;
    public RectangularMap(int width, int height, Vector2d lowerBound, Vector2d upperBound) {

        this.lowerBound = new Vector2d(0, 0);
        this.upperBound =  new Vector2d(width, height);

    }

    public boolean canMoveTo(Vector2d position) {

        return (position.follows(new Vector2d(0,0)) 
                &&position.precedes(upperBound)
                &&!isOccupied(position));
    }


//    @Override
//    public String toString() {
//
//        MapVisualizer myMap = new MapVisualizer(this);
//
//        return myMap.draw(lowerBound,upperBound);
//
//    }

    @Override
    protected Vector2d calculateLowerBound() {
        return lowerBound;
    }

    @Override
    protected Vector2d calculateUpperBound() {
        return upperBound;
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
