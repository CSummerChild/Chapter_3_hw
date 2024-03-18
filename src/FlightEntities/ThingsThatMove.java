/**Class: ThingsThatMove
 * @author Tyler Robinson
 * @version 1.2
 * Course: ITEC 2140 Spring 2023
 * Written: March 9, 2024
 */
package FlightEntities;

public class ThingsThatMove {
    public static void main(String[] args) {
        Movement[] movingObjects = new Movement[3];

        // Create objects
        movingObjects[0] = new Airplane("Boeing 747", 2016);
        movingObjects[1] = new Bird("Eagle");
        movingObjects[2] = new Bird("Hummingbird");

        // Process objects
        for (Movement obj : movingObjects) {
            System.out.println(obj.toString() + ": ");
            obj.fly();
            obj.walk();
            obj.jump();
            System.out.println();
        }
    }
}