package HW1_2JAVAQA;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("+49 151 11111", "Samsung", 180);
        Phone phone2 = new Phone("+49 151 22222", "Iphone", 190);
        Phone phone3 = new Phone("+49 151 33333", "Nokia", 200);

        System.out.println("Phone 1 number" + phone1.number +",model" +phone1.model +",weight" + phone1.weight);
        System.out.println("Phone 2 number" + phone2.number +",model" +phone2.model +",weight" + phone2.weight);
        System.out.println("Phone 3 number" + phone3.number +",model" +phone3.model +",weight" + phone3.weight);

        phone1.receiveCall("Alice");
        System.out.println("Number of Phone 1 " + phone1.getNumber());

        phone2.receiveCall("Luka");
        System.out.println("Number of Phone 2 " + phone2.getNumber());

        phone1.receiveCall("Tom");
        System.out.println("Number of Phone 3 " + phone3.getNumber());

        System.out.println();

        System.out.println("Phone 1 " + phone1.model + " " + phone1.number + " " + phone1.weight);
        System.out.println("Phone 2 " + phone2.model + " " + phone2.number + " " + phone2.weight);
        System.out.println("Phone 3 " + phone3.model + " " + phone3.number + " " + phone3.weight);

    }
}
