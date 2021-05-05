package com.example.FinalAssignment;

public class BankClass {
    private String customerName;
    private Long createdDate;
     private Long accountNumber;
    private Double balance;

    public BankClass(String customerName, Long createdDate, Long accountNumber, Double balance) {
        this.customerName = customerName;
        this.createdDate = createdDate;
         this.accountNumber = accountNumber;
        this.balance = balance;

    }


    public String getCustomerName() {
        return customerName;
    }

    public Long getCreatedDate() {
        return createdDate;
    }

     public Long getAccountNumber() {
        return accountNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public Double setBalance(double newBalance) {
        balance = newBalance;
        return balance;
    }

}
