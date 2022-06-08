public class TestBankAccount {
    
    public static void main(String[] args) {
        BankAccount bank1 = new BankAccount(100, 200);
        bank1.depositCheckingBal(50);
        bank1.withdrawSavingsBal(25);
        bank1.display();
        System.out.println(bank1.getCheckingBal() + bank1.getSavingsBal());
    }


}
