package main;

public class Bank {
    private String firstName;
    private double balance;
    private double initBalance =1234;

    public Bank(String firstName, double balance) {
        this.firstName = firstName;
        this.balance = balance;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void addBalance(){
        this.balance += initBalance;
        System.out.println(this.balance);
    }

    @Override
    public String toString() {
        return "Bank{" +
                "firstName='" + firstName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
