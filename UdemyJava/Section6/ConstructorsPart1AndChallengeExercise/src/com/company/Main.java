package com.company;

public class Main {

    public static void main(String[] args) {
        //create customer object
        BankAccount customerOne = new BankAccount();
        customerOne.setBalance(1);//  initialize monies
        //run deposit method
        System.out.println("customerOne has a balance of "
                + customerOne.getBalance());
        customerOne.depositFunds();
        //run withdraw method
        customerOne.withdrawFunds(20);

        //use a constructor to fill in customer object's values
        //see BankAccount.java for this
        BankAccount customerTwo = new BankAccount(12345, 35, "bob", "bob@email.com", 123);

        //note: we can call one constructor from another constructor using
        //default values
        BankAccount customerThree = new BankAccount("tim");
        System.out.println(customerThree.getNumber() + " name " + customerThree.getPhoneNumber());

        //test challenge exercise code:
        VipAccount bigBoyOne = new VipAccount();
        System.out.println(bigBoyOne.getName());

        VipAccount bigBoyTwo = new VipAccount("bob", 100);
        System.out.println(bigBoyTwo.getName());

        VipAccount bigBoyThree = new VipAccount("tim", 300, "email.com");
        System.out.println(bigBoyThree.getName());

    }
}
/*
challenge;
create new class VipCustomer
3 fields: credit limit, name, and email address
3 constructors (1,2, or 3 inputs)
first constructor calls constructor with 3 parameters with default values
2nd does the same but with default value for third
3rd saves all fields

create only getters for this exercise. ignore setters
test that it works
 */