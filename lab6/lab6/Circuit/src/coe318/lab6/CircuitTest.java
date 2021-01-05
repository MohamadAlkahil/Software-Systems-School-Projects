/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab6;

/**
 *
 * @author Mohamad Alkahil
 */

public class CircuitTest {
    public static void main(String[] args){
        Circuit c = Circuit.getInstance();
        Node n1 = new Node();
        Node n2 = new Node();
        Node n3 = new Node();
    
        
        Resistor r1= new Resistor( 410, n1,n2);
        Resistor r2= new Resistor(610, n2,n3);
    
        
        c.add(r1);
        c.add(r2);
    
        System.out.println(""+c.toString());
    }
}
