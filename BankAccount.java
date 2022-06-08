public class BankAccount {
    // member var
    private double savingsBal;
    private double checkingBal;
    private static int numberOfAccounts = 0;
    private static double totalMoneyAllAccounts = 0;

    // constructerswd
    public BankAccount(){
        this.savingsBal = 0;
        this.checkingBal = 0;
        numberOfAccounts++;
    }
    public BankAccount(double savingsBal, double checkingBal){
        this.savingsBal = savingsBal;
        this.checkingBal = checkingBal;
        numberOfAccounts++;
        totalMoneyAllAccounts += savingsBal;
        totalMoneyAllAccounts += checkingBal;
    }
    // getter
    public double getCheckingBal(){
        return this.checkingBal;
    }
    public double getSavingsBal(){
        return this.savingsBal;
    }
    public double getTotalMoneyAllAccounts(){
        return totalMoneyAllAccounts;
    }
    // setter
    public void setTotalMoneyAllAccounts(double savingsBal, double checkingBal){
        totalMoneyAllAccounts = this.checkingBal + this.savingsBal;
    }

    // methodz
    public double depositSavingsBal(double amount){
        totalMoneyAllAccounts += amount;
        return this.savingsBal += amount;
    }
    public double depositCheckingBal(double amount){
        totalMoneyAllAccounts += amount;
        return this.checkingBal += amount;
    }

    public void withdrawSavingsBal(double amount){
        if(this.savingsBal - amount > 0.0){
            this.savingsBal -= amount;
        }
        if(amount > this.savingsBal){
            System.out.println("Withdrawl amount exceeded account balance");
        }
    }
    public void withdrawCheckingBal(double amount){
        if(this.checkingBal - amount > 0.0){
            this.checkingBal -= amount;
        }
        if(amount > this.checkingBal){
            System.out.println("Withdrawl amount exceeded account balance");
        }
    }



    public void display(){
        System.out.println("Your total account balance is : "+ (this.savingsBal + this.checkingBal));
        }
    
}
