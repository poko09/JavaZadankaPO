package agh.ics.oop;

public class Grass implements IMapElement {


    private Vector2d grassPosition;

    public Vector2d getGrassPosition() {
        return grassPosition;
    }

    public Grass(Vector2d grassPosition) {
        this.grassPosition = grassPosition;
    }

    @Override
    public boolean isAt(Vector2d position) {
        return this.grassPosition.equals(position);
    }


    @Override
    public String toString() {
        return "*";
    }
}
