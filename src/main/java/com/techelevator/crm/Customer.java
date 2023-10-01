package com.techelevator.crm;

import com.techelevator.Billable;
import com.techelevator.Person;

import java.util.*;



public class Customer extends Person implements Billable {

    private String phoneNumber;
    private List<Pet> pets;

    public Customer(String firstName, String lastName, String phoneNumber) {
        super(firstName, lastName);
        this.phoneNumber = phoneNumber;
        this.pets = new ArrayList<>();
    }

    public Customer(String firstName, String lastName) {
        super(firstName, lastName);
        this.phoneNumber = "";
        this.pets = new ArrayList<>();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    @Override
    public double getBalanceDue(Map<String, Double> servicesRendered) {
        double totalBalance = 0.0;
        for (String service : servicesRendered.keySet()) {
            totalBalance += servicesRendered.get(service);
        }
        return totalBalance;
    }
}