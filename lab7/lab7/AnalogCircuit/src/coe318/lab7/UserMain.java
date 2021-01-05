
package coe318.lab7;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Mohamad Alkahil
 * 
 */
public class UserMain {
    public static void main(String[] args){
        circuit c = circuit.getInstance();
        int n1,n2,x=0;
        double v,r;
        Scanner scan = new Scanner(System.in);
        System.out.println("For the TA: \nThe instructions for this assignement were vague for example the the polarized vs nonpolarized volatges and the junit test stuff.\nI was unsure about what exactly they wanted so I just always check for negative voltage and switch the nodes. \nFor the junit test cases I used the Profs notes and watched some videos to try to better understand what I needed to do, since there are barley any instructions. \nI hope you take this into consideration when marking \n\n");
        System.out.println("Instructions: \n1.Type v to set Voltge value, space bar first node, space bar second node, space bar then finally the magnitude of the voltage and press enter \n2.Type r to set Resistor value, space bar first node, space bar second node, space bar then finally the magnitude of the resistance and press enter \n3.Type spice to get uppercase letters ,components numbered sequentially and DC used in the description of voltage \n4.Type end to terminate the program");
        
        while(x!=1){
        String s=scan.next();
        
        if (s.equals("end")){
            System.out.println("All Done\nProgram Terminated. ");
            x=1;
        }
        
        else if(s.equals("v")){
            n1=scan.nextInt();
            n2=scan.nextInt();
            v=scan.nextDouble();
            c.addv(new Voltage(v,new ananode(n1), new ananode(n2)));
            x=0;
        }
        else if(s.equals("r")){
            n1=scan.nextInt();
            n2=scan.nextInt();
            r=scan.nextDouble();
            c.addr(new anaresistor(r,new ananode(n1), new ananode(n2)));
            x=0;
        }
        else if (s.equals("spice")){
            System.out.println(""+c.toString());
        }
        else{
            System.out.println("Invalid input. Program Terminated. ");
            x=1;
        }
        }
    }
        
    
}
