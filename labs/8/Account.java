import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreated;

    //constructor account obj
    Account() {
        this(0, 0);
    }

    //constructor fancy account obj
    Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        annualInterestRate = 0;
        dateCreated = new Date();
    }

    //setter this.id
    public void setId(int id) {
        this.id = id;
    }

    //setter this.balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    //setter this.annualInterstRate
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    //getter return id
    /** Return id */
    public int getId() {
        return id;
    }

   //getter return balance
    public double getBalance() {
        return balance;
    }

   //getter return annualInterestRate
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    //getter return dateCreated as string
    public String getDateCreated() {
        return dateCreated.toString();
    }

    //getter return annualInterstRate
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    //getter return monthlyInterest
    public double getMonthlyInterest() {
        return balance * (getMonthlyInterestRate() / 100);
    }

    //setter withdraw on balance
    public void withdraw(double amount) {
        balance -= amount;
    }

    //setter deposit on balance
    public void deposit(double amount) {
        balance += amount;
    }

    //getter return string of obj
    public String toString() {
        return "Account ID: " + id + "\nDate created: " + getDateCreated()
                + "Balance: $" + String.format("%.2f", balance) +
                "Monthly interest: $" + String.format("%.2f", getMonthlyInterest());
    }
}