package FileReader;

import DataSet.DataSet;
import FileReader.Exceptions.FileNotFoundException;

public class CsvReader extends FileReader {
    public CsvReader(String fileName) throws FileNotFoundException {
        super(fileName);
    }

    @Override
    public DataSet parseFile(){
        return new DataSet();
        //TO-DO
    }
}
