/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CSV.Builder;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

import CSV.main.Database;

/**
 * This class writes the data in a Database object to files
 * @author eddiew
 */
public class Builder {
    /**
     * Creates a Comma-Separated Values file from the objects in the given Database.
     * filePath should include the name of the output file (e.g. "C:/out.csv").
     * The objects in db should implement toString() in order to be saved correctly.
     * @param db
     * @param filePath
     * @throws IOException
     */
    public static void makeCSVFile(Database db, String filePath) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File(filePath)));
        for(HashMap row : db.getData().values()){
            for(Object obj : row.values()){
                bufferedWriter.write('"');
                bufferedWriter.write(obj.toString());
                bufferedWriter.write('"');
                bufferedWriter.write(',');
            }
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
}
