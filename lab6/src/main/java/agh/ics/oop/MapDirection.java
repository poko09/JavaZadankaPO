package agh.ics.oop;

import java.util.Map;

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

    public MapDirection next() {
        switch (this) {
            case NORTH:
                return MapDirection.EAST;

            case EAST:
                return MapDirection.SOUTH;

            case SOUTH:
                return MapDirection.WEST;

            case WEST:
                return MapDirection.NORTH;

            default:
                return null;
        }
    }

    public MapDirection previous() {
        switch (this) {
            case NORTH:
                return MapDirection.WEST;

            case EAST:
                return MapDirection.NORTH;

            case SOUTH:
                return MapDirection.EAST;

            case WEST:
                return MapDirection.SOUTH;

            default:
                return null;
        }
    }

    public Vector2d toUnitVector(){
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

