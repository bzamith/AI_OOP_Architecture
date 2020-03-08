package FileReader;

import DataSet.DataSet;
import FileReader.Exceptions.FileNotFoundException;

public class ArffReader extends FileReader {
    public ArffReader(String fileName) throws FileNotFoundException {
        super(fileName);
    }

    @Override
    public DataSet parseFile(){
        return new DataSet();
        //TO-DO
    }
}
