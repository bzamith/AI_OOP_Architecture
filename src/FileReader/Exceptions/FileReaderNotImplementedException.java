package FileReader.Exceptions;

public class FileReaderNotImplementedException extends Exception {
    public FileReaderNotImplementedException(String extension) {
        super(String.format("No file reader found for extension '%s'",extension));
    }
}
