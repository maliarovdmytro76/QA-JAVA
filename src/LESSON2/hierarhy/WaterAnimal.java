package LESSON2.hierarhy;

public class WaterAnimal extends Animal {

    @Override
    public void printInfo() {
        System.out.println("Water animal");
    }

    public void printFromWaterAnimal() {
        System.out.println("Print from water animal");
    }
}