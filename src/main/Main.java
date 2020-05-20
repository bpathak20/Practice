package main;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("BImal",2345);
        bank.addBalance();
        System.out.println(bank.toString());

    }
}
