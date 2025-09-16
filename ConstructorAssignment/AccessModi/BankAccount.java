package AccessModi;

// Base Class
class BankAccount {
    public int accountNumber;      // public
    protected String accountHolder;// protected
    private double balance;        // private

    // Constructor
    BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public methods for balance
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

// Subclass
class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    void display() {
        System.out.println("Account No: " + accountNumber + ", Holder: " + accountHolder +
                           ", Balance: " + getBalance() + ", Interest Rate: " + interestRate + "%");
    }

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(2001, "Neha", 50000, 5.5);
        sa.display();

        sa.setBalance(60000); // modifying private balance using public method
        sa.display();
    }
}
