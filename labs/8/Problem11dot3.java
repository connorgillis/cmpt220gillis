public class Problem11dot3 {

    public static void main(String[] args) {
        //create instances of objs
        Account account = new Account(1, 50000);
        SavingsAccount savings = new SavingsAccount(2, 50000);
        CheckingAccount checking = new CheckingAccount(3, 20000, -50);

        account.setAnnualInterestRate(2.0);
        savings.setAnnualInterestRate(2.0);
        checking.setAnnualInterestRate(2.0);

        account.withdraw(1000);
        savings.withdraw(1000);
        checking.withdraw(1000);

        account.deposit(2000);
        savings.deposit(2000);
        checking.deposit(2000);

        System.out.println(account.toString());
        System.out.println(savings.toString());
        System.out.println(checking.toString());
    }
}
