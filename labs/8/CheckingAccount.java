public class CheckingAccount extends Account {

    private double overdraftLimit;

    //constructor create checkingAccount obj
    public CheckingAccount() {
        super();
        overdraftLimit = -20;
    }

    //constructor fancy CheckingAccount
    public CheckingAccount(int id, double balance, double overdraftLimit) {
        super(id, balance);
        this.overdraftLimit = overdraftLimit;
    }

    //setter this.overdraftLimit
    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    //getter return overdraftLimit
    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    //setter withdraw on balance
    public void withdraw(double amount) {
        if (getBalance() - amount > overdraftLimit) {
            setBalance(getBalance() - amount);
        }
        else
            System.out.println("Error! Amount exceeds overdraft limit.");
    }

    //getter retrun string of obj
    public String toString() {
        return super.toString() + "\nOverdraft limit: $" +
                String.format("%.2f", overdraftLimit);
    }
}