/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CSV.main;

/**
 *
 * @author kdsweenx
 */
public class RowItem {
    String value="";
    String loc="";
    
    public RowItem(String value, String loc){
        this.value=new String(value);
        this.loc=new String(loc);
    }
    
    public String getLocation(){
        return loc;
    }
    
    public String getValue(){
        return value;
    }

    public void setValue(String value) {
        this.value = new String(value);
    }

    public void setLocation(String loc) {
        this.loc = new String(loc);
    }
    
    
}
