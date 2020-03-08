package FileReader;

import FileReader.Exceptions.FileNotFoundException;
import FileReader.Exceptions.FileReaderNotImplementedException;

public class FileReaderFactory {
    public static FileReader getFileReader(String fileName) throws FileNotFoundException, FileReaderNotImplementedException {
        String extension = fileName.substring(fileName.lastIndexOf('.')+1,fileName.length()).toUpperCase();
        switch (extension){
            case "CSV":
                return new CsvReader(fileName);
            case "ARFF":
                return new ArffReader(fileName);
            default:
                throw new FileReaderNotImplementedException(String.format("%s", extension));
        }
    }
}
