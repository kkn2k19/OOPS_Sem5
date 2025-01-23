// There is a class named "CheckingAccount" contains member method for money withdraw and money deposit and show balance. In case of withdraw money if the customer does not have sufficient balance, then it will throw user defined exception named "InsufficientMoneyException". 

class InsufficientMoneyException extends Exception {
    public InsufficientMoneyException(String message) {
        super(message);
    }
}

class CheckingAccount {
    private double balance;

    public CheckingAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientMoneyException {
        if (amount > balance) {
            throw new InsufficientMoneyException("Insufficient balance!");
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

public class A2BankApp {
    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount(500);
        try {
            account.withdraw(600);
        } catch (InsufficientMoneyException e) {
            System.out.println(e.getMessage());
        }
    }
}

// OUTPUT ---
// Insufficient balance!