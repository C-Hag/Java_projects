package structure;

public class Account {
   private String owner;
   private double balance; 
   private double minimumBalance;

    public void deposit(double amount) {
        // implementation
    }

    /**
     * @return String return the owner
     */
    public String getOwner() {
        return owner;
    }

    /**
     * @param owner the owner to set
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * @return double return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * @return double return the minimumBalance
     */
    public double getMinimumBalance() {
        return minimumBalance;
    }

    /**
     * @param minimumBalance the minimumBalance to set
     */
    public void setMinimumBalance(double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

}
