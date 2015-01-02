package com.happydog.customermodule.user.delegate;

import java.util.ArrayList;
import java.util.List;


public class CustomerDelegate {
    
    private CustomerDelegate() {
    }

    public static CustomerDelegate getInstance() {
        return AlmexDelegateHolder.INSTANCE;
    }

    public List<Customer> getUsers() {
        
        Customer customer = new Customer();
        
        customer.name = "bob";
        customer.petsname = "bucket";
        customer.pettype = "dog";
        customer.lastvisit = "10-10-2009";
        
        ArrayList list = new ArrayList();
        list.add(customer);
        return list;
    }

    private static class AlmexDelegateHolder {
        private static final CustomerDelegate INSTANCE = new CustomerDelegate();
    }

//    public void createUser(UserBO user) {
//
//        try {
//            com.huw.almexoffice.UserWS_Service service = new com.huw.almexoffice.UserWS_Service();
//            com.huw.almexoffice.UserWS port = service.getUserWSPort();
//
//            port.createUser(user);
//        
//        }catch(Exception e) {
//            
//            JOptionPane pane = new JOptionPane(e.getMessage(), JOptionPane.ERROR);
//            pane.setVisible(true);
//        }
//    }
//
//    public void createGroup(GroupBO u) {
//        
//        com.huw.almexoffice.UserWS_Service service = new com.huw.almexoffice.UserWS_Service();
//        com.huw.almexoffice.UserWS port = service.getUserWSPort();
//
//        port.createGroup(u);
//    }
//    
//    public void createGroup2(GroupBO u) {
//        
//        try {
//        
//            com.huw.almexoffice.UserWS_Service service = new com.huw.almexoffice.UserWS_Service();
//            com.huw.almexoffice.UserWS port = service.getUserWSPort();
//
//            port.createGroup2(u);
//        
//        }catch(Exception e) {
//            
//            Logger.getLogger(CustomerDelegate.class.getName()).log(Level.SEVERE, null, e);
//            throw new RuntimeException(e);
//        }
//    }
//    
//    public List<UserBO> getUsers() {
//
//        com.huw.almexoffice.UserWS_Service service = new com.huw.almexoffice.UserWS_Service();
//        com.huw.almexoffice.UserWS port = service.getUserWSPort();
//
//        try {
//
//            List<UserBO> users = port.getAllUsers();
//            return users;
//
//        } catch (Exception ex) {
//            Logger.getLogger(CustomerDelegate.class.getName()).log(Level.SEVERE, null, ex);
//            throw new RuntimeException(ex);
//        }
//    }


}
