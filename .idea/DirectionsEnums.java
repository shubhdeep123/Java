public class DirectionsEnums {
    public static void main(String[] args) {
        // Direction direction = Direction.NORTH;
        // direction.move(); // prints "Moving North"

        // direction = Direction.SOUTH;
        // direction.move(); // prints "Moving South"

        // direction = Direction.EAST;
        // direction.move(); // prints "Moving East"

        // direction = Direction.WEST;
        // direction.move(); // prints "Moving West"

        Direction[] directions = Direction.values(); // returns an array of all enum constants
        for (Direction direction : directions) {
            System.out.println(direction.name() + " - " + direction.ordinal()); // prints the name and ordinal of each enum constant
            // direction.move(); // calls the move() method of each enum constant
        }

        Direction d = Direction.valueOf("NORTH"); // returns the enum constant with the specified name
        System.out.println(d.name() + " - " + d.ordinal()); // prints the name
    }
}

enum Direction {
    // it is same as creating a class with four static final instances of the class, each representing a direction. The enum constants are created as instances of the enum class, and they can have their own methods and fields.
    // public static final Direction NORTH = new Direction(0) {
    //     @Override
    //     public void move() {
    //         System.out.println("Moving North");
    //     }
    // };
    NORTH {
        // anonymous class that extends the enum class and provides an implementation of the abstract method move()
        @Override
        public void move() {
            System.out.println("Moving North");
        }
    },
    SOUTH {
        @Override
        public void move() {
            System.out.println("Moving South");
        }
    },
    EAST {
        @Override
        public void move() {
            System.out.println("Moving East");
        }
    },
    WEST {
        @Override
        public void move() {
            System.out.println("Moving West");
        }
    };

    public abstract void move(); // abstract method that must be implemented by each enum constant
    // Each enum constant can provide its own implementation of the abstract method
}
