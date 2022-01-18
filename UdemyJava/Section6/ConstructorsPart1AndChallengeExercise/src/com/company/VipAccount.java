package com.company;

public class VipAccount {
    private String name;
    private int creditLimit;
    private String email;

    public VipAccount(String name, int creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }
    public VipAccount(String name, int creditLimit) {
        this(name, creditLimit, "unknown email");//     note this line
    }
    public VipAccount() {
        this("defaultName", 555, "defaultEmail");
    }

    //getters
    public String getName() {
        return name;
    }
    public int getCreditLimit() {
        return creditLimit;
    }
    public String getEmail() {
        return email;
    }
}
