package LESSON2.TtansferApp;

public class FakeBankTransfer extends BankTransfer {

    @Override
    public String getIban() {
        return "DE55 4555 5554 6656 6565";
    }
}