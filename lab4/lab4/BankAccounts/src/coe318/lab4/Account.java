
package coe318.lab4;

/**
 *
 * @author Mohamad Alkahil
 */
public class Account {
    String Name;
    int Number;
    double Balance;
    
    public Account(String name, int number, double initialBalance){
        Name=name;
        Number=number;
        Balance=initialBalance;
    }
    
    public String getName(){
        return Name;
    }
    
    public double getBalance(){
        return Balance;
    }
    
    public int getNumber(){
        return Number;
    }
    
    public boolean deposit(double amount){
        Balance=Balance+amount;
        return true;
    }
    
    public boolean withdraw(double amount){
        if(Balance >= amount && amount>0){
            Balance=Balance-amount;
            return true;
        }
        else{
            return false;
        }
        
    }
    
    @Override
    public String toString() {
        return "(" + getName() + ", " + getNumber() + ", " +String.format("$%.2f", getBalance()) + ")";
    }
    
            
}
