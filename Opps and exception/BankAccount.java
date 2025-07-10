public class BankAccount {
    private double balance;

    public BankAccount() { //default constructor
        this.balance = 0.0;
        System.out.println("Default constructor: Balance is $0.0");
    }

    public BankAccount(double balance) {  //overloaded
        if (balance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }
        this.balance = balance;
        System.out.println("Parameterized constructor: Balance is $" + balance);
    }

    public void showBalance() {  //method
        System.out.println("Account Balance: $" + balance);
    }

    public static void main(String[] args) {  //main method
        BankAccount account1 = new BankAccount();
        account1.showBalance();  //default constructor

        BankAccount account2 = new BankAccount(500.0);
        account2.showBalance();  //parameterized constructor valid balacne

        try {
            BankAccount account3 = new BankAccount(-100.0);
        } catch (IllegalArgumentException e) {  //parameterized cnstructor with invalid baalnce
            System.out.println("Error: " + e.getMessage());
        }
    }
}
