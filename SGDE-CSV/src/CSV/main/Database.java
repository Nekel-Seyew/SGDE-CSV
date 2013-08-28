/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CSV.main;

import java.util.ArrayList;
import java.util.Hashtable;

/**
 *
 * @author kdsweenx
 */
public class Database {
    public static final int COMMA=0;
    public static final int TAB=1;
    public static final int SPACE=2;
    public static final int SEMICOLAN=3;
    
    Hashtable<Integer, Hashtable<Integer, Object>> data;
    
    public Database(){
        data= new Hashtable<Integer, Hashtable<Integer, Object>>();
    }
    
    public void put(Object v, int row, int col){
        try{
            data.get(row).put(col, v);
        }catch(NullPointerException npe){
            Hashtable<Integer, Object> r=new Hashtable<Integer, Object>();
            r.put(col, v);
        }
    }
    
    public Object get(int row, int col){
        try{
            return data.get(row).get(col);
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
