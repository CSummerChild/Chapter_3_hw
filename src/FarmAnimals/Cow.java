/**Class: Cow
 * @author Tyler Robinson
 * @version 1.2
 * Course: ITEC 2140 Spring 2023
 * Written: March 9, 2024
 */

package FarmAnimals;

public class Cow extends FarmAnimal {
    private String sound = "Moo Moo";

    public Cow(String name, String gender, double weight, int age) {
        super(name, gender, weight, age);
    }

    @Override
    public String makeSound() {
        return sound;
    }

    @Override
    public String feedLoadingSchedule() {
        return "6am-4pm";
    }

    @Override
    public String toString() {
        return super.toString() + " " + makeSound();
    }
}

