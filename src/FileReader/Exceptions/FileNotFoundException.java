package FileReader.Exceptions;

public class FileNotFoundException extends Exception {
    public FileNotFoundException(String fileName) {
        super(String.format("No file found for '%s'",fileName));
    }
}
