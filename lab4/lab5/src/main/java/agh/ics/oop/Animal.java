package agh.ics.oop;

public class Animal {

    private IWorldMap map;
    private Vector2d initialPosition = new Vector2d(2, 2);

    public Animal(IWorldMap map) {
        this.map = map;
    }

    public Animal(IWorldMap map, Vector2d initialPosition) {
        this.map = map;
        this.initialPosition = initialPosition;
    }

    private MapDirection orientation = MapDirection.NORTH;
    private Vector2d position = new Vector2d(2, 2);


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
        switch (this.orientation) {
            case NORTH -> {
                // this.orientation = MapDirection.EAST;
                //new Animal();
                return "N";
            }
            case WEST -> {
                // this.orientation = MapDirection.WEST;
                //new Animal();
                return "W";
            }
            case EAST -> {
                //this.position = position.add(new Vector2d(0, 1));
                //new Animal();
                return "E";
            }
            case SOUTH -> {
                // this.position = position.add(new Vector2d(0, -1));
                //new Animal();
                return "S";
            }
            default -> {
                return " ";
            }
        }
    }

    public boolean isAt(Vector2d position) {
        return this.position.equals(position);
    }

    public void move2(MoveDirection direction) {
        Vector2d upBoardVector = new Vector2d(3, 3);
        Vector2d downBoardVector = new Vector2d(1, 1);
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
                if (this.map.canMoveTo(position.add( new Vector2d(0,1)))) {
                    this.position = position.add(new Vector2d(0, 1));
                }
                //new Animal();
                return;
            }
            case BACKWARD -> {
                if (this.map.canMoveTo(position.add( new Vector2d(0,-1)))) {
                    this.position = position.add(new Vector2d(0, -1));
                }

                //new Animal();
                return;
            }
            default -> {
            }
        }
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
