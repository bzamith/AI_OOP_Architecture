package FileReader;

import DataSet.DataSet;
import FileReader.Exceptions.FileNotFoundException;
import java.io.File;

public abstract class FileReader {
    protected File file;

    public FileReader(String fileName) throws FileNotFoundException {
        file = new File(fileName);
        fileExists();
    }

    public String getFileName(){
        return file.getName();
    }

    private boolean fileExists() throws FileNotFoundException {
        if(!file.exists()){
            throw new FileNotFoundException(file.getName());
        }
        return true;
    }

    public abstract DataSet parseFile();
}
