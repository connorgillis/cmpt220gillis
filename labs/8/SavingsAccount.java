public class SavingsAccount extends Account {

    public SavingsAccount() {
        super();

    }

    //constructor SavingsAccount
    public SavingsAccount(int id, double balance) {
        super(id, balance);
    }

    //setter withdraw on balance
    public void withdraw(double amount) {
        if (amount < getBalance()) {
            setBalance(getBalance() - amount);
        }
        else
            System.out.println(
                    "Error! Savings account overdrawn transtaction rejected");
    }
}