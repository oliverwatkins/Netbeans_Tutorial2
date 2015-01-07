package com.happydog.customermodule.model;

import com.happydog.customermodule.delegate.CustomerDelegate;

public class Customer {

    public String name;
    public String petsname;
    public String pettype;
    public String lastvisit;

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Customer c = new Customer();
        c.name = "TODO";
        CustomerDelegate.getInstance().createCustomer(c);
    }
}
