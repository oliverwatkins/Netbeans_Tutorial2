package com.happydog.customermodule.delegate;

import com.happydog.customermodule.model.Customer;
import java.util.ArrayList;
import java.util.List;


public class CustomerDelegate {
    
    private static CustomerDelegate INSTANCE = new CustomerDelegate();
    
    private CustomerDelegate() {
    }

    public static CustomerDelegate getInstance() {
        return CustomerDelegate.INSTANCE;
    }

    public List<Customer> getCustomers() {
        
        Customer customer = new Customer();
        
        customer.name = "Bob";
        customer.petsname = "Henry";
        customer.pettype = "dog";
        customer.lastvisit = "10-10-2009";

        Customer customer2 = new Customer();
        
        customer2.name = "Jane";
        customer2.petsname = "Donnie";
        customer2.pettype = "fish";
        customer2.lastvisit = "9-4-2009";
        
        Customer customer3 = new Customer();
        
        customer3.name = "Tyrone";
        customer3.petsname = "Malcom";
        customer3.pettype = "budgie";
        customer3.lastvisit = "8-8-2009";
        
        ArrayList list = new ArrayList();
        list.add(customer);
        list.add(customer2);
        list.add(customer3);
        
        return list;
    }
    
    
    public void createCustomer(Customer customer) {
        //TODO
    }
    
    public void deleteCustomer(Customer customer) {
        //TODO
    }
}
