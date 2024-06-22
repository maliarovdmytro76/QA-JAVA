package LESSON2.hierarhy;

public class OceanAnimal extends WaterAnimal {
    @Override
    public void printInfo() {
        System.out.println("Ocean animal");
    }

    public void printFromOceanAnimal() {
        System.out.println("Print from ocean animal");
    }
}