package lab6;

import java.util.Date;
class Account {
    private int id;
    private double balance;
    private double annualInterestRate = 0;
    private Date dateCreated = new Date();

    Account() {
        this.id = 0;
        this.balance = 0;
    } //create account object with id and balance of 0

    Account(int myId, double myBalance) {
        this.id = myId;
        this.balance=myBalance;
    } //create account constructor to take arguments of ID and balance


    public int getId() {
        return(this.id);
    } //return id


    public void setId(int newId) {
        this.id=newId;
    } //change id


    public double getBalance() {
        return(this.balance);
    } //return balance


    public void setBalance(double newBalance) {
        this.balance=newBalance;
    } //change balance


    public double getAnnualInterestRate() {
        return(this.annualInterestRate);
    } //return interest rate (annual)


    public void setAnnualInterestRate(double newInterestRate) {
        this.annualInterestRate = newInterestRate;
    } //change interst rate


    public Date getDateCreated() {
        return(this.dateCreated);
    } //return date created


    public double getMonthlyInterestRate() {
        return(this.annualInterestRate/12.0);
    } //return interest rate (monthly)


    public double getMonthlyInterest() {
        double value = this.balance;
        value *= this.getMonthlyInterestRate();

        return(value);
    } //return monthly interest amount


    public void withdraw(double amount) {
        this.balance-=amount;
    } //remove amount from balance

    public void deposit(double amount) {
        this.balance+=amount;
    } //increase amount to balance
}
public class ProblemNinePointSeven {

    public static void main(String[] args) {
        Account act = new Account(1122, 20000);
        act.setAnnualInterestRate(0.045);
        act.withdraw(2500);
        act.deposit(3000);

        System.out.println("Balance: $"+act.getBalance());
        System.out.println("Monthly Interest: $"+act.getMonthlyInterest());
        System.out.println("Date Created: "+act.getDateCreated());
    }
}
