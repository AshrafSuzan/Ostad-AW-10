// Base class
class BankAccount {
    protected double balance;

    //initialize balance
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // deposit money
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    //withdraw money 
    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrew: $" + amount);
    }

    //display balance
    public void displayBalance() {
        System.out.println("Current balance: $" + balance);
    }
}

//Savings Account
class SavingsAccount extends BankAccount {
    private static final double WITHDRAWAL_LIMIT = 1000.0;
    private static final double WITHDRAWAL_FEE = 2.0;

    public SavingsAccount(double balance) {
        super(balance);
    }

    // override withdraw method
    @Override
    public void withdraw(double amount) {
        if (amount > WITHDRAWAL_LIMIT) {
            System.out.println("Withdrawal limit exceeded. Max limit: $" + WITHDRAWAL_LIMIT);
        } else if (amount + WITHDRAWAL_FEE > balance) {
            System.out.println("Insufficient funds to cover withdrawal and fee.");
        } else {
            balance -= (amount + WITHDRAWAL_FEE);
            System.out.println("Withdrew: $" + amount + " (Fee: $" + WITHDRAWAL_FEE + ")");
        }
    }
}

//Checking Account
class CheckingAccount extends BankAccount {
    private static final double WITHDRAWAL_FEE = 1.0;

   
    public CheckingAccount(double balance) {
        super(balance);
    }

    //override withdraw method
    @Override
    public void withdraw(double amount) {
        if (amount + WITHDRAWAL_FEE > balance) {
            System.out.println("Insufficient funds to cover withdrawal and fee.");
        } else {
            balance -= (amount + WITHDRAWAL_FEE);
            System.out.println("Withdrew: $" + amount + " (Fee: $" + WITHDRAWAL_FEE + ")");
        }
    }
}


public class BankSystem {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(1500);
        savings.deposit(500);
        savings.displayBalance();
        savings.withdraw(1200);
        savings.displayBalance();

        CheckingAccount checking = new CheckingAccount(1000);
        checking.deposit(200);
        checking.displayBalance();
        checking.withdraw(100);
        checking.displayBalance();
    }
}
