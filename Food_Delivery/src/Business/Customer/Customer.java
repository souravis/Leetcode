/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.UserAccount.UserAccount;

/**
 *
 * @author harold
 */
public class Customer {
    private String custName;
    private String custAddress;
    private int custPhoneNumber; 
    private UserAccount userAccount;
   
    public Customer(){
        userAccount = new UserAccount();
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    public int getCustPhoneNumber() {
        return custPhoneNumber;
    }

    public void setCustPhoneNumber(int custPhoneNumber) {
        this.custPhoneNumber = custPhoneNumber;
    }
    
    @Override
    public String toString(){
        return custName;
    }
}
