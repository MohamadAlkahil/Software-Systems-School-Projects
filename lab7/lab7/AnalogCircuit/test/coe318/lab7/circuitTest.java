
package coe318.lab7;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kahil
 */
public class circuitTest {
    
    public circuitTest() {
    }
    
   

    /**
     * Test of addr method, of class circuit.
     */
    @Test
    public void testAddr() {
        System.out.println("addr");
        circuit b = circuit.getInstance();
        anaresistor r = new anaresistor(5.5, new ananode(0), new ananode(1));
        b.addr(r);
        assertEquals(r,b.list.get(0));
        
    }
    
    /**
     * Test of toString method, of class circuit.
     */
    
    @Test
    public void testToString() {
        System.out.println("toString");
        circuit a = circuit.getInstance();
        Voltage v = new Voltage(10.1, new ananode(0), new ananode(1));
        a.addv(v);
        assertEquals("V1 0 1 DC 10.1", v.toString());
    }
   
}
