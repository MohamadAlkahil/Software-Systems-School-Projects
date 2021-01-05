/**
 *
 * @author Mohamad Alkahil
 */
package coe318.lab3;
public class Counter {
    //Instance variables here
    int modulus,Digit,count;
    Counter leftc;
    
    public Counter(int modulus, Counter left) {
        this.modulus=modulus;
        leftc=left;  
    }
    
    public int getModulus() {
        return this.modulus;
    }

    public Counter getLeft() {
        return leftc;
    }

    public int getDigit() {
        return Digit;
    }

    public void setDigit(int digit) {
        Digit=digit;
        
    }

    public void increment() {
        ++Digit;
        if(Digit == this.modulus){
            Digit=0;
            if(leftc != null){
                ++leftc.Digit;
            }
        }
    
    }

    public int getCount() {
        if(leftc==null){
           this.count=Digit;
        }
        else if(leftc!=null){
            this.count=Digit + (this.modulus *leftc.Digit);   
        }
        return this.count;
    }

    @Override
    public String toString() {
        //DO NOT MODIFY THIS CODE
        return "" + getCount();
    }

}
