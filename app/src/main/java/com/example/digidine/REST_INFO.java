package com.example.digidine;

import android.widget.EditText;

public class REST_INFO {
    String city;
    String restaurant_name;
    String address;
    String first_name;
    String last_name;
    String contact;
    String email;
    static String password;

    public REST_INFO(String rest_name, String email, String password_signup) {
    }

    public REST_INFO(String city, String restaurant_name, String address, String first_name, String last_name, String contact, String email, String password_signup) {
        this.city = city;
        this.restaurant_name = restaurant_name;
        this.address = address;
        this.first_name = first_name;
        this.last_name = last_name;
        this.contact = contact;
        this.email = email;
        this.password=password_signup;
    }


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRestaurant_name() {
        return restaurant_name;
    }

    public void setRestaurant_name(String restaurant_name) {
        this.restaurant_name = restaurant_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public static String getPassword() { return password; }

    public void setPassword(String password) { this.password = password; }
}
