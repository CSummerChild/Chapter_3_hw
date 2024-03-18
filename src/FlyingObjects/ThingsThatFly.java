/**Class: ThingsThatFly
 * @author Tyler Robinson
 * @version 1.2
 * Course: ITEC 2140 Spring 2023
 * Written: March 9, 2024
 */

package FlyingObjects;

public class ThingsThatFly {
    public static void main(String[] args) {
        Flight[] flyingObjects = new Flight[3];

        // Create objects
        flyingObjects[0] = new Airplane("Boeing 747", 2016);
        flyingObjects[1] = new Bird("Eagle");
        flyingObjects[2] = new Bird("Hummingbird");

        // Process objects
        for (Flight obj : flyingObjects) {
            System.out.println(obj.toString() + ": ");
            obj.fly();
            System.out.println();
        }
    }
}
