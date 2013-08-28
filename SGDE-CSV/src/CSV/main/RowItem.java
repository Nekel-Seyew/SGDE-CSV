/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CSV.main;

import java.io.Serializable;

/**
 *
 * @author kdsweenx
 */
public class RowItem implements Serializable{
    Object value;
    String loc="";
    
    public RowItem(Object value, String loc){
        this.value=value;
        this.loc=new String(loc);
    }
    
    public String getLocation(){
        return loc;
    }
    
    public Object getValue(){
        return value;
    }

    public void setValue(String value) {
        this.value = new String(value);
    }

    public void setLocation(String loc) {
        this.loc = new String(loc);
    }
    
}
