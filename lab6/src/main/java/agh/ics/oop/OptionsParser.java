package agh.ics.oop;

import java.util.ArrayList;

public class OptionsParser {

    public static ArrayList<MoveDirection> parse(String[] commands) {
        ArrayList<MoveDirection> direction = new ArrayList<MoveDirection>();

        for (String word : commands) {
            switch (word) {
                case "f", "forward" -> direction.add(MoveDirection.FORWARD);
                case "b", "backward" -> direction.add(MoveDirection.BACKWARD);
                case "r", "right" -> direction.add(MoveDirection.RIGHT);
                case "l", "left" -> direction.add(MoveDirection.LEFT);
                default -> direction.add(null);
            }
        }
        return direction;
    }
}

