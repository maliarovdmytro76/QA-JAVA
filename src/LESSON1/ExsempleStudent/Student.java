package LESSON1.ExsempleStudent;

import java.util.Random;

public class Student {

    private String firstName;

    private String lastName;

    private int age;

    private int rate = 0;

    private int level = 0;

    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 100) {
            this.age = age;
        }
    }

    public void increaseRate() {
        Random random = new Random();
        rate = random.nextInt(40);
    }

    private void increaseLevel() {
        level++;
        rate = 0;
    }

    public void changeLevel() {
        boolean readyForNextLevel = isReadyForNextLevel();
        if (readyForNextLevel == true) {
            increaseLevel();
        }
    }

    public boolean isReadyForNextLevel() {
        return rate > 5;
//      return   rate > 5 ? true : false;
//            if(rate > 5) {
//                return true;
//            } else {
//                return false;
//            }
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void printInfo() {
        System.out.println("Name : " + firstName);
        System.out.println("Surname : " + lastName);
        System.out.println("Age : " + age);
        System.out.println("Level : " + level);
    }
}

