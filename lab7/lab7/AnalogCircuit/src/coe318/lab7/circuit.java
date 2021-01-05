
package coe318.lab7;
import java.util.ArrayList;

/**
 *
 * @author Mohamad Alkahil
 */
public class circuit {
    public ArrayList list = new ArrayList();
    
    private static circuit instance = null;
    public static circuit getInstance() {
        if (instance == null) {
            instance = new  circuit();
        }
        return instance;
    }
    private circuit() {
        
    }
    
    public void addr(anaresistor r){
         list.add(r);
    }
    
    public void addv(Voltage v){
         list.add(v);
    }
    
    @Override
    public String toString(){
        String s ="";
        for(int i=0;i<list.size();i++){
         s =s.concat(list.get(i).toString()+"\n");
        }
        
        return s;
    
    }
    
}
