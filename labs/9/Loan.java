

public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;


    public Loan() {
        this(2.5, 1, 1000);
    }


    public Loan(double annualInterestRate, int numberOfYears,
                double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        loanDate = new java.util.Date();
    }

    //getter return AIR
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    //setter setAIR
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    //getter return no. years
    public int getNumberOfYears() {
        return numberOfYears;
    }

    //setter set no. years
    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    //getter return loanAmount
    public double getLoanAmount() {
        return loanAmount;
    }

    //setter set Loanamount
    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    //getter retrun monthly payment
    public double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 -
                (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
        return monthlyPayment;
    }

    //getter retrun total payment
    public double getTotalPayment() {
        double totalPayment = getMonthlyPayment() * numberOfYears * 12;
        return totalPayment;
    }

    //getter return loan date
    public java.util.Date getLoanDate() {
        return loanDate;
    }
}