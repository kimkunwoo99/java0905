package chp08.ex8_8;

import java.util.Scanner;

public class Account {

    private int balance;
    private String name;
    private String accNumber;
    private String pwd;

    public Account(int balance, String accNumber, String name, String pwd) {
        this.balance = balance;
        this.accNumber = accNumber;
        this.name = name;
        this.pwd = pwd;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }
    public String getPwd() {
        return pwd;
    }

//  입금하는 메소드: deposit
    public void deposit(int money) {
        balance += money; // balance = balance + money
    }

    public void withdraw(int money) {
        balance -= money; // balance = balance - money
    }
//  출금하는 메소드: withrow

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", name='" + name + '\'' +
                ", accNumber='" + accNumber + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}

