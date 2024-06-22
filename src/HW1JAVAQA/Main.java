package HW1JAVAQA;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.fullName = "Pol Makartni";
        person1.age = 82;

        Person person2 = new Person("Philipp Plein", 46);
        person1.move();
        person1.talk();

        person2.move();
        person2.talk();
        
    }
}
