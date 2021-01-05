
package coe318.lab6;

/**
 *
 * @author Mohamad Alkahil
 */
public class Resistor {
    private double Resistance;
    private static int IdNumR=1;
    private Node Node1;
    private Node Node2;
    private int id;
    public Resistor(double resistance, Node node1, Node node2){
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
    
    public Node [] getNodes(){
        Node[] nodes = new Node[2];
        nodes[0]=Node1;
        nodes[1]=Node2;
        return nodes;
    }
     
    @Override
    public String toString(){
        return String.format("R" + id + " "+ Node1.toString() +" " +  Node2.toString() + " " +  Resistance);
    }
    
}
