package LESSON2.TtansferApp;

public class BankApp {
    public static void main(String[] args) {
        BankTransfer bankTransfer = new BankTransfer();
        FakeBankTransfer fakeBankTransfer = new FakeBankTransfer();
        transferMoney(fakeBankTransfer, 5000);
    }

    public static void transferMoney(BankTransfer bankTransfer, int sum) {
        bankTransfer.transfer(sum);
    }
}