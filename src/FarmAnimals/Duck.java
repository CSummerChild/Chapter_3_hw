package FarmAnimals;

public class Duck extends FarmAnimal {
    private String sound = "Quack Quack";

    public Duck(String name, String gender, double weight, int age) {
        super(name, gender, weight, age);
    }

    @Override
    public String makeSound() {
        return sound;
    }

    @Override
    public String feedLoadingSchedule() {
        return "8am-12pm-6pm";
    }

    @Override
    public String toString() {
        return super.toString() + " " + makeSound();
    }
}
