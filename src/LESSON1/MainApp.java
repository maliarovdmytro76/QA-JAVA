package LESSON1;

public class MainApp {

    public static void main(String[] args) {
        Dog dogOne = new Dog();
        dogOne.age = 10;

        Dog dogTwo = new Dog();
        dogTwo.age = 5;

        System.out.println("Age of dog one is = " + dogOne.age +
                ", and color is " + dogOne.color);
        System.out.println("Age of dog two is = " + dogTwo.age +
                ", and color is " + dogTwo.color);

        Cat cat = new Cat();
        cat.setAge(10);
        System.out.println("Age of cat is " + cat.getAge());

        cat.setAge(-15);
        System.out.println("Age of cat is " + cat.getAge());

        cat.setBreed("yard");
        cat.setColor("Yellow");

        Cat catTwo = new Cat();
        catTwo.setColor("Red");
        catTwo.setAge(5);
        catTwo.setBreed("British");

        Cat catThree = new Cat("British", 10, "Black");
        System.out.println("Color for cat three is " +
                catThree.getColor() + " age is  " + catThree.getAge() +
                " breed is " + catThree.getBreed());
    }
}
