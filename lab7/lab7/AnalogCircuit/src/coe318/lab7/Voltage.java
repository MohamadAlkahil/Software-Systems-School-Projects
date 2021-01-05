
package coe318.lab7;

/**
 *
 * @author Mohamad Alkahil
 */
public class Voltage {
    private double Volts;
    private static int IdNumV=1;
    private ananode Node1;
    private ananode Node2;
    private int id;
    public Voltage(double volts, ananode node1, ananode node2){
        
        if(volts >=0){
        Volts=volts;
        Node1=node1;
        Node2=node2;
        }
        else if(volts <0){
        Volts=-volts;
        Node1= node2;
        Node2=node1;
        }
        id = IdNumV++;
    }
    
    public ananode [] getNodes(){
        ananode[] nodes = new ananode[2];
        nodes[0]=Node1;
        nodes[1]=Node2;
        return nodes;
    }
     
    @Override
    public String toString(){
        return String.format("V" + id + " "+ Node1.toString() +" " +  Node2.toString() + " DC " +  Volts);
    }
    
}
