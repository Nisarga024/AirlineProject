package com.service;

public class CustomerServiceImpl implements CustomerService {
	public void applyForChequeBook(long acno) {
        
	    
        System.out.println("applyForChequeBook method called..");
    }
    
    public void stopCheque(long acno) {
        System.out.println("stopCheque method called..");
    }
    
    public void applyForCreditCard(String name, double salary) {
   
        System.out.println("applyForCreditCard method called..");
    }
    

    public double balance(long acno) {
        System.out.println("balance method called..");
        return 9999.9;
    }
}
