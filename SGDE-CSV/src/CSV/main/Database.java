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
    Hashtable<Integer, Row> data;
    
    public Database(){
        data= new Hashtable<Integer,Row>();
    }
    
    public void put(String v, int row, int col){
        try{
            data.get(row).put(col, v);
        }catch(NullPointerException npe){
            Row r=new Row(row);
            data.put(row, r);
            r.put(col, v);
        }
    }
    
    public String get(int row, int col){
        try{
            return data.get(row).getValue(col);
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
    
    
    private class Row{
        int rowNum;
        Hashtable<Integer, RowItem> data;
        
        public Row(int rowNum){
            this.rowNum=rowNum;
            data= new Hashtable<Integer, RowItem>();
        }
        
        public void put(int i, String v){
            data.put(i, new RowItem(v,getColumnLetters(i)));
        }
        
        public String getValue(int col){
            return data.get(col).getValue();
        }
        
        private String getColumnLetters(int i){
            //TODO: make this work
            return ""+('A'+i);
        }
    }
}
