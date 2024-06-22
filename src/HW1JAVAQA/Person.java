package HW1JAVAQA;

public class Person {
    String fullName;
    int age;

    public Person(){

    }
    public Person(String fullName, int age){
    this.fullName = fullName;
    this.age = age;
    }
    public void move(){
        System.out.println(this.fullName + " is moving");
    }
    public void talk(){
        System.out.println(this.fullName + " is tolking");
    }


}
