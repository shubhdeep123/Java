public class JavaEnums {
    public static void main(String[] args) {
        PaymentStatus status = PaymentStatus.PENDING;
        System.out.println("Payment Status: " + status.name());
    }
}

// enum Direction {
//     NORTH(0),
//     SOUTH(180),
//     EAST(90),
//     WEST(270);

//     private int degree;

//     Direction(int degree) {
//         this.degree = degree;
//     }

//     public int getDegree() {
//         return degree;
//     }
// }


//Internally, the Java compiler converts the enum into a class that extends java.lang.Enum. Each enum constant is represented as a static final instance of the enum class. The enum class has a private constructor, and the enum constants are created as instances of the enum class.
// final class Direction extends Enum<Direction> {
//     public static final Direction NORTH = new Direction(0);
//     public static final Direction SOUTH = new Direction(180);
//     public static final Direction EAST = new Direction(90);
//     public static final Direction WEST = new Direction(270);

//     private Direction(int degree) {
//         this.degree = degree;
//     }

//     public int getDegree() {
//         return degree;
//     }
// }

enum PaymentStatus {
    PENDING,
    COMPLETED,
    FAILED
}
