package LESSON2.Dogs;

public class ExampleApp {

    public static void main(String[] args) {
        /*
           Example for git demo

         */

        Dog dog = new Dog("Mega Barsik"); // Dog
        SmallDog smallDog = new SmallDog("Barsik"); // Dog + SmallDog
        BigDog bigDog = new BigDog("Super Barsik"); // Dog + BigDog

//        smallDog.setName("Barsik");
//        bigDog.setName("Super Barsik");
//        dog.setName("Mega Barsik");

        dog.voice();
        smallDog.voice();
        bigDog.voice();


        //Dog - parent for SmallDog , BigDog
        //ExampleApp - main
    }
}