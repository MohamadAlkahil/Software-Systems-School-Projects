
package coe318.lab7;

/**
 *
 * @author Mohamad Alkahil
 */
public class ananode {
    private int var;
    
    public ananode(int z){
       if (z < 0) {
            throw new IllegalArgumentException("node can't be negative");
       }
       var=z;
       
    }
   
    @Override
    public String toString(){
       return String.format("%d", var);
    }
}
    

