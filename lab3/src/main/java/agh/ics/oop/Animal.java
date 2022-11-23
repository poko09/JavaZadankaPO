package agh.ics.oop;

public class Animal {

    private MapDirection orientation = MapDirection.NORTH;
    private Vector2d position = new Vector2d(2,2);


    public MapDirection getOrientation() {
        return orientation;
    }

    public void setOrientation(MapDirection orientation) {
        this.orientation = orientation;
    }

    public Vector2d getPosition() {
        return position;
    }

    public void setPosition(Vector2d position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "orientation=" + orientation +
                ", position=" + position +
                '}';
    }

    public boolean isAt(Vector2d position) {
        return this.position.equals(position);
    }

    public void move (MoveDirection direction) {
        Vector2d upBoardVector = new Vector2d(3,3);
        Vector2d downBoardVector = new Vector2d(1,1);
        if(this.position.precedes(upBoardVector)&& this.position.follows(downBoardVector)) {
            switch (direction) {
                case RIGHT -> {
                    this.orientation = MapDirection.EAST;
                    //new Animal();
                    return;
                }
                case LEFT -> {
                    this.orientation = MapDirection.WEST;
                    //new Animal();
                    return;
                }
                case FORWARD -> {
                    this.position = position.add(new Vector2d(0, 1));
                    //new Animal();
                    return;
                }
                case BACKWARD -> {
                    this.position = position.add(new Vector2d(0, -1));
                    //new Animal();
                    return;
                }
                default -> {
                }
            }
        }

    }
}
