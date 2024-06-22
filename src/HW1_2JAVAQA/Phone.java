package HW1_2JAVAQA;

public class Phone {
    String number;
    String model;
    double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    public void receiveCall(String name){
        System.out.println("Звонит "+ name);
    }
    public String getNumber(){
        return number;
    }
}
