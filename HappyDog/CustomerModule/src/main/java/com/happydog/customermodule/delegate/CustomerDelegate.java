package com.happydog.customermodule.delegate;

import com.happydog.customermodule.model.Customer;
import java.util.ArrayList;
import java.util.List;


public class CustomerDelegate {
    
    private static CustomerDelegate INSTANCE;
    
    private CustomerDelegate() {
    }

    public static CustomerDelegate getInstance() {
        return CustomerDelegate.INSTANCE;
    }

    public List<Customer> getUsers() {
        
        Customer customer = new Customer();
        
        customer.name = "bob";
        customer.petsname = "Henrz";
        customer.pettype = "dog";
        customer.lastvisit = "10-10-2009";

        Customer customer2 = new Customer();
        
        customer2.name = "bob";
        customer2.petsname = "Henrz";
        customer2.pettype = "dog";
        customer2.lastvisit = "10-10-2009";
        
        Customer customer3 = new Customer();
        
        customer3.name = "bob";
        customer3.petsname = "Henrz";
        customer3.pettype = "dog";
        customer3.lastvisit = "10-10-2009";
        
        ArrayList list = new ArrayList();
        list.add(customer);
        list.add(customer2);
        list.add(customer3);
        
        return list;
    }
}
