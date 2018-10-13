package bid.thediamonddragon.adifparser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class ADIParser {

    private BufferedReader reader;

    /**
     * @param file
     * ADI File to parse
     * @return
     * List of records, which eventually contains a header as first element
     */

    public ArrayList<String> readADI(File file){
        ArrayList<String> records = new ArrayList<>();
        try{
            reader = new BufferedReader(new FileReader(file));
            StringBuilder record = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null){
                record.append(line);
                if (line.toLowerCase().endsWith("<eor>") ||
                    line.toLowerCase().endsWith("<eoh>")){
                    records.add(record.toString());
                    record = new StringBuilder();
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return records;
    }
}
