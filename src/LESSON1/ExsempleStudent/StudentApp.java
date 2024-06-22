package LESSON1.ExsempleStudent;

public class StudentApp {

    public static void main(String[] args) {
        Student studentOne = new Student("Oleg", "Olegov", 25);
        Student studentTwo = new Student("Maxim", "Maximov", 30);

        System.out.println("Student info : ");
        studentOne.printInfo();
        System.out.println();
        studentTwo.printInfo();

        System.out.println("\nStudent one after increase age : ");
        studentOne.setAge(26);
        studentOne.printInfo();

        Student[] students = {studentOne, studentTwo};

        for (Student student : students) {
            student.increaseRate();
            if (student.isReadyForNextLevel()) {
                System.out.println("Student " + student.getFullName() + " ready for next level ");
                student.changeLevel();
            }
        }

        System.out.println();

        for(Student student :students) {
            System.out.println();
            student.printInfo();
        }
    }
}