package agh.ics.oop;



public class World {

    public static void main(String args[]) {
        System.out.println("System Wystartował");

        run(args);

        Direction direction = modifiedToEnum(args);

        run2(direction);

        path(args);

        System.out.println("System zakończył działanie");


        //LABY 2:


    }
    public static Direction modifiedToEnum(String[] args) {
       Direction direction = null;
        for(int i = 0; i <args.length;i++){
            direction = Direction.valueOf(args[i]);
           // System.out.println(direction);
        }
        return direction;
    }
    public static void run(String[] letters) {
        int count = letters.length;
        for (String argument : letters) {
            count = count - 1;

            if (count < 1) {
                System.out.println(argument);
                return;
            }
            System.out.println(argument + ",");
        }
    }

    public static void path(String[] commands) {

        for(String argument : commands) {

            String message = switch(argument) {
                case "f" -> "Do przodu";
                case "b" -> "Do tyłu";
                case "r" -> "W prawo";
                case "l" -> "W lewo";
                default -> "Nie ma takiej komendy";
            };
            System.out.println(message);

        }
    }
    public static void run2(Direction directions){

        for(Direction direction : Direction.values()){
            String message = switch(direction) {
                case f -> "Do przodu enum";
                case b -> "Do tyłu enum";
                case r -> "W prawo enum";
                case l -> "W lewo enum";
                default -> "Nie ma takiej komendy";
            };
            System.out.println(message);
        }


    }
}


