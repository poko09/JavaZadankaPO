package agh.ics.oop;

public class Vector2d {

    public final int x;
    public final int y;


    public Vector2d(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Vector2d moveForward(){
        return new Vector2d(x+1, y);
    }

    @Override
    public String toString() {
        return "(%d, %d)".formatted(x,y);
    }


    public boolean precedes(Vector2d other) { //to mozna wsm skrocic

        if(x <= other.x && y <= other.y){

            return true;
        }

        else {

            return false;
        }
    }

    public boolean follows(Vector2d other) {
        return x >= other.x && y >= other.y;
    }

    public Vector2d add(Vector2d other) {
        return new Vector2d(x + other.x, y + other.y);
    }

    public Vector2d substract(Vector2d other) {
        return new Vector2d(x - other.x, y - other.y);
    }

    public Vector2d upperRight(Vector2d other) {

        return new Vector2d(Math.max(x, other.x), Math.max(y, other.y));
    }

    public Vector2d lowerLeft(Vector2d other) {

        return new Vector2d(Math.min(x, other.x), Math.min(y, other.y));
    }

    public Vector2d oposite() {

        return new Vector2d(-x, -y);
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        /* Check if o is an instance of Complex or not
          "null instanceof [type]" also returns false */
        if (!(other instanceof Vector2d)) {
            return false;
        }

        // typecast o to Complex so that we can compare data members
        Vector2d vector = (Vector2d) other;

        // Compare the data members and return accordingly
        return Double.compare(x, vector.x) == 0
                && Double.compare(y, vector.y) == 0;
    }
}
