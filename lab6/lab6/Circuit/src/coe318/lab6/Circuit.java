
package coe318.lab6;
import java.util.ArrayList;

/**
 *
 * @author Mohamad Alkahil
 */
public class Circuit {
    ArrayList<Resistor> resist = new ArrayList<Resistor>();
    
    private static Circuit instance = null;
    public static Circuit getInstance() {
        if (instance == null) {
            instance = new  Circuit();
        }
        return instance;
    }
    private Circuit() {
        
    }
    
    public void add(Resistor r){
         resist.add(r);
    }
    
    @Override
    public String toString(){
        String s ="";
        for(int i=0;i<resist.size();i++){
         s =s.concat(resist.get(i).toString()+"\n");
        }
        
        return s;
    
    }
}
