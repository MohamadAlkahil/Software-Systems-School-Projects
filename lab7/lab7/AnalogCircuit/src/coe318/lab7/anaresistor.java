
package coe318.lab7;

/**
 *
 * @author Mohamad Alkahil
 */
public class anaresistor { 
    private double Resistance;
    private static int IdNumR=1;
    private ananode Node1;
    private ananode Node2;
    private int id;
    public anaresistor(double resistance, ananode node1, ananode node2){
         if (resistance < 0) {
            throw new IllegalArgumentException("Resistance can't be negative");
        }
        if(resistance == 0) {
            throw new IllegalArgumentException("Resistance can't be zero");}
    
        Resistance=resistance;
        Node1=node1;
        Node2=node2;
        id = IdNumR++;
    }
    
    public ananode [] getNodes(){
        ananode[] nodes = new ananode[2];
        nodes[0]=Node1;
        nodes[1]=Node2;
        return nodes;
    }
     
    @Override
    public String toString(){
        return String.format("R" + id + " "+ Node1.toString() +" " +  Node2.toString() + " " +  Resistance);
    }
    
}

