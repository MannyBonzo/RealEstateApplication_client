/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.realestateapp.domain;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Transaction worker class - client side
 * @author Manasseh Barnes
 */
public class rentTransaction implements Serializable {
    private int transaction_id, customer_id, house_id, rent_price, commission;
    private String customer_surname;
    private boolean is_available;
    
    private static final AtomicInteger count = new AtomicInteger(0);
    private int counter = 0;

    public rentTransaction(int transaction_id, int customer_id, String customer_surname, int house_id, int rent_price, int commission,  boolean is_available) {
        this.transaction_id = transaction_id;
        this.customer_id = customer_id;
        this.house_id = house_id;
        this.rent_price = rent_price;
        this.commission = commission;
        this.customer_surname = customer_surname;
        this.is_available = is_available;
    }

    public int id_increment(){
        counter = count.incrementAndGet();
        return counter;
    }
    
    public int commission(){
        int rent = getRent_price();
        int Calculation = rent / 10;
        return Calculation;
    }

    public String getCustomer_surname() {
        return customer_surname;
    }

    public void setCustomer_surname(String customer_surname) {
        this.customer_surname = customer_surname;
    }

    public boolean isIs_available() {
        return is_available;
    }

    public void setIs_available(boolean is_available) {
        this.is_available = is_available;
    }
    
    
    public int getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(int transaction_id) {
        this.transaction_id = transaction_id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getHouse_id() {
        return house_id;
    }

    public void setHouse_id(int house_id) {
        this.house_id = house_id;
    }

    public int getRent_price() {
        return rent_price;
    }

    public void setRent_price(int rent_price) {
        this.rent_price = rent_price;
    }

    public int getCommission() {
        return commission;
    }

    public void setCommission(int commission) {
        this.commission = commission;
    }

    @Override
    public String toString() {
        return "rentTransaction{" + "transaction_id=" + transaction_id + ", customer_id=" + customer_id + ", house_id=" + house_id + ", rent_price=" + rent_price + ", commission=" + commission + ", customer_surname=" + customer_surname + ", is_availble=" + is_available + ", counter=" + counter + '}';
    }
}
