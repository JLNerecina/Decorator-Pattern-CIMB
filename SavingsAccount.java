public class SavingsAccount implements BankAccount {
    private String accountNumber;
    private String accountName;
    private double balance;

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String showInfo() {
        return "Account number: " + accountNumber + "\nAccount name: " + accountName + "\nBalance: " + balance;
    }

    @Override
    public String showAccountType() {
        return "Savings Account";
    }

    @Override
    public double getInterestRate() {
        return 0.01;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public String showBenefits() {
        return "Standard Savings Account";
    }

    @Override
    public double computeBalanceWithInterest() {
        return getBalance() * (1 + getInterestRate());
    }
}