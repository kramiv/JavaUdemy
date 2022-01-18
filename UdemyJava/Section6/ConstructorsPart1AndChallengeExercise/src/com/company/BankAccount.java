package com.company;

import java.util.Locale;
import java.util.Scanner;

public class BankAccount {

    private int number;
    private int balance;//double
    private String customerName;
    private String email;
    private int phoneNumber;

    public BankAccount() {//this is the constructor
        //default values:
        //note that the constructor line that is next must be the first line
        //in this constructor method.
        this(55, 5, "default name", "default email", 555);
        System.out.println("empty constructor called");
    }

    public BankAccount(String customerName) {
        this();//   this is how to call another constructor - in this case
        //the default constructor
        this.customerName = customerName;
    }

    public BankAccount(int number, int balance, String customerName, String email
    , int phoneNumber) {
        setNumber(number);//this approach to setting value is good if
        //the function setNumber has some way to verify the value, for example
        this.balance = balance;//generally, setting values directly is best
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        //general rule of thumb: in a constructor, call only other constructors.
    }

    //I can also go to code--> generate a constructor with the fields I want.

    //shortcut to create getters and setters:
    //code --> generate --> getter and setter --> select which variables
    //to make getters and setters for.

    //setters
    public void setNumber(int num) {
        this.number = num;
    }
    public void setBalance(int bal) {
        this.balance = bal;
    }
    public void setCustomerName(String custName) {
        this.customerName = custName;
    }
    public void setEmail(String em) {
        this.email = em;
    }
    public void setPhoneNum(int phoneNum) {
        this.phoneNumber = phoneNum;
    }

    //getters
    public int getNumber() {
        return this.number;
    }
    public int getBalance() {
        return this.balance;
    }
    public String getCustomerName() {
        return this.customerName;
    }
    public String getEmail() {
        return this.email;
    }
    public int getPhoneNumber() {
        return this.phoneNumber;
    }

    //methods
    //private?

    //added the scanner part to review older code
    public void depositFunds(){
        Scanner scanner = new Scanner(System.in);
        boolean fundsDeposited = false;
        while (!fundsDeposited) {//set up to exit loop after a deposit
            System.out.println("enter your deposit amount: ");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {//check for valid number of deposit amount
                fundsDeposited = true;
                int currentNum = scanner.nextInt();
                this.balance = currentNum + this.balance;
            } else {
                System.out.println("invalid deposit amount");
            }
            scanner.nextLine();//   handle enter key
        }
        int placeholder = getBalance();
        //can I put getBalance inside of the sout below?
        System.out.println("your current balance is " + placeholder);
        scanner.close();
    }// java told me to remove "static" so this.balance = currentNum; goes through

    //another method.
    //if I model it using the above code, I'm just copying code.
    //should create a different transaction method.
    //for now, will do just a simple method.

    public void withdrawFunds(int amountToWithdraw) {
        if (amountToWithdraw > this.getBalance()) {
            System.out.println("You're poor, but you're not broke. Broke is a mindset.");
        } else {
            int newBalance = this.getBalance() - amountToWithdraw;
            this.setBalance(newBalance);
            System.out.println("your new balance is " + this.getBalance());
        }
    }



}
