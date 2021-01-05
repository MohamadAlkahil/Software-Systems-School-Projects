
package coe318.lab6;

/**
 *
 * @author Mohamad Alkahil
 */
public class Node {
    public static int IdNumN=0;
    private int var;
    
    public Node(){
        var=IdNumN;
        IdNumN++;
    }
   
    @Override
    public String toString(){
       return String.format("%d", var);
    }
}
