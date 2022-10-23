package agh.ics.oop;

public enum MapDirection {

    NORTH,
    EAST,
    SOUTH,
    WEST;

    @Override
    public String toString() {
        switch (this) {
            case NORTH:
                return "Północ";

            case EAST:
                return "Wschód";

            case SOUTH:
                return "Południe";

            case WEST:
                return "Zachód";

            default:
                return null;
        }
    }

    public String next() {
        switch (this) {
            case NORTH:
                return "Wschód";

            case EAST:
                return "Południe";

            case SOUTH:
                return "Zachod";

            case WEST:
                return "Północ";

            default:
                return null;
        }
    }

    public String previous() {
        switch (this) {
            case NORTH:
                return "Zachód";

            case EAST:
                return "Północ";

            case SOUTH:
                return "Wschód";

            case WEST:
                return "Południe";

            default:
                return null;
        }
    }

    public Object toUnitVector(){
        Vector2d v1 = new Vector2d(0,1);
        Vector2d v2 = new Vector2d(1,0);
        Vector2d v3 = new Vector2d(0,-1);
        Vector2d v4 = new Vector2d(-1,0);

        switch (this) {
            case NORTH:
                return v1;

            case EAST:
                return v2;

            case SOUTH:
                return v3;

            case WEST:
                return v4;

            default:
                return null;
        }

    }



}

