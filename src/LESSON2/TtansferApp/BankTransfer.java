package LESSON2.TtansferApp;

public class BankTransfer {

    private String iban = "TR030 0344 4343 2345";

    public void transfer(int sum) {
        System.out.println("Sum " + sum + " transfer to " + getIban());
    }

    public String getIban() {
        return iban;
    }
}