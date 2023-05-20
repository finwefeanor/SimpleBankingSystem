class Account {
    private String name;
    private int balance;
    public Account(String name)
    {
        this.name = name;
        this.balance = 0;
    }

    public void deposit(int amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + ". Current balance: " + balance);
        } else {
            System.out.println("Amount must be positive.");
        }
    }

    public void withdraw(int amount) {
        if(amount > 0) {
            if(balance >= amount) {
                balance -= amount;
                System.out.println("Withdrew " + amount + ". Current balance: " + balance);
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Amount must be positive.");
        }
    }
    public int getBalance()
    {
        return balance;
    }

}
