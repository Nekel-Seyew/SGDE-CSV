/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CSV.Builder;

import java.io.IOException;
import java.lang.StringBuilder;
import java.util.Hashtable;

/**
 *
 * @author kdsweenx
 */
public class Builder {
    private static StringBuilder fileContents;
    public static void makeCSVFile(Database db){
        for(Hashtable row : db){
            for(Object obj : row){
                fileContents.append(obj.toString());
                fileContents.append(',');
            }
            fileContents.append('\n');
        }

    }
    public static void makeCSVFile(Database db, Path filePath) throws IOException {
        for(Hashtable row : db){
            for(Object obj : row){
                fileContents.append(obj.toString());
                fileContents.append(',');
            }
            fileContents.append('\n');
        }
        Files.newBufferedWriter(filePath, fileContents).write(s, 0, s.length());
    }
}
