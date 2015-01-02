package com.happydog.customermodule.model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class CustomerTableModel extends AbstractTableModel {

    private List<Customer> customers = new ArrayList<Customer>();
    
    public CustomerTableModel(List<Customer> users) {
        this.customers = users;
    }

    @Override
    public int getRowCount() {
        return this.customers.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }
    
    @Override
    public String getColumnName(int i) {

        switch (i) {
            case 0:
                return "Name";
            case 1:
                return "Pets Name";
            case 2:
                return "Pet Type";
            case 3:
                return "Last Visit";
        }
        return "";
    }        

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        Customer u = (Customer)this.customers.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return u.name;
            case 1:
                return u.petsname;
            case 2:
                return u.pettype;
            case 3:
                return u.lastvisit;
        }
        return null;
    }
}
