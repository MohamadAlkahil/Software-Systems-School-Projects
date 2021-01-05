/**
 *
 * @author Mohamad Alkahil
 */
package coe318.lab4;

public class Bank {
    private String name;
    private Account [] accounts;
    private int numAccounts;

    public Bank(String name, int maxNumberAccounts) {
        this.name = name;
        accounts = new Account[maxNumberAccounts];
        numAccounts=0;
    }

    public String getName() {
        return this.name;  
    }

    public int getNumAccounts() {
        return numAccounts; 
    }


    public Account[] getAccounts() {
         return accounts;   
    }
   
    public boolean hasAccountNumber(int accountNumber) {
         int j=0;
         
        for(int i=0;i<accounts.length;i++){
                if( accounts[i ]!= null && accounts[i].Number == accountNumber ){
                    j++;
                }
        }
        
        if(j>0){
           return true; 
        }
        else{
            return false;
        }
    }

    public boolean add(Account account) {
        int i=0;
        
        if(hasAccountNumber(account.Number) == true || numAccounts>=accounts.length){
            return false;
        }
        else{
            while(accounts[i] !=null){
                i++;
            }
            
            accounts[i]=account; 
            numAccounts++;
            return true;
                
            }
    }
    

    @Override
    public String toString() {
        //DO NOT MODIFY THIS CODE
        String s = getName() + ": " + getNumAccounts() +
                " of " + getAccounts().length +
                " accounts open";
        for(Account account : getAccounts()) {
            if (account == null) break;
            s += "\n  " + account;
        }
        return s;
    }
}